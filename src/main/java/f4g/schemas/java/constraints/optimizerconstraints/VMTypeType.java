//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.30 at 04:51:12 PM CEST 
//


package java.constraints.optimizerconstraints;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VMTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VMType" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="capacity" type="{java/constraints/OptimizerConstraints}capacityType"/>
 *                   &lt;element name="expectedLoad" type="{java/constraints/OptimizerConstraints}expectedLoadType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMTypeType", propOrder = {
    "vmType"
})
public class VMTypeType {

    @XmlElement(name = "VMType", required = true)
    protected List<VMTypeType.VMType> vmType;

    /**
     * Gets the value of the vmType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVMType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VMTypeType.VMType }
     * 
     * 
     */
    public List<VMTypeType.VMType> getVMType() {
        if (vmType == null) {
            vmType = new ArrayList<VMTypeType.VMType>();
        }
        return this.vmType;
    }


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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="capacity" type="{java/constraints/OptimizerConstraints}capacityType"/>
     *         &lt;element name="expectedLoad" type="{java/constraints/OptimizerConstraints}expectedLoadType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "capacity",
        "expectedLoad"
    })
    public static class VMType {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected CapacityType capacity;
        @XmlElement(required = true)
        protected ExpectedLoadType expectedLoad;

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
         * Gets the value of the capacity property.
         * 
         * @return
         *     possible object is
         *     {@link CapacityType }
         *     
         */
        public CapacityType getCapacity() {
            return capacity;
        }

        /**
         * Sets the value of the capacity property.
         * 
         * @param value
         *     allowed object is
         *     {@link CapacityType }
         *     
         */
        public void setCapacity(CapacityType value) {
            this.capacity = value;
        }

        /**
         * Gets the value of the expectedLoad property.
         * 
         * @return
         *     possible object is
         *     {@link ExpectedLoadType }
         *     
         */
        public ExpectedLoadType getExpectedLoad() {
            return expectedLoad;
        }

        /**
         * Sets the value of the expectedLoad property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExpectedLoadType }
         *     
         */
        public void setExpectedLoad(ExpectedLoadType value) {
            this.expectedLoad = value;
        }

    }

}