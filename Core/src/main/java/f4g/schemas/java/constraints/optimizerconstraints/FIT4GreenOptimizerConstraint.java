//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.10 at 04:34:50 PM CEST 
//


package f4g.schemas.java.constraints.optimizerconstraints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.massfords.humantask.Visitable;
import com.massfords.humantask.Visitor;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VirtualMachines" type="{f4g/schemas/java/constraints/OptimizerConstraints}VMFlavorType"/&gt;
 *         &lt;element name="FIT4GreenFederation" type="{f4g/schemas/java/constraints/OptimizerConstraints}FederationType" minOccurs="0"/&gt;
 *         &lt;element name="FIT4GreenCluster" type="{f4g/schemas/java/constraints/OptimizerConstraints}ClusterType"/&gt;
 *         &lt;element name="FIT4GreenServerGroup" type="{f4g/schemas/java/constraints/OptimizerConstraints}ServerGroupType" minOccurs="0"/&gt;
 *         &lt;element name="ListOfSLA" type="{f4g/schemas/java/constraints/OptimizerConstraints}SLAType"/&gt;
 *         &lt;element name="ListOfPolicies" type="{f4g/schemas/java/constraints/OptimizerConstraints}PolicyType"/&gt;
 *         &lt;element name="ListOfPlacementConstraints" type="{f4g/schemas/java/constraints/OptimizerConstraints}Constraint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "virtualMachines",
    "fit4GreenFederation",
    "fit4GreenCluster",
    "fit4GreenServerGroup",
    "listOfSLA",
    "listOfPolicies",
    "listOfPlacementConstraints"
})
@XmlRootElement(name = "FIT4GreenOptimizerConstraint")
public class FIT4GreenOptimizerConstraint implements Cloneable, Visitable, CopyTo
{

    @XmlElement(name = "VirtualMachines", required = true)
    protected VMFlavorType virtualMachines;
    @XmlElement(name = "FIT4GreenFederation")
    protected FederationType fit4GreenFederation;
    @XmlElement(name = "FIT4GreenCluster", required = true)
    protected ClusterType fit4GreenCluster;
    @XmlElement(name = "FIT4GreenServerGroup")
    protected ServerGroupType fit4GreenServerGroup;
    @XmlElement(name = "ListOfSLA", required = true)
    protected SLAType listOfSLA;
    @XmlElement(name = "ListOfPolicies", required = true)
    protected PolicyType listOfPolicies;
    @XmlElement(name = "ListOfPlacementConstraints")
    protected Constraint listOfPlacementConstraints;

    /**
     * Default no-arg constructor
     * 
     */
    public FIT4GreenOptimizerConstraint() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FIT4GreenOptimizerConstraint(final VMFlavorType virtualMachines, final FederationType fit4GreenFederation, final ClusterType fit4GreenCluster, final ServerGroupType fit4GreenServerGroup, final SLAType listOfSLA, final PolicyType listOfPolicies, final Constraint listOfPlacementConstraints) {
        this.virtualMachines = virtualMachines;
        this.fit4GreenFederation = fit4GreenFederation;
        this.fit4GreenCluster = fit4GreenCluster;
        this.fit4GreenServerGroup = fit4GreenServerGroup;
        this.listOfSLA = listOfSLA;
        this.listOfPolicies = listOfPolicies;
        this.listOfPlacementConstraints = listOfPlacementConstraints;
    }

    /**
     * Gets the value of the virtualMachines property.
     * 
     * @return
     *     possible object is
     *     {@link VMFlavorType }
     *     
     */
    public VMFlavorType getVirtualMachines() {
        return virtualMachines;
    }

    /**
     * Sets the value of the virtualMachines property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMFlavorType }
     *     
     */
    public void setVirtualMachines(VMFlavorType value) {
        this.virtualMachines = value;
    }

    /**
     * Gets the value of the fit4GreenFederation property.
     * 
     * @return
     *     possible object is
     *     {@link FederationType }
     *     
     */
    public FederationType getFIT4GreenFederation() {
        return fit4GreenFederation;
    }

    /**
     * Sets the value of the fit4GreenFederation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FederationType }
     *     
     */
    public void setFIT4GreenFederation(FederationType value) {
        this.fit4GreenFederation = value;
    }

    /**
     * Gets the value of the fit4GreenCluster property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterType }
     *     
     */
    public ClusterType getFIT4GreenCluster() {
        return fit4GreenCluster;
    }

    /**
     * Sets the value of the fit4GreenCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterType }
     *     
     */
    public void setFIT4GreenCluster(ClusterType value) {
        this.fit4GreenCluster = value;
    }

    /**
     * Gets the value of the fit4GreenServerGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ServerGroupType }
     *     
     */
    public ServerGroupType getFIT4GreenServerGroup() {
        return fit4GreenServerGroup;
    }

    /**
     * Sets the value of the fit4GreenServerGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerGroupType }
     *     
     */
    public void setFIT4GreenServerGroup(ServerGroupType value) {
        this.fit4GreenServerGroup = value;
    }

    /**
     * Gets the value of the listOfSLA property.
     * 
     * @return
     *     possible object is
     *     {@link SLAType }
     *     
     */
    public SLAType getListOfSLA() {
        return listOfSLA;
    }

    /**
     * Sets the value of the listOfSLA property.
     * 
     * @param value
     *     allowed object is
     *     {@link SLAType }
     *     
     */
    public void setListOfSLA(SLAType value) {
        this.listOfSLA = value;
    }

    /**
     * Gets the value of the listOfPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType }
     *     
     */
    public PolicyType getListOfPolicies() {
        return listOfPolicies;
    }

    /**
     * Sets the value of the listOfPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType }
     *     
     */
    public void setListOfPolicies(PolicyType value) {
        this.listOfPolicies = value;
    }

    /**
     * Gets the value of the listOfPlacementConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link Constraint }
     *     
     */
    public Constraint getListOfPlacementConstraints() {
        return listOfPlacementConstraints;
    }

    /**
     * Sets the value of the listOfPlacementConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Constraint }
     *     
     */
    public void setListOfPlacementConstraints(Constraint value) {
        this.listOfPlacementConstraints = value;
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
        if (draftCopy instanceof FIT4GreenOptimizerConstraint) {
            final FIT4GreenOptimizerConstraint copy = ((FIT4GreenOptimizerConstraint) draftCopy);
            if (this.virtualMachines!= null) {
                VMFlavorType sourceVirtualMachines;
                sourceVirtualMachines = this.getVirtualMachines();
                VMFlavorType copyVirtualMachines = ((VMFlavorType) strategy.copy(LocatorUtils.property(locator, "virtualMachines", sourceVirtualMachines), sourceVirtualMachines));
                copy.setVirtualMachines(copyVirtualMachines);
            } else {
                copy.virtualMachines = null;
            }
            if (this.fit4GreenFederation!= null) {
                FederationType sourceFIT4GreenFederation;
                sourceFIT4GreenFederation = this.getFIT4GreenFederation();
                FederationType copyFIT4GreenFederation = ((FederationType) strategy.copy(LocatorUtils.property(locator, "fit4GreenFederation", sourceFIT4GreenFederation), sourceFIT4GreenFederation));
                copy.setFIT4GreenFederation(copyFIT4GreenFederation);
            } else {
                copy.fit4GreenFederation = null;
            }
            if (this.fit4GreenCluster!= null) {
                ClusterType sourceFIT4GreenCluster;
                sourceFIT4GreenCluster = this.getFIT4GreenCluster();
                ClusterType copyFIT4GreenCluster = ((ClusterType) strategy.copy(LocatorUtils.property(locator, "fit4GreenCluster", sourceFIT4GreenCluster), sourceFIT4GreenCluster));
                copy.setFIT4GreenCluster(copyFIT4GreenCluster);
            } else {
                copy.fit4GreenCluster = null;
            }
            if (this.fit4GreenServerGroup!= null) {
                ServerGroupType sourceFIT4GreenServerGroup;
                sourceFIT4GreenServerGroup = this.getFIT4GreenServerGroup();
                ServerGroupType copyFIT4GreenServerGroup = ((ServerGroupType) strategy.copy(LocatorUtils.property(locator, "fit4GreenServerGroup", sourceFIT4GreenServerGroup), sourceFIT4GreenServerGroup));
                copy.setFIT4GreenServerGroup(copyFIT4GreenServerGroup);
            } else {
                copy.fit4GreenServerGroup = null;
            }
            if (this.listOfSLA!= null) {
                SLAType sourceListOfSLA;
                sourceListOfSLA = this.getListOfSLA();
                SLAType copyListOfSLA = ((SLAType) strategy.copy(LocatorUtils.property(locator, "listOfSLA", sourceListOfSLA), sourceListOfSLA));
                copy.setListOfSLA(copyListOfSLA);
            } else {
                copy.listOfSLA = null;
            }
            if (this.listOfPolicies!= null) {
                PolicyType sourceListOfPolicies;
                sourceListOfPolicies = this.getListOfPolicies();
                PolicyType copyListOfPolicies = ((PolicyType) strategy.copy(LocatorUtils.property(locator, "listOfPolicies", sourceListOfPolicies), sourceListOfPolicies));
                copy.setListOfPolicies(copyListOfPolicies);
            } else {
                copy.listOfPolicies = null;
            }
            if (this.listOfPlacementConstraints!= null) {
                Constraint sourceListOfPlacementConstraints;
                sourceListOfPlacementConstraints = this.getListOfPlacementConstraints();
                Constraint copyListOfPlacementConstraints = ((Constraint) strategy.copy(LocatorUtils.property(locator, "listOfPlacementConstraints", sourceListOfPlacementConstraints), sourceListOfPlacementConstraints));
                copy.setListOfPlacementConstraints(copyListOfPlacementConstraints);
            } else {
                copy.listOfPlacementConstraints = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FIT4GreenOptimizerConstraint();
    }

}
