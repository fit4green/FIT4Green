//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.30 at 04:51:12 PM CEST 
//


package java.metamodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostedOperatingSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostedOperatingSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{java/MetaModel}OperatingSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{java/MetaModel}SoftwareApplication" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostedOperatingSystemType", propOrder = {
    "softwareApplication"
})
public class HostedOperatingSystemType
    extends OperatingSystemType
{

    @XmlElement(name = "SoftwareApplication", namespace = "java/MetaModel")
    protected List<SoftwareApplicationType> softwareApplication;

    /**
     * Gets the value of the softwareApplication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareApplication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwareApplicationType }
     * 
     * 
     */
    public List<SoftwareApplicationType> getSoftwareApplication() {
        if (softwareApplication == null) {
            softwareApplication = new ArrayList<SoftwareApplicationType>();
        }
        return this.softwareApplication;
    }

}
