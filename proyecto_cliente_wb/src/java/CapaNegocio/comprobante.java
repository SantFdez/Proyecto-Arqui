package CapaNegocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.math.BigDecimal;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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
import pkg_servicio.Servidor;
import pkg_servicio.Servidor_Service;


/**
 *
 * @author SONY
 */
@ManagedBean()
@SessionScoped

public class comprobante {

    //CABECERA
    private String codigoCabecera = "";
    private String fechaCabecera = "";
    //private String cuentaBancaria = "";
    private String descripcion = "";
    
    //private List<factureporte1> reporte1;
    private String fechaA;
    private String fechaB;

    private String mensajeCabecera = "";
    
    private Servidor_Service service = new Servidor_Service();
    private Servidor port = service.getServidorPort();
    
    //DETALLES
    
    private List<detcomprobante> listaDetalles = new ArrayList<>();
    private String codigoDetalle;
    private String tipoCuenta;
    private String debe;
    private String haber;
    private String debe1;
    private ArrayList<Integer> haberes = new ArrayList<>();
    
    private String mensajeDetalle = "";
    private int suma=0;
    
    private List<cuentas> reporte1 = new ArrayList<>();
    private List<cuentas> activo = new ArrayList<>();
    private List<cuentas> pasivo = new ArrayList<>();
    private List<cuentas> capital = new ArrayList<>();
    private List<cuentas> ingreso = new ArrayList<>();
    private List<cuentas> egreso = new ArrayList<>();
    
    private int sumaAct=0;
    private int sumaPas=0;
    private int sumaCap=0;
    private int sumaIng=0;
    private int sumaEg=0;
    private int total=0;
    private int utilidad=0;

    public comprobante() {
    }

    public String getCodigoCabecera() {
        return codigoCabecera;
    }

    public void setCodigoCabecera(String codigoCabecera) {
        this.codigoCabecera = codigoCabecera;
    }

    public String getFechaCabecera() {
        return fechaCabecera;
    }

    public void setFechaCabecera(String fechaCabecera) {
        this.fechaCabecera = fechaCabecera;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaA() {
        return fechaA;
    }

    public void setFechaA(String fechaA) {
        this.fechaA = fechaA;
    }

    public List<cuentas> getReporte1() {
        return reporte1;
    }

    public void setReporte1(List<cuentas> reporte1) {
        this.reporte1 = reporte1;
    }

    
    public String getFechaB() {
        return fechaB;
    }

    public void setFechaB(String fechaB) {
        this.fechaB = fechaB;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    
    public String getMensajeCabecera() {
        return mensajeCabecera;
    }

    public int getSumaIng() {
        return sumaIng;
    }

    public void setSumaIng(int sumaIng) {
        this.sumaIng = sumaIng;
    }

    public int getSumaEg() {
        return sumaEg;
    }

    public void setSumaEg(int sumaEg) {
        this.sumaEg = sumaEg;
    }
    

    public void setMensajeCabecera(String mensajeCabecera) {
        this.mensajeCabecera = mensajeCabecera;
    }

    public List<detcomprobante> getListaDetalles() {
        return listaDetalles;
    }

    public void setListaDetalles(List<detcomprobante> listaDetalles) {
        this.listaDetalles = listaDetalles;
    }

    public String getCodigoDetalle() {
        return codigoDetalle;
    }

    public void setCodigoDetalle(String codigoDetalle) {
        this.codigoDetalle = codigoDetalle;
    }

    public int getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(int utilidad) {
        this.utilidad = utilidad;
    }

    
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public List<cuentas> getIngreso() {
        return ingreso;
    }

    public void setIngreso(List<cuentas> ingreso) {
        this.ingreso = ingreso;
    }

    public List<cuentas> getEgreso() {
        return egreso;
    }

    public void setEgreso(List<cuentas> egreso) {
        this.egreso = egreso;
    }

    
    public String getDebe() {
        return debe;
    }

    public void setDebe(String debe) {
        this.debe = debe;
    }

    public String getHaber() {
        return haber;
    }

    public List<cuentas> getActivo() {
        return activo;
    }

    public int getSumaAct() {
        return sumaAct;
    }

    public void setSumaAct(int sumaAct) {
        this.sumaAct = sumaAct;
    }

    public int getSumaPas() {
        return sumaPas;
    }

    public void setSumaPas(int sumaPas) {
        this.sumaPas = sumaPas;
    }

    public int getSumaCap() {
        return sumaCap;
    }

    public void setSumaCap(int sumaCap) {
        this.sumaCap = sumaCap;
    }
    

    public void setActivo(List<cuentas> activo) {
        this.activo = activo;
    }

    public List<cuentas> getPasivo() {
        return pasivo;
    }

    public void setPasivo(List<cuentas> pasivo) {
        this.pasivo = pasivo;
    }

    public List<cuentas> getCapital() {
        return capital;
    }

    public void setCapital(List<cuentas> capital) {
        this.capital = capital;
    }

    
    public void setHaber(String haber) {
        this.haber = haber;
    }

    public String getMensajeDetalle() {
        return mensajeDetalle;
    }

    public void setMensajeDetalle(String mensajeDetalle) {
        this.mensajeDetalle = mensajeDetalle;
    }

    public String getDebe1() {
        return debe1;
    }

    public void setDebe1(String debe1) {
        this.debe1 = debe1;
    }

    
    

    
    /*public List<factureporte1> getReporte1() {
        return reporte1;
    }

    public void setReporte1(List<factureporte1> reporte1) {
        this.reporte1 = reporte1;
    }
*/
    
    public void validar(){
        String debe1;
        if(!"0".equals(debe)){
            debe1=debe;
        }
    }

    public void insertar() {
        String resp;
        resp = port.insertarComprobante(this.fechaCabecera, this.descripcion);

            String[] arr=resp.split(",");
            mensajeCabecera=arr[0];

            if (mensajeCabecera.equals("No se pudo insertar")) {
                codigoCabecera = "";
            } else {
                codigoCabecera = arr[1];
            }
        
    }

    
    public void eliminar() {
       mensajeCabecera= port.eliminarComprobante(codigoCabecera);

        
        if (mensajeCabecera.equals("Se eliminó satisfactoriamente")) {
            codigoCabecera = "";
            fechaCabecera = "";
            descripcion = "";
        }

    }

    public void modificar() {
     
        mensajeCabecera = port.modificarComprobante(descripcion, fechaCabecera, codigoCabecera);

        if(mensajeCabecera.equals("Se actualizó satisfactoriamente")){
            
        }


    }

    public void buscar() {
        listaDetalles=new ArrayList<detcomprobante>();
        
        ArrayList<String> resp=(ArrayList<String>) port.buscarComprobante(codigoCabecera);
        if(resp.get(2).equals("Comprobante encontrado")){
            //uentaBancaria=resp.get(0);
            fechaCabecera=resp.get(0);
            descripcion=resp.get(1);
            mensajeCabecera=resp.get(2);
            
            for(int i=3;i<resp.size();i++){
                String[] datos=resp.get(i).split(",");
                
                
                detcomprobante obj=new detcomprobante(datos[0],datos[1],datos[2],datos[3]);
                listaDetalles.add(obj);
            }
            
        }
        
        
        

    }

    public void reportar1() {
        tiposBalance();
    }
    
    /*public  Map<String, Object> cuentas(){
        Map<String,Object> lista=new LinkedHashMap<>();
        ArrayList<String> l1= (ArrayList<String>)port.cuentasBancariasLista();
                
        for (int i = 0; i < l1.size(); i++) {
            String[] datos=l1.get(i).split(",");
            lista.put(datos[1], datos[0]);
        }
        //Map<String,Object> listaCuentas=port.
        return lista;
    }*/
    
    public  Map<String, Object> tiposCuentas(){
        Map<String,Object> lista=new LinkedHashMap<>();
        ArrayList<String> l1= (ArrayList<String>)port.cuentaLista();
                
        for (int i = 0; i < l1.size(); i++) {
            String[] datos=l1.get(i).split(",");
            lista.put(datos[1], datos[0]);
        }
        //Map<String,Object> listaCuentas=port.
        return lista;
    }
    
     public void tiposBalance(){
         reporte1=new ArrayList<>();
         activo.clear();
         pasivo.clear();
         capital.clear();
         ingreso.clear();
         egreso.clear();
         sumaAct=0; sumaPas=0; sumaCap=0; sumaIng=0; sumaEg=0; utilidad=0;
        ArrayList<String> l1= (ArrayList<String>)port.balanceLista();
                
        for (int i = 0; i < l1.size(); i++) {
            String[] datos=l1.get(i).split(",");
            reporte1.add(new cuentas(datos[0],datos[1],datos[2],datos[3]));
        }
        //Map<String,Object> listaCuentas=port.
        separar();
    }
     
     public void separar(){
         for(int i=0; i<reporte1.size(); i++){
             if(reporte1.get(i).getNcuenta().equals("ACTIVO")){
                 activo.add(reporte1.get(i));
             }
             else{
                 if(reporte1.get(i).getNcuenta().equals("PASIVO"))
                     pasivo.add(reporte1.get(i));
                 else
                 {
                     if(reporte1.get(i).getNcuenta().equals("CAPITAL"))
                     capital.add(reporte1.get(i));
                     else{
                        if(reporte1.get(i).getNcuenta().equals("INGRESO"))
                            ingreso.add(reporte1.get(i));
                        else{
                            if(reporte1.get(i).getNcuenta().equals("EGRESO"))
                                egreso.add(reporte1.get(i));
                        }
                     }
                 }
             }
         }
         sumar();
     }
     
    public void sumar(){
        for(int i=0; i<activo.size();i++){
            sumaAct=sumaAct+Integer.parseInt(activo.get(i).getDebe());
        }
       
        activo.add(new cuentas("TOTAL",String.valueOf(sumaAct),"",""));
        
        for(int i=0; i<pasivo.size();i++){
            sumaPas=sumaPas+Integer.parseInt(pasivo.get(i).getHaber());
        }
       
        pasivo.add(new cuentas("TOTAL","","",String.valueOf(sumaPas)));
        
        if(!capital.isEmpty()){
            for(int i=0; i<capital.size();i++){
            sumaCap=sumaCap+Integer.parseInt(capital.get(i).getHaber());
            }
       
            capital.add(new cuentas("TOTAL","","",String.valueOf(sumaCap)));
        }
        else{
            sumaCap=sumaAct-sumaPas;
            capital.add(new cuentas("TOTAL","","",String.valueOf(sumaCap)));
        }
        total=sumaPas+sumaCap;
        
        for(int i=0; i<ingreso.size();i++){
            sumaIng=sumaIng+Integer.parseInt(ingreso.get(i).getHaber());
        }
       
        ingreso.add(new cuentas("TOTAL","","",String.valueOf(sumaIng)));
        
        for(int i=0; i<egreso.size();i++){
            sumaEg=sumaEg+Integer.parseInt(egreso.get(i).getDebe());
        }
       
        egreso.add(new cuentas("TOTAL",String.valueOf(sumaEg),"",""));
        utilidad=sumaIng-sumaEg;
    }
    
    public void insertarDetalle(){
        if(!"0".equals(debe)){
            haberes.removeAll(haberes);
            debe1=debe;
            mensajeDetalle =port.insertarDetalleComprobante(codigoCabecera,tipoCuenta, debe, haber);
            buscar();
            suma=0;
        }
         else{   
            if(Integer.parseInt(haber)<=(Integer.parseInt(debe1)-suma)){
                    suma=suma+Integer.parseInt(haber);
                mensajeDetalle =port.insertarDetalleComprobante(codigoCabecera,tipoCuenta, debe, haber);
                buscar();
            }
            else{
                mensajeDetalle="No puede ingresar asientos descuadrados";
            }
        }
    }
    
    
    public void modificarDetalle(){
        mensajeDetalle =port.modificarDetalleComprobante(codigoDetalle, tipoCuenta, debe, haber);
        buscar();
    }
    
    public void eliminarDetalle(){
        mensajeDetalle =port.eliminarDetalleComprobante(codigoDetalle);
        buscar();
    }
    
    

}
