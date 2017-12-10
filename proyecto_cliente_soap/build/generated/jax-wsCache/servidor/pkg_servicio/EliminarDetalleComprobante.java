
package pkg_servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarDetalleComprobante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarDetalleComprobante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoDetalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarDetalleComprobante", propOrder = {
    "codigoDetalle"
})
public class EliminarDetalleComprobante {

    protected String codigoDetalle;

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

}
