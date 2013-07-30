//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.30 at 04:51:12 PM CEST 
//


package java.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Move a Virtual Machine Action Type (cold migration, including inter-/intra- data centre)
 * 
 * <p>Java class for MoveVMActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoveVMActionType">
 *   &lt;complexContent>
 *     &lt;extension base="{java/Actions}AbstractBaseActionType">
 *       &lt;sequence>
 *         &lt;element name="VirtualMachine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SourceNodeController" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DestNodeController" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveVMActionType", propOrder = {
    "virtualMachine",
    "sourceNodeController",
    "destNodeController"
})
public class MoveVMActionType
    extends AbstractBaseActionType
{

    @XmlElement(name = "VirtualMachine", required = true)
    protected String virtualMachine;
    @XmlElement(name = "SourceNodeController", required = true)
    protected String sourceNodeController;
    @XmlElement(name = "DestNodeController", required = true)
    protected String destNodeController;

    /**
     * Gets the value of the virtualMachine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualMachine() {
        return virtualMachine;
    }

    /**
     * Sets the value of the virtualMachine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualMachine(String value) {
        this.virtualMachine = value;
    }

    /**
     * Gets the value of the sourceNodeController property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceNodeController() {
        return sourceNodeController;
    }

    /**
     * Sets the value of the sourceNodeController property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceNodeController(String value) {
        this.sourceNodeController = value;
    }

    /**
     * Gets the value of the destNodeController property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestNodeController() {
        return destNodeController;
    }

    /**
     * Sets the value of the destNodeController property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestNodeController(String value) {
        this.destNodeController = value;
    }

}
