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
 * <p>Java class for OperatingSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingSystemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{java/MetaModel}OperatingSystemTypeType"/>
 *         &lt;element name="systemRAMBaseUsage" type="{java/MetaModel}MemoryUsageType" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}FileSystem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}SoftwareRAID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}SoftwareNetwork" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingSystemType", propOrder = {
    "name",
    "systemRAMBaseUsage",
    "fileSystem",
    "softwareRAID",
    "softwareNetwork"
})
@XmlSeeAlso({
    NativeOperatingSystemType.class,
    HostedOperatingSystemType.class,
    NativeHypervisorType.class
})
public class OperatingSystemType {

    @XmlElement(required = true)
    protected OperatingSystemTypeType name;
    protected MemoryUsageType systemRAMBaseUsage;
    @XmlElement(name = "FileSystem", namespace = "java/MetaModel")
    protected List<FileSystemType> fileSystem;
    @XmlElement(name = "SoftwareRAID", namespace = "java/MetaModel")
    protected List<SoftwareRAIDType> softwareRAID;
    @XmlElement(name = "SoftwareNetwork", namespace = "java/MetaModel")
    protected List<SoftwareNetworkType> softwareNetwork;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingSystemTypeType }
     *     
     */
    public OperatingSystemTypeType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingSystemTypeType }
     *     
     */
    public void setName(OperatingSystemTypeType value) {
        this.name = value;
    }

    /**
     * Gets the value of the systemRAMBaseUsage property.
     * 
     * @return
     *     possible object is
     *     {@link MemoryUsageType }
     *     
     */
    public MemoryUsageType getSystemRAMBaseUsage() {
        return systemRAMBaseUsage;
    }

    /**
     * Sets the value of the systemRAMBaseUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoryUsageType }
     *     
     */
    public void setSystemRAMBaseUsage(MemoryUsageType value) {
        this.systemRAMBaseUsage = value;
    }

    /**
     * Gets the value of the fileSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileSystemType }
     * 
     * 
     */
    public List<FileSystemType> getFileSystem() {
        if (fileSystem == null) {
            fileSystem = new ArrayList<FileSystemType>();
        }
        return this.fileSystem;
    }

    /**
     * Gets the value of the softwareRAID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareRAID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareRAID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwareRAIDType }
     * 
     * 
     */
    public List<SoftwareRAIDType> getSoftwareRAID() {
        if (softwareRAID == null) {
            softwareRAID = new ArrayList<SoftwareRAIDType>();
        }
        return this.softwareRAID;
    }

    /**
     * Gets the value of the softwareNetwork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareNetwork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwareNetworkType }
     * 
     * 
     */
    public List<SoftwareNetworkType> getSoftwareNetwork() {
        if (softwareNetwork == null) {
            softwareNetwork = new ArrayList<SoftwareNetworkType>();
        }
        return this.softwareNetwork;
    }

}
