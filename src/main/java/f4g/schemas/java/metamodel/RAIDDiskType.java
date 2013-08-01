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
 * <p>Java class for RAIDDiskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RAIDDiskType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="raidDiskId" type="{http://www.w3.org/2001/XMLSchema}ID"/>
 *         &lt;element name="level" type="{java/MetaModel}RAIDLevelType"/>
 *         &lt;element name="computedPower" type="{java/MetaModel}PowerType" minOccurs="0"/>
 *         &lt;element name="readRate" type="{java/MetaModel}IoRateType"/>
 *         &lt;element name="writeRate" type="{java/MetaModel}IoRateType"/>
 *         &lt;element name="maxReadRate" type="{java/MetaModel}IoRateType"/>
 *         &lt;element name="maxWriteRate" type="{java/MetaModel}IoRateType"/>
 *         &lt;element name="numberOfReadOps" type="{java/MetaModel}OPType"/>
 *         &lt;element name="numberOfWriteOps" type="{java/MetaModel}OPType"/>
 *         &lt;element name="blockSize" type="{java/MetaModel}BlockSizeType"/>
 *         &lt;element ref="{java/MetaModel}FileSystem" minOccurs="0"/>
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
@XmlType(name = "RAIDDiskType", propOrder = {
    "raidDiskId",
    "level",
    "computedPower",
    "readRate",
    "writeRate",
    "maxReadRate",
    "maxWriteRate",
    "numberOfReadOps",
    "numberOfWriteOps",
    "blockSize",
    "fileSystem",
    "solidStateDisk",
    "hardDisk"
})
public class RAIDDiskType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String raidDiskId;
    @XmlElement(required = true)
    protected RAIDLevelType level;
    protected PowerType computedPower;
    @XmlElement(required = true)
    protected IoRateType readRate;
    @XmlElement(required = true)
    protected IoRateType writeRate;
    @XmlElement(required = true)
    protected IoRateType maxReadRate;
    @XmlElement(required = true)
    protected IoRateType maxWriteRate;
    @XmlElement(required = true)
    protected OPType numberOfReadOps;
    @XmlElement(required = true)
    protected OPType numberOfWriteOps;
    @XmlElement(required = true)
    protected BlockSizeType blockSize;
    @XmlElement(name = "FileSystem", namespace = "java/MetaModel")
    protected FileSystemType fileSystem;
    @XmlElement(name = "SolidStateDisk", namespace = "java/MetaModel")
    protected List<SolidStateDiskType> solidStateDisk;
    @XmlElement(name = "HardDisk", namespace = "java/MetaModel")
    protected List<HardDiskType> hardDisk;

    /**
     * Gets the value of the raidDiskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaidDiskId() {
        return raidDiskId;
    }

    /**
     * Sets the value of the raidDiskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaidDiskId(String value) {
        this.raidDiskId = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link RAIDLevelType }
     *     
     */
    public RAIDLevelType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAIDLevelType }
     *     
     */
    public void setLevel(RAIDLevelType value) {
        this.level = value;
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
     * Gets the value of the numberOfReadOps property.
     * 
     * @return
     *     possible object is
     *     {@link OPType }
     *     
     */
    public OPType getNumberOfReadOps() {
        return numberOfReadOps;
    }

    /**
     * Sets the value of the numberOfReadOps property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPType }
     *     
     */
    public void setNumberOfReadOps(OPType value) {
        this.numberOfReadOps = value;
    }

    /**
     * Gets the value of the numberOfWriteOps property.
     * 
     * @return
     *     possible object is
     *     {@link OPType }
     *     
     */
    public OPType getNumberOfWriteOps() {
        return numberOfWriteOps;
    }

    /**
     * Sets the value of the numberOfWriteOps property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPType }
     *     
     */
    public void setNumberOfWriteOps(OPType value) {
        this.numberOfWriteOps = value;
    }

    /**
     * Gets the value of the blockSize property.
     * 
     * @return
     *     possible object is
     *     {@link BlockSizeType }
     *     
     */
    public BlockSizeType getBlockSize() {
        return blockSize;
    }

    /**
     * Sets the value of the blockSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockSizeType }
     *     
     */
    public void setBlockSize(BlockSizeType value) {
        this.blockSize = value;
    }

    /**
     * Gets the value of the fileSystem property.
     * 
     * @return
     *     possible object is
     *     {@link FileSystemType }
     *     
     */
    public FileSystemType getFileSystem() {
        return fileSystem;
    }

    /**
     * Sets the value of the fileSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSystemType }
     *     
     */
    public void setFileSystem(FileSystemType value) {
        this.fileSystem = value;
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
