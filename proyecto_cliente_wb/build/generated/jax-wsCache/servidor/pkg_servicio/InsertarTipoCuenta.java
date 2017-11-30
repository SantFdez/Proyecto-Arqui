
package pkg_servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarTipoCuenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarTipoCuenta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="par1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarTipoCuenta", propOrder = {
    "par1"
})
public class InsertarTipoCuenta {

    protected String par1;

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

}
