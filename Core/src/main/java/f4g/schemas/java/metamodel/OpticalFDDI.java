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
import javax.xml.namespace.QName;
import com.massfords.humantask.Visitable;
import com.massfords.humantask.Visitor;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for OpticalFDDI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpticalFDDI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{f4g/schemas/java/MetaModel}NetworkPort"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpticalFDDI")
public class OpticalFDDI
    extends NetworkPort
    implements Cloneable, Visitable, CopyTo
{


    /**
     * Default no-arg constructor
     * 
     */
    public OpticalFDDI() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OpticalFDDI(final NetworkTraffic lineCapacity, final Power powerIdle, final Power powerMax, final String portID, final NetworkTraffic trafficIn, final NetworkTraffic trafficOut, final NetworkPortBufferSize bufferSize, final NetworkPortBufferOccupancy bufferOccupancy, final Link link, final String networkPortRef, final String id, final QName jaxbElementName) {
        super(lineCapacity, powerIdle, powerMax, portID, trafficIn, trafficOut, bufferSize, bufferOccupancy, link, networkPortRef, id, jaxbElementName);
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
        super.copyTo(locator, draftCopy, strategy);
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OpticalFDDI();
    }

}
