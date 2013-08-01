//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.31 at 04:14:30 PM CEST 
//


package java.metamodel;

import java.IDREFS;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{java/MetaModel}SoftwareApplicationType">
 *       &lt;sequence>
 *         &lt;element name="properties" type="{java/MetaModel}NodePropType"/>
 *         &lt;element name="status" type="{java/MetaModel}NodeStatusType"/>
 *         &lt;element name="coresInUse" type="{java/MetaModel}NrOfCoresType"/>
 *         &lt;element name="jobRef" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeType", propOrder = {
    "properties",
    "status",
    "coresInUse",
    "jobRef"
})
public class NodeType
    extends SoftwareApplicationType
{

    @XmlElement(required = true)
    protected NodePropType properties;
    @XmlElement(required = true)
    protected NodeStatusType status;
    @XmlElement(required = true)
    protected NrOfCoresType coresInUse;
    protected IDREFS jobRef;

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link NodePropType }
     *     
     */
    public NodePropType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodePropType }
     *     
     */
    public void setProperties(NodePropType value) {
        this.properties = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link NodeStatusType }
     *     
     */
    public NodeStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeStatusType }
     *     
     */
    public void setStatus(NodeStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the coresInUse property.
     * 
     * @return
     *     possible object is
     *     {@link NrOfCoresType }
     *     
     */
    public NrOfCoresType getCoresInUse() {
        return coresInUse;
    }

    /**
     * Sets the value of the coresInUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link NrOfCoresType }
     *     
     */
    public void setCoresInUse(NrOfCoresType value) {
        this.coresInUse = value;
    }

    /**
     * Gets the value of the jobRef property.
     * 
     * @return
     *     possible object is
     *     {@link IDREFS }
     *     
     */
    public IDREFS getJobRef() {
        return jobRef;
    }

    /**
     * Sets the value of the jobRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDREFS }
     *     
     */
    public void setJobRef(IDREFS value) {
        this.jobRef = value;
    }

}
