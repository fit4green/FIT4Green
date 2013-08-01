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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServerGroup" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NodeController" type="{java/constraints/OptimizerConstraints}nodeControllerType"/>
 *                   &lt;element name="BoundedSLAs" type="{java/constraints/OptimizerConstraints}boundedSLAsType"/>
 *                   &lt;element name="BoundedPlacementConstraints" type="{java/constraints/OptimizerConstraints}boundedPlacementConstraintType"/>
 *                 &lt;/sequence>
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
@XmlType(name = "ServerGroupType", propOrder = {
    "serverGroup"
})
public class ServerGroupType {

    @XmlElement(name = "ServerGroup", required = true)
    protected List<ServerGroupType.ServerGroup> serverGroup;

    /**
     * Gets the value of the serverGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServerGroupType.ServerGroup }
     * 
     * 
     */
    public List<ServerGroupType.ServerGroup> getServerGroup() {
        if (serverGroup == null) {
            serverGroup = new ArrayList<ServerGroupType.ServerGroup>();
        }
        return this.serverGroup;
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
     *       &lt;sequence>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NodeController" type="{java/constraints/OptimizerConstraints}nodeControllerType"/>
     *         &lt;element name="BoundedSLAs" type="{java/constraints/OptimizerConstraints}boundedSLAsType"/>
     *         &lt;element name="BoundedPlacementConstraints" type="{java/constraints/OptimizerConstraints}boundedPlacementConstraintType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "nodeController",
        "boundedSLAs",
        "boundedPlacementConstraints"
    })
    public static class ServerGroup {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "NodeController", required = true)
        protected NodeControllerType nodeController;
        @XmlElement(name = "BoundedSLAs", required = true)
        protected BoundedSLAsType boundedSLAs;
        @XmlElement(name = "BoundedPlacementConstraints", required = true)
        protected BoundedPlacementConstraintType boundedPlacementConstraints;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the nodeController property.
         * 
         * @return
         *     possible object is
         *     {@link NodeControllerType }
         *     
         */
        public NodeControllerType getNodeController() {
            return nodeController;
        }

        /**
         * Sets the value of the nodeController property.
         * 
         * @param value
         *     allowed object is
         *     {@link NodeControllerType }
         *     
         */
        public void setNodeController(NodeControllerType value) {
            this.nodeController = value;
        }

        /**
         * Gets the value of the boundedSLAs property.
         * 
         * @return
         *     possible object is
         *     {@link BoundedSLAsType }
         *     
         */
        public BoundedSLAsType getBoundedSLAs() {
            return boundedSLAs;
        }

        /**
         * Sets the value of the boundedSLAs property.
         * 
         * @param value
         *     allowed object is
         *     {@link BoundedSLAsType }
         *     
         */
        public void setBoundedSLAs(BoundedSLAsType value) {
            this.boundedSLAs = value;
        }

        /**
         * Gets the value of the boundedPlacementConstraints property.
         * 
         * @return
         *     possible object is
         *     {@link BoundedPlacementConstraintType }
         *     
         */
        public BoundedPlacementConstraintType getBoundedPlacementConstraints() {
            return boundedPlacementConstraints;
        }

        /**
         * Sets the value of the boundedPlacementConstraints property.
         * 
         * @param value
         *     allowed object is
         *     {@link BoundedPlacementConstraintType }
         *     
         */
        public void setBoundedPlacementConstraints(BoundedPlacementConstraintType value) {
            this.boundedPlacementConstraints = value;
        }

    }

}
