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


/**
 *
 * @author SONY
 */
@ManagedBean()
@SessionScoped

public class transaccion {

    private String codigo = "";
    private String fecha = "";
    private String cuentaBancaria = "";
    private String descripcion = "";
    
    //private List<factureporte1> reporte1;
    

    private String fechaA;
    private String fechaB;

    private String mensaje = "";
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("proyecto_soap_webPU");
    EntityManager em1 = factory.createEntityManager();

    public transaccion() {
    }

    /*public List<factureporte1> getReporte1() {
        return reporte1;
    }

    public void setReporte1(List<factureporte1> reporte1) {
        this.reporte1 = reporte1;
    }
*/
    public String getFechaA() {
        return fechaA;
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

  

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String ciudadentrega) {
        this.cuentaBancaria = ciudadentrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String ruc) {
        this.descripcion = ruc;
    }

    public void insertar() {
        String resp;
        try {
           
            

            mensaje = arr[0];
            if (mensaje.equals("No se pudo insertar")) {
                codigo = "";
            } else {
                codigo = arr[1];
            }

        } catch (RemoteException | NotBoundException ex) {
            System.out.println("error");
        }

    }

    public String valorTotal() {
        String salida = "";

        String query = "SELECT SUM(DF_TOTAL) FROM DETALLEFACTURA WHERE CF_NUMERO=" + codigo;

        try {
            /*em1.getTransaction().begin();
               em1.persist(c1);
               em1.getTransaction().commit();*/

            BigDecimal lista = new BigDecimal(em1.createNativeQuery(query).getSingleResult().toString());

            salida = lista.toString();

            System.out.println("valor " + salida);
        } catch (Exception ex) {

            ex.printStackTrace();
            salida = "ERROR";
        }

        return salida;
        // programar el código de la regla de negocio         
    }

    public void actualizarTotal() {

        String nuevoValor = valorTotal();
        System.out.println("VALOR TOTAL DESPUES=" + nuevoValor);
        String query = "UPDATE \"KIRA\".\"CABECERAFACTURA\" SET CF_VALOR = '" + nuevoValor + "' WHERE CF_NUMERO=" + codigo;

        try {
            /*em1.getTransaction().begin();
               em1.persist(c1);
               em1.getTransaction().commit();*/

            em1.getTransaction().begin();
            em1.createNativeQuery(query).executeUpdate();
            em1.getTransaction().commit();
            mensaje = "total actualizado";

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }

    public void eliminar() {
        
        try {
            //System.out.println("LLAMANDO RMI CIUDADES LISTA");
            Registry registro = LocateRegistry.getRegistry("127.0.0.1", 1099);
            cls_interface interface1 = (cls_interface) registro.lookup("rmi://localhost:1099/RMI_interface");
            mensaje=interface1.eliminarFactura(codigo);
            if(mensaje.equals("Se eliminó satisfactoriamente")){
                cuentaBancaria="";
                codigo="";
                fecha="";
                descripcion="";
            }
        } catch (RemoteException | NotBoundException ex) {
            System.out.println("error");
        }
    }

    public void modificar() {
        //System.out.println("ESTA MODIFICANDO");
       try {
            //System.out.println("LLAMANDO RMI CIUDADES LISTA");
            Registry registro = LocateRegistry.getRegistry("127.0.0.1", 1099);
            cls_interface interface1 = (cls_interface) registro.lookup("rmi://localhost:1099/RMI_interface");
            mensaje=interface1.modificarFactura(cuentaBancaria, descripcion, fecha, codigo);
            
        } catch (RemoteException | NotBoundException ex) {
            System.out.println("error");
        }

    }

    public void buscar() {
        String sql = "select * from cabecerafactura where cf_numero=" + "'" + codigo + "'";
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            Object[] ar_objeto = (Object[]) (l1.get(0));

            DateFormat fecha2 = new SimpleDateFormat("yyyy-MM-dd");
            Date fechita = (Date) ar_objeto[3];
            String convertido = fecha2.format(fechita);

            fecha = convertido;

            valTotal = Float.valueOf(ar_objeto[4].toString());
            cuentaBancaria = ar_objeto[1].toString();
            descripcion = ar_objeto[2].toString();
//            direccion=ar_objeto[2].toString();
            mensaje = "Factura encontrada";

        } else {
            mensaje = "No se encontró registro";
            valTotal = 0.0f;
            cuentaBancaria = "";
            descripcion = "";
            fecha = "";
        }

    }

    public void reportar1() {
        repor1();
    }
    
    public  Map<String, Object> cuentas(){
        return null;
    }

    public void repor1() {

        reporte1 = new ArrayList<>();
        List<Object[]> c1 = null;

        try {
            c1 = em1.createNativeQuery("SELECT  C.CE_NOMBRE, SUM(F.CF_VALOR)\n"
                    + "FROM CABECERAFACTURA \"F\", CIUDADENTREGA \"C\" \n"
                    + "WHERE F.CE_CODIGO=C.CE_CODIGO \n"
                    + "AND F.CF_FECHA >= to_date('" + fechaA + "','yyyy/mm/dd') \n"
                    + "AND F.CF_FECHA <= to_date('" + fechaB + "','yyyy/mm/dd')\n"
                    + "GROUP BY C.CE_CODIGO, C.CE_NOMBRE")
                    .getResultList();

            for (Object[] a : c1) {
                factureporte1 obj = new factureporte1(a[0].toString(), a[1].toString());
                reporte1.add(obj);
            }

            System.out.println("PINCHE REPORTE" + reporte1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
