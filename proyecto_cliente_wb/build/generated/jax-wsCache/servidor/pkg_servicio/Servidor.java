
package pkg_servicio;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "servidor", targetNamespace = "http://pkg_servicio/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Servidor {


    /**
     * 
     * @param par1
     * @param par2
     * @param id
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarTipoTransac", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarTipoTransac")
    @ResponseWrapper(localName = "modificarTipoTransacResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarTipoTransacResponse")
    @Action(input = "http://pkg_servicio/servidor/modificarTipoTransacRequest", output = "http://pkg_servicio/servidor/modificarTipoTransacResponse")
    public int modificarTipoTransac(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "par1", targetNamespace = "")
        String par1,
        @WebParam(name = "par2", targetNamespace = "")
        String par2);

    /**
     * 
     * @param par1
     * @param par2
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarTipoTransac", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarTipoTransac")
    @ResponseWrapper(localName = "insertarTipoTransacResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarTipoTransacResponse")
    @Action(input = "http://pkg_servicio/servidor/insertarTipoTransacRequest", output = "http://pkg_servicio/servidor/insertarTipoTransacResponse")
    public int insertarTipoTransac(
        @WebParam(name = "par1", targetNamespace = "")
        String par1,
        @WebParam(name = "par2", targetNamespace = "")
        String par2);

    /**
     * 
     * @param asCodigo
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarTipoTransac", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarTipoTransac")
    @ResponseWrapper(localName = "eliminarTipoTransacResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarTipoTransacResponse")
    @Action(input = "http://pkg_servicio/servidor/eliminarTipoTransacRequest", output = "http://pkg_servicio/servidor/eliminarTipoTransacResponse")
    public int eliminarTipoTransac(
        @WebParam(name = "as_codigo", targetNamespace = "")
        String asCodigo);

    /**
     * 
     * @param par1
     * @param par2
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarCuentaBanc", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarCuentaBanc")
    @ResponseWrapper(localName = "insertarCuentaBancResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarCuentaBancResponse")
    @Action(input = "http://pkg_servicio/servidor/insertarCuentaBancRequest", output = "http://pkg_servicio/servidor/insertarCuentaBancResponse")
    public int insertarCuentaBanc(
        @WebParam(name = "par1", targetNamespace = "")
        String par1,
        @WebParam(name = "par2", targetNamespace = "")
        String par2);

    /**
     * 
     * @param asCodigo
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarCuentaBanc", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarCuentaBanc")
    @ResponseWrapper(localName = "eliminarCuentaBancResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarCuentaBancResponse")
    @Action(input = "http://pkg_servicio/servidor/eliminarCuentaBancRequest", output = "http://pkg_servicio/servidor/eliminarCuentaBancResponse")
    public int eliminarCuentaBanc(
        @WebParam(name = "as_codigo", targetNamespace = "")
        String asCodigo);

    /**
     * 
     * @param par1
     * @param par2
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "transaccionReporte1", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.TransaccionReporte1")
    @ResponseWrapper(localName = "transaccionReporte1Response", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.TransaccionReporte1Response")
    @Action(input = "http://pkg_servicio/servidor/transaccionReporte1Request", output = "http://pkg_servicio/servidor/transaccionReporte1Response")
    public List<String> transaccionReporte1(
        @WebParam(name = "par1", targetNamespace = "")
        String par1,
        @WebParam(name = "par2", targetNamespace = "")
        String par2);

    /**
     * 
     * @param par1
     * @param id
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarTipoCuenta", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarTipoCuenta")
    @ResponseWrapper(localName = "modificarTipoCuentaResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarTipoCuentaResponse")
    @Action(input = "http://pkg_servicio/servidor/modificarTipoCuentaRequest", output = "http://pkg_servicio/servidor/modificarTipoCuentaResponse")
    public int modificarTipoCuenta(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "par1", targetNamespace = "")
        String par1);

    /**
     * 
     * @param val
     * @param cabTransac
     * @param fecha
     * @param tipoTransac
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarDetalleTransaccion", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarDetalleTransaccion")
    @ResponseWrapper(localName = "insertarDetalleTransaccionResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarDetalleTransaccionResponse")
    @Action(input = "http://pkg_servicio/servidor/insertarDetalleTransaccionRequest", output = "http://pkg_servicio/servidor/insertarDetalleTransaccionResponse")
    public String insertarDetalleTransaccion(
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "tipoTransac", targetNamespace = "")
        String tipoTransac,
        @WebParam(name = "val", targetNamespace = "")
        String val,
        @WebParam(name = "cabTransac", targetNamespace = "")
        String cabTransac);

    /**
     * 
     * @param asCodigo
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarTipoCuenta", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarTipoCuenta")
    @ResponseWrapper(localName = "eliminarTipoCuentaResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarTipoCuentaResponse")
    @Action(input = "http://pkg_servicio/servidor/eliminarTipoCuentaRequest", output = "http://pkg_servicio/servidor/eliminarTipoCuentaResponse")
    public int eliminarTipoCuenta(
        @WebParam(name = "as_codigo", targetNamespace = "")
        String asCodigo);

    /**
     * 
     * @param codigo
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarTransaccion", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarTransaccion")
    @ResponseWrapper(localName = "buscarTransaccionResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarTransaccionResponse")
    @Action(input = "http://pkg_servicio/servidor/buscarTransaccionRequest", output = "http://pkg_servicio/servidor/buscarTransaccionResponse")
    public List<String> buscarTransaccion(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo);

    /**
     * 
     * @param par1
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarTipoCuenta", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarTipoCuenta")
    @ResponseWrapper(localName = "insertarTipoCuentaResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarTipoCuentaResponse")
    @Action(input = "http://pkg_servicio/servidor/insertarTipoCuentaRequest", output = "http://pkg_servicio/servidor/insertarTipoCuentaResponse")
    public int insertarTipoCuenta(
        @WebParam(name = "par1", targetNamespace = "")
        String par1);

    /**
     * 
     * @param codigoDetalle
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarDetalleTransaccion", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarDetalleTransaccion")
    @ResponseWrapper(localName = "eliminarDetalleTransaccionResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarDetalleTransaccionResponse")
    @Action(input = "http://pkg_servicio/servidor/eliminarDetalleTransaccionRequest", output = "http://pkg_servicio/servidor/eliminarDetalleTransaccionResponse")
    public String eliminarDetalleTransaccion(
        @WebParam(name = "codigoDetalle", targetNamespace = "")
        String codigoDetalle);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cuentasBancariasLista", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.CuentasBancariasLista")
    @ResponseWrapper(localName = "cuentasBancariasListaResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.CuentasBancariasListaResponse")
    @Action(input = "http://pkg_servicio/servidor/cuentasBancariasListaRequest", output = "http://pkg_servicio/servidor/cuentasBancariasListaResponse")
    public List<String> cuentasBancariasLista();

    /**
     * 
     * @param par1
     * @param par2
     * @param id
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarCuentaBanc", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarCuentaBanc")
    @ResponseWrapper(localName = "modificarCuentaBancResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarCuentaBancResponse")
    @Action(input = "http://pkg_servicio/servidor/modificarCuentaBancRequest", output = "http://pkg_servicio/servidor/modificarCuentaBancResponse")
    public int modificarCuentaBanc(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "par1", targetNamespace = "")
        String par1,
        @WebParam(name = "par2", targetNamespace = "")
        String par2);

    /**
     * 
     * @param par1
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarTipoCuenta2", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarTipoCuenta2")
    @ResponseWrapper(localName = "buscarTipoCuenta2Response", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarTipoCuenta2Response")
    @Action(input = "http://pkg_servicio/servidor/buscarTipoCuenta2Request", output = "http://pkg_servicio/servidor/buscarTipoCuenta2Response")
    public String buscarTipoCuenta2(
        @WebParam(name = "par1", targetNamespace = "")
        String par1);

    /**
     * 
     * @param fecha
     * @param tipoTransac
     * @param valor
     * @param codigoDetalle
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarDetalleTransaccion", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarDetalleTransaccion")
    @ResponseWrapper(localName = "modificarDetalleTransaccionResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarDetalleTransaccionResponse")
    @Action(input = "http://pkg_servicio/servidor/modificarDetalleTransaccionRequest", output = "http://pkg_servicio/servidor/modificarDetalleTransaccionResponse")
    public String modificarDetalleTransaccion(
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "tipoTransac", targetNamespace = "")
        String tipoTransac,
        @WebParam(name = "valor", targetNamespace = "")
        String valor,
        @WebParam(name = "codigoDetalle", targetNamespace = "")
        String codigoDetalle);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "tipoTransaccionLista", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.TipoTransaccionLista")
    @ResponseWrapper(localName = "tipoTransaccionListaResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.TipoTransaccionListaResponse")
    @Action(input = "http://pkg_servicio/servidor/tipoTransaccionListaRequest", output = "http://pkg_servicio/servidor/tipoTransaccionListaResponse")
    public List<String> tipoTransaccionLista();

    /**
     * 
     * @param codigo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarTransaccion", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarTransaccion")
    @ResponseWrapper(localName = "eliminarTransaccionResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarTransaccionResponse")
    @Action(input = "http://pkg_servicio/servidor/eliminarTransaccionRequest", output = "http://pkg_servicio/servidor/eliminarTransaccionResponse")
    public String eliminarTransaccion(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo);

    /**
     * 
     * @param descripcion
     * @param fecha
     * @param cuentaBancaria
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarTransaccion", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarTransaccion")
    @ResponseWrapper(localName = "insertarTransaccionResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarTransaccionResponse")
    @Action(input = "http://pkg_servicio/servidor/insertarTransaccionRequest", output = "http://pkg_servicio/servidor/insertarTransaccionResponse")
    public String insertarTransaccion(
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "cuentaBancaria", targetNamespace = "")
        String cuentaBancaria,
        @WebParam(name = "descripcion", targetNamespace = "")
        String descripcion);

    /**
     * 
     * @param fecha
     * @param codigo
     * @param desc
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarComprobante", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarComprobante")
    @ResponseWrapper(localName = "modificarComprobanteResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarComprobanteResponse")
    @Action(input = "http://pkg_servicio/servidor/modificarComprobanteRequest", output = "http://pkg_servicio/servidor/modificarComprobanteResponse")
    public String modificarComprobante(
        @WebParam(name = "desc", targetNamespace = "")
        String desc,
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo);

    /**
     * 
     * @param descripcion
     * @param fecha
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarComprobante", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarComprobante")
    @ResponseWrapper(localName = "insertarComprobanteResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarComprobanteResponse")
    @Action(input = "http://pkg_servicio/servidor/insertarComprobanteRequest", output = "http://pkg_servicio/servidor/insertarComprobanteResponse")
    public String insertarComprobante(
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "descripcion", targetNamespace = "")
        String descripcion);

    /**
     * 
     * @param haber
     * @param cuenta
     * @param cabComprob
     * @param debe
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarDetalleComprobante", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarDetalleComprobante")
    @ResponseWrapper(localName = "insertarDetalleComprobanteResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarDetalleComprobanteResponse")
    @Action(input = "http://pkg_servicio/servidor/insertarDetalleComprobanteRequest", output = "http://pkg_servicio/servidor/insertarDetalleComprobanteResponse")
    public String insertarDetalleComprobante(
        @WebParam(name = "cabComprob", targetNamespace = "")
        String cabComprob,
        @WebParam(name = "cuenta", targetNamespace = "")
        String cuenta,
        @WebParam(name = "debe", targetNamespace = "")
        String debe,
        @WebParam(name = "haber", targetNamespace = "")
        String haber);

    /**
     * 
     * @param haber
     * @param cuenta
     * @param codigoDetalle
     * @param debe
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarDetalleComprobante", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarDetalleComprobante")
    @ResponseWrapper(localName = "modificarDetalleComprobanteResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarDetalleComprobanteResponse")
    @Action(input = "http://pkg_servicio/servidor/modificarDetalleComprobanteRequest", output = "http://pkg_servicio/servidor/modificarDetalleComprobanteResponse")
    public String modificarDetalleComprobante(
        @WebParam(name = "codigoDetalle", targetNamespace = "")
        String codigoDetalle,
        @WebParam(name = "cuenta", targetNamespace = "")
        String cuenta,
        @WebParam(name = "debe", targetNamespace = "")
        String debe,
        @WebParam(name = "haber", targetNamespace = "")
        String haber);

    /**
     * 
     * @param codigo
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarComprobante", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarComprobante")
    @ResponseWrapper(localName = "buscarComprobanteResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarComprobanteResponse")
    @Action(input = "http://pkg_servicio/servidor/buscarComprobanteRequest", output = "http://pkg_servicio/servidor/buscarComprobanteResponse")
    public List<String> buscarComprobante(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo);

    /**
     * 
     * @param codigoDetalle
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarDetalleComprobante", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarDetalleComprobante")
    @ResponseWrapper(localName = "eliminarDetalleComprobanteResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarDetalleComprobanteResponse")
    @Action(input = "http://pkg_servicio/servidor/eliminarDetalleComprobanteRequest", output = "http://pkg_servicio/servidor/eliminarDetalleComprobanteResponse")
    public String eliminarDetalleComprobante(
        @WebParam(name = "codigoDetalle", targetNamespace = "")
        String codigoDetalle);

    /**
     * 
     * @param codigo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarComprobante", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarComprobante")
    @ResponseWrapper(localName = "eliminarComprobanteResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarComprobanteResponse")
    @Action(input = "http://pkg_servicio/servidor/eliminarComprobanteRequest", output = "http://pkg_servicio/servidor/eliminarComprobanteResponse")
    public String eliminarComprobante(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo);

    /**
     * 
     * @param par1
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarUsuario", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarUsuario")
    @ResponseWrapper(localName = "eliminarUsuarioResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarUsuarioResponse")
    @Action(input = "http://pkg_servicio/servidor/eliminarUsuarioRequest", output = "http://pkg_servicio/servidor/eliminarUsuarioResponse")
    public int eliminarUsuario(
        @WebParam(name = "par1", targetNamespace = "")
        String par1);

    /**
     * 
     * @param par1
     * @param par2
     * @param id
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarUsuario", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarUsuario")
    @ResponseWrapper(localName = "insertarUsuarioResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarUsuarioResponse")
    @Action(input = "http://pkg_servicio/servidor/insertarUsuarioRequest", output = "http://pkg_servicio/servidor/insertarUsuarioResponse")
    public int insertarUsuario(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "par1", targetNamespace = "")
        String par1,
        @WebParam(name = "par2", targetNamespace = "")
        String par2);

    /**
     * 
     * @param par1
     * @param par2
     * @param id
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarUsuario", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarUsuario")
    @ResponseWrapper(localName = "modificarUsuarioResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarUsuarioResponse")
    @Action(input = "http://pkg_servicio/servidor/modificarUsuarioRequest", output = "http://pkg_servicio/servidor/modificarUsuarioResponse")
    public int modificarUsuario(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "par1", targetNamespace = "")
        String par1,
        @WebParam(name = "par2", targetNamespace = "")
        String par2);

    /**
     * 
     * @param par2
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarUsuario", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarUsuario")
    @ResponseWrapper(localName = "buscarUsuarioResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarUsuarioResponse")
    @Action(input = "http://pkg_servicio/servidor/buscarUsuarioRequest", output = "http://pkg_servicio/servidor/buscarUsuarioResponse")
    public String buscarUsuario(
        @WebParam(name = "par2", targetNamespace = "")
        String par2);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(operationName = "CuentaLista")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CuentaLista", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.CuentaLista")
    @ResponseWrapper(localName = "CuentaListaResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.CuentaListaResponse")
    @Action(input = "http://pkg_servicio/servidor/CuentaListaRequest", output = "http://pkg_servicio/servidor/CuentaListaResponse")
    public List<String> cuentaLista();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "balanceLista", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BalanceLista")
    @ResponseWrapper(localName = "balanceListaResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BalanceListaResponse")
    @Action(input = "http://pkg_servicio/servidor/balanceListaRequest", output = "http://pkg_servicio/servidor/balanceListaResponse")
    public List<String> balanceLista();

    /**
     * 
     * @param par1
     * @param par2
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "integracion", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.Integracion")
    @ResponseWrapper(localName = "integracionResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.IntegracionResponse")
    @Action(input = "http://pkg_servicio/servidor/integracionRequest", output = "http://pkg_servicio/servidor/integracionResponse")
    public String integracion(
        @WebParam(name = "par1", targetNamespace = "")
        String par1,
        @WebParam(name = "par2", targetNamespace = "")
        String par2);

    /**
     * 
     * @param par1
     * @param par2
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarCuenta", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarCuenta")
    @ResponseWrapper(localName = "insertarCuentaResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.InsertarCuentaResponse")
    @Action(input = "http://pkg_servicio/servidor/insertarCuentaRequest", output = "http://pkg_servicio/servidor/insertarCuentaResponse")
    public int insertarCuenta(
        @WebParam(name = "par1", targetNamespace = "")
        String par1,
        @WebParam(name = "par2", targetNamespace = "")
        String par2);

    /**
     * 
     * @param par1
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarCuentaBanc", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarCuentaBanc")
    @ResponseWrapper(localName = "buscarCuentaBancResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarCuentaBancResponse")
    @Action(input = "http://pkg_servicio/servidor/buscarCuentaBancRequest", output = "http://pkg_servicio/servidor/buscarCuentaBancResponse")
    public String buscarCuentaBanc(
        @WebParam(name = "par1", targetNamespace = "")
        String par1);

    /**
     * 
     * @param par1
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarTipoCuenta", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarTipoCuenta")
    @ResponseWrapper(localName = "buscarTipoCuentaResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarTipoCuentaResponse")
    @Action(input = "http://pkg_servicio/servidor/buscarTipoCuentaRequest", output = "http://pkg_servicio/servidor/buscarTipoCuentaResponse")
    public String buscarTipoCuenta(
        @WebParam(name = "par1", targetNamespace = "")
        String par1);

    /**
     * 
     * @param fecha
     * @param cuentaBancaria
     * @param codigo
     * @param desc
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarTransaccion", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarTransaccion")
    @ResponseWrapper(localName = "modificarTransaccionResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarTransaccionResponse")
    @Action(input = "http://pkg_servicio/servidor/modificarTransaccionRequest", output = "http://pkg_servicio/servidor/modificarTransaccionResponse")
    public String modificarTransaccion(
        @WebParam(name = "cuentaBancaria", targetNamespace = "")
        String cuentaBancaria,
        @WebParam(name = "desc", targetNamespace = "")
        String desc,
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo);

    /**
     * 
     * @param asId
     * @param asPass
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validarUsuario", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ValidarUsuario")
    @ResponseWrapper(localName = "validarUsuarioResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ValidarUsuarioResponse")
    @Action(input = "http://pkg_servicio/servidor/validarUsuarioRequest", output = "http://pkg_servicio/servidor/validarUsuarioResponse")
    public String validarUsuario(
        @WebParam(name = "as_id", targetNamespace = "")
        String asId,
        @WebParam(name = "as_pass", targetNamespace = "")
        String asPass);

    /**
     * 
     * @param asCodigo
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarCuenta", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarCuenta")
    @ResponseWrapper(localName = "eliminarCuentaResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.EliminarCuentaResponse")
    @Action(input = "http://pkg_servicio/servidor/eliminarCuentaRequest", output = "http://pkg_servicio/servidor/eliminarCuentaResponse")
    public int eliminarCuenta(
        @WebParam(name = "as_codigo", targetNamespace = "")
        String asCodigo);

    /**
     * 
     * @param par1
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarTipoTransac", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarTipoTransac")
    @ResponseWrapper(localName = "buscarTipoTransacResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarTipoTransacResponse")
    @Action(input = "http://pkg_servicio/servidor/buscarTipoTransacRequest", output = "http://pkg_servicio/servidor/buscarTipoTransacResponse")
    public String buscarTipoTransac(
        @WebParam(name = "par1", targetNamespace = "")
        String par1);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarTodoCuenta", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarTodoCuenta")
    @ResponseWrapper(localName = "buscarTodoCuentaResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarTodoCuentaResponse")
    @Action(input = "http://pkg_servicio/servidor/buscarTodoCuentaRequest", output = "http://pkg_servicio/servidor/buscarTodoCuentaResponse")
    public List<String> buscarTodoCuenta();

    /**
     * 
     * @param par1
     * @param par2
     * @param id
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarCuenta", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarCuenta")
    @ResponseWrapper(localName = "modificarCuentaResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.ModificarCuentaResponse")
    @Action(input = "http://pkg_servicio/servidor/modificarCuentaRequest", output = "http://pkg_servicio/servidor/modificarCuentaResponse")
    public int modificarCuenta(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "par1", targetNamespace = "")
        String par1,
        @WebParam(name = "par2", targetNamespace = "")
        String par2);

    /**
     * 
     * @param par1
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarCuenta", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarCuenta")
    @ResponseWrapper(localName = "buscarCuentaResponse", targetNamespace = "http://pkg_servicio/", className = "pkg_servicio.BuscarCuentaResponse")
    @Action(input = "http://pkg_servicio/servidor/buscarCuentaRequest", output = "http://pkg_servicio/servidor/buscarCuentaResponse")
    public String buscarCuenta(
        @WebParam(name = "par1", targetNamespace = "")
        String par1);

}
