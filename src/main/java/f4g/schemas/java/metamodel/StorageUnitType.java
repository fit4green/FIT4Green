//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.30 at 04:51:12 PM CEST 
//


package java.metamodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorageUnitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frameworkID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storageCapacity" type="{java/MetaModel}StorageCapacityType"/>
 *         &lt;element name="maxReadRate" type="{java/MetaModel}IoRateType"/>
 *         &lt;element name="maxWriteRate" type="{java/MetaModel}IoRateType"/>
 *         &lt;element name="readRate" type="{java/MetaModel}IoRateType" minOccurs="0"/>
 *         &lt;element name="writeRate" type="{java/MetaModel}IoRateType" minOccurs="0"/>
 *         &lt;element name="powerIdle" type="{java/MetaModel}PowerType"/>
 *         &lt;element name="powerMax" type="{java/MetaModel}PowerType"/>
 *         &lt;element name="computedPower" type="{java/MetaModel}PowerType" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}Cache" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageUnitType", propOrder = {
    "frameworkID",
    "storageCapacity",
    "maxReadRate",
    "maxWriteRate",
    "readRate",
    "writeRate",
    "powerIdle",
    "powerMax",
    "computedPower",
    "cache"
})
@XmlSeeAlso({
    SolidStateDiskType.class,
    HardDiskType.class
})
public class StorageUnitType {

    protected String frameworkID;
    @XmlElement(required = true)
    protected StorageCapacityType storageCapacity;
    @XmlElement(required = true)
    protected IoRateType maxReadRate;
    @XmlElement(required = true)
    protected IoRateType maxWriteRate;
    protected IoRateType readRate;
    protected IoRateType writeRate;
    @XmlElement(required = true)
    protected PowerType powerIdle;
    @XmlElement(required = true)
    protected PowerType powerMax;
    protected PowerType computedPower;
    @XmlElement(name = "Cache", namespace = "java/MetaModel")
    protected List<CacheType> cache;

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
     * Gets the value of the storageCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link StorageCapacityType }
     *     
     */
    public StorageCapacityType getStorageCapacity() {
        return storageCapacity;
    }

    /**
     * Sets the value of the storageCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageCapacityType }
     *     
     */
    public void setStorageCapacity(StorageCapacityType value) {
        this.storageCapacity = value;
    }

    /**
     * Gets the value of the maxReadRate property.
     * 
     * @return
     *     possible object is
     *     {@link IoRateType }
     *     
     */
    public IoRateType getMaxReadRate() {
        return maxReadRate;
    }

    /**
     * Sets the value of the maxReadRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IoRateType }
     *     
     */
    public void setMaxReadRate(IoRateType value) {
        this.maxReadRate = value;
    }

    /**
     * Gets the value of the maxWriteRate property.
     * 
     * @return
     *     possible object is
     *     {@link IoRateType }
     *     
     */
    public IoRateType getMaxWriteRate() {
        return maxWriteRate;
    }

    /**
     * Sets the value of the maxWriteRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IoRateType }
     *     
     */
    public void setMaxWriteRate(IoRateType value) {
        this.maxWriteRate = value;
    }

    /**
     * Gets the value of the readRate property.
     * 
     * @return
     *     possible object is
     *     {@link IoRateType }
     *     
     */
    public IoRateType getReadRate() {
        return readRate;
    }

    /**
     * Sets the value of the readRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IoRateType }
     *     
     */
    public void setReadRate(IoRateType value) {
        this.readRate = value;
    }

    /**
     * Gets the value of the writeRate property.
     * 
     * @return
     *     possible object is
     *     {@link IoRateType }
     *     
     */
    public IoRateType getWriteRate() {
        return writeRate;
    }

    /**
     * Sets the value of the writeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IoRateType }
     *     
     */
    public void setWriteRate(IoRateType value) {
        this.writeRate = value;
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

}
