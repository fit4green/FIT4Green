//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.31 at 04:14:30 PM CEST 
//


package java.commontypes;

import java.PositiveInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for MinutesType simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;simpleType name="MinutesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MinutesType", propOrder = {
    "value"
})
public class MinutesType {

    @XmlValue
    protected PositiveInteger value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInteger }
     *     
     */
    public PositiveInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInteger }
     *     
     */
    public void setValue(PositiveInteger value) {
        this.value = value;
    }

}
