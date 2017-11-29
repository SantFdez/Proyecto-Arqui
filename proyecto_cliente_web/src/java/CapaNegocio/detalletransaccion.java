package CapaNegocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.math.BigDecimal;
import java.math.BigInteger;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedProperty;
import pkg_interface.cls_interface;

/**
 *
 * @author SONY
 */
@ManagedBean()
@SessionScoped

public class detalletransaccion {

    private List<articulo> listaDetalles = new ArrayList<articulo>();
    private String codigo;
    private String articulo;
    private String cantidad;
    private String precio;
    private String fechaA;
    private String fechaB;
    private List<factureporte2> listaReporte2 = new ArrayList<factureporte2>();
    private LinkedHashMap<String, LinkedHashMap<String, Float>> mapita = new LinkedHashMap<>();
    private ArrayList<String> cliList = new ArrayList<>();

    public String mensaje = "";
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("final3_factura-warPU");
    EntityManager em1 = factory.createEntityManager();

    @ManagedProperty("#{factura}")
    private transaccion fac;

    public String getFechaA() {
        return fechaA;
    }

    public void setFechaA(String fechaA) {
        this.fechaA = fechaA;
    }

    public String getFechaB() {
        return fechaB;
    }

    public LinkedHashMap<String, LinkedHashMap<String, Float>> getMapita() {
        return mapita;
    }

    public ArrayList<String> getCliList() {
        return cliList;
    }

    public void setCliList(ArrayList<String> cliList) {
        this.cliList = cliList;
    }

    public void setMapita(LinkedHashMap<String, LinkedHashMap<String, Float>> mapita) {
        this.mapita = mapita;
    }

    public void setFechaB(String fechaB) {
        this.fechaB = fechaB;
    }

    public transaccion getFac() {
        return fac;
    }

    public void setFac(transaccion fac) {
        this.fac = fac;
    }

    public detalletransaccion() {
    }

    public List<articulo> getListaDetalles() {
        return listaDetalles;
    }

    public void setListaDetalles(List<articulo> listaDetalles) {
        this.listaDetalles = listaDetalles;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void mostrarLista() {
        ArrayList<String> respuesta;
        listaDetalles = new ArrayList<>();

        try {
            //System.out.println("LLAMANDO RMI CIUDADES LISTA");
            Registry registro = LocateRegistry.getRegistry("127.0.0.1", 1099);
            cls_interface interface1 = (cls_interface) registro.lookup("rmi://localhost:1099/RMI_interface");
            respuesta = interface1.buscarFactura(fac.getCodigo());

            fac.setFecha(respuesta.get(0));
            fac.setValTotal(Float.valueOf(respuesta.get(1)));
            fac.setCiudadentrega(respuesta.get(2));
            fac.setRuc(respuesta.get(3));
            fac.setMensaje(respuesta.get(4));

            for (int i = 5; i < respuesta.size(); i++) {
                String[] vals = respuesta.get(i).split(",");
                articulo art = new articulo(vals[0], vals[1], vals[2], vals[3]);
                listaDetalles.add(art);
            }

        } catch (RemoteException | NotBoundException ex) {
            System.out.println("error");
        }

    }

    public void eliminarDetalle() {
        String respuesta;
        try {
            //System.out.println("LLAMANDO RMI CIUDADES LISTA");
            Registry registro = LocateRegistry.getRegistry("127.0.0.1", 1099);
            cls_interface interface1 = (cls_interface) registro.lookup("rmi://localhost:1099/RMI_interface");
            respuesta = interface1.eliminarDetalle(codigo, fac.getCodigo());

            mensaje = respuesta;

            mostrarLista();
            articulo = "";
            cantidad = "";
            precio = "";
            codigo = "";

        } catch (RemoteException | NotBoundException ex) {
            System.out.println("error ");
            System.out.println(ex.getMessage());
        }
       
    }

    public void modificarDetalle() {
        String respuesta;
        try {
            //System.out.println("LLAMANDO RMI CIUDADES LISTA");
            Registry registro = LocateRegistry.getRegistry("127.0.0.1", 1099);
            cls_interface interface1 = (cls_interface) registro.lookup("rmi://localhost:1099/RMI_interface");
            respuesta = interface1.modificarDetalle(cantidad, precio, articulo, codigo, fac.getCodigo());

            mensaje = respuesta;

            mostrarLista();

        } catch (RemoteException | NotBoundException ex) {
            System.out.println("error ");
            System.out.println(ex.getMessage());
        }

    }

    public void insertarDetalle() {

        String respuesta;
        try {
            //System.out.println("LLAMANDO RMI CIUDADES LISTA");
            Registry registro = LocateRegistry.getRegistry("127.0.0.1", 1099);
            cls_interface interface1 = (cls_interface) registro.lookup("rmi://localhost:1099/RMI_interface");
            respuesta = interface1.insertarDetalle(articulo, cantidad, precio, fac.getCodigo());

            mensaje = respuesta;

            mostrarLista();

        } catch (RemoteException | NotBoundException ex) {
            System.out.println("error de insertar detalle");
            System.out.println(ex.getMessage());
        }

    }

    public void reportar2() {
        report2();
    }

    public void report2() {

        List<Object[]> c1 = null;
        cliList = new ArrayList<>();
        cliente nCli = new cliente();
        Map<String, Object> listaCliente = nCli.clientes();

        for (Map.Entry<String, Object> entry : listaCliente.entrySet()) {
            String key = entry.getKey();

            cliList.add(key);

        }

        try {
            c1 = em1.createNativeQuery("SELECT DF.DF_ARTICULO, DF.DF_TOTAL,CF.CL_RUC FROM DETALLEFACTURA \"DF\" LEFT JOIN CABECERAFACTURA \"CF\" ON CF.CF_NUMERO=DF.CF_NUMERO "
                    + "WHERE CF.CF_FECHA >= to_date('" + fechaA + "','yyyy/mm/dd') \n"
                    + "AND CF.CF_FECHA <= to_date('" + fechaB + "','yyyy/mm/dd') "
                    + "ORDER BY CL_RUC ")
                    .getResultList();

            for (Object[] a : c1) {
                LinkedHashMap<String, Float> subMap = new LinkedHashMap<>();
                for (int i = 0; i < cliList.size(); i++) {
                    subMap.put(cliList.get(i), 0f);
                }
                subMap.put(a[2].toString(), Float.valueOf(a[1].toString()));
                mapita.put(a[0].toString(), subMap);

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
