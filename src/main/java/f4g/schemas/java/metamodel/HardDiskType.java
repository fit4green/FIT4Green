//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.31 at 04:14:30 PM CEST 
//


package java.metamodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HardDiskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HardDiskType">
 *   &lt;complexContent>
 *     &lt;extension base="{java/MetaModel}StorageUnitType">
 *       &lt;sequence>
 *         &lt;element name="rpm" type="{java/MetaModel}RPMType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HardDiskType", propOrder = {
    "rpm"
})
public class HardDiskType
    extends StorageUnitType
{

    @XmlElement(required = true)
    protected RPMType rpm;

    /**
     * Gets the value of the rpm property.
     * 
     * @return
     *     possible object is
     *     {@link RPMType }
     *     
     */
    public RPMType getRpm() {
        return rpm;
    }

    /**
     * Sets the value of the rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RPMType }
     *     
     */
    public void setRpm(RPMType value) {
        this.rpm = value;
    }

}
