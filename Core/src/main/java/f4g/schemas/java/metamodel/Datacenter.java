//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.10 at 04:34:50 PM CEST 
//


package f4g.schemas.java.metamodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.massfords.humantask.Named;
import com.massfords.humantask.Visitable;
import com.massfords.humantask.Visitor;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for Datacenter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Datacenter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{f4g/schemas/java/MetaModel}ApplicationBenchmark" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="computedPower" type="{f4g/schemas/java/MetaModel}Power" minOccurs="0"/&gt;
 *         &lt;element ref="{f4g/schemas/java/MetaModel}Rack" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{f4g/schemas/java/MetaModel}TowerServer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{f4g/schemas/java/MetaModel}BoxRouter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{f4g/schemas/java/MetaModel}BoxSwitch" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{f4g/schemas/java/MetaModel}FrameworkCapabilities" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{f4g/schemas/java/MetaModel}NetworkLoad" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Datacenter", propOrder = {
    "name",
    "applicationBenchmark",
    "computedPower",
    "rack",
    "towerServer",
    "boxRouter",
    "boxSwitch",
    "frameworkCapabilities",
    "networkLoad"
})
public class Datacenter implements Cloneable, Named, Visitable, CopyTo
{

    protected String name;
    @XmlElement(name = "ApplicationBenchmark", namespace = "f4g/schemas/java/MetaModel")
    protected List<ApplicationBenchmark> applicationBenchmark;
    @XmlSchemaType(name = "double")
    protected Power computedPower;
    @XmlElement(name = "Rack", namespace = "f4g/schemas/java/MetaModel")
    protected List<Rack> rack;
    @XmlElement(name = "TowerServer", namespace = "f4g/schemas/java/MetaModel")
    protected List<TowerServer> towerServer;
    @XmlElement(name = "BoxRouter", namespace = "f4g/schemas/java/MetaModel")
    protected List<BoxRouter> boxRouter;
    @XmlElement(name = "BoxSwitch", namespace = "f4g/schemas/java/MetaModel")
    protected List<BoxSwitch> boxSwitch;
    @XmlElement(name = "FrameworkCapabilities", namespace = "f4g/schemas/java/MetaModel")
    protected List<FrameworkCapabilities> frameworkCapabilities;
    @XmlElement(name = "NetworkLoad", namespace = "f4g/schemas/java/MetaModel")
    protected NetworkLoad networkLoad;
    @XmlTransient
    private QName jaxbElementName;

    /**
     * Default no-arg constructor
     * 
     */
    public Datacenter() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Datacenter(final String name, final List<ApplicationBenchmark> applicationBenchmark, final Power computedPower, final List<Rack> rack, final List<TowerServer> towerServer, final List<BoxRouter> boxRouter, final List<BoxSwitch> boxSwitch, final List<FrameworkCapabilities> frameworkCapabilities, final NetworkLoad networkLoad, final QName jaxbElementName) {
        this.name = name;
        this.applicationBenchmark = applicationBenchmark;
        this.computedPower = computedPower;
        this.rack = rack;
        this.towerServer = towerServer;
        this.boxRouter = boxRouter;
        this.boxSwitch = boxSwitch;
        this.frameworkCapabilities = frameworkCapabilities;
        this.networkLoad = networkLoad;
        this.jaxbElementName = jaxbElementName;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the applicationBenchmark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationBenchmark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationBenchmark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationBenchmark }
     * 
     * 
     */
    public List<ApplicationBenchmark> getApplicationBenchmark() {
        if (applicationBenchmark == null) {
            applicationBenchmark = new ArrayList<ApplicationBenchmark>();
        }
        return this.applicationBenchmark;
    }

    /**
     * Gets the value of the computedPower property.
     * 
     * @return
     *     possible object is
     *     {@link Power }
     *     
     */
    public Power getComputedPower() {
        return computedPower;
    }

    /**
     * Sets the value of the computedPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Power }
     *     
     */
    public void setComputedPower(Power value) {
        this.computedPower = value;
    }

    /**
     * Gets the value of the rack property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rack property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rack }
     * 
     * 
     */
    public List<Rack> getRack() {
        if (rack == null) {
            rack = new ArrayList<Rack>();
        }
        return this.rack;
    }

    /**
     * Gets the value of the towerServer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the towerServer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTowerServer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TowerServer }
     * 
     * 
     */
    public List<TowerServer> getTowerServer() {
        if (towerServer == null) {
            towerServer = new ArrayList<TowerServer>();
        }
        return this.towerServer;
    }

    /**
     * Gets the value of the boxRouter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boxRouter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoxRouter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoxRouter }
     * 
     * 
     */
    public List<BoxRouter> getBoxRouter() {
        if (boxRouter == null) {
            boxRouter = new ArrayList<BoxRouter>();
        }
        return this.boxRouter;
    }

    /**
     * Gets the value of the boxSwitch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boxSwitch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoxSwitch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoxSwitch }
     * 
     * 
     */
    public List<BoxSwitch> getBoxSwitch() {
        if (boxSwitch == null) {
            boxSwitch = new ArrayList<BoxSwitch>();
        }
        return this.boxSwitch;
    }

    /**
     * Gets the value of the frameworkCapabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frameworkCapabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrameworkCapabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrameworkCapabilities }
     * 
     * 
     */
    public List<FrameworkCapabilities> getFrameworkCapabilities() {
        if (frameworkCapabilities == null) {
            frameworkCapabilities = new ArrayList<FrameworkCapabilities>();
        }
        return this.frameworkCapabilities;
    }

    /**
     * Gets the value of the networkLoad property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkLoad }
     *     
     */
    public NetworkLoad getNetworkLoad() {
        return networkLoad;
    }

    /**
     * Sets the value of the networkLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkLoad }
     *     
     */
    public void setNetworkLoad(NetworkLoad value) {
        this.networkLoad = value;
    }

    public void setJAXBElementName(QName name) {
        this.jaxbElementName = name;
    }

    public QName getJAXBElementName() {
        return this.jaxbElementName;
    }

    public void afterUnmarshal(Unmarshaller u, Object parent) {
        if (parent instanceof JAXBElement) {
            this.jaxbElementName = ((JAXBElement) parent).getName();
        }
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Datacenter) {
            final Datacenter copy = ((Datacenter) draftCopy);
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
            if ((this.applicationBenchmark!= null)&&(!this.applicationBenchmark.isEmpty())) {
                List<ApplicationBenchmark> sourceApplicationBenchmark;
                sourceApplicationBenchmark = (((this.applicationBenchmark!= null)&&(!this.applicationBenchmark.isEmpty()))?this.getApplicationBenchmark():null);
                @SuppressWarnings("unchecked")
                List<ApplicationBenchmark> copyApplicationBenchmark = ((List<ApplicationBenchmark> ) strategy.copy(LocatorUtils.property(locator, "applicationBenchmark", sourceApplicationBenchmark), sourceApplicationBenchmark));
                copy.applicationBenchmark = null;
                if (copyApplicationBenchmark!= null) {
                    List<ApplicationBenchmark> uniqueApplicationBenchmarkl = copy.getApplicationBenchmark();
                    uniqueApplicationBenchmarkl.addAll(copyApplicationBenchmark);
                }
            } else {
                copy.applicationBenchmark = null;
            }
            if (this.computedPower!= null) {
                Power sourceComputedPower;
                sourceComputedPower = this.getComputedPower();
                Power copyComputedPower = ((Power) strategy.copy(LocatorUtils.property(locator, "computedPower", sourceComputedPower), sourceComputedPower));
                copy.setComputedPower(copyComputedPower);
            } else {
                copy.computedPower = null;
            }
            if ((this.rack!= null)&&(!this.rack.isEmpty())) {
                List<Rack> sourceRack;
                sourceRack = (((this.rack!= null)&&(!this.rack.isEmpty()))?this.getRack():null);
                @SuppressWarnings("unchecked")
                List<Rack> copyRack = ((List<Rack> ) strategy.copy(LocatorUtils.property(locator, "rack", sourceRack), sourceRack));
                copy.rack = null;
                if (copyRack!= null) {
                    List<Rack> uniqueRackl = copy.getRack();
                    uniqueRackl.addAll(copyRack);
                }
            } else {
                copy.rack = null;
            }
            if ((this.towerServer!= null)&&(!this.towerServer.isEmpty())) {
                List<TowerServer> sourceTowerServer;
                sourceTowerServer = (((this.towerServer!= null)&&(!this.towerServer.isEmpty()))?this.getTowerServer():null);
                @SuppressWarnings("unchecked")
                List<TowerServer> copyTowerServer = ((List<TowerServer> ) strategy.copy(LocatorUtils.property(locator, "towerServer", sourceTowerServer), sourceTowerServer));
                copy.towerServer = null;
                if (copyTowerServer!= null) {
                    List<TowerServer> uniqueTowerServerl = copy.getTowerServer();
                    uniqueTowerServerl.addAll(copyTowerServer);
                }
            } else {
                copy.towerServer = null;
            }
            if ((this.boxRouter!= null)&&(!this.boxRouter.isEmpty())) {
                List<BoxRouter> sourceBoxRouter;
                sourceBoxRouter = (((this.boxRouter!= null)&&(!this.boxRouter.isEmpty()))?this.getBoxRouter():null);
                @SuppressWarnings("unchecked")
                List<BoxRouter> copyBoxRouter = ((List<BoxRouter> ) strategy.copy(LocatorUtils.property(locator, "boxRouter", sourceBoxRouter), sourceBoxRouter));
                copy.boxRouter = null;
                if (copyBoxRouter!= null) {
                    List<BoxRouter> uniqueBoxRouterl = copy.getBoxRouter();
                    uniqueBoxRouterl.addAll(copyBoxRouter);
                }
            } else {
                copy.boxRouter = null;
            }
            if ((this.boxSwitch!= null)&&(!this.boxSwitch.isEmpty())) {
                List<BoxSwitch> sourceBoxSwitch;
                sourceBoxSwitch = (((this.boxSwitch!= null)&&(!this.boxSwitch.isEmpty()))?this.getBoxSwitch():null);
                @SuppressWarnings("unchecked")
                List<BoxSwitch> copyBoxSwitch = ((List<BoxSwitch> ) strategy.copy(LocatorUtils.property(locator, "boxSwitch", sourceBoxSwitch), sourceBoxSwitch));
                copy.boxSwitch = null;
                if (copyBoxSwitch!= null) {
                    List<BoxSwitch> uniqueBoxSwitchl = copy.getBoxSwitch();
                    uniqueBoxSwitchl.addAll(copyBoxSwitch);
                }
            } else {
                copy.boxSwitch = null;
            }
            if ((this.frameworkCapabilities!= null)&&(!this.frameworkCapabilities.isEmpty())) {
                List<FrameworkCapabilities> sourceFrameworkCapabilities;
                sourceFrameworkCapabilities = (((this.frameworkCapabilities!= null)&&(!this.frameworkCapabilities.isEmpty()))?this.getFrameworkCapabilities():null);
                @SuppressWarnings("unchecked")
                List<FrameworkCapabilities> copyFrameworkCapabilities = ((List<FrameworkCapabilities> ) strategy.copy(LocatorUtils.property(locator, "frameworkCapabilities", sourceFrameworkCapabilities), sourceFrameworkCapabilities));
                copy.frameworkCapabilities = null;
                if (copyFrameworkCapabilities!= null) {
                    List<FrameworkCapabilities> uniqueFrameworkCapabilitiesl = copy.getFrameworkCapabilities();
                    uniqueFrameworkCapabilitiesl.addAll(copyFrameworkCapabilities);
                }
            } else {
                copy.frameworkCapabilities = null;
            }
            if (this.networkLoad!= null) {
                NetworkLoad sourceNetworkLoad;
                sourceNetworkLoad = this.getNetworkLoad();
                NetworkLoad copyNetworkLoad = ((NetworkLoad) strategy.copy(LocatorUtils.property(locator, "networkLoad", sourceNetworkLoad), sourceNetworkLoad));
                copy.setNetworkLoad(copyNetworkLoad);
            } else {
                copy.networkLoad = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Datacenter();
    }

}
