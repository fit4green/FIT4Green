//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.30 at 04:51:12 PM CEST 
//


package java.metamodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SolidStateDiskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SolidStateDiskType">
 *   &lt;complexContent>
 *     &lt;extension base="{java/MetaModel}StorageUnitType">
 *       &lt;sequence>
 *         &lt;element name="powerByRead" type="{java/MetaModel}PowerType"/>
 *         &lt;element name="powerByWrite" type="{java/MetaModel}PowerType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolidStateDiskType", propOrder = {
    "powerByRead",
    "powerByWrite"
})
public class SolidStateDiskType
    extends StorageUnitType
{

    @XmlElement(required = true)
    protected PowerType powerByRead;
    @XmlElement(required = true)
    protected PowerType powerByWrite;

    /**
     * Gets the value of the powerByRead property.
     * 
     * @return
     *     possible object is
     *     {@link PowerType }
     *     
     */
    public PowerType getPowerByRead() {
        return powerByRead;
    }

    /**
     * Sets the value of the powerByRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerType }
     *     
     */
    public void setPowerByRead(PowerType value) {
        this.powerByRead = value;
    }

    /**
     * Gets the value of the powerByWrite property.
     * 
     * @return
     *     possible object is
     *     {@link PowerType }
     *     
     */
    public PowerType getPowerByWrite() {
        return powerByWrite;
    }

    /**
     * Sets the value of the powerByWrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerType }
     *     
     */
    public void setPowerByWrite(PowerType value) {
        this.powerByWrite = value;
    }

}