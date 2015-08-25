//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.10 at 04:34:50 PM CEST 
//


package f4g.schemas.java.constraints.optimizerconstraints;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.massfords.humantask.Visitable;
import com.massfords.humantask.Visitor;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ClusterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClusterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cluster" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NodeController" type="{f4g/schemas/java/constraints/OptimizerConstraints}nodeController"/&gt;
 *                   &lt;element name="BoundedSLAs" type="{f4g/schemas/java/constraints/OptimizerConstraints}boundedSLAsType"/&gt;
 *                   &lt;element name="BoundedPolicies" type="{f4g/schemas/java/constraints/OptimizerConstraints}boundedPoliciesType"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterType", propOrder = {
    "cluster"
})
public class ClusterType implements Cloneable, Visitable, CopyTo
{

    @XmlElement(name = "Cluster", required = true)
    protected List<ClusterType.Cluster> cluster;

    /**
     * Default no-arg constructor
     * 
     */
    public ClusterType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ClusterType(final List<ClusterType.Cluster> cluster) {
        this.cluster = cluster;
    }

    /**
     * Gets the value of the cluster property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cluster property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCluster().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterType.Cluster }
     * 
     * 
     */
    public List<ClusterType.Cluster> getCluster() {
        if (cluster == null) {
            cluster = new ArrayList<ClusterType.Cluster>();
        }
        return this.cluster;
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ClusterType) {
            final ClusterType copy = ((ClusterType) draftCopy);
            if ((this.cluster!= null)&&(!this.cluster.isEmpty())) {
                List<ClusterType.Cluster> sourceCluster;
                sourceCluster = (((this.cluster!= null)&&(!this.cluster.isEmpty()))?this.getCluster():null);
                @SuppressWarnings("unchecked")
                List<ClusterType.Cluster> copyCluster = ((List<ClusterType.Cluster> ) strategy.copy(LocatorUtils.property(locator, "cluster", sourceCluster), sourceCluster));
                copy.cluster = null;
                if (copyCluster!= null) {
                    List<ClusterType.Cluster> uniqueClusterl = copy.getCluster();
                    uniqueClusterl.addAll(copyCluster);
                }
            } else {
                copy.cluster = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ClusterType();
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NodeController" type="{f4g/schemas/java/constraints/OptimizerConstraints}nodeController"/&gt;
     *         &lt;element name="BoundedSLAs" type="{f4g/schemas/java/constraints/OptimizerConstraints}boundedSLAsType"/&gt;
     *         &lt;element name="BoundedPolicies" type="{f4g/schemas/java/constraints/OptimizerConstraints}boundedPoliciesType"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "nodeController",
        "boundedSLAs",
        "boundedPolicies"
    })
    public static class Cluster implements Cloneable, Visitable, CopyTo
    {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "NodeController", required = true)
        protected NodeController nodeController;
        @XmlElement(name = "BoundedSLAs", required = true)
        protected BoundedSLAsType boundedSLAs;
        @XmlElement(name = "BoundedPolicies", required = true)
        protected BoundedPoliciesType boundedPolicies;
        @XmlAttribute(name = "id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

        /**
         * Default no-arg constructor
         * 
         */
        public Cluster() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public Cluster(final String name, final NodeController nodeController, final BoundedSLAsType boundedSLAs, final BoundedPoliciesType boundedPolicies, final String id) {
            this.name = name;
            this.nodeController = nodeController;
            this.boundedSLAs = boundedSLAs;
            this.boundedPolicies = boundedPolicies;
            this.id = id;
        }

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
         *     {@link NodeController }
         *     
         */
        public NodeController getNodeController() {
            return nodeController;
        }

        /**
         * Sets the value of the nodeController property.
         * 
         * @param value
         *     allowed object is
         *     {@link NodeController }
         *     
         */
        public void setNodeController(NodeController value) {
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
         * Gets the value of the boundedPolicies property.
         * 
         * @return
         *     possible object is
         *     {@link BoundedPoliciesType }
         *     
         */
        public BoundedPoliciesType getBoundedPolicies() {
            return boundedPolicies;
        }

        /**
         * Sets the value of the boundedPolicies property.
         * 
         * @param value
         *     allowed object is
         *     {@link BoundedPoliciesType }
         *     
         */
        public void setBoundedPolicies(BoundedPoliciesType value) {
            this.boundedPolicies = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        public void accept(Visitor aVisitor) {
            aVisitor.visit(this);
        }

        public Object clone() {
            return copyTo(createNewInstance());
        }

        public Object copyTo(Object target) {
            final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof ClusterType.Cluster) {
                final ClusterType.Cluster copy = ((ClusterType.Cluster) draftCopy);
                if (this.name!= null) {
                    String sourceName;
                    sourceName = this.getName();
                    String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                    copy.setName(copyName);
                } else {
                    copy.name = null;
                }
                if (this.nodeController!= null) {
                    NodeController sourceNodeController;
                    sourceNodeController = this.getNodeController();
                    NodeController copyNodeController = ((NodeController) strategy.copy(LocatorUtils.property(locator, "nodeController", sourceNodeController), sourceNodeController));
                    copy.setNodeController(copyNodeController);
                } else {
                    copy.nodeController = null;
                }
                if (this.boundedSLAs!= null) {
                    BoundedSLAsType sourceBoundedSLAs;
                    sourceBoundedSLAs = this.getBoundedSLAs();
                    BoundedSLAsType copyBoundedSLAs = ((BoundedSLAsType) strategy.copy(LocatorUtils.property(locator, "boundedSLAs", sourceBoundedSLAs), sourceBoundedSLAs));
                    copy.setBoundedSLAs(copyBoundedSLAs);
                } else {
                    copy.boundedSLAs = null;
                }
                if (this.boundedPolicies!= null) {
                    BoundedPoliciesType sourceBoundedPolicies;
                    sourceBoundedPolicies = this.getBoundedPolicies();
                    BoundedPoliciesType copyBoundedPolicies = ((BoundedPoliciesType) strategy.copy(LocatorUtils.property(locator, "boundedPolicies", sourceBoundedPolicies), sourceBoundedPolicies));
                    copy.setBoundedPolicies(copyBoundedPolicies);
                } else {
                    copy.boundedPolicies = null;
                }
                if (this.id!= null) {
                    String sourceId;
                    sourceId = this.getId();
                    String copyId = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                    copy.setId(copyId);
                } else {
                    copy.id = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ClusterType.Cluster();
        }

    }

}