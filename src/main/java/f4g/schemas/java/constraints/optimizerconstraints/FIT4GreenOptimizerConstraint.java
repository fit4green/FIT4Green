//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.31 at 04:14:30 PM CEST 
//


package java.constraints.optimizerconstraints;

import java.metamodel.ScenarioType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VirtualMachines" type="{java/constraints/OptimizerConstraints}VMTypeType"/>
 *         &lt;element name="FIT4GreenFederation" type="{java/constraints/OptimizerConstraints}FederationType" minOccurs="0"/>
 *         &lt;element name="FIT4GreenCluster" type="{java/constraints/OptimizerConstraints}ClusterType"/>
 *         &lt;element name="FIT4GreenServerGroup" type="{java/constraints/OptimizerConstraints}ServerGroupType" minOccurs="0"/>
 *         &lt;element name="ListOfSLA" type="{java/constraints/OptimizerConstraints}SLAType"/>
 *         &lt;element name="ListOfPolicies" type="{java/constraints/OptimizerConstraints}PolicyType"/>
 *         &lt;element name="ListOfPlacementConstraints" type="{java/constraints/OptimizerConstraints}ConstraintType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{java/CommonTypes}TSAttr"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
public class FIT4GreenOptimizerConstraint {

    @XmlElement(name = "VirtualMachines", required = true)
    protected VMTypeType virtualMachines;
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
    protected ConstraintType listOfPlacementConstraints;
    @XmlAttribute(name = "scenario", required = true)
    protected ScenarioType scenario;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the virtualMachines property.
     * 
     * @return
     *     possible object is
     *     {@link VMTypeType }
     *     
     */
    public VMTypeType getVirtualMachines() {
        return virtualMachines;
    }

    /**
     * Sets the value of the virtualMachines property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMTypeType }
     *     
     */
    public void setVirtualMachines(VMTypeType value) {
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
     *     {@link ConstraintType }
     *     
     */
    public ConstraintType getListOfPlacementConstraints() {
        return listOfPlacementConstraints;
    }

    /**
     * Sets the value of the listOfPlacementConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintType }
     *     
     */
    public void setListOfPlacementConstraints(ConstraintType value) {
        this.listOfPlacementConstraints = value;
    }

    /**
     * Gets the value of the scenario property.
     * 
     * @return
     *     possible object is
     *     {@link ScenarioType }
     *     
     */
    public ScenarioType getScenario() {
        return scenario;
    }

    /**
     * Sets the value of the scenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScenarioType }
     *     
     */
    public void setScenario(ScenarioType value) {
        this.scenario = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
