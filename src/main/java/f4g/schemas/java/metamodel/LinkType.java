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
 * <p>Java class for LinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propagationDelay" type="{java/MetaModel}PropagationDelayType"/>
 *         &lt;element name="bitErrorRate" type="{java/MetaModel}BitErrorRateType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkType", propOrder = {
    "propagationDelay",
    "bitErrorRate"
})
public class LinkType {

    @XmlElement(required = true)
    protected PropagationDelayType propagationDelay;
    @XmlElement(required = true)
    protected BitErrorRateType bitErrorRate;

    /**
     * Gets the value of the propagationDelay property.
     * 
     * @return
     *     possible object is
     *     {@link PropagationDelayType }
     *     
     */
    public PropagationDelayType getPropagationDelay() {
        return propagationDelay;
    }

    /**
     * Sets the value of the propagationDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropagationDelayType }
     *     
     */
    public void setPropagationDelay(PropagationDelayType value) {
        this.propagationDelay = value;
    }

    /**
     * Gets the value of the bitErrorRate property.
     * 
     * @return
     *     possible object is
     *     {@link BitErrorRateType }
     *     
     */
    public BitErrorRateType getBitErrorRate() {
        return bitErrorRate;
    }

    /**
     * Sets the value of the bitErrorRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BitErrorRateType }
     *     
     */
    public void setBitErrorRate(BitErrorRateType value) {
        this.bitErrorRate = value;
    }

}