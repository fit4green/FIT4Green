//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.30 at 04:51:12 PM CEST 
//


package java.metamodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FrameworkCapabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrameworkCapabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frameworkName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{java/MetaModel}FrameworkStatusType"/>
 *         &lt;element name="node" type="{java/MetaModel}NodeActionsType" minOccurs="0"/>
 *         &lt;element name="vm" type="{java/MetaModel}VMActionsType" minOccurs="0"/>
 *         &lt;element name="job" type="{java/MetaModel}JobActionsType" minOccurs="0"/>
 *         &lt;element name="networkNode" type="{java/MetaModel}NodeActionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrameworkCapabilitiesType", propOrder = {
    "frameworkName",
    "status",
    "node",
    "vm",
    "job",
    "networkNode"
})
public class FrameworkCapabilitiesType {

    @XmlElement(required = true)
    protected String frameworkName;
    @XmlElement(required = true)
    protected FrameworkStatusType status;
    protected NodeActionsType node;
    protected VMActionsType vm;
    protected JobActionsType job;
    protected NodeActionsType networkNode;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the frameworkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameworkName() {
        return frameworkName;
    }

    /**
     * Sets the value of the frameworkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameworkName(String value) {
        this.frameworkName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link FrameworkStatusType }
     *     
     */
    public FrameworkStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrameworkStatusType }
     *     
     */
    public void setStatus(FrameworkStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionsType }
     *     
     */
    public NodeActionsType getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionsType }
     *     
     */
    public void setNode(NodeActionsType value) {
        this.node = value;
    }

    /**
     * Gets the value of the vm property.
     * 
     * @return
     *     possible object is
     *     {@link VMActionsType }
     *     
     */
    public VMActionsType getVm() {
        return vm;
    }

    /**
     * Sets the value of the vm property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMActionsType }
     *     
     */
    public void setVm(VMActionsType value) {
        this.vm = value;
    }

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link JobActionsType }
     *     
     */
    public JobActionsType getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobActionsType }
     *     
     */
    public void setJob(JobActionsType value) {
        this.job = value;
    }

    /**
     * Gets the value of the networkNode property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionsType }
     *     
     */
    public NodeActionsType getNetworkNode() {
        return networkNode;
    }

    /**
     * Sets the value of the networkNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionsType }
     *     
     */
    public void setNetworkNode(NodeActionsType value) {
        this.networkNode = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
