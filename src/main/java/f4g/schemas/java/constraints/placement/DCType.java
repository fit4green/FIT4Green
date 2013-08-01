//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.31 at 04:14:30 PM CEST 
//


package java.constraints.placement;

import java.metamodel.DCComputingStyleType;
import java.metamodel.LocationType;
import java.metamodel.ScenarioType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DCType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TargetSys" type="{java/constraints/placement}TSType"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{java/constraints/placement}TSAttr"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DCType", propOrder = {
    "targetSys"
})
public class DCType {

    @XmlElement(name = "TargetSys", required = true)
    protected TSType targetSys;
    @XmlAttribute(name = "style", required = true)
    protected DCComputingStyleType style;
    @XmlAttribute(name = "scenario", required = true)
    protected ScenarioType scenario;
    @XmlAttribute(name = "location", required = true)
    protected LocationType location;

    /**
     * Gets the value of the targetSys property.
     * 
     * @return
     *     possible object is
     *     {@link TSType }
     *     
     */
    public TSType getTargetSys() {
        return targetSys;
    }

    /**
     * Sets the value of the targetSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSType }
     *     
     */
    public void setTargetSys(TSType value) {
        this.targetSys = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link DCComputingStyleType }
     *     
     */
    public DCComputingStyleType getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link DCComputingStyleType }
     *     
     */
    public void setStyle(DCComputingStyleType value) {
        this.style = value;
    }

    /**
     * Gets the value of the scenario property.
     * 
     * @return
     *     possible object is
     *     {@link ScenarioType }
     *     
     */
    public ScenarioType getScenario() {
        return scenario;
    }

    /**
     * Sets the value of the scenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScenarioType }
     *     
     */
    public void setScenario(ScenarioType value) {
        this.scenario = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

}
