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
 * <p>Java class for NASType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NASType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frameworkID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="computedPower" type="{java/MetaModel}PowerType" minOccurs="0"/>
 *         &lt;element name="measuredPower" type="{java/MetaModel}PowerType" minOccurs="0"/>
 *         &lt;element name="powerIdle" type="{java/MetaModel}PowerType"/>
 *         &lt;element name="powerMax" type="{java/MetaModel}PowerType"/>
 *         &lt;element name="constantFactor" type="{java/MetaModel}PowerType"/>
 *         &lt;element ref="{java/MetaModel}Cache" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}Controller" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}RAIDDisk" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}Fan" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}PSU" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}EthernetNIC" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}FiberchannelNIC" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}SolidStateDisk" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}HardDisk" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="frameworkRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NASType", propOrder = {
    "frameworkID",
    "computedPower",
    "measuredPower",
    "powerIdle",
    "powerMax",
    "constantFactor",
    "cache",
    "controller",
    "raidDisk",
    "fan",
    "psu",
    "ethernetNIC",
    "fiberchannelNIC",
    "solidStateDisk",
    "hardDisk"
})
public class NASType {

    @XmlElement(required = true)
    protected String frameworkID;
    protected PowerType computedPower;
    protected PowerType measuredPower;
    @XmlElement(required = true)
    protected PowerType powerIdle;
    @XmlElement(required = true)
    protected PowerType powerMax;
    @XmlElement(required = true)
    protected PowerType constantFactor;
    @XmlElement(name = "Cache", namespace = "java/MetaModel")
    protected List<CacheType> cache;
    @XmlElement(name = "Controller", namespace = "java/MetaModel")
    protected List<ControllerType> controller;
    @XmlElement(name = "RAIDDisk", namespace = "java/MetaModel")
    protected List<RAIDDiskType> raidDisk;
    @XmlElement(name = "Fan", namespace = "java/MetaModel")
    protected List<FanType> fan;
    @XmlElement(name = "PSU", namespace = "java/MetaModel")
    protected List<PSUType> psu;
    @XmlElement(name = "EthernetNIC", namespace = "java/MetaModel")
    protected List<NICType> ethernetNIC;
    @XmlElement(name = "FiberchannelNIC", namespace = "java/MetaModel")
    protected List<NICType> fiberchannelNIC;
    @XmlElement(name = "SolidStateDisk", namespace = "java/MetaModel")
    protected List<SolidStateDiskType> solidStateDisk;
    @XmlElement(name = "HardDisk", namespace = "java/MetaModel")
    protected List<HardDiskType> hardDisk;
    @XmlAttribute(name = "frameworkRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object frameworkRef;

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
     * Gets the value of the constantFactor property.
     * 
     * @return
     *     possible object is
     *     {@link PowerType }
     *     
     */
    public PowerType getConstantFactor() {
        return constantFactor;
    }

    /**
     * Sets the value of the constantFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerType }
     *     
     */
    public void setConstantFactor(PowerType value) {
        this.constantFactor = value;
    }

    /**
     * Gets the value of the cache property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cache property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCache().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CacheType }
     * 
     * 
     */
    public List<CacheType> getCache() {
        if (cache == null) {
            cache = new ArrayList<CacheType>();
        }
        return this.cache;
    }

    /**
     * Gets the value of the controller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getController().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControllerType }
     * 
     * 
     */
    public List<ControllerType> getController() {
        if (controller == null) {
            controller = new ArrayList<ControllerType>();
        }
        return this.controller;
    }

    /**
     * Gets the value of the raidDisk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the raidDisk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRAIDDisk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RAIDDiskType }
     * 
     * 
     */
    public List<RAIDDiskType> getRAIDDisk() {
        if (raidDisk == null) {
            raidDisk = new ArrayList<RAIDDiskType>();
        }
        return this.raidDisk;
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
     * Gets the value of the solidStateDisk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solidStateDisk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolidStateDisk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SolidStateDiskType }
     * 
     * 
     */
    public List<SolidStateDiskType> getSolidStateDisk() {
        if (solidStateDisk == null) {
            solidStateDisk = new ArrayList<SolidStateDiskType>();
        }
        return this.solidStateDisk;
    }

    /**
     * Gets the value of the hardDisk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardDisk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardDisk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HardDiskType }
     * 
     * 
     */
    public List<HardDiskType> getHardDisk() {
        if (hardDisk == null) {
            hardDisk = new ArrayList<HardDiskType>();
        }
        return this.hardDisk;
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
