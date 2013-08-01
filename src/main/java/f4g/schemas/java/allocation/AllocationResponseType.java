//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.31 at 04:14:30 PM CEST 
//


package java.allocation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AllocationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllocationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element ref="{java/Allocation}Response"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllocationResponseType", propOrder = {
    "datetime",
    "response"
})
public class AllocationResponseType {

    @XmlElement(name = "Datetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetime;
    @XmlElementRef(name = "Response", namespace = "java/Allocation", type = JAXBElement.class)
    protected JAXBElement<? extends ResponseType> response;

    /**
     * Gets the value of the datetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetime() {
        return datetime;
    }

    /**
     * Sets the value of the datetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetime(XMLGregorianCalendar value) {
        this.datetime = value;
    }

    /**
     * FIT4Green Allocation Response
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResponseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HpcClusterAllocationResponseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CloudVmAllocationResponseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TraditionalVmAllocationResponseType }{@code >}
     *     
     */
    public JAXBElement<? extends ResponseType> getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResponseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HpcClusterAllocationResponseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CloudVmAllocationResponseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TraditionalVmAllocationResponseType }{@code >}
     *     
     */
    public void setResponse(JAXBElement<? extends ResponseType> value) {
        this.response = ((JAXBElement<? extends ResponseType> ) value);
    }

}
