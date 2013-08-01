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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{java/MetaModel}ServerRoleType"/>
 *         &lt;element name="status" type="{java/MetaModel}ServerStatusType"/>
 *         &lt;element name="frameworkID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="computedPower" type="{java/MetaModel}PowerType" minOccurs="0"/>
 *         &lt;element name="measuredPower" type="{java/MetaModel}PowerType" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}LogicalVolume" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}Mainboard" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{java/MetaModel}NativeOperatingSystem"/>
 *           &lt;element ref="{java/MetaModel}NativeHypervisor"/>
 *         &lt;/choice>
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
@XmlType(name = "ServerType", propOrder = {
    "name",
    "status",
    "frameworkID",
    "computedPower",
    "measuredPower",
    "logicalVolume",
    "mainboard",
    "nativeOperatingSystem",
    "nativeHypervisor"
})
@XmlSeeAlso({
    BladeServerType.class,
    RackableServerType.class,
    TowerServerType.class
})
public class ServerType {

    @XmlElement(required = true)
    protected ServerRoleType name;
    @XmlElement(required = true)
    protected ServerStatusType status;
    @XmlElement(required = true)
    protected String frameworkID;
    protected PowerType computedPower;
    protected PowerType measuredPower;
    @XmlElement(name = "LogicalVolume", namespace = "java/MetaModel")
    protected List<LogicalVolumeType> logicalVolume;
    @XmlElement(name = "Mainboard", namespace = "java/MetaModel")
    protected List<MainboardType> mainboard;
    @XmlElement(name = "NativeOperatingSystem", namespace = "java/MetaModel")
    protected NativeOperatingSystemType nativeOperatingSystem;
    @XmlElement(name = "NativeHypervisor", namespace = "java/MetaModel")
    protected NativeHypervisorType nativeHypervisor;
    @XmlAttribute(name = "frameworkRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object frameworkRef;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ServerRoleType }
     *     
     */
    public ServerRoleType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerRoleType }
     *     
     */
    public void setName(ServerRoleType value) {
        this.name = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ServerStatusType }
     *     
     */
    public ServerStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerStatusType }
     *     
     */
    public void setStatus(ServerStatusType value) {
        this.status = value;
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
     * Gets the value of the logicalVolume property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logicalVolume property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogicalVolume().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogicalVolumeType }
     * 
     * 
     */
    public List<LogicalVolumeType> getLogicalVolume() {
        if (logicalVolume == null) {
            logicalVolume = new ArrayList<LogicalVolumeType>();
        }
        return this.logicalVolume;
    }

    /**
     * Gets the value of the mainboard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainboard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainboard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MainboardType }
     * 
     * 
     */
    public List<MainboardType> getMainboard() {
        if (mainboard == null) {
            mainboard = new ArrayList<MainboardType>();
        }
        return this.mainboard;
    }

    /**
     * Gets the value of the nativeOperatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link NativeOperatingSystemType }
     *     
     */
    public NativeOperatingSystemType getNativeOperatingSystem() {
        return nativeOperatingSystem;
    }

    /**
     * Sets the value of the nativeOperatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeOperatingSystemType }
     *     
     */
    public void setNativeOperatingSystem(NativeOperatingSystemType value) {
        this.nativeOperatingSystem = value;
    }

    /**
     * Gets the value of the nativeHypervisor property.
     * 
     * @return
     *     possible object is
     *     {@link NativeHypervisorType }
     *     
     */
    public NativeHypervisorType getNativeHypervisor() {
        return nativeHypervisor;
    }

    /**
     * Sets the value of the nativeHypervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeHypervisorType }
     *     
     */
    public void setNativeHypervisor(NativeHypervisorType value) {
        this.nativeHypervisor = value;
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
