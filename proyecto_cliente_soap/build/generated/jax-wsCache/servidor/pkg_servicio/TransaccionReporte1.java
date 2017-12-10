
package pkg_servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para transaccionReporte1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transaccionReporte1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="par1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="par2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaccionReporte1", propOrder = {
    "par1",
    "par2"
})
public class TransaccionReporte1 {

    protected String par1;
    protected String par2;

    /**
     * Obtiene el valor de la propiedad par1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPar1() {
        return par1;
    }

    /**
     * Define el valor de la propiedad par1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPar1(String value) {
        this.par1 = value;
    }

    /**
     * Obtiene el valor de la propiedad par2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPar2() {
        return par2;
    }

    /**
     * Define el valor de la propiedad par2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPar2(String value) {
        this.par2 = value;
    }

}
