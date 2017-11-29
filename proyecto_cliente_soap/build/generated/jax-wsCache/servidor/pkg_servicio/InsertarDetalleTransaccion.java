
package pkg_servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarDetalleTransaccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarDetalleTransaccion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoTransac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="val" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cabTransac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarDetalleTransaccion", propOrder = {
    "fecha",
    "tipoTransac",
    "val",
    "cabTransac"
})
public class InsertarDetalleTransaccion {

    protected String fecha;
    protected String tipoTransac;
    protected String val;
    protected String cabTransac;

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTransac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTransac() {
        return tipoTransac;
    }

    /**
     * Define el valor de la propiedad tipoTransac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTransac(String value) {
        this.tipoTransac = value;
    }

    /**
     * Obtiene el valor de la propiedad val.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVal() {
        return val;
    }

    /**
     * Define el valor de la propiedad val.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVal(String value) {
        this.val = value;
    }

    /**
     * Obtiene el valor de la propiedad cabTransac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabTransac() {
        return cabTransac;
    }

    /**
     * Define el valor de la propiedad cabTransac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabTransac(String value) {
        this.cabTransac = value;
    }

}
