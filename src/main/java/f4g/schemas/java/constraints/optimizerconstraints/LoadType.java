//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.31 at 04:14:30 PM CEST 
//


package java.constraints.optimizerconstraints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spareCPUs" type="{java/constraints/OptimizerConstraints}spareCPUs" minOccurs="0"/>
 *         &lt;element name="spareNodes" type="{java/constraints/OptimizerConstraints}spareNodes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadType", propOrder = {
    "spareCPUs",
    "spareNodes"
})
public class LoadType {

    protected SpareCPUs spareCPUs;
    protected SpareNodes spareNodes;

    /**
     * Gets the value of the spareCPUs property.
     * 
     * @return
     *     possible object is
     *     {@link SpareCPUs }
     *     
     */
    public SpareCPUs getSpareCPUs() {
        return spareCPUs;
    }

    /**
     * Sets the value of the spareCPUs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpareCPUs }
     *     
     */
    public void setSpareCPUs(SpareCPUs value) {
        this.spareCPUs = value;
    }

    /**
     * Gets the value of the spareNodes property.
     * 
     * @return
     *     possible object is
     *     {@link SpareNodes }
     *     
     */
    public SpareNodes getSpareNodes() {
        return spareNodes;
    }

    /**
     * Sets the value of the spareNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpareNodes }
     *     
     */
    public void setSpareNodes(SpareNodes value) {
        this.spareNodes = value;
    }

}
