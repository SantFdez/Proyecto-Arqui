
package pkg_servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modificarDetalleComprobante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarDetalleComprobante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoDetalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="haber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificarDetalleComprobante", propOrder = {
    "codigoDetalle",
    "cuenta",
    "debe",
    "haber"
})
public class ModificarDetalleComprobante {

    protected String codigoDetalle;
    protected String cuenta;
    protected String debe;
    protected String haber;

    /**
     * Obtiene el valor de la propiedad codigoDetalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDetalle() {
        return codigoDetalle;
    }

    /**
     * Define el valor de la propiedad codigoDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDetalle(String value) {
        this.codigoDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad cuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Define el valor de la propiedad cuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuenta(String value) {
        this.cuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad debe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebe() {
        return debe;
    }

    /**
     * Define el valor de la propiedad debe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebe(String value) {
        this.debe = value;
    }

    /**
     * Obtiene el valor de la propiedad haber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHaber() {
        return haber;
    }

    /**
     * Define el valor de la propiedad haber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHaber(String value) {
        this.haber = value;
    }

}
