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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LogicalUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogicalUnitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lunId" type="{http://www.w3.org/2001/XMLSchema}ID"/>
 *         &lt;element name="readRate" type="{java/MetaModel}IoRateType"/>
 *         &lt;element name="writeRate" type="{java/MetaModel}IoRateType"/>
 *         &lt;element name="maxReadRate" type="{java/MetaModel}IoRateType"/>
 *         &lt;element name="maxWriteRate" type="{java/MetaModel}IoRateType"/>
 *         &lt;element name="numOfReadOP" type="{java/MetaModel}OPType"/>
 *         &lt;element name="numOfWriteOP" type="{java/MetaModel}OPType"/>
 *         &lt;element name="stripSize" type="{java/MetaModel}StripSizeType"/>
 *         &lt;element name="computedPower" type="{java/MetaModel}PowerType" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}RAID"/>
 *         &lt;element ref="{java/MetaModel}RAIDDisk" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}SolidStateDisk" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}HardDisk" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalUnitType", propOrder = {
    "lunId",
    "readRate",
    "writeRate",
    "maxReadRate",
    "maxWriteRate",
    "numOfReadOP",
    "numOfWriteOP",
    "stripSize",
    "computedPower",
    "raid",
    "raidDisk",
    "solidStateDisk",
    "hardDisk"
})
public class LogicalUnitType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String lunId;
    @XmlElement(required = true)
    protected IoRateType readRate;
    @XmlElement(required = true)
    protected IoRateType writeRate;
    @XmlElement(required = true)
    protected IoRateType maxReadRate;
    @XmlElement(required = true)
    protected IoRateType maxWriteRate;
    @XmlElement(required = true)
    protected OPType numOfReadOP;
    @XmlElement(required = true)
    protected OPType numOfWriteOP;
    @XmlElement(required = true)
    protected StripSizeType stripSize;
    protected PowerType computedPower;
    @XmlElement(name = "RAID", namespace = "java/MetaModel", required = true)
    protected RAIDType raid;
    @XmlElement(name = "RAIDDisk", namespace = "java/MetaModel")
    protected RAIDDiskType raidDisk;
    @XmlElement(name = "SolidStateDisk", namespace = "java/MetaModel")
    protected List<SolidStateDiskType> solidStateDisk;
    @XmlElement(name = "HardDisk", namespace = "java/MetaModel")
    protected List<HardDiskType> hardDisk;

    /**
     * Gets the value of the lunId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLunId() {
        return lunId;
    }

    /**
     * Sets the value of the lunId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLunId(String value) {
        this.lunId = value;
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
     * Gets the value of the numOfReadOP property.
     * 
     * @return
     *     possible object is
     *     {@link OPType }
     *     
     */
    public OPType getNumOfReadOP() {
        return numOfReadOP;
    }

    /**
     * Sets the value of the numOfReadOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPType }
     *     
     */
    public void setNumOfReadOP(OPType value) {
        this.numOfReadOP = value;
    }

    /**
     * Gets the value of the numOfWriteOP property.
     * 
     * @return
     *     possible object is
     *     {@link OPType }
     *     
     */
    public OPType getNumOfWriteOP() {
        return numOfWriteOP;
    }

    /**
     * Sets the value of the numOfWriteOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPType }
     *     
     */
    public void setNumOfWriteOP(OPType value) {
        this.numOfWriteOP = value;
    }

    /**
     * Gets the value of the stripSize property.
     * 
     * @return
     *     possible object is
     *     {@link StripSizeType }
     *     
     */
    public StripSizeType getStripSize() {
        return stripSize;
    }

    /**
     * Sets the value of the stripSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link StripSizeType }
     *     
     */
    public void setStripSize(StripSizeType value) {
        this.stripSize = value;
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
     * Gets the value of the raid property.
     * 
     * @return
     *     possible object is
     *     {@link RAIDType }
     *     
     */
    public RAIDType getRAID() {
        return raid;
    }

    /**
     * Sets the value of the raid property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAIDType }
     *     
     */
    public void setRAID(RAIDType value) {
        this.raid = value;
    }

    /**
     * Gets the value of the raidDisk property.
     * 
     * @return
     *     possible object is
     *     {@link RAIDDiskType }
     *     
     */
    public RAIDDiskType getRAIDDisk() {
        return raidDisk;
    }

    /**
     * Sets the value of the raidDisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAIDDiskType }
     *     
     */
    public void setRAIDDisk(RAIDDiskType value) {
        this.raidDisk = value;
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

}
