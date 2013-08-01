//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.31 at 04:14:30 PM CEST 
//


package java.metamodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RAMStickType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RAMStickType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="voltage" type="{java/MetaModel}VoltageType"/>
 *         &lt;element name="size" type="{java/MetaModel}RAMSizeType"/>
 *         &lt;element name="type" type="{java/MetaModel}RAMTypeType"/>
 *         &lt;element name="frequency" type="{java/MetaModel}FrequencyType"/>
 *         &lt;element name="bufferType" type="{java/MetaModel}BufferTypeType"/>
 *         &lt;element name="vendor" type="{java/MetaModel}RAMTypeVendorType"/>
 *         &lt;element name="computedPower" type="{java/MetaModel}PowerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RAMStickType", propOrder = {
    "voltage",
    "size",
    "type",
    "frequency",
    "bufferType",
    "vendor",
    "computedPower"
})
public class RAMStickType {

    @XmlElement(required = true)
    protected VoltageType voltage;
    @XmlElement(required = true)
    protected RAMSizeType size;
    @XmlElement(required = true)
    protected RAMTypeType type;
    @XmlElement(required = true)
    protected FrequencyType frequency;
    @XmlElement(required = true)
    protected BufferTypeType bufferType;
    @XmlElement(required = true)
    protected RAMTypeVendorType vendor;
    protected PowerType computedPower;

    /**
     * Gets the value of the voltage property.
     * 
     * @return
     *     possible object is
     *     {@link VoltageType }
     *     
     */
    public VoltageType getVoltage() {
        return voltage;
    }

    /**
     * Sets the value of the voltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageType }
     *     
     */
    public void setVoltage(VoltageType value) {
        this.voltage = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link RAMSizeType }
     *     
     */
    public RAMSizeType getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAMSizeType }
     *     
     */
    public void setSize(RAMSizeType value) {
        this.size = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RAMTypeType }
     *     
     */
    public RAMTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAMTypeType }
     *     
     */
    public void setType(RAMTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyType }
     *     
     */
    public FrequencyType getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyType }
     *     
     */
    public void setFrequency(FrequencyType value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the bufferType property.
     * 
     * @return
     *     possible object is
     *     {@link BufferTypeType }
     *     
     */
    public BufferTypeType getBufferType() {
        return bufferType;
    }

    /**
     * Sets the value of the bufferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BufferTypeType }
     *     
     */
    public void setBufferType(BufferTypeType value) {
        this.bufferType = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link RAMTypeVendorType }
     *     
     */
    public RAMTypeVendorType getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAMTypeVendorType }
     *     
     */
    public void setVendor(RAMTypeVendorType value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the computedPower property.
     * 
     * @return
     *     possible object is
     *     {@link PowerType }
     *     
     */
    public PowerType getComputedPower() {
        return computedPower;
    }

    /**
     * Sets the value of the computedPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerType }
     *     
     */
    public void setComputedPower(PowerType value) {
        this.computedPower = value;
    }

}
