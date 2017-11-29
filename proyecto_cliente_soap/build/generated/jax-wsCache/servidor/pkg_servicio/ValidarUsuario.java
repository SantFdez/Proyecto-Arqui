
package pkg_servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="as_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="as_pass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarUsuario", propOrder = {
    "asId",
    "asPass"
})
public class ValidarUsuario {

    @XmlElement(name = "as_id")
    protected String asId;
    @XmlElement(name = "as_pass")
    protected String asPass;

    /**
     * Obtiene el valor de la propiedad asId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsId() {
        return asId;
    }

    /**
     * Define el valor de la propiedad asId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsId(String value) {
        this.asId = value;
    }

    /**
     * Obtiene el valor de la propiedad asPass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsPass() {
        return asPass;
    }

    /**
     * Define el valor de la propiedad asPass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsPass(String value) {
        this.asPass = value;
    }

}
