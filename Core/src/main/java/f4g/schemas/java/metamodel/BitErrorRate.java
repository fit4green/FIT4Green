//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.10 at 04:34:50 PM CEST 
//


package f4g.schemas.java.metamodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.massfords.humantask.Visitable;
import com.massfords.humantask.Visitor;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for BitErrorRate simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;simpleType name="BitErrorRate"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *     &lt;minInclusive value="0"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BitErrorRate", propOrder = {
    "value"
})
public class BitErrorRate implements Cloneable, Visitable, CopyTo
{

    @XmlValue
    protected double value;

    /**
     * Default no-arg constructor
     * 
     */
    public BitErrorRate() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BitErrorRate(final double value) {
        this.value = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
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
        if (draftCopy instanceof BitErrorRate) {
            final BitErrorRate copy = ((BitErrorRate) draftCopy);
            double sourceValue;
            sourceValue = (true?this.getValue(): 0.0D);
            double copyValue = strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue);
            copy.setValue(copyValue);
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BitErrorRate();
    }

}
