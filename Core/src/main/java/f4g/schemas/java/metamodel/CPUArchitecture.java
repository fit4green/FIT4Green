//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.10 at 04:34:50 PM CEST 
//


package f4g.schemas.java.metamodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CPUArchitecture.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CPUArchitecture"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INTEL"/&gt;
 *     &lt;enumeration value="AMD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CPUArchitecture")
@XmlEnum
public enum CPUArchitecture {

    INTEL,
    AMD;

    public String value() {
        return name();
    }

    public static CPUArchitecture fromValue(String v) {
        return valueOf(v);
    }

}
