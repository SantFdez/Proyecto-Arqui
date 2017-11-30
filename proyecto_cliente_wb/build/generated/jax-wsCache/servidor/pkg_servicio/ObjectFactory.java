
package pkg_servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pkg_servicio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarCuenta_QNAME = new QName("http://pkg_servicio/", "buscarCuenta");
    private final static QName _BuscarCuentaBanc_QNAME = new QName("http://pkg_servicio/", "buscarCuentaBanc");
    private final static QName _BuscarCuentaBancResponse_QNAME = new QName("http://pkg_servicio/", "buscarCuentaBancResponse");
    private final static QName _BuscarCuentaResponse_QNAME = new QName("http://pkg_servicio/", "buscarCuentaResponse");
    private final static QName _BuscarTipoCuenta_QNAME = new QName("http://pkg_servicio/", "buscarTipoCuenta");
    private final static QName _BuscarTipoCuenta2_QNAME = new QName("http://pkg_servicio/", "buscarTipoCuenta2");
    private final static QName _BuscarTipoCuenta2Response_QNAME = new QName("http://pkg_servicio/", "buscarTipoCuenta2Response");
    private final static QName _BuscarTipoCuentaResponse_QNAME = new QName("http://pkg_servicio/", "buscarTipoCuentaResponse");
    private final static QName _BuscarTipoTransac_QNAME = new QName("http://pkg_servicio/", "buscarTipoTransac");
    private final static QName _BuscarTipoTransacResponse_QNAME = new QName("http://pkg_servicio/", "buscarTipoTransacResponse");
    private final static QName _BuscarTodoCuenta_QNAME = new QName("http://pkg_servicio/", "buscarTodoCuenta");
    private final static QName _BuscarTodoCuentaResponse_QNAME = new QName("http://pkg_servicio/", "buscarTodoCuentaResponse");
    private final static QName _BuscarTransaccion_QNAME = new QName("http://pkg_servicio/", "buscarTransaccion");
    private final static QName _BuscarTransaccionResponse_QNAME = new QName("http://pkg_servicio/", "buscarTransaccionResponse");
    private final static QName _EliminarCuenta_QNAME = new QName("http://pkg_servicio/", "eliminarCuenta");
    private final static QName _EliminarCuentaBanc_QNAME = new QName("http://pkg_servicio/", "eliminarCuentaBanc");
    private final static QName _EliminarCuentaBancResponse_QNAME = new QName("http://pkg_servicio/", "eliminarCuentaBancResponse");
    private final static QName _EliminarCuentaResponse_QNAME = new QName("http://pkg_servicio/", "eliminarCuentaResponse");
    private final static QName _EliminarDetalleTransaccion_QNAME = new QName("http://pkg_servicio/", "eliminarDetalleTransaccion");
    private final static QName _EliminarDetalleTransaccionResponse_QNAME = new QName("http://pkg_servicio/", "eliminarDetalleTransaccionResponse");
    private final static QName _EliminarTipoCuenta_QNAME = new QName("http://pkg_servicio/", "eliminarTipoCuenta");
    private final static QName _EliminarTipoCuentaResponse_QNAME = new QName("http://pkg_servicio/", "eliminarTipoCuentaResponse");
    private final static QName _EliminarTipoTransac_QNAME = new QName("http://pkg_servicio/", "eliminarTipoTransac");
    private final static QName _EliminarTipoTransacResponse_QNAME = new QName("http://pkg_servicio/", "eliminarTipoTransacResponse");
    private final static QName _EliminarTransaccion_QNAME = new QName("http://pkg_servicio/", "eliminarTransaccion");
    private final static QName _EliminarTransaccionResponse_QNAME = new QName("http://pkg_servicio/", "eliminarTransaccionResponse");
    private final static QName _InsertarCuenta_QNAME = new QName("http://pkg_servicio/", "insertarCuenta");
    private final static QName _InsertarCuentaBanc_QNAME = new QName("http://pkg_servicio/", "insertarCuentaBanc");
    private final static QName _InsertarCuentaBancResponse_QNAME = new QName("http://pkg_servicio/", "insertarCuentaBancResponse");
    private final static QName _InsertarCuentaResponse_QNAME = new QName("http://pkg_servicio/", "insertarCuentaResponse");
    private final static QName _InsertarDetalleTransaccion_QNAME = new QName("http://pkg_servicio/", "insertarDetalleTransaccion");
    private final static QName _InsertarDetalleTransaccionResponse_QNAME = new QName("http://pkg_servicio/", "insertarDetalleTransaccionResponse");
    private final static QName _InsertarTipoCuenta_QNAME = new QName("http://pkg_servicio/", "insertarTipoCuenta");
    private final static QName _InsertarTipoCuentaResponse_QNAME = new QName("http://pkg_servicio/", "insertarTipoCuentaResponse");
    private final static QName _InsertarTipoTransac_QNAME = new QName("http://pkg_servicio/", "insertarTipoTransac");
    private final static QName _InsertarTipoTransacResponse_QNAME = new QName("http://pkg_servicio/", "insertarTipoTransacResponse");
    private final static QName _InsertarTransaccion_QNAME = new QName("http://pkg_servicio/", "insertarTransaccion");
    private final static QName _InsertarTransaccionResponse_QNAME = new QName("http://pkg_servicio/", "insertarTransaccionResponse");
    private final static QName _ModificarCuenta_QNAME = new QName("http://pkg_servicio/", "modificarCuenta");
    private final static QName _ModificarCuentaBanc_QNAME = new QName("http://pkg_servicio/", "modificarCuentaBanc");
    private final static QName _ModificarCuentaBancResponse_QNAME = new QName("http://pkg_servicio/", "modificarCuentaBancResponse");
    private final static QName _ModificarCuentaResponse_QNAME = new QName("http://pkg_servicio/", "modificarCuentaResponse");
    private final static QName _ModificarDetalleTransaccion_QNAME = new QName("http://pkg_servicio/", "modificarDetalleTransaccion");
    private final static QName _ModificarDetalleTransaccionResponse_QNAME = new QName("http://pkg_servicio/", "modificarDetalleTransaccionResponse");
    private final static QName _ModificarTipoCuenta_QNAME = new QName("http://pkg_servicio/", "modificarTipoCuenta");
    private final static QName _ModificarTipoCuentaResponse_QNAME = new QName("http://pkg_servicio/", "modificarTipoCuentaResponse");
    private final static QName _ModificarTipoTransac_QNAME = new QName("http://pkg_servicio/", "modificarTipoTransac");
    private final static QName _ModificarTipoTransacResponse_QNAME = new QName("http://pkg_servicio/", "modificarTipoTransacResponse");
    private final static QName _ModificarTransaccion_QNAME = new QName("http://pkg_servicio/", "modificarTransaccion");
    private final static QName _ModificarTransaccionResponse_QNAME = new QName("http://pkg_servicio/", "modificarTransaccionResponse");
    private final static QName _ValidarUsuario_QNAME = new QName("http://pkg_servicio/", "validarUsuario");
    private final static QName _ValidarUsuarioResponse_QNAME = new QName("http://pkg_servicio/", "validarUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pkg_servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarCuenta }
     * 
     */
    public BuscarCuenta createBuscarCuenta() {
        return new BuscarCuenta();
    }

    /**
     * Create an instance of {@link BuscarCuentaBanc }
     * 
     */
    public BuscarCuentaBanc createBuscarCuentaBanc() {
        return new BuscarCuentaBanc();
    }

    /**
     * Create an instance of {@link BuscarCuentaBancResponse }
     * 
     */
    public BuscarCuentaBancResponse createBuscarCuentaBancResponse() {
        return new BuscarCuentaBancResponse();
    }

    /**
     * Create an instance of {@link BuscarCuentaResponse }
     * 
     */
    public BuscarCuentaResponse createBuscarCuentaResponse() {
        return new BuscarCuentaResponse();
    }

    /**
     * Create an instance of {@link BuscarTipoCuenta }
     * 
     */
    public BuscarTipoCuenta createBuscarTipoCuenta() {
        return new BuscarTipoCuenta();
    }

    /**
     * Create an instance of {@link BuscarTipoCuenta2 }
     * 
     */
    public BuscarTipoCuenta2 createBuscarTipoCuenta2() {
        return new BuscarTipoCuenta2();
    }

    /**
     * Create an instance of {@link BuscarTipoCuenta2Response }
     * 
     */
    public BuscarTipoCuenta2Response createBuscarTipoCuenta2Response() {
        return new BuscarTipoCuenta2Response();
    }

    /**
     * Create an instance of {@link BuscarTipoCuentaResponse }
     * 
     */
    public BuscarTipoCuentaResponse createBuscarTipoCuentaResponse() {
        return new BuscarTipoCuentaResponse();
    }

    /**
     * Create an instance of {@link BuscarTipoTransac }
     * 
     */
    public BuscarTipoTransac createBuscarTipoTransac() {
        return new BuscarTipoTransac();
    }

    /**
     * Create an instance of {@link BuscarTipoTransacResponse }
     * 
     */
    public BuscarTipoTransacResponse createBuscarTipoTransacResponse() {
        return new BuscarTipoTransacResponse();
    }

    /**
     * Create an instance of {@link BuscarTodoCuenta }
     * 
     */
    public BuscarTodoCuenta createBuscarTodoCuenta() {
        return new BuscarTodoCuenta();
    }

    /**
     * Create an instance of {@link BuscarTodoCuentaResponse }
     * 
     */
    public BuscarTodoCuentaResponse createBuscarTodoCuentaResponse() {
        return new BuscarTodoCuentaResponse();
    }

    /**
     * Create an instance of {@link BuscarTransaccion }
     * 
     */
    public BuscarTransaccion createBuscarTransaccion() {
        return new BuscarTransaccion();
    }

    /**
     * Create an instance of {@link BuscarTransaccionResponse }
     * 
     */
    public BuscarTransaccionResponse createBuscarTransaccionResponse() {
        return new BuscarTransaccionResponse();
    }

    /**
     * Create an instance of {@link EliminarCuenta }
     * 
     */
    public EliminarCuenta createEliminarCuenta() {
        return new EliminarCuenta();
    }

    /**
     * Create an instance of {@link EliminarCuentaBanc }
     * 
     */
    public EliminarCuentaBanc createEliminarCuentaBanc() {
        return new EliminarCuentaBanc();
    }

    /**
     * Create an instance of {@link EliminarCuentaBancResponse }
     * 
     */
    public EliminarCuentaBancResponse createEliminarCuentaBancResponse() {
        return new EliminarCuentaBancResponse();
    }

    /**
     * Create an instance of {@link EliminarCuentaResponse }
     * 
     */
    public EliminarCuentaResponse createEliminarCuentaResponse() {
        return new EliminarCuentaResponse();
    }

    /**
     * Create an instance of {@link EliminarDetalleTransaccion }
     * 
     */
    public EliminarDetalleTransaccion createEliminarDetalleTransaccion() {
        return new EliminarDetalleTransaccion();
    }

    /**
     * Create an instance of {@link EliminarDetalleTransaccionResponse }
     * 
     */
    public EliminarDetalleTransaccionResponse createEliminarDetalleTransaccionResponse() {
        return new EliminarDetalleTransaccionResponse();
    }

    /**
     * Create an instance of {@link EliminarTipoCuenta }
     * 
     */
    public EliminarTipoCuenta createEliminarTipoCuenta() {
        return new EliminarTipoCuenta();
    }

    /**
     * Create an instance of {@link EliminarTipoCuentaResponse }
     * 
     */
    public EliminarTipoCuentaResponse createEliminarTipoCuentaResponse() {
        return new EliminarTipoCuentaResponse();
    }

    /**
     * Create an instance of {@link EliminarTipoTransac }
     * 
     */
    public EliminarTipoTransac createEliminarTipoTransac() {
        return new EliminarTipoTransac();
    }

    /**
     * Create an instance of {@link EliminarTipoTransacResponse }
     * 
     */
    public EliminarTipoTransacResponse createEliminarTipoTransacResponse() {
        return new EliminarTipoTransacResponse();
    }

    /**
     * Create an instance of {@link EliminarTransaccion }
     * 
     */
    public EliminarTransaccion createEliminarTransaccion() {
        return new EliminarTransaccion();
    }

    /**
     * Create an instance of {@link EliminarTransaccionResponse }
     * 
     */
    public EliminarTransaccionResponse createEliminarTransaccionResponse() {
        return new EliminarTransaccionResponse();
    }

    /**
     * Create an instance of {@link InsertarCuenta }
     * 
     */
    public InsertarCuenta createInsertarCuenta() {
        return new InsertarCuenta();
    }

    /**
     * Create an instance of {@link InsertarCuentaBanc }
     * 
     */
    public InsertarCuentaBanc createInsertarCuentaBanc() {
        return new InsertarCuentaBanc();
    }

    /**
     * Create an instance of {@link InsertarCuentaBancResponse }
     * 
     */
    public InsertarCuentaBancResponse createInsertarCuentaBancResponse() {
        return new InsertarCuentaBancResponse();
    }

    /**
     * Create an instance of {@link InsertarCuentaResponse }
     * 
     */
    public InsertarCuentaResponse createInsertarCuentaResponse() {
        return new InsertarCuentaResponse();
    }

    /**
     * Create an instance of {@link InsertarDetalleTransaccion }
     * 
     */
    public InsertarDetalleTransaccion createInsertarDetalleTransaccion() {
        return new InsertarDetalleTransaccion();
    }

    /**
     * Create an instance of {@link InsertarDetalleTransaccionResponse }
     * 
     */
    public InsertarDetalleTransaccionResponse createInsertarDetalleTransaccionResponse() {
        return new InsertarDetalleTransaccionResponse();
    }

    /**
     * Create an instance of {@link InsertarTipoCuenta }
     * 
     */
    public InsertarTipoCuenta createInsertarTipoCuenta() {
        return new InsertarTipoCuenta();
    }

    /**
     * Create an instance of {@link InsertarTipoCuentaResponse }
     * 
     */
    public InsertarTipoCuentaResponse createInsertarTipoCuentaResponse() {
        return new InsertarTipoCuentaResponse();
    }

    /**
     * Create an instance of {@link InsertarTipoTransac }
     * 
     */
    public InsertarTipoTransac createInsertarTipoTransac() {
        return new InsertarTipoTransac();
    }

    /**
     * Create an instance of {@link InsertarTipoTransacResponse }
     * 
     */
    public InsertarTipoTransacResponse createInsertarTipoTransacResponse() {
        return new InsertarTipoTransacResponse();
    }

    /**
     * Create an instance of {@link InsertarTransaccion }
     * 
     */
    public InsertarTransaccion createInsertarTransaccion() {
        return new InsertarTransaccion();
    }

    /**
     * Create an instance of {@link InsertarTransaccionResponse }
     * 
     */
    public InsertarTransaccionResponse createInsertarTransaccionResponse() {
        return new InsertarTransaccionResponse();
    }

    /**
     * Create an instance of {@link ModificarCuenta }
     * 
     */
    public ModificarCuenta createModificarCuenta() {
        return new ModificarCuenta();
    }

    /**
     * Create an instance of {@link ModificarCuentaBanc }
     * 
     */
    public ModificarCuentaBanc createModificarCuentaBanc() {
        return new ModificarCuentaBanc();
    }

    /**
     * Create an instance of {@link ModificarCuentaBancResponse }
     * 
     */
    public ModificarCuentaBancResponse createModificarCuentaBancResponse() {
        return new ModificarCuentaBancResponse();
    }

    /**
     * Create an instance of {@link ModificarCuentaResponse }
     * 
     */
    public ModificarCuentaResponse createModificarCuentaResponse() {
        return new ModificarCuentaResponse();
    }

    /**
     * Create an instance of {@link ModificarDetalleTransaccion }
     * 
     */
    public ModificarDetalleTransaccion createModificarDetalleTransaccion() {
        return new ModificarDetalleTransaccion();
    }

    /**
     * Create an instance of {@link ModificarDetalleTransaccionResponse }
     * 
     */
    public ModificarDetalleTransaccionResponse createModificarDetalleTransaccionResponse() {
        return new ModificarDetalleTransaccionResponse();
    }

    /**
     * Create an instance of {@link ModificarTipoCuenta }
     * 
     */
    public ModificarTipoCuenta createModificarTipoCuenta() {
        return new ModificarTipoCuenta();
    }

    /**
     * Create an instance of {@link ModificarTipoCuentaResponse }
     * 
     */
    public ModificarTipoCuentaResponse createModificarTipoCuentaResponse() {
        return new ModificarTipoCuentaResponse();
    }

    /**
     * Create an instance of {@link ModificarTipoTransac }
     * 
     */
    public ModificarTipoTransac createModificarTipoTransac() {
        return new ModificarTipoTransac();
    }

    /**
     * Create an instance of {@link ModificarTipoTransacResponse }
     * 
     */
    public ModificarTipoTransacResponse createModificarTipoTransacResponse() {
        return new ModificarTipoTransacResponse();
    }

    /**
     * Create an instance of {@link ModificarTransaccion }
     * 
     */
    public ModificarTransaccion createModificarTransaccion() {
        return new ModificarTransaccion();
    }

    /**
     * Create an instance of {@link ModificarTransaccionResponse }
     * 
     */
    public ModificarTransaccionResponse createModificarTransaccionResponse() {
        return new ModificarTransaccionResponse();
    }

    /**
     * Create an instance of {@link ValidarUsuario }
     * 
     */
    public ValidarUsuario createValidarUsuario() {
        return new ValidarUsuario();
    }

    /**
     * Create an instance of {@link ValidarUsuarioResponse }
     * 
     */
    public ValidarUsuarioResponse createValidarUsuarioResponse() {
        return new ValidarUsuarioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarCuenta")
    public JAXBElement<BuscarCuenta> createBuscarCuenta(BuscarCuenta value) {
        return new JAXBElement<BuscarCuenta>(_BuscarCuenta_QNAME, BuscarCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCuentaBanc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarCuentaBanc")
    public JAXBElement<BuscarCuentaBanc> createBuscarCuentaBanc(BuscarCuentaBanc value) {
        return new JAXBElement<BuscarCuentaBanc>(_BuscarCuentaBanc_QNAME, BuscarCuentaBanc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCuentaBancResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarCuentaBancResponse")
    public JAXBElement<BuscarCuentaBancResponse> createBuscarCuentaBancResponse(BuscarCuentaBancResponse value) {
        return new JAXBElement<BuscarCuentaBancResponse>(_BuscarCuentaBancResponse_QNAME, BuscarCuentaBancResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarCuentaResponse")
    public JAXBElement<BuscarCuentaResponse> createBuscarCuentaResponse(BuscarCuentaResponse value) {
        return new JAXBElement<BuscarCuentaResponse>(_BuscarCuentaResponse_QNAME, BuscarCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTipoCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarTipoCuenta")
    public JAXBElement<BuscarTipoCuenta> createBuscarTipoCuenta(BuscarTipoCuenta value) {
        return new JAXBElement<BuscarTipoCuenta>(_BuscarTipoCuenta_QNAME, BuscarTipoCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTipoCuenta2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarTipoCuenta2")
    public JAXBElement<BuscarTipoCuenta2> createBuscarTipoCuenta2(BuscarTipoCuenta2 value) {
        return new JAXBElement<BuscarTipoCuenta2>(_BuscarTipoCuenta2_QNAME, BuscarTipoCuenta2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTipoCuenta2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarTipoCuenta2Response")
    public JAXBElement<BuscarTipoCuenta2Response> createBuscarTipoCuenta2Response(BuscarTipoCuenta2Response value) {
        return new JAXBElement<BuscarTipoCuenta2Response>(_BuscarTipoCuenta2Response_QNAME, BuscarTipoCuenta2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTipoCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarTipoCuentaResponse")
    public JAXBElement<BuscarTipoCuentaResponse> createBuscarTipoCuentaResponse(BuscarTipoCuentaResponse value) {
        return new JAXBElement<BuscarTipoCuentaResponse>(_BuscarTipoCuentaResponse_QNAME, BuscarTipoCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTipoTransac }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarTipoTransac")
    public JAXBElement<BuscarTipoTransac> createBuscarTipoTransac(BuscarTipoTransac value) {
        return new JAXBElement<BuscarTipoTransac>(_BuscarTipoTransac_QNAME, BuscarTipoTransac.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTipoTransacResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarTipoTransacResponse")
    public JAXBElement<BuscarTipoTransacResponse> createBuscarTipoTransacResponse(BuscarTipoTransacResponse value) {
        return new JAXBElement<BuscarTipoTransacResponse>(_BuscarTipoTransacResponse_QNAME, BuscarTipoTransacResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodoCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarTodoCuenta")
    public JAXBElement<BuscarTodoCuenta> createBuscarTodoCuenta(BuscarTodoCuenta value) {
        return new JAXBElement<BuscarTodoCuenta>(_BuscarTodoCuenta_QNAME, BuscarTodoCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodoCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarTodoCuentaResponse")
    public JAXBElement<BuscarTodoCuentaResponse> createBuscarTodoCuentaResponse(BuscarTodoCuentaResponse value) {
        return new JAXBElement<BuscarTodoCuentaResponse>(_BuscarTodoCuentaResponse_QNAME, BuscarTodoCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTransaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarTransaccion")
    public JAXBElement<BuscarTransaccion> createBuscarTransaccion(BuscarTransaccion value) {
        return new JAXBElement<BuscarTransaccion>(_BuscarTransaccion_QNAME, BuscarTransaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTransaccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarTransaccionResponse")
    public JAXBElement<BuscarTransaccionResponse> createBuscarTransaccionResponse(BuscarTransaccionResponse value) {
        return new JAXBElement<BuscarTransaccionResponse>(_BuscarTransaccionResponse_QNAME, BuscarTransaccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarCuenta")
    public JAXBElement<EliminarCuenta> createEliminarCuenta(EliminarCuenta value) {
        return new JAXBElement<EliminarCuenta>(_EliminarCuenta_QNAME, EliminarCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCuentaBanc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarCuentaBanc")
    public JAXBElement<EliminarCuentaBanc> createEliminarCuentaBanc(EliminarCuentaBanc value) {
        return new JAXBElement<EliminarCuentaBanc>(_EliminarCuentaBanc_QNAME, EliminarCuentaBanc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCuentaBancResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarCuentaBancResponse")
    public JAXBElement<EliminarCuentaBancResponse> createEliminarCuentaBancResponse(EliminarCuentaBancResponse value) {
        return new JAXBElement<EliminarCuentaBancResponse>(_EliminarCuentaBancResponse_QNAME, EliminarCuentaBancResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarCuentaResponse")
    public JAXBElement<EliminarCuentaResponse> createEliminarCuentaResponse(EliminarCuentaResponse value) {
        return new JAXBElement<EliminarCuentaResponse>(_EliminarCuentaResponse_QNAME, EliminarCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDetalleTransaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarDetalleTransaccion")
    public JAXBElement<EliminarDetalleTransaccion> createEliminarDetalleTransaccion(EliminarDetalleTransaccion value) {
        return new JAXBElement<EliminarDetalleTransaccion>(_EliminarDetalleTransaccion_QNAME, EliminarDetalleTransaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDetalleTransaccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarDetalleTransaccionResponse")
    public JAXBElement<EliminarDetalleTransaccionResponse> createEliminarDetalleTransaccionResponse(EliminarDetalleTransaccionResponse value) {
        return new JAXBElement<EliminarDetalleTransaccionResponse>(_EliminarDetalleTransaccionResponse_QNAME, EliminarDetalleTransaccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTipoCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarTipoCuenta")
    public JAXBElement<EliminarTipoCuenta> createEliminarTipoCuenta(EliminarTipoCuenta value) {
        return new JAXBElement<EliminarTipoCuenta>(_EliminarTipoCuenta_QNAME, EliminarTipoCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTipoCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarTipoCuentaResponse")
    public JAXBElement<EliminarTipoCuentaResponse> createEliminarTipoCuentaResponse(EliminarTipoCuentaResponse value) {
        return new JAXBElement<EliminarTipoCuentaResponse>(_EliminarTipoCuentaResponse_QNAME, EliminarTipoCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTipoTransac }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarTipoTransac")
    public JAXBElement<EliminarTipoTransac> createEliminarTipoTransac(EliminarTipoTransac value) {
        return new JAXBElement<EliminarTipoTransac>(_EliminarTipoTransac_QNAME, EliminarTipoTransac.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTipoTransacResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarTipoTransacResponse")
    public JAXBElement<EliminarTipoTransacResponse> createEliminarTipoTransacResponse(EliminarTipoTransacResponse value) {
        return new JAXBElement<EliminarTipoTransacResponse>(_EliminarTipoTransacResponse_QNAME, EliminarTipoTransacResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTransaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarTransaccion")
    public JAXBElement<EliminarTransaccion> createEliminarTransaccion(EliminarTransaccion value) {
        return new JAXBElement<EliminarTransaccion>(_EliminarTransaccion_QNAME, EliminarTransaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTransaccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarTransaccionResponse")
    public JAXBElement<EliminarTransaccionResponse> createEliminarTransaccionResponse(EliminarTransaccionResponse value) {
        return new JAXBElement<EliminarTransaccionResponse>(_EliminarTransaccionResponse_QNAME, EliminarTransaccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarCuenta")
    public JAXBElement<InsertarCuenta> createInsertarCuenta(InsertarCuenta value) {
        return new JAXBElement<InsertarCuenta>(_InsertarCuenta_QNAME, InsertarCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCuentaBanc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarCuentaBanc")
    public JAXBElement<InsertarCuentaBanc> createInsertarCuentaBanc(InsertarCuentaBanc value) {
        return new JAXBElement<InsertarCuentaBanc>(_InsertarCuentaBanc_QNAME, InsertarCuentaBanc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCuentaBancResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarCuentaBancResponse")
    public JAXBElement<InsertarCuentaBancResponse> createInsertarCuentaBancResponse(InsertarCuentaBancResponse value) {
        return new JAXBElement<InsertarCuentaBancResponse>(_InsertarCuentaBancResponse_QNAME, InsertarCuentaBancResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarCuentaResponse")
    public JAXBElement<InsertarCuentaResponse> createInsertarCuentaResponse(InsertarCuentaResponse value) {
        return new JAXBElement<InsertarCuentaResponse>(_InsertarCuentaResponse_QNAME, InsertarCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarDetalleTransaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarDetalleTransaccion")
    public JAXBElement<InsertarDetalleTransaccion> createInsertarDetalleTransaccion(InsertarDetalleTransaccion value) {
        return new JAXBElement<InsertarDetalleTransaccion>(_InsertarDetalleTransaccion_QNAME, InsertarDetalleTransaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarDetalleTransaccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarDetalleTransaccionResponse")
    public JAXBElement<InsertarDetalleTransaccionResponse> createInsertarDetalleTransaccionResponse(InsertarDetalleTransaccionResponse value) {
        return new JAXBElement<InsertarDetalleTransaccionResponse>(_InsertarDetalleTransaccionResponse_QNAME, InsertarDetalleTransaccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarTipoCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarTipoCuenta")
    public JAXBElement<InsertarTipoCuenta> createInsertarTipoCuenta(InsertarTipoCuenta value) {
        return new JAXBElement<InsertarTipoCuenta>(_InsertarTipoCuenta_QNAME, InsertarTipoCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarTipoCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarTipoCuentaResponse")
    public JAXBElement<InsertarTipoCuentaResponse> createInsertarTipoCuentaResponse(InsertarTipoCuentaResponse value) {
        return new JAXBElement<InsertarTipoCuentaResponse>(_InsertarTipoCuentaResponse_QNAME, InsertarTipoCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarTipoTransac }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarTipoTransac")
    public JAXBElement<InsertarTipoTransac> createInsertarTipoTransac(InsertarTipoTransac value) {
        return new JAXBElement<InsertarTipoTransac>(_InsertarTipoTransac_QNAME, InsertarTipoTransac.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarTipoTransacResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarTipoTransacResponse")
    public JAXBElement<InsertarTipoTransacResponse> createInsertarTipoTransacResponse(InsertarTipoTransacResponse value) {
        return new JAXBElement<InsertarTipoTransacResponse>(_InsertarTipoTransacResponse_QNAME, InsertarTipoTransacResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarTransaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarTransaccion")
    public JAXBElement<InsertarTransaccion> createInsertarTransaccion(InsertarTransaccion value) {
        return new JAXBElement<InsertarTransaccion>(_InsertarTransaccion_QNAME, InsertarTransaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarTransaccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarTransaccionResponse")
    public JAXBElement<InsertarTransaccionResponse> createInsertarTransaccionResponse(InsertarTransaccionResponse value) {
        return new JAXBElement<InsertarTransaccionResponse>(_InsertarTransaccionResponse_QNAME, InsertarTransaccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarCuenta")
    public JAXBElement<ModificarCuenta> createModificarCuenta(ModificarCuenta value) {
        return new JAXBElement<ModificarCuenta>(_ModificarCuenta_QNAME, ModificarCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarCuentaBanc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarCuentaBanc")
    public JAXBElement<ModificarCuentaBanc> createModificarCuentaBanc(ModificarCuentaBanc value) {
        return new JAXBElement<ModificarCuentaBanc>(_ModificarCuentaBanc_QNAME, ModificarCuentaBanc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarCuentaBancResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarCuentaBancResponse")
    public JAXBElement<ModificarCuentaBancResponse> createModificarCuentaBancResponse(ModificarCuentaBancResponse value) {
        return new JAXBElement<ModificarCuentaBancResponse>(_ModificarCuentaBancResponse_QNAME, ModificarCuentaBancResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarCuentaResponse")
    public JAXBElement<ModificarCuentaResponse> createModificarCuentaResponse(ModificarCuentaResponse value) {
        return new JAXBElement<ModificarCuentaResponse>(_ModificarCuentaResponse_QNAME, ModificarCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarDetalleTransaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarDetalleTransaccion")
    public JAXBElement<ModificarDetalleTransaccion> createModificarDetalleTransaccion(ModificarDetalleTransaccion value) {
        return new JAXBElement<ModificarDetalleTransaccion>(_ModificarDetalleTransaccion_QNAME, ModificarDetalleTransaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarDetalleTransaccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarDetalleTransaccionResponse")
    public JAXBElement<ModificarDetalleTransaccionResponse> createModificarDetalleTransaccionResponse(ModificarDetalleTransaccionResponse value) {
        return new JAXBElement<ModificarDetalleTransaccionResponse>(_ModificarDetalleTransaccionResponse_QNAME, ModificarDetalleTransaccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarTipoCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarTipoCuenta")
    public JAXBElement<ModificarTipoCuenta> createModificarTipoCuenta(ModificarTipoCuenta value) {
        return new JAXBElement<ModificarTipoCuenta>(_ModificarTipoCuenta_QNAME, ModificarTipoCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarTipoCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarTipoCuentaResponse")
    public JAXBElement<ModificarTipoCuentaResponse> createModificarTipoCuentaResponse(ModificarTipoCuentaResponse value) {
        return new JAXBElement<ModificarTipoCuentaResponse>(_ModificarTipoCuentaResponse_QNAME, ModificarTipoCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarTipoTransac }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarTipoTransac")
    public JAXBElement<ModificarTipoTransac> createModificarTipoTransac(ModificarTipoTransac value) {
        return new JAXBElement<ModificarTipoTransac>(_ModificarTipoTransac_QNAME, ModificarTipoTransac.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarTipoTransacResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarTipoTransacResponse")
    public JAXBElement<ModificarTipoTransacResponse> createModificarTipoTransacResponse(ModificarTipoTransacResponse value) {
        return new JAXBElement<ModificarTipoTransacResponse>(_ModificarTipoTransacResponse_QNAME, ModificarTipoTransacResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarTransaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarTransaccion")
    public JAXBElement<ModificarTransaccion> createModificarTransaccion(ModificarTransaccion value) {
        return new JAXBElement<ModificarTransaccion>(_ModificarTransaccion_QNAME, ModificarTransaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarTransaccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarTransaccionResponse")
    public JAXBElement<ModificarTransaccionResponse> createModificarTransaccionResponse(ModificarTransaccionResponse value) {
        return new JAXBElement<ModificarTransaccionResponse>(_ModificarTransaccionResponse_QNAME, ModificarTransaccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "validarUsuario")
    public JAXBElement<ValidarUsuario> createValidarUsuario(ValidarUsuario value) {
        return new JAXBElement<ValidarUsuario>(_ValidarUsuario_QNAME, ValidarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "validarUsuarioResponse")
    public JAXBElement<ValidarUsuarioResponse> createValidarUsuarioResponse(ValidarUsuarioResponse value) {
        return new JAXBElement<ValidarUsuarioResponse>(_ValidarUsuarioResponse_QNAME, ValidarUsuarioResponse.class, null, value);
    }

}
