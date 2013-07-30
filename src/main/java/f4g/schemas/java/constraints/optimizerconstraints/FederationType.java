//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.30 at 04:51:12 PM CEST 
//


package java.constraints.optimizerconstraints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FederationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FederationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BoundedCluster" type="{java/constraints/OptimizerConstraints}boundedClustersType"/>
 *         &lt;element name="BoundedPolicies" type="{java/constraints/OptimizerConstraints}boundedPoliciesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FederationType", propOrder = {
    "name",
    "boundedCluster",
    "boundedPolicies"
})
public class FederationType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "BoundedCluster", required = true)
    protected BoundedClustersType boundedCluster;
    @XmlElement(name = "BoundedPolicies", required = true)
    protected BoundedPoliciesType boundedPolicies;

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
     * Gets the value of the boundedCluster property.
     * 
     * @return
     *     possible object is
     *     {@link BoundedClustersType }
     *     
     */
    public BoundedClustersType getBoundedCluster() {
        return boundedCluster;
    }

    /**
     * Sets the value of the boundedCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundedClustersType }
     *     
     */
    public void setBoundedCluster(BoundedClustersType value) {
        this.boundedCluster = value;
    }

    /**
     * Gets the value of the boundedPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link BoundedPoliciesType }
     *     
     */
    public BoundedPoliciesType getBoundedPolicies() {
        return boundedPolicies;
    }

    /**
     * Sets the value of the boundedPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundedPoliciesType }
     *     
     */
    public void setBoundedPolicies(BoundedPoliciesType value) {
        this.boundedPolicies = value;
    }

}