//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.31 at 04:14:30 PM CEST 
//


package java.constraints.optimizerconstraints;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for boundedSLAsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="boundedSLAsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SLA" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="idref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "boundedSLAsType", propOrder = {
    "sla"
})
public class BoundedSLAsType {

    @XmlElement(name = "SLA", required = true)
    protected List<BoundedSLAsType.SLA> sla;

    /**
     * Gets the value of the sla property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sla property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSLA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoundedSLAsType.SLA }
     * 
     * 
     */
    public List<BoundedSLAsType.SLA> getSLA() {
        if (sla == null) {
            sla = new ArrayList<BoundedSLAsType.SLA>();
        }
        return this.sla;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="idref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SLA {

        @XmlAttribute(name = "idref", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected SLAType.SLA idref;

        /**
         * Gets the value of the idref property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public SLAType.SLA getIdref() {
            return idref;
        }

        /**
         * Sets the value of the idref property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setIdref(SLAType.SLA value) {
            this.idref = value;
        }

    }

}
