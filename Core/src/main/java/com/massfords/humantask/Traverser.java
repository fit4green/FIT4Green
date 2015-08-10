//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.10 at 04:34:50 PM CEST 
//


package com.massfords.humantask;

import f4g.schemas.java.ENTITIES;
import f4g.schemas.java.ENTITY;
import f4g.schemas.java.IDREFS;
import f4g.schemas.java.Language;
import f4g.schemas.java.NCName;
import f4g.schemas.java.NMTOKEN;
import f4g.schemas.java.NMTOKENS;
import f4g.schemas.java.Name;
import f4g.schemas.java.NegativeInteger;
import f4g.schemas.java.NonNegativeInteger;
import f4g.schemas.java.NonPositiveInteger;
import f4g.schemas.java.PositiveInteger;
import f4g.schemas.java.UnsignedLong;
import f4g.schemas.java.actions.ActionRequest;
import f4g.schemas.java.actions.LiveMigrateVMAction;
import f4g.schemas.java.actions.MoveVMAction;
import f4g.schemas.java.actions.PowerOffAction;
import f4g.schemas.java.actions.PowerOnAction;
import f4g.schemas.java.actions.StandByAction;
import f4g.schemas.java.actions.StartJobAction;
import f4g.schemas.java.allocation.AllocationRequest;
import f4g.schemas.java.allocation.AllocationResponse;
import f4g.schemas.java.allocation.CloudVmAllocation;
import f4g.schemas.java.allocation.CloudVmAllocationResponse;
import f4g.schemas.java.constraints.optimizerconstraints.Ban;
import f4g.schemas.java.constraints.optimizerconstraints.BoundedClustersType;
import f4g.schemas.java.constraints.optimizerconstraints.BoundedPlacementConstraint;
import f4g.schemas.java.constraints.optimizerconstraints.BoundedPoliciesType;
import f4g.schemas.java.constraints.optimizerconstraints.BoundedSLAsType;
import f4g.schemas.java.constraints.optimizerconstraints.Capacity;
import f4g.schemas.java.constraints.optimizerconstraints.CapacityType;
import f4g.schemas.java.constraints.optimizerconstraints.ClusterType;
import f4g.schemas.java.constraints.optimizerconstraints.Constraint;
import f4g.schemas.java.constraints.optimizerconstraints.EnergyConstraintsType;
import f4g.schemas.java.constraints.optimizerconstraints.ExpectedLoad;
import f4g.schemas.java.constraints.optimizerconstraints.FIT4GreenOptimizerConstraint;
import f4g.schemas.java.constraints.optimizerconstraints.FederationType;
import f4g.schemas.java.constraints.optimizerconstraints.Fence;
import f4g.schemas.java.constraints.optimizerconstraints.Gather;
import f4g.schemas.java.constraints.optimizerconstraints.HardwareConstraintsType;
import f4g.schemas.java.constraints.optimizerconstraints.Load;
import f4g.schemas.java.constraints.optimizerconstraints.Lonely;
import f4g.schemas.java.constraints.optimizerconstraints.NodeController;
import f4g.schemas.java.constraints.optimizerconstraints.Period;
import f4g.schemas.java.constraints.optimizerconstraints.PolicyType;
import f4g.schemas.java.constraints.optimizerconstraints.QoSConstraintsType;
import f4g.schemas.java.constraints.optimizerconstraints.Root;
import f4g.schemas.java.constraints.optimizerconstraints.SLAType;
import f4g.schemas.java.constraints.optimizerconstraints.SecurityConstraintsType;
import f4g.schemas.java.constraints.optimizerconstraints.ServerGroupType;
import f4g.schemas.java.constraints.optimizerconstraints.SpareCPUs;
import f4g.schemas.java.constraints.optimizerconstraints.SpareNodes;
import f4g.schemas.java.constraints.optimizerconstraints.Split;
import f4g.schemas.java.constraints.optimizerconstraints.Spread;
import f4g.schemas.java.constraints.optimizerconstraints.VMFlavorType;
import f4g.schemas.java.constraints.optimizerconstraints.VMGroup;
import f4g.schemas.java.metamodel.ATM;
import f4g.schemas.java.metamodel.ApplicationBenchmark;
import f4g.schemas.java.metamodel.BitErrorRate;
import f4g.schemas.java.metamodel.BladeServer;
import f4g.schemas.java.metamodel.BlockSize;
import f4g.schemas.java.metamodel.BoxNetwork;
import f4g.schemas.java.metamodel.BoxRouter;
import f4g.schemas.java.metamodel.BoxSwitch;
import f4g.schemas.java.metamodel.CPU;
import f4g.schemas.java.metamodel.CUE;
import f4g.schemas.java.metamodel.Cache;
import f4g.schemas.java.metamodel.CacheLevel;
import f4g.schemas.java.metamodel.ClusterManagement;
import f4g.schemas.java.metamodel.Controller;
import f4g.schemas.java.metamodel.CoolingSystem;
import f4g.schemas.java.metamodel.Core;
import f4g.schemas.java.metamodel.CoreLoad;
import f4g.schemas.java.metamodel.CpuUsage;
import f4g.schemas.java.metamodel.Datacenter;
import f4g.schemas.java.metamodel.Dimension;
import f4g.schemas.java.metamodel.E80211X;
import f4g.schemas.java.metamodel.Efficiency;
import f4g.schemas.java.metamodel.Enclosure;
import f4g.schemas.java.metamodel.Ethernet;
import f4g.schemas.java.metamodel.FIT4Green;
import f4g.schemas.java.metamodel.Fan;
import f4g.schemas.java.metamodel.FileSystem;
import f4g.schemas.java.metamodel.FileSystemFragmentation;
import f4g.schemas.java.metamodel.FileSystemSpace;
import f4g.schemas.java.metamodel.Flow;
import f4g.schemas.java.metamodel.FrameworkCapabilities;
import f4g.schemas.java.metamodel.Frequency;
import f4g.schemas.java.metamodel.GPU;
import f4g.schemas.java.metamodel.HardDisk;
import f4g.schemas.java.metamodel.HardwareRAID;
import f4g.schemas.java.metamodel.HitRatio;
import f4g.schemas.java.metamodel.HostedHypervisor;
import f4g.schemas.java.metamodel.HostedOperatingSystem;
import f4g.schemas.java.metamodel.IntAppRank;
import f4g.schemas.java.metamodel.IntPercent;
import f4g.schemas.java.metamodel.IoRate;
import f4g.schemas.java.metamodel.Job;
import f4g.schemas.java.metamodel.JobActions;
import f4g.schemas.java.metamodel.JobLimit;
import f4g.schemas.java.metamodel.JobPriority;
import f4g.schemas.java.metamodel.JobTime;
import f4g.schemas.java.metamodel.LUN;
import f4g.schemas.java.metamodel.Link;
import f4g.schemas.java.metamodel.Lithography;
import f4g.schemas.java.metamodel.Location;
import f4g.schemas.java.metamodel.LogicalUnit;
import f4g.schemas.java.metamodel.LogicalVolume;
import f4g.schemas.java.metamodel.Mainboard;
import f4g.schemas.java.metamodel.MemoryUsage;
import f4g.schemas.java.metamodel.NAS;
import f4g.schemas.java.metamodel.NIC;
import f4g.schemas.java.metamodel.NativeHypervisor;
import f4g.schemas.java.metamodel.NativeOperatingSystem;
import f4g.schemas.java.metamodel.NetworkLoad;
import f4g.schemas.java.metamodel.NetworkNode;
import f4g.schemas.java.metamodel.NetworkPort;
import f4g.schemas.java.metamodel.NetworkPortBufferOccupancy;
import f4g.schemas.java.metamodel.NetworkPortBufferSize;
import f4g.schemas.java.metamodel.NetworkTraffic;
import f4g.schemas.java.metamodel.NetworkUsage;
import f4g.schemas.java.metamodel.Node;
import f4g.schemas.java.metamodel.NodeActions;
import f4g.schemas.java.metamodel.NrOfCores;
import f4g.schemas.java.metamodel.NrOfCpus;
import f4g.schemas.java.metamodel.NrOfLinks;
import f4g.schemas.java.metamodel.NrOfNodes;
import f4g.schemas.java.metamodel.NrOfPlugs;
import f4g.schemas.java.metamodel.NrOfPorts;
import f4g.schemas.java.metamodel.NrOfPstates;
import f4g.schemas.java.metamodel.NrOfTransistors;
import f4g.schemas.java.metamodel.OP;
import f4g.schemas.java.metamodel.OperatingSystem;
import f4g.schemas.java.metamodel.OpticalFDDI;
import f4g.schemas.java.metamodel.PDU;
import f4g.schemas.java.metamodel.PSU;
import f4g.schemas.java.metamodel.PSULoad;
import f4g.schemas.java.metamodel.PUE;
import f4g.schemas.java.metamodel.Power;
import f4g.schemas.java.metamodel.PropagationDelay;
import f4g.schemas.java.metamodel.Queue;
import f4g.schemas.java.metamodel.QueuePriority;
import f4g.schemas.java.metamodel.RAID;
import f4g.schemas.java.metamodel.RAIDDisk;
import f4g.schemas.java.metamodel.RAMSize;
import f4g.schemas.java.metamodel.RAMStick;
import f4g.schemas.java.metamodel.RPM;
import f4g.schemas.java.metamodel.Rack;
import f4g.schemas.java.metamodel.RackableNetwork;
import f4g.schemas.java.metamodel.RackableRouter;
import f4g.schemas.java.metamodel.RackableServer;
import f4g.schemas.java.metamodel.RackableSwitch;
import f4g.schemas.java.metamodel.Role;
import f4g.schemas.java.metamodel.SAN;
import f4g.schemas.java.metamodel.SerialPPP;
import f4g.schemas.java.metamodel.Server;
import f4g.schemas.java.metamodel.Site;
import f4g.schemas.java.metamodel.SoftwareApplication;
import f4g.schemas.java.metamodel.SoftwareNetwork;
import f4g.schemas.java.metamodel.SoftwareRAID;
import f4g.schemas.java.metamodel.SolidStateDisk;
import f4g.schemas.java.metamodel.StorageCapacity;
import f4g.schemas.java.metamodel.StorageUnit;
import f4g.schemas.java.metamodel.StorageUsage;
import f4g.schemas.java.metamodel.StripSize;
import f4g.schemas.java.metamodel.SwitchFabric;
import f4g.schemas.java.metamodel.TowerServer;
import f4g.schemas.java.metamodel.Tunnel;
import f4g.schemas.java.metamodel.VMActions;
import f4g.schemas.java.metamodel.VPN;
import f4g.schemas.java.metamodel.VirtualMachine;
import f4g.schemas.java.metamodel.Voltage;
import f4g.schemas.java.metamodel.WaterCooler;

public interface Traverser {


    public void traverse(ENTITIES aBean, Visitor aVisitor);

    public void traverse(ENTITY aBean, Visitor aVisitor);

    public void traverse(IDREFS aBean, Visitor aVisitor);

    public void traverse(Language aBean, Visitor aVisitor);

    public void traverse(NCName aBean, Visitor aVisitor);

    public void traverse(NMTOKEN aBean, Visitor aVisitor);

    public void traverse(NMTOKENS aBean, Visitor aVisitor);

    public void traverse(Name aBean, Visitor aVisitor);

    public void traverse(NegativeInteger aBean, Visitor aVisitor);

    public void traverse(NonNegativeInteger aBean, Visitor aVisitor);

    public void traverse(NonPositiveInteger aBean, Visitor aVisitor);

    public void traverse(PositiveInteger aBean, Visitor aVisitor);

    public void traverse(UnsignedLong aBean, Visitor aVisitor);

    public void traverse(ActionRequest aBean, Visitor aVisitor);

    public void traverse(ActionRequest.ActionList aBean, Visitor aVisitor);

    public void traverse(LiveMigrateVMAction aBean, Visitor aVisitor);

    public void traverse(MoveVMAction aBean, Visitor aVisitor);

    public void traverse(PowerOffAction aBean, Visitor aVisitor);

    public void traverse(PowerOnAction aBean, Visitor aVisitor);

    public void traverse(StandByAction aBean, Visitor aVisitor);

    public void traverse(StartJobAction aBean, Visitor aVisitor);

    public void traverse(AllocationRequest aBean, Visitor aVisitor);

    public void traverse(AllocationResponse aBean, Visitor aVisitor);

    public void traverse(CloudVmAllocation aBean, Visitor aVisitor);

    public void traverse(CloudVmAllocationResponse aBean, Visitor aVisitor);

    public void traverse(Ban aBean, Visitor aVisitor);

    public void traverse(BoundedClustersType aBean, Visitor aVisitor);

    public void traverse(BoundedClustersType.Cluster aBean, Visitor aVisitor);

    public void traverse(BoundedPlacementConstraint aBean, Visitor aVisitor);

    public void traverse(BoundedPlacementConstraint.PlacementConstraint aBean, Visitor aVisitor);

    public void traverse(BoundedPoliciesType aBean, Visitor aVisitor);

    public void traverse(BoundedPoliciesType.Policy aBean, Visitor aVisitor);

    public void traverse(BoundedSLAsType aBean, Visitor aVisitor);

    public void traverse(BoundedSLAsType.SLA aBean, Visitor aVisitor);

    public void traverse(Capacity aBean, Visitor aVisitor);

    public void traverse(CapacityType aBean, Visitor aVisitor);

    public void traverse(ClusterType aBean, Visitor aVisitor);

    public void traverse(ClusterType.Cluster aBean, Visitor aVisitor);

    public void traverse(Constraint aBean, Visitor aVisitor);

    public void traverse(Constraint.PlacementConstraint aBean, Visitor aVisitor);

    public void traverse(EnergyConstraintsType aBean, Visitor aVisitor);

    public void traverse(EnergyConstraintsType.MaxPowerServer aBean, Visitor aVisitor);

    public void traverse(ExpectedLoad aBean, Visitor aVisitor);

    public void traverse(FIT4GreenOptimizerConstraint aBean, Visitor aVisitor);

    public void traverse(FederationType aBean, Visitor aVisitor);

    public void traverse(Fence aBean, Visitor aVisitor);

    public void traverse(Gather aBean, Visitor aVisitor);

    public void traverse(HardwareConstraintsType aBean, Visitor aVisitor);

    public void traverse(HardwareConstraintsType.CompPowerGHz aBean, Visitor aVisitor);

    public void traverse(HardwareConstraintsType.GPUFreqGHz aBean, Visitor aVisitor);

    public void traverse(HardwareConstraintsType.HDDCapacity aBean, Visitor aVisitor);

    public void traverse(HardwareConstraintsType.MemorySpaceGB aBean, Visitor aVisitor);

    public void traverse(HardwareConstraintsType.NbOfCores aBean, Visitor aVisitor);

    public void traverse(HardwareConstraintsType.NbOfGPUCores aBean, Visitor aVisitor);

    public void traverse(HardwareConstraintsType.RAIDLevel aBean, Visitor aVisitor);

    public void traverse(Load aBean, Visitor aVisitor);

    public void traverse(Lonely aBean, Visitor aVisitor);

    public void traverse(NodeController aBean, Visitor aVisitor);

    public void traverse(Period aBean, Visitor aVisitor);

    public void traverse(f4g.schemas.java.constraints.optimizerconstraints.PlacementConstraint aBean, Visitor aVisitor);

    public void traverse(PolicyType aBean, Visitor aVisitor);

    public void traverse(PolicyType.Policy aBean, Visitor aVisitor);

    public void traverse(QoSConstraintsType aBean, Visitor aVisitor);

    public void traverse(QoSConstraintsType.Bandwidth aBean, Visitor aVisitor);

    public void traverse(QoSConstraintsType.MaxServerAvgVCPUperCore aBean, Visitor aVisitor);

    public void traverse(QoSConstraintsType.MaxServerAvgVRAMperPhyRAM aBean, Visitor aVisitor);

    public void traverse(QoSConstraintsType.MaxServerCPULoad aBean, Visitor aVisitor);

    public void traverse(QoSConstraintsType.MaxVMperServer aBean, Visitor aVisitor);

    public void traverse(QoSConstraintsType.MaxVRAMperPhyRAM aBean, Visitor aVisitor);

    public void traverse(QoSConstraintsType.MaxVirtualCPUPerCore aBean, Visitor aVisitor);

    public void traverse(QoSConstraintsType.MaxVirtualLoadPerCore aBean, Visitor aVisitor);

    public void traverse(Root aBean, Visitor aVisitor);

    public void traverse(SLAType aBean, Visitor aVisitor);

    public void traverse(SLAType.SLA aBean, Visitor aVisitor);

    public void traverse(SecurityConstraintsType aBean, Visitor aVisitor);

    public void traverse(SecurityConstraintsType.DedicatedServer aBean, Visitor aVisitor);

    public void traverse(SecurityConstraintsType.SecureAccessPossibility aBean, Visitor aVisitor);

    public void traverse(ServerGroupType aBean, Visitor aVisitor);

    public void traverse(ServerGroupType.ServerGroup aBean, Visitor aVisitor);

    public void traverse(SpareCPUs aBean, Visitor aVisitor);

    public void traverse(SpareNodes aBean, Visitor aVisitor);

    public void traverse(Split aBean, Visitor aVisitor);

    public void traverse(Spread aBean, Visitor aVisitor);

    public void traverse(VMFlavorType aBean, Visitor aVisitor);

    public void traverse(VMFlavorType.VMFlavor aBean, Visitor aVisitor);

    public void traverse(VMGroup aBean, Visitor aVisitor);

    public void traverse(ATM aBean, Visitor aVisitor);

    public void traverse(ApplicationBenchmark aBean, Visitor aVisitor);

    public void traverse(f4g.schemas.java.metamodel.Bandwidth aBean, Visitor aVisitor);

    public void traverse(BitErrorRate aBean, Visitor aVisitor);

    public void traverse(BladeServer aBean, Visitor aVisitor);

    public void traverse(BlockSize aBean, Visitor aVisitor);

    public void traverse(BoxNetwork aBean, Visitor aVisitor);

    public void traverse(BoxRouter aBean, Visitor aVisitor);

    public void traverse(BoxSwitch aBean, Visitor aVisitor);

    public void traverse(CPU aBean, Visitor aVisitor);

    public void traverse(CUE aBean, Visitor aVisitor);

    public void traverse(Cache aBean, Visitor aVisitor);

    public void traverse(CacheLevel aBean, Visitor aVisitor);

    public void traverse(ClusterManagement aBean, Visitor aVisitor);

    public void traverse(Controller aBean, Visitor aVisitor);

    public void traverse(CoolingSystem aBean, Visitor aVisitor);

    public void traverse(Core aBean, Visitor aVisitor);

    public void traverse(CoreLoad aBean, Visitor aVisitor);

    public void traverse(CpuUsage aBean, Visitor aVisitor);

    public void traverse(Datacenter aBean, Visitor aVisitor);

    public void traverse(Dimension aBean, Visitor aVisitor);

    public void traverse(E80211X aBean, Visitor aVisitor);

    public void traverse(Efficiency aBean, Visitor aVisitor);

    public void traverse(Enclosure aBean, Visitor aVisitor);

    public void traverse(Ethernet aBean, Visitor aVisitor);

    public void traverse(FIT4Green aBean, Visitor aVisitor);

    public void traverse(Fan aBean, Visitor aVisitor);

    public void traverse(FileSystem aBean, Visitor aVisitor);

    public void traverse(FileSystemFragmentation aBean, Visitor aVisitor);

    public void traverse(FileSystemSpace aBean, Visitor aVisitor);

    public void traverse(Flow aBean, Visitor aVisitor);

    public void traverse(FrameworkCapabilities aBean, Visitor aVisitor);

    public void traverse(Frequency aBean, Visitor aVisitor);

    public void traverse(GPU aBean, Visitor aVisitor);

    public void traverse(HardDisk aBean, Visitor aVisitor);

    public void traverse(HardwareRAID aBean, Visitor aVisitor);

    public void traverse(HitRatio aBean, Visitor aVisitor);

    public void traverse(HostedHypervisor aBean, Visitor aVisitor);

    public void traverse(HostedOperatingSystem aBean, Visitor aVisitor);

    public void traverse(IntAppRank aBean, Visitor aVisitor);

    public void traverse(IntPercent aBean, Visitor aVisitor);

    public void traverse(IoRate aBean, Visitor aVisitor);

    public void traverse(Job aBean, Visitor aVisitor);

    public void traverse(JobActions aBean, Visitor aVisitor);

    public void traverse(JobLimit aBean, Visitor aVisitor);

    public void traverse(JobPriority aBean, Visitor aVisitor);

    public void traverse(JobTime aBean, Visitor aVisitor);

    public void traverse(LUN aBean, Visitor aVisitor);

    public void traverse(Link aBean, Visitor aVisitor);

    public void traverse(Lithography aBean, Visitor aVisitor);

    public void traverse(Location aBean, Visitor aVisitor);

    public void traverse(LogicalUnit aBean, Visitor aVisitor);

    public void traverse(LogicalVolume aBean, Visitor aVisitor);

    public void traverse(Mainboard aBean, Visitor aVisitor);

    public void traverse(MemoryUsage aBean, Visitor aVisitor);

    public void traverse(NAS aBean, Visitor aVisitor);

    public void traverse(NIC aBean, Visitor aVisitor);

    public void traverse(NativeHypervisor aBean, Visitor aVisitor);

    public void traverse(NativeOperatingSystem aBean, Visitor aVisitor);

    public void traverse(NetworkLoad aBean, Visitor aVisitor);

    public void traverse(NetworkNode aBean, Visitor aVisitor);

    public void traverse(NetworkPort aBean, Visitor aVisitor);

    public void traverse(NetworkPortBufferOccupancy aBean, Visitor aVisitor);

    public void traverse(NetworkPortBufferSize aBean, Visitor aVisitor);

    public void traverse(NetworkTraffic aBean, Visitor aVisitor);

    public void traverse(NetworkUsage aBean, Visitor aVisitor);

    public void traverse(Node aBean, Visitor aVisitor);

    public void traverse(NodeActions aBean, Visitor aVisitor);

    public void traverse(NrOfCores aBean, Visitor aVisitor);

    public void traverse(NrOfCpus aBean, Visitor aVisitor);

    public void traverse(NrOfLinks aBean, Visitor aVisitor);

    public void traverse(NrOfNodes aBean, Visitor aVisitor);

    public void traverse(NrOfPlugs aBean, Visitor aVisitor);

    public void traverse(NrOfPorts aBean, Visitor aVisitor);

    public void traverse(NrOfPstates aBean, Visitor aVisitor);

    public void traverse(NrOfTransistors aBean, Visitor aVisitor);

    public void traverse(OP aBean, Visitor aVisitor);

    public void traverse(OperatingSystem aBean, Visitor aVisitor);

    public void traverse(OpticalFDDI aBean, Visitor aVisitor);

    public void traverse(PDU aBean, Visitor aVisitor);

    public void traverse(PSU aBean, Visitor aVisitor);

    public void traverse(PSULoad aBean, Visitor aVisitor);

    public void traverse(PUE aBean, Visitor aVisitor);

    public void traverse(Power aBean, Visitor aVisitor);

    public void traverse(PropagationDelay aBean, Visitor aVisitor);

    public void traverse(Queue aBean, Visitor aVisitor);

    public void traverse(QueuePriority aBean, Visitor aVisitor);

    public void traverse(RAID aBean, Visitor aVisitor);

    public void traverse(RAIDDisk aBean, Visitor aVisitor);

    public void traverse(f4g.schemas.java.metamodel.RAIDLevel aBean, Visitor aVisitor);

    public void traverse(RAMSize aBean, Visitor aVisitor);

    public void traverse(RAMStick aBean, Visitor aVisitor);

    public void traverse(RPM aBean, Visitor aVisitor);

    public void traverse(Rack aBean, Visitor aVisitor);

    public void traverse(RackableNetwork aBean, Visitor aVisitor);

    public void traverse(RackableRouter aBean, Visitor aVisitor);

    public void traverse(RackableServer aBean, Visitor aVisitor);

    public void traverse(RackableSwitch aBean, Visitor aVisitor);

    public void traverse(Role aBean, Visitor aVisitor);

    public void traverse(SAN aBean, Visitor aVisitor);

    public void traverse(SerialPPP aBean, Visitor aVisitor);

    public void traverse(Server aBean, Visitor aVisitor);

    public void traverse(Site aBean, Visitor aVisitor);

    public void traverse(SoftwareApplication aBean, Visitor aVisitor);

    public void traverse(SoftwareNetwork aBean, Visitor aVisitor);

    public void traverse(SoftwareRAID aBean, Visitor aVisitor);

    public void traverse(SolidStateDisk aBean, Visitor aVisitor);

    public void traverse(StorageCapacity aBean, Visitor aVisitor);

    public void traverse(StorageUnit aBean, Visitor aVisitor);

    public void traverse(StorageUsage aBean, Visitor aVisitor);

    public void traverse(StripSize aBean, Visitor aVisitor);

    public void traverse(SwitchFabric aBean, Visitor aVisitor);

    public void traverse(TowerServer aBean, Visitor aVisitor);

    public void traverse(Tunnel aBean, Visitor aVisitor);

    public void traverse(VMActions aBean, Visitor aVisitor);

    public void traverse(VPN aBean, Visitor aVisitor);

    public void traverse(VirtualMachine aBean, Visitor aVisitor);

    public void traverse(Voltage aBean, Visitor aVisitor);

    public void traverse(WaterCooler aBean, Visitor aVisitor);

}
