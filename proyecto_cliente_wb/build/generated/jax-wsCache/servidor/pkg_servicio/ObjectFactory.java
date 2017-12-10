
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

    private final static QName _CuentaLista_QNAME = new QName("http://pkg_servicio/", "CuentaLista");
    private final static QName _CuentaListaResponse_QNAME = new QName("http://pkg_servicio/", "CuentaListaResponse");
    private final static QName _BalanceLista_QNAME = new QName("http://pkg_servicio/", "balanceLista");
    private final static QName _BalanceListaResponse_QNAME = new QName("http://pkg_servicio/", "balanceListaResponse");
    private final static QName _BuscarComprobante_QNAME = new QName("http://pkg_servicio/", "buscarComprobante");
    private final static QName _BuscarComprobanteResponse_QNAME = new QName("http://pkg_servicio/", "buscarComprobanteResponse");
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
    private final static QName _BuscarUsuario_QNAME = new QName("http://pkg_servicio/", "buscarUsuario");
    private final static QName _BuscarUsuarioResponse_QNAME = new QName("http://pkg_servicio/", "buscarUsuarioResponse");
    private final static QName _CuentasBancariasLista_QNAME = new QName("http://pkg_servicio/", "cuentasBancariasLista");
    private final static QName _CuentasBancariasListaResponse_QNAME = new QName("http://pkg_servicio/", "cuentasBancariasListaResponse");
    private final static QName _EliminarComprobante_QNAME = new QName("http://pkg_servicio/", "eliminarComprobante");
    private final static QName _EliminarComprobanteResponse_QNAME = new QName("http://pkg_servicio/", "eliminarComprobanteResponse");
    private final static QName _EliminarCuenta_QNAME = new QName("http://pkg_servicio/", "eliminarCuenta");
    private final static QName _EliminarCuentaBanc_QNAME = new QName("http://pkg_servicio/", "eliminarCuentaBanc");
    private final static QName _EliminarCuentaBancResponse_QNAME = new QName("http://pkg_servicio/", "eliminarCuentaBancResponse");
    private final static QName _EliminarCuentaResponse_QNAME = new QName("http://pkg_servicio/", "eliminarCuentaResponse");
    private final static QName _EliminarDetalleComprobante_QNAME = new QName("http://pkg_servicio/", "eliminarDetalleComprobante");
    private final static QName _EliminarDetalleComprobanteResponse_QNAME = new QName("http://pkg_servicio/", "eliminarDetalleComprobanteResponse");
    private final static QName _EliminarDetalleTransaccion_QNAME = new QName("http://pkg_servicio/", "eliminarDetalleTransaccion");
    private final static QName _EliminarDetalleTransaccionResponse_QNAME = new QName("http://pkg_servicio/", "eliminarDetalleTransaccionResponse");
    private final static QName _EliminarTipoCuenta_QNAME = new QName("http://pkg_servicio/", "eliminarTipoCuenta");
    private final static QName _EliminarTipoCuentaResponse_QNAME = new QName("http://pkg_servicio/", "eliminarTipoCuentaResponse");
    private final static QName _EliminarTipoTransac_QNAME = new QName("http://pkg_servicio/", "eliminarTipoTransac");
    private final static QName _EliminarTipoTransacResponse_QNAME = new QName("http://pkg_servicio/", "eliminarTipoTransacResponse");
    private final static QName _EliminarTransaccion_QNAME = new QName("http://pkg_servicio/", "eliminarTransaccion");
    private final static QName _EliminarTransaccionResponse_QNAME = new QName("http://pkg_servicio/", "eliminarTransaccionResponse");
    private final static QName _EliminarUsuario_QNAME = new QName("http://pkg_servicio/", "eliminarUsuario");
    private final static QName _EliminarUsuarioResponse_QNAME = new QName("http://pkg_servicio/", "eliminarUsuarioResponse");
    private final static QName _InsertarComprobante_QNAME = new QName("http://pkg_servicio/", "insertarComprobante");
    private final static QName _InsertarComprobanteResponse_QNAME = new QName("http://pkg_servicio/", "insertarComprobanteResponse");
    private final static QName _InsertarCuenta_QNAME = new QName("http://pkg_servicio/", "insertarCuenta");
    private final static QName _InsertarCuentaBanc_QNAME = new QName("http://pkg_servicio/", "insertarCuentaBanc");
    private final static QName _InsertarCuentaBancResponse_QNAME = new QName("http://pkg_servicio/", "insertarCuentaBancResponse");
    private final static QName _InsertarCuentaResponse_QNAME = new QName("http://pkg_servicio/", "insertarCuentaResponse");
    private final static QName _InsertarDetalleComprobante_QNAME = new QName("http://pkg_servicio/", "insertarDetalleComprobante");
    private final static QName _InsertarDetalleComprobanteResponse_QNAME = new QName("http://pkg_servicio/", "insertarDetalleComprobanteResponse");
    private final static QName _InsertarDetalleTransaccion_QNAME = new QName("http://pkg_servicio/", "insertarDetalleTransaccion");
    private final static QName _InsertarDetalleTransaccionResponse_QNAME = new QName("http://pkg_servicio/", "insertarDetalleTransaccionResponse");
    private final static QName _InsertarTipoCuenta_QNAME = new QName("http://pkg_servicio/", "insertarTipoCuenta");
    private final static QName _InsertarTipoCuentaResponse_QNAME = new QName("http://pkg_servicio/", "insertarTipoCuentaResponse");
    private final static QName _InsertarTipoTransac_QNAME = new QName("http://pkg_servicio/", "insertarTipoTransac");
    private final static QName _InsertarTipoTransacResponse_QNAME = new QName("http://pkg_servicio/", "insertarTipoTransacResponse");
    private final static QName _InsertarTransaccion_QNAME = new QName("http://pkg_servicio/", "insertarTransaccion");
    private final static QName _InsertarTransaccionResponse_QNAME = new QName("http://pkg_servicio/", "insertarTransaccionResponse");
    private final static QName _InsertarUsuario_QNAME = new QName("http://pkg_servicio/", "insertarUsuario");
    private final static QName _InsertarUsuarioResponse_QNAME = new QName("http://pkg_servicio/", "insertarUsuarioResponse");
    private final static QName _Integracion_QNAME = new QName("http://pkg_servicio/", "integracion");
    private final static QName _IntegracionResponse_QNAME = new QName("http://pkg_servicio/", "integracionResponse");
    private final static QName _ModificarComprobante_QNAME = new QName("http://pkg_servicio/", "modificarComprobante");
    private final static QName _ModificarComprobanteResponse_QNAME = new QName("http://pkg_servicio/", "modificarComprobanteResponse");
    private final static QName _ModificarCuenta_QNAME = new QName("http://pkg_servicio/", "modificarCuenta");
    private final static QName _ModificarCuentaBanc_QNAME = new QName("http://pkg_servicio/", "modificarCuentaBanc");
    private final static QName _ModificarCuentaBancResponse_QNAME = new QName("http://pkg_servicio/", "modificarCuentaBancResponse");
    private final static QName _ModificarCuentaResponse_QNAME = new QName("http://pkg_servicio/", "modificarCuentaResponse");
    private final static QName _ModificarDetalleComprobante_QNAME = new QName("http://pkg_servicio/", "modificarDetalleComprobante");
    private final static QName _ModificarDetalleComprobanteResponse_QNAME = new QName("http://pkg_servicio/", "modificarDetalleComprobanteResponse");
    private final static QName _ModificarDetalleTransaccion_QNAME = new QName("http://pkg_servicio/", "modificarDetalleTransaccion");
    private final static QName _ModificarDetalleTransaccionResponse_QNAME = new QName("http://pkg_servicio/", "modificarDetalleTransaccionResponse");
    private final static QName _ModificarTipoCuenta_QNAME = new QName("http://pkg_servicio/", "modificarTipoCuenta");
    private final static QName _ModificarTipoCuentaResponse_QNAME = new QName("http://pkg_servicio/", "modificarTipoCuentaResponse");
    private final static QName _ModificarTipoTransac_QNAME = new QName("http://pkg_servicio/", "modificarTipoTransac");
    private final static QName _ModificarTipoTransacResponse_QNAME = new QName("http://pkg_servicio/", "modificarTipoTransacResponse");
    private final static QName _ModificarTransaccion_QNAME = new QName("http://pkg_servicio/", "modificarTransaccion");
    private final static QName _ModificarTransaccionResponse_QNAME = new QName("http://pkg_servicio/", "modificarTransaccionResponse");
    private final static QName _ModificarUsuario_QNAME = new QName("http://pkg_servicio/", "modificarUsuario");
    private final static QName _ModificarUsuarioResponse_QNAME = new QName("http://pkg_servicio/", "modificarUsuarioResponse");
    private final static QName _TipoTransaccionLista_QNAME = new QName("http://pkg_servicio/", "tipoTransaccionLista");
    private final static QName _TipoTransaccionListaResponse_QNAME = new QName("http://pkg_servicio/", "tipoTransaccionListaResponse");
    private final static QName _TransaccionReporte1_QNAME = new QName("http://pkg_servicio/", "transaccionReporte1");
    private final static QName _TransaccionReporte1Response_QNAME = new QName("http://pkg_servicio/", "transaccionReporte1Response");
    private final static QName _ValidarUsuario_QNAME = new QName("http://pkg_servicio/", "validarUsuario");
    private final static QName _ValidarUsuarioResponse_QNAME = new QName("http://pkg_servicio/", "validarUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pkg_servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CuentaLista }
     * 
     */
    public CuentaLista createCuentaLista() {
        return new CuentaLista();
    }

    /**
     * Create an instance of {@link CuentaListaResponse }
     * 
     */
    public CuentaListaResponse createCuentaListaResponse() {
        return new CuentaListaResponse();
    }

    /**
     * Create an instance of {@link BalanceLista }
     * 
     */
    public BalanceLista createBalanceLista() {
        return new BalanceLista();
    }

    /**
     * Create an instance of {@link BalanceListaResponse }
     * 
     */
    public BalanceListaResponse createBalanceListaResponse() {
        return new BalanceListaResponse();
    }

    /**
     * Create an instance of {@link BuscarComprobante }
     * 
     */
    public BuscarComprobante createBuscarComprobante() {
        return new BuscarComprobante();
    }

    /**
     * Create an instance of {@link BuscarComprobanteResponse }
     * 
     */
    public BuscarComprobanteResponse createBuscarComprobanteResponse() {
        return new BuscarComprobanteResponse();
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
     * Create an instance of {@link BuscarUsuario }
     * 
     */
    public BuscarUsuario createBuscarUsuario() {
        return new BuscarUsuario();
    }

    /**
     * Create an instance of {@link BuscarUsuarioResponse }
     * 
     */
    public BuscarUsuarioResponse createBuscarUsuarioResponse() {
        return new BuscarUsuarioResponse();
    }

    /**
     * Create an instance of {@link CuentasBancariasLista }
     * 
     */
    public CuentasBancariasLista createCuentasBancariasLista() {
        return new CuentasBancariasLista();
    }

    /**
     * Create an instance of {@link CuentasBancariasListaResponse }
     * 
     */
    public CuentasBancariasListaResponse createCuentasBancariasListaResponse() {
        return new CuentasBancariasListaResponse();
    }

    /**
     * Create an instance of {@link EliminarComprobante }
     * 
     */
    public EliminarComprobante createEliminarComprobante() {
        return new EliminarComprobante();
    }

    /**
     * Create an instance of {@link EliminarComprobanteResponse }
     * 
     */
    public EliminarComprobanteResponse createEliminarComprobanteResponse() {
        return new EliminarComprobanteResponse();
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
     * Create an instance of {@link EliminarDetalleComprobante }
     * 
     */
    public EliminarDetalleComprobante createEliminarDetalleComprobante() {
        return new EliminarDetalleComprobante();
    }

    /**
     * Create an instance of {@link EliminarDetalleComprobanteResponse }
     * 
     */
    public EliminarDetalleComprobanteResponse createEliminarDetalleComprobanteResponse() {
        return new EliminarDetalleComprobanteResponse();
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
     * Create an instance of {@link EliminarUsuario }
     * 
     */
    public EliminarUsuario createEliminarUsuario() {
        return new EliminarUsuario();
    }

    /**
     * Create an instance of {@link EliminarUsuarioResponse }
     * 
     */
    public EliminarUsuarioResponse createEliminarUsuarioResponse() {
        return new EliminarUsuarioResponse();
    }

    /**
     * Create an instance of {@link InsertarComprobante }
     * 
     */
    public InsertarComprobante createInsertarComprobante() {
        return new InsertarComprobante();
    }

    /**
     * Create an instance of {@link InsertarComprobanteResponse }
     * 
     */
    public InsertarComprobanteResponse createInsertarComprobanteResponse() {
        return new InsertarComprobanteResponse();
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
     * Create an instance of {@link InsertarDetalleComprobante }
     * 
     */
    public InsertarDetalleComprobante createInsertarDetalleComprobante() {
        return new InsertarDetalleComprobante();
    }

    /**
     * Create an instance of {@link InsertarDetalleComprobanteResponse }
     * 
     */
    public InsertarDetalleComprobanteResponse createInsertarDetalleComprobanteResponse() {
        return new InsertarDetalleComprobanteResponse();
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
     * Create an instance of {@link InsertarUsuario }
     * 
     */
    public InsertarUsuario createInsertarUsuario() {
        return new InsertarUsuario();
    }

    /**
     * Create an instance of {@link InsertarUsuarioResponse }
     * 
     */
    public InsertarUsuarioResponse createInsertarUsuarioResponse() {
        return new InsertarUsuarioResponse();
    }

    /**
     * Create an instance of {@link Integracion }
     * 
     */
    public Integracion createIntegracion() {
        return new Integracion();
    }

    /**
     * Create an instance of {@link IntegracionResponse }
     * 
     */
    public IntegracionResponse createIntegracionResponse() {
        return new IntegracionResponse();
    }

    /**
     * Create an instance of {@link ModificarComprobante }
     * 
     */
    public ModificarComprobante createModificarComprobante() {
        return new ModificarComprobante();
    }

    /**
     * Create an instance of {@link ModificarComprobanteResponse }
     * 
     */
    public ModificarComprobanteResponse createModificarComprobanteResponse() {
        return new ModificarComprobanteResponse();
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
     * Create an instance of {@link ModificarDetalleComprobante }
     * 
     */
    public ModificarDetalleComprobante createModificarDetalleComprobante() {
        return new ModificarDetalleComprobante();
    }

    /**
     * Create an instance of {@link ModificarDetalleComprobanteResponse }
     * 
     */
    public ModificarDetalleComprobanteResponse createModificarDetalleComprobanteResponse() {
        return new ModificarDetalleComprobanteResponse();
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
     * Create an instance of {@link ModificarUsuario }
     * 
     */
    public ModificarUsuario createModificarUsuario() {
        return new ModificarUsuario();
    }

    /**
     * Create an instance of {@link ModificarUsuarioResponse }
     * 
     */
    public ModificarUsuarioResponse createModificarUsuarioResponse() {
        return new ModificarUsuarioResponse();
    }

    /**
     * Create an instance of {@link TipoTransaccionLista }
     * 
     */
    public TipoTransaccionLista createTipoTransaccionLista() {
        return new TipoTransaccionLista();
    }

    /**
     * Create an instance of {@link TipoTransaccionListaResponse }
     * 
     */
    public TipoTransaccionListaResponse createTipoTransaccionListaResponse() {
        return new TipoTransaccionListaResponse();
    }

    /**
     * Create an instance of {@link TransaccionReporte1 }
     * 
     */
    public TransaccionReporte1 createTransaccionReporte1() {
        return new TransaccionReporte1();
    }

    /**
     * Create an instance of {@link TransaccionReporte1Response }
     * 
     */
    public TransaccionReporte1Response createTransaccionReporte1Response() {
        return new TransaccionReporte1Response();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CuentaLista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "CuentaLista")
    public JAXBElement<CuentaLista> createCuentaLista(CuentaLista value) {
        return new JAXBElement<CuentaLista>(_CuentaLista_QNAME, CuentaLista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CuentaListaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "CuentaListaResponse")
    public JAXBElement<CuentaListaResponse> createCuentaListaResponse(CuentaListaResponse value) {
        return new JAXBElement<CuentaListaResponse>(_CuentaListaResponse_QNAME, CuentaListaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceLista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "balanceLista")
    public JAXBElement<BalanceLista> createBalanceLista(BalanceLista value) {
        return new JAXBElement<BalanceLista>(_BalanceLista_QNAME, BalanceLista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceListaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "balanceListaResponse")
    public JAXBElement<BalanceListaResponse> createBalanceListaResponse(BalanceListaResponse value) {
        return new JAXBElement<BalanceListaResponse>(_BalanceListaResponse_QNAME, BalanceListaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarComprobante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarComprobante")
    public JAXBElement<BuscarComprobante> createBuscarComprobante(BuscarComprobante value) {
        return new JAXBElement<BuscarComprobante>(_BuscarComprobante_QNAME, BuscarComprobante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarComprobanteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarComprobanteResponse")
    public JAXBElement<BuscarComprobanteResponse> createBuscarComprobanteResponse(BuscarComprobanteResponse value) {
        return new JAXBElement<BuscarComprobanteResponse>(_BuscarComprobanteResponse_QNAME, BuscarComprobanteResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarUsuario")
    public JAXBElement<BuscarUsuario> createBuscarUsuario(BuscarUsuario value) {
        return new JAXBElement<BuscarUsuario>(_BuscarUsuario_QNAME, BuscarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "buscarUsuarioResponse")
    public JAXBElement<BuscarUsuarioResponse> createBuscarUsuarioResponse(BuscarUsuarioResponse value) {
        return new JAXBElement<BuscarUsuarioResponse>(_BuscarUsuarioResponse_QNAME, BuscarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CuentasBancariasLista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "cuentasBancariasLista")
    public JAXBElement<CuentasBancariasLista> createCuentasBancariasLista(CuentasBancariasLista value) {
        return new JAXBElement<CuentasBancariasLista>(_CuentasBancariasLista_QNAME, CuentasBancariasLista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CuentasBancariasListaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "cuentasBancariasListaResponse")
    public JAXBElement<CuentasBancariasListaResponse> createCuentasBancariasListaResponse(CuentasBancariasListaResponse value) {
        return new JAXBElement<CuentasBancariasListaResponse>(_CuentasBancariasListaResponse_QNAME, CuentasBancariasListaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarComprobante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarComprobante")
    public JAXBElement<EliminarComprobante> createEliminarComprobante(EliminarComprobante value) {
        return new JAXBElement<EliminarComprobante>(_EliminarComprobante_QNAME, EliminarComprobante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarComprobanteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarComprobanteResponse")
    public JAXBElement<EliminarComprobanteResponse> createEliminarComprobanteResponse(EliminarComprobanteResponse value) {
        return new JAXBElement<EliminarComprobanteResponse>(_EliminarComprobanteResponse_QNAME, EliminarComprobanteResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDetalleComprobante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarDetalleComprobante")
    public JAXBElement<EliminarDetalleComprobante> createEliminarDetalleComprobante(EliminarDetalleComprobante value) {
        return new JAXBElement<EliminarDetalleComprobante>(_EliminarDetalleComprobante_QNAME, EliminarDetalleComprobante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDetalleComprobanteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarDetalleComprobanteResponse")
    public JAXBElement<EliminarDetalleComprobanteResponse> createEliminarDetalleComprobanteResponse(EliminarDetalleComprobanteResponse value) {
        return new JAXBElement<EliminarDetalleComprobanteResponse>(_EliminarDetalleComprobanteResponse_QNAME, EliminarDetalleComprobanteResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarUsuario")
    public JAXBElement<EliminarUsuario> createEliminarUsuario(EliminarUsuario value) {
        return new JAXBElement<EliminarUsuario>(_EliminarUsuario_QNAME, EliminarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "eliminarUsuarioResponse")
    public JAXBElement<EliminarUsuarioResponse> createEliminarUsuarioResponse(EliminarUsuarioResponse value) {
        return new JAXBElement<EliminarUsuarioResponse>(_EliminarUsuarioResponse_QNAME, EliminarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarComprobante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarComprobante")
    public JAXBElement<InsertarComprobante> createInsertarComprobante(InsertarComprobante value) {
        return new JAXBElement<InsertarComprobante>(_InsertarComprobante_QNAME, InsertarComprobante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarComprobanteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarComprobanteResponse")
    public JAXBElement<InsertarComprobanteResponse> createInsertarComprobanteResponse(InsertarComprobanteResponse value) {
        return new JAXBElement<InsertarComprobanteResponse>(_InsertarComprobanteResponse_QNAME, InsertarComprobanteResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarDetalleComprobante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarDetalleComprobante")
    public JAXBElement<InsertarDetalleComprobante> createInsertarDetalleComprobante(InsertarDetalleComprobante value) {
        return new JAXBElement<InsertarDetalleComprobante>(_InsertarDetalleComprobante_QNAME, InsertarDetalleComprobante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarDetalleComprobanteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarDetalleComprobanteResponse")
    public JAXBElement<InsertarDetalleComprobanteResponse> createInsertarDetalleComprobanteResponse(InsertarDetalleComprobanteResponse value) {
        return new JAXBElement<InsertarDetalleComprobanteResponse>(_InsertarDetalleComprobanteResponse_QNAME, InsertarDetalleComprobanteResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarUsuario")
    public JAXBElement<InsertarUsuario> createInsertarUsuario(InsertarUsuario value) {
        return new JAXBElement<InsertarUsuario>(_InsertarUsuario_QNAME, InsertarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "insertarUsuarioResponse")
    public JAXBElement<InsertarUsuarioResponse> createInsertarUsuarioResponse(InsertarUsuarioResponse value) {
        return new JAXBElement<InsertarUsuarioResponse>(_InsertarUsuarioResponse_QNAME, InsertarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integracion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "integracion")
    public JAXBElement<Integracion> createIntegracion(Integracion value) {
        return new JAXBElement<Integracion>(_Integracion_QNAME, Integracion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegracionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "integracionResponse")
    public JAXBElement<IntegracionResponse> createIntegracionResponse(IntegracionResponse value) {
        return new JAXBElement<IntegracionResponse>(_IntegracionResponse_QNAME, IntegracionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarComprobante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarComprobante")
    public JAXBElement<ModificarComprobante> createModificarComprobante(ModificarComprobante value) {
        return new JAXBElement<ModificarComprobante>(_ModificarComprobante_QNAME, ModificarComprobante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarComprobanteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarComprobanteResponse")
    public JAXBElement<ModificarComprobanteResponse> createModificarComprobanteResponse(ModificarComprobanteResponse value) {
        return new JAXBElement<ModificarComprobanteResponse>(_ModificarComprobanteResponse_QNAME, ModificarComprobanteResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarDetalleComprobante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarDetalleComprobante")
    public JAXBElement<ModificarDetalleComprobante> createModificarDetalleComprobante(ModificarDetalleComprobante value) {
        return new JAXBElement<ModificarDetalleComprobante>(_ModificarDetalleComprobante_QNAME, ModificarDetalleComprobante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarDetalleComprobanteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarDetalleComprobanteResponse")
    public JAXBElement<ModificarDetalleComprobanteResponse> createModificarDetalleComprobanteResponse(ModificarDetalleComprobanteResponse value) {
        return new JAXBElement<ModificarDetalleComprobanteResponse>(_ModificarDetalleComprobanteResponse_QNAME, ModificarDetalleComprobanteResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarUsuario")
    public JAXBElement<ModificarUsuario> createModificarUsuario(ModificarUsuario value) {
        return new JAXBElement<ModificarUsuario>(_ModificarUsuario_QNAME, ModificarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "modificarUsuarioResponse")
    public JAXBElement<ModificarUsuarioResponse> createModificarUsuarioResponse(ModificarUsuarioResponse value) {
        return new JAXBElement<ModificarUsuarioResponse>(_ModificarUsuarioResponse_QNAME, ModificarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoTransaccionLista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "tipoTransaccionLista")
    public JAXBElement<TipoTransaccionLista> createTipoTransaccionLista(TipoTransaccionLista value) {
        return new JAXBElement<TipoTransaccionLista>(_TipoTransaccionLista_QNAME, TipoTransaccionLista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoTransaccionListaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "tipoTransaccionListaResponse")
    public JAXBElement<TipoTransaccionListaResponse> createTipoTransaccionListaResponse(TipoTransaccionListaResponse value) {
        return new JAXBElement<TipoTransaccionListaResponse>(_TipoTransaccionListaResponse_QNAME, TipoTransaccionListaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionReporte1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "transaccionReporte1")
    public JAXBElement<TransaccionReporte1> createTransaccionReporte1(TransaccionReporte1 value) {
        return new JAXBElement<TransaccionReporte1>(_TransaccionReporte1_QNAME, TransaccionReporte1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionReporte1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pkg_servicio/", name = "transaccionReporte1Response")
    public JAXBElement<TransaccionReporte1Response> createTransaccionReporte1Response(TransaccionReporte1Response value) {
        return new JAXBElement<TransaccionReporte1Response>(_TransaccionReporte1Response_QNAME, TransaccionReporte1Response.class, null, value);
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
