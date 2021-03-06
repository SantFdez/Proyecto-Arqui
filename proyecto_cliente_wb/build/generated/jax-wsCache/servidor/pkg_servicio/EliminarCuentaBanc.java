
package pkg_servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarCuentaBanc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarCuentaBanc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="as_codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarCuentaBanc", propOrder = {
    "asCodigo"
})
public class EliminarCuentaBanc {

    @XmlElement(name = "as_codigo")
    protected String asCodigo;

    /**
     * Obtiene el valor de la propiedad asCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsCodigo() {
        return asCodigo;
    }

    /**
     * Define el valor de la propiedad asCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsCodigo(String value) {
        this.asCodigo = value;
    }

}
