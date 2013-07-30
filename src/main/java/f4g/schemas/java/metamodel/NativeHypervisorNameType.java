//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.30 at 04:51:12 PM CEST 
//


package java.metamodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NativeHypervisorNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NativeHypervisorNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ESX"/>
 *     &lt;enumeration value="Hyper-V"/>
 *     &lt;enumeration value="XenServer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NativeHypervisorNameType")
@XmlEnum
public enum NativeHypervisorNameType {

    ESX("ESX"),
    @XmlEnumValue("Hyper-V")
    HYPER_V("Hyper-V"),
    @XmlEnumValue("XenServer")
    XEN_SERVER("XenServer");
    private final String value;

    NativeHypervisorNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NativeHypervisorNameType fromValue(String v) {
        for (NativeHypervisorNameType c: NativeHypervisorNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
