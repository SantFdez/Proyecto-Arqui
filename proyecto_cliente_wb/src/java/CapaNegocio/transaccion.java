package CapaNegocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
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
import pkg_servicio.Servidor;
import pkg_servicio.Servidor_Service;


/**
 *
 * @author SONY
 */
@ManagedBean()
@SessionScoped

public class transaccion {

    //CABECERA
    private String codigoCabecera = "";
    private String fechaCabecera = "";
    private String cuentaBancaria = "";
    private String descripcion = "";
   

    private String mensajeCabecera = "";
    
    private Servidor_Service service = new Servidor_Service();
    private Servidor port = service.getServidorPort();
    
    //DETALLES
    
    private List<dettransac> listaDetalles = new ArrayList<>();
    private String codigoDetalle;
    private String tipoTransac;
    private String fechaDetalle;
    private String valorDetalle;
    
    private String mensajeDetalle = "";

    //REPORTE
    private ArrayList<String> cuentaList;
    private ArrayList<String> transacList;
    private LinkedHashMap<String, LinkedHashMap<String,Float>> reporte2;
    private List<transacReporte1> reporte1;
    private String fechaA;
    private String fechaB;
    
    public transaccion() {
    }

    public ArrayList<String> getTransacList() {
        return transacList;
    }

    public void setTransacList(ArrayList<String> transacList) {
        this.transacList = transacList;
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

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
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

    public ArrayList<String> getCuentaList() {
        return cuentaList;
    }

    public void setCuentaList(ArrayList<String> cuentaList) {
        this.cuentaList = cuentaList;
    }

    
    public void setFechaA(String fechaA) {
        this.fechaA = fechaA;
    }

    public String getFechaB() {
        return fechaB;
    }

    public void setFechaB(String fechaB) {
        this.fechaB = fechaB;
    }

    public String getMensajeCabecera() {
        return mensajeCabecera;
    }

    public void setMensajeCabecera(String mensajeCabecera) {
        this.mensajeCabecera = mensajeCabecera;
    }

    public List<dettransac> getListaDetalles() {
        return listaDetalles;
    }

    public void setListaDetalles(List<dettransac> listaDetalles) {
        this.listaDetalles = listaDetalles;
    }

    public String getCodigoDetalle() {
        return codigoDetalle;
    }

    public void setCodigoDetalle(String codigoDetalle) {
        this.codigoDetalle = codigoDetalle;
    }

    public String getTipoTransac() {
        return tipoTransac;
    }

    public void setTipoTransac(String tipoTransac) {
        this.tipoTransac = tipoTransac;
    }

    public String getFechaDetalle() {
        return fechaDetalle;
    }

    public void setFechaDetalle(String fechaDetalle) {
        this.fechaDetalle = fechaDetalle;
    }

    public String getValorDetalle() {
        return valorDetalle;
    }

    public void setValorDetalle(String valorDetalle) {
        this.valorDetalle = valorDetalle;
    }

    public String getMensajeDetalle() {
        return mensajeDetalle;
    }

    public void setMensajeDetalle(String mensajeDetalle) {
        this.mensajeDetalle = mensajeDetalle;
    }

    public List<transacReporte1> getReporte1() {
        return reporte1;
    }

    public void setReporte1(List<transacReporte1> reporte1) {
        this.reporte1 = reporte1;
    }

    public LinkedHashMap<String, LinkedHashMap<String, Float>> getReporte2() {
        return reporte2;
    }

    public void setReporte2(LinkedHashMap<String, LinkedHashMap<String, Float>> reporte2) {
        this.reporte2 = reporte2;
    }

    
    
    
    
    

    
    /*public List<factureporte1> getReporte1() {
        return reporte1;
    }

    public void setReporte1(List<factureporte1> reporte1) {
        this.reporte1 = reporte1;
    }
*/
    

    public void insertar() {
        String resp;

        resp = port.insertarTransaccion(this.fechaCabecera, this.cuentaBancaria, this.descripcion);

        String[] arr=resp.split(",");
        mensajeCabecera=arr[0];
        
        if (mensajeCabecera.equals("No se pudo insertar")) {
            codigoCabecera = "";
        } else {
            codigoCabecera = arr[1];
        }

    }

    
    public void eliminar() {
       mensajeCabecera= port.eliminarTransaccion(codigoCabecera);

        
        if (mensajeCabecera.equals("Se eliminó satisfactoriamente")) {
            cuentaBancaria = "";
            codigoCabecera = "";
            fechaCabecera = "";
            descripcion = "";
        }

    }

    public void modificar() {
     
        mensajeCabecera = port.modificarTransaccion(cuentaBancaria, descripcion, fechaCabecera, codigoCabecera);

        if(mensajeCabecera.equals("Se actualizó satisfactoriamente")){
            
        }


    }

    public void buscar() {
        listaDetalles=new ArrayList<>();
        
        ArrayList<String> resp=(ArrayList<String>) port.buscarTransaccion(codigoCabecera);
        if(resp.get(3).equals("Factura encontrada")){
            cuentaBancaria=resp.get(0);
            fechaCabecera=resp.get(1);
            descripcion=resp.get(2);
            mensajeCabecera=resp.get(3);
            
            for(int i=4;i<resp.size();i++){
                String[] datos=resp.get(i).split(",");
                dettransac obj=new dettransac(datos[0],datos[1],datos[2],datos[3]);
                listaDetalles.add(obj);
            }
            
        }
        
        
        

    }

    public void reportar1() {
        reporte1 = new ArrayList<>();
        HashMap<String,Float> mapita=new HashMap<>();
        List<String> c1 = port.transaccionReporte1(fechaA, fechaB);
        for(int i=0;i<c1.size();i++){
            String[] datos=c1.get(i).split(";");
            Float val=Float.valueOf(datos[1]);
            if(datos[2].equals("-")){
                val=val*(-1);
            }
            if(mapita.containsKey(datos[0])){
                mapita.put(datos[0], mapita.get(datos[0])+val);
            }
            else{
                mapita.put(datos[0],val);
            }
            
        }

        for (Map.Entry<String, Float> entry : mapita.entrySet()) {
            String key = entry.getKey();
            Float value = entry.getValue();
            reporte1.add(new transacReporte1(key,value.toString()));
        }

    }
    
    
    
    public void reportar2(){
        List<Object[]> c1 = null;
        reporte2=new LinkedHashMap<>();
        cuentaList = listaCuentas();
        transacList=(ArrayList<String>)listaTransacciones();
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("proyecto_cliente_wbPU");
        EntityManager em1 = factory.createEntityManager();

        try {
            c1 = em1.createNativeQuery("SELECT CUENTA_BANC.CUB_ID,CAB_TRANSAC.CAT_ID, DET_TRANSAC.DET_VAL,TIPO_TRANSAC.TTR_SIGNO, DET_TRANSAC.DET_FECHA \n"
                    + " FROM DET_TRANSAC,TIPO_TRANSAC , CAB_TRANSAC, CUENTA_BANC\n"
                    + " WHERE DET_TRANSAC.DET_FECHA >= to_date('"+fechaA+"','yyyy/mm/dd') \n"
                    + " AND DET_TRANSAC.DET_FECHA <= to_date('"+fechaB+"','yyyy/mm/dd') \n"
                    + " AND TIPO_TRANSAC.TTR_ID=DET_TRANSAC.TTR_ID\n"
                    + " AND DET_TRANSAC.CAT_ID=CAB_TRANSAC.CAT_ID\n"
                    + " AND CAB_TRANSAC.CUB_ID=CUENTA_BANC.CUB_ID ORDER BY CUENTA_BANC.CUB_ID")
                    .getResultList();

            LinkedHashMap<String, Float> mapaTotalTransaccion = new LinkedHashMap<>();
            for (Object[] a : c1) {

                Float val = Float.valueOf(a[2].toString());
                if (a[3].equals("-")) {
                    val = val * (-1);
                }
                if (mapaTotalTransaccion.containsKey(a[1].toString())) {
                    mapaTotalTransaccion.put(a[1].toString(), mapaTotalTransaccion.get(a[1].toString()) + val);
                } else {
                    mapaTotalTransaccion.put(a[1].toString(), val);
                }

            }

            c1 = em1.createNativeQuery("select cat_id,cub_id from cab_transac order by cat_id")
                    .getResultList();
            for (String a : cuentaList) {
                LinkedHashMap<String, Float> subMap = new LinkedHashMap<>();
                for (int i = 0; i < transacList.size(); i++) {

                    if (c1.get(i)[1].toString().equals(a)) {
                        subMap.put(transacList.get(i), mapaTotalTransaccion.get(transacList.get(i)));
                    } else {
                        subMap.put(transacList.get(i), 0.0f);
                    }
                }
                reporte2.put(a, subMap);
            }

    }
    catch (Exception ex) {
            ex.printStackTrace();
        }
    
    }
    
    private List<String> listaTransacciones() {
        String sql = "select * from CAB_TRANSAC";
        ArrayList<String> array=new ArrayList<>();
         EntityManagerFactory factory = Persistence.createEntityManagerFactory("proyecto_cliente_wbPU");
        EntityManager em1 = factory.createEntityManager();
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            for (int i = 0; i < l1.size(); i++) {
            Object[] ar_objeto = (Object[]) (l1.get(i));
            array.add(ar_objeto[0].toString());
            }
            
            return array;
        } else {
            return null;
        }

    }
    
    public void integrar(){
        mensajeDetalle=port.integracion(codigoCabecera, fechaCabecera);
    }
    
    private ArrayList<String> listaCuentas() {
          EntityManagerFactory factory = Persistence.createEntityManagerFactory("proyecto_cliente_wbPU");
        EntityManager em1 = factory.createEntityManager();
        String sql = "select cub_id,cub_cliente from CUENTA_BANC order by cub_id";
        ArrayList<String> array=new ArrayList<>();
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            for (int i = 0; i < l1.size(); i++) {
            Object[] ar_objeto = (Object[]) (l1.get(i));
            array.add(ar_objeto[0].toString());
            }
            
            return array;
        } else {
            return null;
        }

    }
    
    public  Map<String, Object> cuentas(){
        Map<String,Object> lista=new LinkedHashMap<>();
        ArrayList<String> l1= (ArrayList<String>)port.cuentasBancariasLista();
                
        for (int i = 0; i < l1.size(); i++) {
            String[] datos=l1.get(i).split(",");
            lista.put(datos[1], datos[0]);
        }
        //Map<String,Object> listaCuentas=port.
        return lista;
    }
    
    public  Map<String, Object> tiposTransacciones(){
        Map<String,Object> lista=new LinkedHashMap<>();
        ArrayList<String> l1= (ArrayList<String>)port.tipoTransaccionLista();
                
        for (int i = 0; i < l1.size(); i++) {
            String[] datos=l1.get(i).split(",");
            lista.put(datos[1], datos[0]);
        }
        //Map<String,Object> listaCuentas=port.
        return lista;
    }
    
    public void insertarDetalle(){
        mensajeDetalle =port.insertarDetalleTransaccion(fechaDetalle, tipoTransac, valorDetalle, codigoCabecera);
        buscar();
        
    }
    
    public void modificarDetalle(){
        mensajeDetalle =port.modificarDetalleTransaccion(fechaDetalle, tipoTransac, valorDetalle, codigoDetalle);
        buscar();
    }
    
    public void eliminarDetalle(){
        mensajeDetalle =port.eliminarDetalleTransaccion(codigoDetalle);
        buscar();
    }
    
    



}
