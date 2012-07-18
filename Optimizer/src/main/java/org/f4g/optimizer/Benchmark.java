package org.f4g.optimizer;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import org.apache.log4j.Logger;
import org.f4g.controller.IController;
import org.f4g.cost_estimator.NetworkCost;
import org.f4g.optimizer.CloudTraditional.OptimizerEngineCloudTraditional;
import org.f4g.optimizer.CloudTraditional.SLAReader;
import org.f4g.optimizer.utils.Recorder;
import org.f4g.optimizer.utils.Utils;
import org.f4g.power.PowerCalculator;
import org.f4g.schema.actions.ActionRequestType;
import org.f4g.schema.constraints.optimizerconstraints.*;
import org.f4g.schema.metamodel.FIT4GreenType;
import org.f4g.schema.metamodel.RackableServerType;
import org.f4g.schema.metamodel.ServerType;
import org.f4g.schema.metamodel.VirtualMachineType;
import org.f4g.test.ModelGenerator;
import org.f4g.test.SLAGenerator;
import org.f4g.util.Util;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.util.*;
import java.util.concurrent.Semaphore;

/**
 * A tool to generate then solve placement problems.
 *
 * @author Fabien Hermenier
 */
public class Benchmark {


    public static void generateConfiguration(int nbServers, String path) {

        int NbVMsperServer = 6;
        int NBVMsTotal = nbServers * NbVMsperServer;
        int nbServers1 = nbServers / 2;
        int nbServers2 = (nbServers % 2 == 0 ? nbServers / 2 : nbServers / 2 + 1);

        ModelGenerator modelGenerator1 = new ModelGenerator();
        //Server1:
        //CPU Dual CPU, quad-core, Intel® Xeon® E5520 2.27 GHz
        //Memory    24 GB (6 x 4 GB DIMMs)
        //Hard disk  2 x 300 GB
        modelGenerator1.setCPU(2);
        modelGenerator1.setCORE(4);
        modelGenerator1.setFREQUENCY(2.27);
        modelGenerator1.setRAM_SIZE(24);
        modelGenerator1.setSTORAGE_SIZE(600);
        modelGenerator1.setNB_VIRTUAL_MACHINES(0);
        modelGenerator1.setNB_SERVERS(nbServers1);
        modelGenerator1.setNB_ROUTERS(0);
        modelGenerator1.setNB_SWITCHES(0);
        modelGenerator1.NUMBER_OF_TRANSISTORS = 731;
        modelGenerator1.SERVER_FRAMEWORK_ID = 100000;


        ModelGenerator modelGenerator2 = new ModelGenerator();
        //Server2:
        //CPU Dual CPU, quad-core, Intel® Xeon® E5540 2.53 GHz
        //Memory    24 GB (6 x 4 GB DIMMs)
        //Hard disk  2 x 300 GB
        modelGenerator2.setCPU(2);
        modelGenerator2.setCORE(4);
        modelGenerator2.setFREQUENCY(2.53);
        modelGenerator2.setRAM_SIZE(24);
        modelGenerator2.setSTORAGE_SIZE(600);
        modelGenerator2.setNB_VIRTUAL_MACHINES(0);
        modelGenerator2.setNB_SERVERS(nbServers2);
        modelGenerator2.SERVER_FRAMEWORK_ID = 200000;
        modelGenerator2.NIC_FRAMEWORK_ID = 300000;
        modelGenerator2.NUMBER_OF_TRANSISTORS = 731;
        FIT4GreenType model = modelGenerator1.createPopulatedFIT4GreenType();
        FIT4GreenType model2 = modelGenerator2.createPopulatedFIT4GreenType();


        //all the servers of model2 are added in model 1. model2 will not be used anymore.
        List<RackableServerType> rackServers = model.getSite().get(0).getDatacenter().get(0).getRack().get(0).getRackableServer();

        for (ServerType server2 : Utils.getAllServers(model2)) {
            rackServers.add((RackableServerType) server2);
        }
        List<ServerType> servers = Utils.getAllServers(model);

        String sep = System.getProperty("file.separator");
        final SLAReader sla = new SLAReader("resources" + sep + "unittest_SLA_instance_ComHP.xml");


        //predicate to determine is a server is full according to our known constraints
        Predicate<ServerType> isFull = new Predicate<ServerType>() {
            @Override
            public boolean apply(ServerType server) {

                List<VirtualMachineType> vms = Utils.getVMs(server);

                int sumCPUs = 0;
                int sumCPUDemands = 0;
                for (VirtualMachineType vm : vms) {
                    VMTypeType.VMType SLAVM = Util.findVMByName(vm.getCloudVmType(), sla.getVMtypes());
                    sumCPUs += SLAVM.getCapacity().getVCpus().getValue();
                    sumCPUDemands += SLAVM.getExpectedLoad().getVCpuLoad().getValue();
                }

                //constraint MaxVMperServer=15
                if (vms.size() >= 15)
                    return true;
                //constraint MaxVirtualCPUPerCore=2
                if (sumCPUs >= Utils.getNbCores(server) * 2)
                    return true;

                //regular CPU consumption constraint
                if (sumCPUDemands + 100 >= Utils.getNbCores(server) * 100)
                    return true;

                return false;
            }
        };


        Date date = new Date();
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTime(date);
        XMLGregorianCalendar now = null;
        try {
            now = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
        } catch (DatatypeConfigurationException e1) {
            e1.printStackTrace();
        }

        //List<VirtualMachineType> vms = new ArrayList<VirtualMachineType>();
        Random rand = new Random(System.currentTimeMillis());

        for (int i = 0; i < NBVMsTotal; i++) {
            VirtualMachineType VM = modelGenerator1.createVirtualMachineType(servers.get(0), model.getSite().get(0).getDatacenter().get(0).getFrameworkCapabilities().get(0), 1);
            VM.setCloudVmType("m1.small");
            VM.setLastMigrationTimestamp(now);
            VM.setFrameworkID("VMa" + i);
            //vms.add(VM);

            Collection<ServerType> nonFullServers = Collections2.filter(servers, Predicates.not(isFull));
            if (nonFullServers.isEmpty()) {
                break;
            }
            int item = rand.nextInt(nonFullServers.size());
            List<ServerType> myList = new ArrayList<ServerType>();
            myList.addAll(nonFullServers);
            ServerType s = myList.get(item);
            s.getNativeOperatingSystem().getHostedHypervisor().get(0).getVirtualMachine().add(VM);

        }

        Recorder recorder = new Recorder(true, path);
        recorder.recordModel(model);
    }

    //run all configurations in a directory
    static void runConfigurations(String pathName) {


        String fileName;
        File folder = new File(pathName);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                fileName = listOfFiles[i].getName();
                if (fileName.endsWith(".xml")) {
                    runConfiguration(pathName + File.separator + fileName);
                }
            }
        }
    }

    //run a configuration file
    static void runConfiguration(String pathName) {

        Logger log = log = Logger.getLogger(Benchmark.class.getName());

        List<LoadType> load = new LinkedList<LoadType>();
        load.add(new LoadType("m1.small", 300, 6));

        XMLGregorianCalendar begin = null;

        XMLGregorianCalendar end = null;

        try {
            begin = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(2010, 1, 1, 0);
            end = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(2020, 1, 1, 0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


        SLAGenerator slaGenerator = new SLAGenerator();

        PeriodType period = new PeriodType(
                begin, end, null, null, new LoadType("m1.small", 300, 6));

        PolicyType.Policy pol = new PolicyType.Policy();
        pol.getPeriodVMThreshold().add(period);

        List<PolicyType.Policy> polL = new LinkedList<PolicyType.Policy>();
        polL.add(pol);

        PolicyType vmMargins = new PolicyType(polL);
        vmMargins.getPolicy().add(pol);

        Semaphore actionRequestAvailable = new Semaphore(1);

        ModelGenerator modelGenerator = new ModelGenerator();
        FIT4GreenType model = modelGenerator.getModel(pathName);

        final SLAReader sla = new SLAReader("resources" + File.separator + "unittest_SLA_instance_ComHP.xml");

        OptimizerEngineCloudTraditional optimizer = new OptimizerEngineCloudTraditional(new MockController(), new PowerCalculator(), new NetworkCost(),
                slaGenerator.createVirtualMachineType(), vmMargins, makeSimpleFed(vmMargins, null));

        optimizer.setClusterType(sla.getCluster());
        optimizer.setSla(sla.getSLAs());
        optimizer.setFederation(sla.getFeds());
        optimizer.setClusterType(sla.getCluster());
        optimizer.setPolicies(sla.getPolicies());
        optimizer.setVmTypes(sla.getVMtypes());

        optimizer.runGlobalOptimization(model);
    }

    private static FederationType makeSimpleFed(PolicyType policies, FIT4GreenType f4g) {

        FederationType fed = new FederationType();
        BoundedPoliciesType.Policy bpol = new BoundedPoliciesType.Policy(policies.getPolicy().get(0));
        BoundedPoliciesType bpols = new BoundedPoliciesType();
        bpols.getPolicy().add(bpol);
        fed.setBoundedPolicies(bpols);

        if (f4g != null) {
            //add all servers in one cluster
            BoundedClustersType bcls = new BoundedClustersType();
            ClusterType.Cluster c = new ClusterType.Cluster();
            c.setNodeController(new NodeControllerType());
            c.setName("c1");
            for (ServerType s : Utils.getAllServers(f4g)) {
                c.getNodeController().getNodeName().add(s.getFrameworkID());
            }
            BoundedClustersType.Cluster bcl = new BoundedClustersType.Cluster();
            bcl.setIdref(c);
            bcls.getCluster().add(bcl);
            fed.setBoundedCluster(bcls);
        }

        return fed;
    }

    protected static class MockController implements IController {

        @Override
        public boolean executeActionList(ActionRequestType myActionRequest) {
            return true;
        }

        @Override
        public boolean dispose() {
            return false;
        }

        /* (non-Javadoc)
           * @see org.f4g.controller.IController#setActionsApproved(boolean)
           */
        @Override
        public void setActionsApproved(boolean actionsApproved) {
        }

        /* (non-Javadoc)
           * @see org.f4g.controller.IController#setActionsApproved(boolean)
           */
        @Override
        public void setApprovalSent(boolean actionsApproved) {
        }
    }


    private static void usage(int ret) {
        System.out.println("Usage: Benchmark -gen 10 20 -o foo");
        System.out.println("Generate 10 instances of data centres having 20 servers each. Output files are stored in the folder 'foo'");
        System.out.println("\nUsage: Benchmark -run foo ");
        System.out.println("If 'foo' is an instance, compute a solution and print it on stdout. If 'foo' is a folder, run every instances");
        System.exit(ret);
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            usage(0);
        }
        if (args[0].equals("-gen")) {
            if (args.length == 5) {
                int nbInstances = Integer.parseInt(args[1]);
                int nbServers = Integer.parseInt(args[2]);
                String output = args[4];

                for (int i = 0; i < nbInstances; i++) {
                    generateConfiguration(nbServers, output);
                }
            } else {
                usage(1);
            }
        } else if (args[0].equals("-run")) {
            if (args.length != 2) {
                usage(1);
            } else {

                File f = new File(args[1]);
                if (f.isDirectory()) {
                    runConfigurations(args[1]);
                } else {
                    runConfiguration(args[1]);
                }
            }
        } else {
            usage(1);
        }
    }
}
