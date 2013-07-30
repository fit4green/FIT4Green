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
 * <p>Java class for HostedHypervisorNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostedHypervisorNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VirtualPC"/>
 *     &lt;enumeration value="VirtualBox"/>
 *     &lt;enumeration value="KVM"/>
 *     &lt;enumeration value="Xen"/>
 *     &lt;enumeration value="VMWare"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostedHypervisorNameType")
@XmlEnum
public enum HostedHypervisorNameType {

    @XmlEnumValue("VirtualPC")
    VIRTUAL_PC("VirtualPC"),
    @XmlEnumValue("VirtualBox")
    VIRTUAL_BOX("VirtualBox"),
    KVM("KVM"),
    @XmlEnumValue("Xen")
    XEN("Xen"),
    @XmlEnumValue("VMWare")
    VM_WARE("VMWare");
    private final String value;

    HostedHypervisorNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostedHypervisorNameType fromValue(String v) {
        for (HostedHypervisorNameType c: HostedHypervisorNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
