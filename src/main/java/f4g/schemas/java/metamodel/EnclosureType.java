//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.31 at 04:14:30 PM CEST 
//


package java.metamodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnclosureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnclosureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="powerIdle" type="{java/MetaModel}PowerType"/>
 *         &lt;element name="powerMax" type="{java/MetaModel}PowerType"/>
 *         &lt;element name="frameworkID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="computedPower" type="{java/MetaModel}PowerType" minOccurs="0"/>
 *         &lt;element name="measuredPower" type="{java/MetaModel}PowerType" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}BladeServer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}EthernetNIC" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}FiberchannelNIC" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}PSU" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}Fan" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}WaterCooler" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="frameworkRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnclosureType", propOrder = {
    "powerIdle",
    "powerMax",
    "frameworkID",
    "computedPower",
    "measuredPower",
    "bladeServer",
    "ethernetNIC",
    "fiberchannelNIC",
    "psu",
    "fan",
    "waterCooler"
})
public class EnclosureType {

    @XmlElement(required = true)
    protected PowerType powerIdle;
    @XmlElement(required = true)
    protected PowerType powerMax;
    @XmlElement(required = true)
    protected String frameworkID;
    protected PowerType computedPower;
    protected PowerType measuredPower;
    @XmlElement(name = "BladeServer", namespace = "java/MetaModel")
    protected List<BladeServerType> bladeServer;
    @XmlElement(name = "EthernetNIC", namespace = "java/MetaModel")
    protected List<NICType> ethernetNIC;
    @XmlElement(name = "FiberchannelNIC", namespace = "java/MetaModel")
    protected List<NICType> fiberchannelNIC;
    @XmlElement(name = "PSU", namespace = "java/MetaModel")
    protected List<PSUType> psu;
    @XmlElement(name = "Fan", namespace = "java/MetaModel")
    protected List<FanType> fan;
    @XmlElement(name = "WaterCooler", namespace = "java/MetaModel")
    protected List<WaterCoolerType> waterCooler;
    @XmlAttribute(name = "frameworkRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object frameworkRef;

    /**
     * Gets the value of the powerIdle property.
     * 
     * @return
     *     possible object is
     *     {@link PowerType }
     *     
     */
    public PowerType getPowerIdle() {
        return powerIdle;
    }

    /**
     * Sets the value of the powerIdle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerType }
     *     
     */
    public void setPowerIdle(PowerType value) {
        this.powerIdle = value;
    }

    /**
     * Gets the value of the powerMax property.
     * 
     * @return
     *     possible object is
     *     {@link PowerType }
     *     
     */
    public PowerType getPowerMax() {
        return powerMax;
    }

    /**
     * Sets the value of the powerMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerType }
     *     
     */
    public void setPowerMax(PowerType value) {
        this.powerMax = value;
    }

    /**
     * Gets the value of the frameworkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameworkID() {
        return frameworkID;
    }

    /**
     * Sets the value of the frameworkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameworkID(String value) {
        this.frameworkID = value;
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

    /**
     * Gets the value of the measuredPower property.
     * 
     * @return
     *     possible object is
     *     {@link PowerType }
     *     
     */
    public PowerType getMeasuredPower() {
        return measuredPower;
    }

    /**
     * Sets the value of the measuredPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerType }
     *     
     */
    public void setMeasuredPower(PowerType value) {
        this.measuredPower = value;
    }

    /**
     * Gets the value of the bladeServer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bladeServer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBladeServer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BladeServerType }
     * 
     * 
     */
    public List<BladeServerType> getBladeServer() {
        if (bladeServer == null) {
            bladeServer = new ArrayList<BladeServerType>();
        }
        return this.bladeServer;
    }

    /**
     * Gets the value of the ethernetNIC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ethernetNIC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEthernetNIC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NICType }
     * 
     * 
     */
    public List<NICType> getEthernetNIC() {
        if (ethernetNIC == null) {
            ethernetNIC = new ArrayList<NICType>();
        }
        return this.ethernetNIC;
    }

    /**
     * Gets the value of the fiberchannelNIC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiberchannelNIC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiberchannelNIC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NICType }
     * 
     * 
     */
    public List<NICType> getFiberchannelNIC() {
        if (fiberchannelNIC == null) {
            fiberchannelNIC = new ArrayList<NICType>();
        }
        return this.fiberchannelNIC;
    }

    /**
     * Gets the value of the psu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the psu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPSU().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PSUType }
     * 
     * 
     */
    public List<PSUType> getPSU() {
        if (psu == null) {
            psu = new ArrayList<PSUType>();
        }
        return this.psu;
    }

    /**
     * Gets the value of the fan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FanType }
     * 
     * 
     */
    public List<FanType> getFan() {
        if (fan == null) {
            fan = new ArrayList<FanType>();
        }
        return this.fan;
    }

    /**
     * Gets the value of the waterCooler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waterCooler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaterCooler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaterCoolerType }
     * 
     * 
     */
    public List<WaterCoolerType> getWaterCooler() {
        if (waterCooler == null) {
            waterCooler = new ArrayList<WaterCoolerType>();
        }
        return this.waterCooler;
    }

    /**
     * Gets the value of the frameworkRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFrameworkRef() {
        return frameworkRef;
    }

    /**
     * Sets the value of the frameworkRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFrameworkRef(Object value) {
        this.frameworkRef = value;
    }

}
