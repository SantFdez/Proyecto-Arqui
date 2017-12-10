/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_servicio;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Date;
import java.util.LinkedHashMap;
=======
>>>>>>> master
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;
import java.util.Map;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


/**
 *
 * @author Trancos
 */
@WebService(serviceName = "servidor")
public class servidor {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("proyecto_soapPU");
    EntityManager em1 = factory.createEntityManager();

    @WebMethod(operationName = "insertarTipoTransac")
    public int insertarTipoTrans(
            //@WebParam(name = "id") String id, 
            @WebParam(name = "par1") String par1,
            @WebParam(name = "par2") String par2) {
        String sql = "insert into TIPO_TRANSAC (TTR_NOMBRE,TTR_SIGNO) values ('" + par1 + "'" + "," + "'" + par2 + "')";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);
        try {
            qe.executeUpdate();
            em1.getTransaction().commit();
            return 1;
        } catch (Exception ex) {
            em1.getTransaction().rollback();
            return -1;
        }
    }

    @WebMethod(operationName = "eliminarTipoTransac")
    public int eliminarTipoTrans(@WebParam(name = "as_codigo") String as_codigo) {
        String sql = "delete from  TIPO_TRANSAC where TTR_ID='" + as_codigo + "'";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);

        int li_filas = qe.executeUpdate();
        if (li_filas >= 1) {
            em1.getTransaction().commit();
            return 1;
        } else {
            em1.getTransaction().rollback();
            return 0;
        }
    }

    @WebMethod(operationName = "modificarTipoTransac")
    public int modificarTipoTrans(
            @WebParam(name = "id") String id, 
            @WebParam(name = "par1") String par1,
            @WebParam(name = "par2") String par2) {
        String sql = "update TIPO_TRANSAC set TTR_NOMBRE='" + par1 + "',TTR_SIGNO='"+par2+"' where TTR_ID='" + id + "'";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);

        int li_filas = qe.executeUpdate();
        if (li_filas >= 1) {
            em1.getTransaction().commit();
            return 1;
        } else {
            em1.getTransaction().rollback();
            return 0;
        }
    }

    @WebMethod(operationName = "buscarTipoTransac")
    public String buscarTipoTrans(@WebParam(name = "par1") String par1) {
        String sql = "select * from TIPO_TRANSAC where TTR_NOMBRE=" + "'" + par1 + "'";
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            Object[] ar_objeto = (Object[]) (l1.get(0));
            String resultado = ar_objeto[0].toString()+","+ar_objeto[2].toString();
        
            
            return resultado;

        } else {
            
            return null;
        }
        

    }
    
    @WebMethod(operationName = "insertarCuentaBanc")
    public int insertarCuentaBanc(
            //@WebParam(name = "id") String id, 
            @WebParam(name = "par1") String par1,
            @WebParam(name = "par2") String par2) {
        String sql = "insert into CUENTA_BANC (CUB_CLIENTE,CUB_DESC) values ('" + par1 + "'" + "," + "'" + par2 + "')";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);
        try {
            qe.executeUpdate();
            em1.getTransaction().commit();
            return 1;
        } catch (Exception ex) {
            em1.getTransaction().rollback();
            return -1;
        }
    }

    @WebMethod(operationName = "eliminarCuentaBanc")
    public int eliminarCuentaBanc(@WebParam(name = "as_codigo") String as_codigo) {
        String sql = "delete from  CUENTA_BANC where CUB_ID='" + as_codigo + "'";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);

        int li_filas = qe.executeUpdate();
        if (li_filas >= 1) {
            em1.getTransaction().commit();
            return 1;
        } else {
            em1.getTransaction().rollback();
            return 0;
        }
    }

    @WebMethod(operationName = "modificarCuentaBanc")
    public int modificarCuentaBanc(
            @WebParam(name = "id") String id, 
            @WebParam(name = "par1") String par1,
            @WebParam(name = "par2") String par2) {
        String sql = "update CUENTA_BANC set CUB_CLIENTE='" + par1 + "',CUB_DESC='"+par2+"' where CUB_ID='" + id + "'";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);

        int li_filas = qe.executeUpdate();
        if (li_filas >= 1) {
            em1.getTransaction().commit();
            return 1;
        } else {
            em1.getTransaction().rollback();
            return 0;
        }
    }

    @WebMethod(operationName = "buscarCuentaBanc")
    public String buscarCuentaBanc(@WebParam(name = "par1") String par1) {
        String sql = "select * from CUENTA_BANC where CUB_CLIENTE=" + "'" + par1 + "'";
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            Object[] ar_objeto = (Object[]) (l1.get(0));
            String resultado = ar_objeto[0].toString()+","+ar_objeto[2].toString();
            return resultado;

        } else {
            return null;
        }

    }
    
    @WebMethod(operationName = "insertarTipoCuenta")
    public int insertarTipoCuenta(
            //@WebParam(name = "id") String id, 
            @WebParam(name = "par1") String par1) {
        String sql = "insert into TIPO_CUENTA (TCT_NOMBRE) values ('" + par1 + "')";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);
        try {
            qe.executeUpdate();
            em1.getTransaction().commit();
            return 1;
        } catch (Exception ex) {
            em1.getTransaction().rollback();
            return -1;
        }
    }

    @WebMethod(operationName = "eliminarTipoCuenta")
    public int eliminarTipoCuenta(@WebParam(name = "as_codigo") String as_codigo) {
        String sql = "delete from  TIPO_CUENTA where TCT_CODIGO='" + as_codigo + "'";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);

        int li_filas = qe.executeUpdate();
        if (li_filas >= 1) {
            em1.getTransaction().commit();
            return 1;
        } else {
            em1.getTransaction().rollback();
            return 0;
        }
    }

    @WebMethod(operationName = "modificarTipoCuenta")
    public int modificarTipoCuenta(
            @WebParam(name = "id") String id, 
            @WebParam(name = "par1") String par1) {
        String sql = "update TIPO_CUENTA set TCT_NOMBRE='" + par1 + "' where TCT_CODIGO='" + id + "'";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);

        int li_filas = qe.executeUpdate();
        if (li_filas >= 1) {
            em1.getTransaction().commit();
            return 1;
        } else {
            em1.getTransaction().rollback();
            return 0;
        }
    }

    @WebMethod(operationName = "buscarTipoCuenta")
    public String buscarTipoCuenta(@WebParam(name = "par1") String par1) {
        String sql = "select * from TIPO_CUENTA where TCT_NOMBRE=" + "'" + par1 + "'";
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            Object[] ar_objeto = (Object[]) (l1.get(0));
            String resultado = ar_objeto[0].toString();
        
            
            return resultado;

<<<<<<< HEAD
            DateFormat fecha2 = new SimpleDateFormat("yyyy/MM/dd");
            Date fechita = (Date) ar_objeto[2];
            String convertido = fecha2.format(fechita);

            listaDetalles.add(ar_objeto[1].toString());
            listaDetalles.add(convertido);

            listaDetalles.add(ar_objeto[3].toString());
=======
        } else {
>>>>>>> master
            
            return null;
        }
        

    }
    
    @WebMethod(operationName = "buscarTipoCuenta2")
    public String buscarTipoCuenta2(@WebParam(name = "par1") String par1) {
        String sql = "select * from TIPO_CUENTA where TCT_CODIGO=" + "'" + par1 + "'";
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            Object[] ar_objeto = (Object[]) (l1.get(0));
            String resultado = ar_objeto[1].toString();
        
            
            return resultado;

        } else {
            
            return null;
        }
<<<<<<< HEAD
        String sql2 = "select	 \"DET_TRANSAC\".\"DET_ID\" as \"DET_ID\",\n" +
"     \"DET_TRANSAC\".\"CAT_ID\" as \"CAT_ID\",\n" +
"     \"TIPO_TRANSAC\".\"TTR_NOMBRE\" as \"TTR_NOMBRE\",\n" +
"	 \"DET_TRANSAC\".\"DET_FECHA\" as \"DET_FECHA\",\n" +
"	 \"DET_TRANSAC\".\"DET_VAL\" as \"DET_VAL\"\n" +
" from	 \"TIPO_TRANSAC\" \"TIPO_TRANSAC\",\n" +
"	 \"DET_TRANSAC\" \"DET_TRANSAC\" \n" +
" where   \"DET_TRANSAC\".\"TTR_ID\"=\"TIPO_TRANSAC\".\"TTR_ID\"\n" +
" and    \"DET_TRANSAC\".CAT_ID=" + codigo;
        qe = em1.createNativeQuery(sql2);
        List l2 = qe.getResultList();
        System.out.println(l2);
        if (l2.size() >= 1) {
            for (int i = 0; i < l2.size(); i++) {
                Object[] obj = (Object[]) l2.get(i);
                DateFormat fecha2 = new SimpleDateFormat("yyyy/MM/dd");
                Date fechita = (Date) obj[3];
                String convertido = fecha2.format(fechita);
                String art = obj[0].toString() + "," + obj[2].toString() + "," + convertido + "," + obj[4].toString();
                listaDetalles.add(art);
                
            }
            System.out.println(l2.size());
        }
        return listaDetalles;
    }
=======
        

    }
    
    @WebMethod(operationName = "buscarTodoCuenta")
    public List<String> buscarTodoCuenta() {
        String sql = "select * from TIPO_CUENTA";
        List<String> lista = new ArrayList<String>();
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            for(int i=0; i<l1.size();i++){
            Object[] ar_objeto = (Object[]) (l1.get(i));
            lista.add(ar_objeto[1].toString());
            }
        
            
            return lista;
>>>>>>> master

        } else {
            
            return null;
        }
        
<<<<<<< HEAD
        System.out.println(fecha+" "+tipoTransac+" "+valor+" "+cabTransac);
        
        String sql = "INSERT INTO \"KIRA\".\"DET_TRANSAC\" (CAT_ID,DET_FECHA, TTR_ID, DET_VAL ) VALUES ("+cabTransac+",TO_DATE('"+fecha+"', 'YYYY-MM-DD HH24:MI:SS'),'"+tipoTransac+"','"+valor+"')";
        
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);
=======
>>>>>>> master

    }
    
     @WebMethod(operationName = "insertarCuenta")
    public int insertarCuenta(
            //@WebParam(name = "id") String id, 
            @WebParam(name = "par1") String par1,
            @WebParam(name = "par2") String par2) {
        String sql = "insert into CUENTA (CNT_NOMBRE, TCT_CODIGO) values ('" + par1 + "','"+ par2 +"')";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);
        try {
            qe.executeUpdate();
            em1.getTransaction().commit();
            return 1;
        } catch (Exception ex) {
            em1.getTransaction().rollback();
            return -1;
        }
    }

<<<<<<< HEAD
    @WebMethod(operationName = "modificarDetalleTransaccion")
    public String modificarDetalleTransaccion(
            @WebParam(name = "fecha") String fecha, 
            @WebParam(name = "tipoTransac") String tipoTransac, 
            @WebParam(name = "valor") String valor, 
            @WebParam(name = "codigoDetalle") String codigoDet) {
        String mensaje = "";
        
        String sql = "update det_transac set det_val='" + valor + "', det_fecha=TO_DATE('"+fecha+"', 'YYYY-MM-DD HH24:MI:SS')" + ", ttr_id='" + tipoTransac + "' where det_id='" + codigoDet + "'";

=======
    @WebMethod(operationName = "eliminarCuenta")
    public int eliminarCuenta(@WebParam(name = "as_codigo") String as_codigo) {
        String sql = "delete from  CUENTA where CNT_CODIGO='" + as_codigo + "'";
>>>>>>> master
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);

        int li_filas = qe.executeUpdate();
        if (li_filas >= 1) {
            em1.getTransaction().commit();
            return 1;
        } else {
            em1.getTransaction().rollback();
            return 0;
        }
    }

    @WebMethod(operationName = "modificarCuenta")
    public int modificarCuenta(
            @WebParam(name = "id") String id, 
            @WebParam(name = "par1") String par1,
            @WebParam(name = "par2") String par2) {
        String sql = "update CUENTA set CNT_NOMBRE='" + par1 + "',TCT_CODIGO='"+par2+"' where CNT_CODIGO='" + id + "'";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);

        int li_filas = qe.executeUpdate();
        if (li_filas >= 1) {
            em1.getTransaction().commit();
            return 1;
        } else {
            em1.getTransaction().rollback();
            return 0;
        }
    }

    @WebMethod(operationName = "buscarCuenta")
    public String buscarCuenta(@WebParam(name = "par1") String par1) {
        String sql = "select * from CUENTA where CNT_NOMBRE=" + "'" + par1 + "'";
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            Object[] ar_objeto = (Object[]) (l1.get(0));
            String resultado = ar_objeto[0].toString()+","+ar_objeto[2].toString();
            return resultado;

        } else {
            return null;
        }

    }
    
<<<<<<< HEAD
    @WebMethod(operationName = "buscarTodoCuenta")
    public List<String> buscarTodoCuenta() {
        String sql = "select * from TIPO_CUENTA";
        List<String> lista = new ArrayList<String>();
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            for (int i = 0; i < l1.size(); i++) {
                Object[] ar_objeto = (Object[]) (l1.get(i));
                lista.add(ar_objeto[1].toString());
            }

            return lista;

        } else {

            return null;
        }
    }

    @WebMethod(operationName = "insertarTipoCuenta")
    public int insertarTipoCuenta(
            //@WebParam(name = "id") String id, 
            @WebParam(name = "par1") String par1) {
        String sql = "insert into TIPO_CUENTA (TCT_NOMBRE) values ('" + par1 + "')";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);
        try {
            qe.executeUpdate();
            em1.getTransaction().commit();
            return 1;
        } catch (Exception ex) {
            em1.getTransaction().rollback();
            return -1;
        }
    }

    @WebMethod(operationName = "eliminarTipoCuenta")
    public int eliminarTipoCuenta(@WebParam(name = "as_codigo") String as_codigo) {
        String sql = "delete from  TIPO_CUENTA where TCT_CODIGO='" + as_codigo + "'";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);

        int li_filas = qe.executeUpdate();
        if (li_filas >= 1) {
            em1.getTransaction().commit();
            return 1;
        } else {
            em1.getTransaction().rollback();
            return 0;
        }
    }

    @WebMethod(operationName = "modificarTipoCuenta")
    public int modificarTipoCuenta(
            @WebParam(name = "id") String id,
            @WebParam(name = "par1") String par1) {
        String sql = "update TIPO_CUENTA set TCT_NOMBRE='" + par1 + "' where TCT_CODIGO='" + id + "'";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);

        int li_filas = qe.executeUpdate();
        if (li_filas >= 1) {
            em1.getTransaction().commit();
            return 1;
        } else {
            em1.getTransaction().rollback();
            return 0;
        }
    }

    @WebMethod(operationName = "buscarTipoCuenta")
    public String buscarTipoCuenta(@WebParam(name = "par1") String par1) {
        String sql = "select * from TIPO_CUENTA where TCT_NOMBRE=" + "'" + par1 + "'";
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            Object[] ar_objeto = (Object[]) (l1.get(0));
            String resultado = ar_objeto[0].toString();

            return resultado;

        } else {

            return null;
        }

    }

    @WebMethod(operationName = "buscarTipoCuenta2")
    public String buscarTipoCuenta2(@WebParam(name = "par1") String par1) {
        String sql = "select * from TIPO_CUENTA where TCT_CODIGO=" + "'" + par1 + "'";
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            Object[] ar_objeto = (Object[]) (l1.get(0));
            String resultado = ar_objeto[1].toString();

            return resultado;

        } else {

            return null;
        }

    }

    @WebMethod(operationName = "insertarCuenta")
    public int insertarCuenta(
            //@WebParam(name = "id") String id, 
            @WebParam(name = "par1") String par1,
            @WebParam(name = "par2") String par2) {
        String sql = "insert into CUENTA (CNT_NOMBRE, TCT_CODIGO) values ('" + par1 + "','" + par2 + "')";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);
        try {
            qe.executeUpdate();
            em1.getTransaction().commit();
            return 1;
        } catch (Exception ex) {
            em1.getTransaction().rollback();
            return -1;
        }
    }

    @WebMethod(operationName = "eliminarCuenta")
    public int eliminarCuenta(@WebParam(name = "as_codigo") String as_codigo) {
        String sql = "delete from  CUENTA where CNT_CODIGO='" + as_codigo + "'";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);

        int li_filas = qe.executeUpdate();
        if (li_filas >= 1) {
            em1.getTransaction().commit();
            return 1;
        } else {
            em1.getTransaction().rollback();
            return 0;
        }
    }

    @WebMethod(operationName = "modificarCuenta")
    public int modificarCuenta(
            @WebParam(name = "id") String id,
            @WebParam(name = "par1") String par1,
            @WebParam(name = "par2") String par2) {
        String sql = "update CUENTA set CNT_NOMBRE='" + par1 + "',TCT_CODIGO='" + par2 + "' where CNT_CODIGO='" + id + "'";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);

        int li_filas = qe.executeUpdate();
        if (li_filas >= 1) {
            em1.getTransaction().commit();
            return 1;
        } else {
            em1.getTransaction().rollback();
            return 0;
        }
    }

    @WebMethod(operationName = "buscarCuenta")
    public String buscarCuenta(@WebParam(name = "par1") String par1) {
        String sql = "select * from CUENTA where CNT_NOMBRE=" + "'" + par1 + "'";
=======
     @WebMethod(operationName = "validarUsuario")
    public String validarUsuario(@WebParam(name = "as_id") String as_id, @WebParam(name = "as_pass") String as_pass) {
        String acceso = "";

        String sql = "select * from USUARIOS where US_ID=" + "'" + as_id + "'";
>>>>>>> master
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            Object[] ar_objeto = (Object[]) (l1.get(0));
<<<<<<< HEAD
            String resultado = ar_objeto[0].toString() + "," + ar_objeto[1].toString();
            return resultado;

        } else {
            return null;
        }

    }

    @WebMethod(operationName = "cuentasBancariasLista")
    public ArrayList<String> cuentasBancariasLista() {
        String sql = "select cub_id,cub_cliente from CUENTA_BANC order by cub_id";
        ArrayList<String> array=new ArrayList<>();
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            for (int i = 0; i < l1.size(); i++) {
            Object[] ar_objeto = (Object[]) (l1.get(i));
            array.add(ar_objeto[0].toString()+","+ ar_objeto[0].toString());
            }
            
            return array;
        } else {
            return null;
        }

    }

    @WebMethod(operationName = "tipoTransaccionLista")
    public List<String> tipoTransaccionLista() {
        String sql = "select ttr_id,ttr_nombre from TIPO_TRANSAC";
        ArrayList<String> array=new ArrayList<>();
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            for (int i = 0; i < l1.size(); i++) {
            Object[] ar_objeto = (Object[]) (l1.get(i));
            array.add(ar_objeto[0].toString()+","+ ar_objeto[1].toString());
            }
            
            return array;
=======
            //System.out.println("VALIDANDO: "+as_pass+" "+ar_objeto[1]);
            if (as_pass.equals(ar_objeto[1])) {
                acceso = "1," + ar_objeto[2];
            } else {
                acceso = "0";
            }
            return acceso;

>>>>>>> master
        } else {
            return null;
        }

    }
    
<<<<<<< HEAD
     @WebMethod(operationName = "transaccionReporte1")
    public List<String> transaccionReporte1(@WebParam(name = "par1") String fechaA,
            @WebParam(name = "par2") String fechaB) {
         String sql = "SELECT CUENTA_BANC.CUB_ID, DET_TRANSAC.DET_VAL,TIPO_TRANSAC.TTR_SIGNO, DET_TRANSAC.DET_FECHA \n"
                 + " FROM DET_TRANSAC,TIPO_TRANSAC , CAB_TRANSAC, CUENTA_BANC\n"
                 + " WHERE DET_TRANSAC.DET_FECHA >= to_date('"+fechaA+"','yyyy/mm/dd') \n"
                 + " AND DET_TRANSAC.DET_FECHA <= to_date('"+fechaB+"','yyyy/mm/dd') \n"
                 + " AND TIPO_TRANSAC.TTR_ID=DET_TRANSAC.TTR_ID\n"
                 + " AND DET_TRANSAC.CAT_ID=CAB_TRANSAC.CAT_ID\n"
                 + " AND CAB_TRANSAC.CUB_ID=CUENTA_BANC.CUB_ID\n"
                 + "";
         ArrayList<String> array = new ArrayList<>();
         Query qe = em1.createNativeQuery(sql);
         List l1 = qe.getResultList();
         if (l1.size() >= 1) {
             for (int i = 0; i < l1.size(); i++) {
                 Object[] ar_objeto = (Object[]) (l1.get(i));
                 array.add(ar_objeto[0].toString() + ";" + ar_objeto[1].toString()+ ";" + ar_objeto[2].toString());
             }

             return array;
         } else {
             return null;
         }

    }
    
    @WebMethod(operationName = "integracion")
    public String integracion(
            @WebParam(name = "par1") String codigoCabecera,
            @WebParam(name = "par2") String fechaCabecera
    ) {
        String sql = "SELECT SUM(DET_TRANSAC.DET_VAL) FROM DET_TRANSAC WHERE CAT_ID='"+codigoCabecera+"' AND TTR_ID=(SELECT TTR_ID FROM TIPO_TRANSAC WHERE TTR_NOMBRE='DEPOSITO')";
        
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        String totalDeposito;
        String codigoComprobante;
        if (l1.size() >= 1) {
            
            BigDecimal ar_objeto = (BigDecimal) (l1.get(0));
            totalDeposito=ar_objeto.toString();
            
            //CREAR COMPROBANTE
            String sql2 = "INSERT INTO CAB_COMPROB (CAC_FECHA,CAC_OBSERVAC)  VALUES (TO_DATE('"+fechaCabecera+"', 'YYYY-MM-DD HH24:MI:SS'),'ENVIADO DESDE BANCOS')";
            em1.getTransaction().begin();
            qe = em1.createNativeQuery(sql2);

            try {
                qe.executeUpdate();
                em1.getTransaction().commit();
                System.out.println("SE INSERTO COMPROBANDE DESDE BANCOS");;
            } catch (Exception ex) {
                em1.getTransaction().rollback();
                System.out.println("NO SE PUDO INSERTAR COMPROBANTE DESDE BANCOS");
                System.out.println(ex.getMessage());
            }
            
            //COGER ID COMPROBANTE NUEVO
            sql2="SELECT CAC_NUMERO FROM CAB_COMPROB ORDER BY CAC_NUMERO DESC";
            qe = em1.createNativeQuery(sql2);
            List l2 = qe.getResultList();
            BigDecimal ar_objeto2 = (BigDecimal) (l2.get(0));
            codigoComprobante=ar_objeto2.toString();
            
            //INSERTAR DEBE
            sql2="INSERT INTO DET_COMPROB (CAC_NUMERO,CNT_CODIGO,DEC_DEBE,DEC_HABER) VALUES ("+codigoComprobante+", (SELECT CNT_CODIGO FROM CUENTA WHERE CNT_NOMBRE='BANCOS'),"+totalDeposito+",0)";
            em1.getTransaction().begin();
            qe = em1.createNativeQuery(sql2);

            try {
                qe.executeUpdate();
                em1.getTransaction().commit();
                System.out.println("SE INSERTO DETALLE DEBE");;
            } catch (Exception ex) {
                em1.getTransaction().rollback();
                System.out.println("NO SE PUDO INSERTAR DETALLE DEBE");
                System.out.println(ex.getMessage());
            }
            
            //INSERTAR HABER
            sql2="INSERT INTO DET_COMPROB (CAC_NUMERO,CNT_CODIGO,DEC_DEBE,DEC_HABER) VALUES ("+codigoComprobante+", (SELECT CNT_CODIGO FROM CUENTA WHERE CNT_NOMBRE='INGRESOS'),0,"+totalDeposito+")";
            em1.getTransaction().begin();
            qe = em1.createNativeQuery(sql2);

            try {
                qe.executeUpdate();
                em1.getTransaction().commit();
                System.out.println("SE INSERTO DETALLE DEBE");;
            } catch (Exception ex) {
                em1.getTransaction().rollback();
                System.out.println("NO SE PUDO INSERTAR DETALLE DEBE");
                System.out.println(ex.getMessage());
            }
            
        } else {
            return "Error al guardar, no hay depositos";
        }

        return "Registro almacenado con exito";
    }
    
    
        @WebMethod(operationName = "insertarUsuario")
    public int insertarUsuario(
            @WebParam(name = "id") String nombre, 
            @WebParam(name = "par1") String password,
            @WebParam(name = "par2") String rol)
         {
       String mensaje="";
       String sql ="insert into usuarios (us_id,us_pass,us_rol) values ('"+nombre+"'"+","+"'"+password+"'"+","+"'"+rol+"')";
       em1.getTransaction().begin();
       Query qe=em1.createNativeQuery(sql);
       try
       {
           qe.executeUpdate();
           em1.getTransaction().commit();
           return 1;
        }
       catch (Exception ex)
       {    em1.getTransaction().rollback();
           return 0;
       }
     

    }
    
    @WebMethod(operationName = "eliminarUsuario")
    public int eliminarUsuario( 
            @WebParam(name = "par1") String nombre)
    {
       String mensaje="";
       String sql ="delete from  usuarios where us_id='"+nombre+"'";
       em1.getTransaction().begin();
       Query qe=em1.createNativeQuery(sql);

       int li_filas= qe.executeUpdate();
       if (li_filas>=1)
       {
           em1.getTransaction().commit();
           return 1;
       }
        else
       {
           em1.getTransaction().rollback();
           return 0;
       }
    
    }
    
    @WebMethod(operationName = "modificarUsuario")
    public int modificarUsuario(
            @WebParam(name = "id") String password, 
            @WebParam(name = "par1") String rol,
            @WebParam(name = "par2") String nombre)
    {
        
       String sql ="update usuarios set us_pass='"+password+"' "+", us_rol='"+ rol+"' where us_id='"+nombre+"'";
       em1.getTransaction().begin();
       Query qe=em1.createNativeQuery(sql);
=======
    @WebMethod(operationName = "ContarCuenta")
    public String contarCuenta() {
        String sql = "SELECT COUNT(TCT_CODIGO) FROM TIPO_CUENTA";
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            Object ar_objeto = (Object) (l1.get(0));
            //Integer i = Integer.parseInt(l1.get(0));
            String resultado = ar_objeto.toString();
            return resultado;

        } else {
            return null;
        }

    }
>>>>>>> master

       int li_filas=qe.executeUpdate();
       if (li_filas>=1)
       {
           em1.getTransaction().commit();
           return 1;
        }
        else
        {
            em1.getTransaction().rollback();
            return 0;
         }
    
    }
    

    @WebMethod(operationName = "buscarUsuario")
    public String buscarUsuario(
            @WebParam(name = "par2") String nombre)
    {
        String resultado;
       String sql ="select * from usuarios where us_id="+"'"+nombre+"'";
       
       Query qe=em1.createNativeQuery(sql);
       List l1=qe.getResultList();
       
       if (l1.size()>=1)
        {
            Object[] obj=(Object[]) l1.get(0);
            //Object [] ar_objeto=(Object [])(l1.get(0));
            //String ls_nombre=ar_objeto[1].toString();
            //nombre=ls_nombre;
            
            resultado=obj[1].toString()+","+obj[2].toString();
            
            return resultado;
        }
        else
        {
            return null;
        }
      
    }
    

  
    
    @WebMethod(operationName = "insertarComprobante")

    public String insertarComprobante(
            @WebParam(name = "fecha") String fecha,
            @WebParam(name = "descripcion") String descripcion) {
        String mensaje = "";
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String strFecha = fecha;
        java.util.Date fechaDate = null;

        try {
            fechaDate = formato.parse(strFecha);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        
        String sql = "INSERT INTO \"KIRA\".\"CAB_COMPROB\" (CAC_FECHA, CAC_OBSERVAC) VALUES (TO_DATE(?, 'YYYY-MM-DD HH24:MI:SS'),?) ";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql)
                .setParameter(2, descripcion)
                .setParameter(1, fecha);

        try {
            qe.executeUpdate();
            em1.getTransaction().commit();
            mensaje = "Se insertÃ³ satisfactoriamente";

        } catch (Exception ex) {
            em1.getTransaction().rollback();
            mensaje = "No se pudo insertar";
        }

        String codigo=null;
        sql = "SELECT CAC_NUMERO FROM KIRA.CAB_COMPROB ORDER BY CAC_NUMERO DESC";
        qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            BigDecimal obj = (BigDecimal) l1.get(0);
            codigo = obj.toString();
        }
        return mensaje + "," + codigo;
    }

    @WebMethod(operationName = "eliminarComprobante")
    public String eliminarComprobante(
            @WebParam(name = "codigo") String codigo) {
        String mensaje = "";
        String sql = "delete from  cab_comprob where cac_numero='" + codigo + "'";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);

        int li_filas = qe.executeUpdate();
        if (li_filas >= 1) {
            em1.getTransaction().commit();
            mensaje = "Se eliminÃ³ satisfactoriamente";

        } else {
            em1.getTransaction().rollback();
            mensaje = "No se pudo eliminar";
        }
        return mensaje;
    }

    @WebMethod(operationName = "modificarComprobante")
    public String modificarComprobante(
            @WebParam(name = "desc") String desc,
            @WebParam(name = "fecha") String fecha,
            @WebParam(name = "codigo") String codigo) {
        String mensaje = "";
        String sql = "update cab_comprob set cac_observac='" + desc + "', cac_fecha=TO_DATE('" + fecha + "', 'YYYY-MM-DD HH24:MI:SS')  where cac_numero='" + codigo + "'";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);

        int li_filas = qe.executeUpdate();
        if (li_filas >= 1) {
            em1.getTransaction().commit();
            mensaje = "Se actualizÃ³ satisfactoriamente";
        } else {
            em1.getTransaction().rollback();
            mensaje = "No se pudo modificar";
        }
        return mensaje;
    }

    @WebMethod(operationName = "buscarComprobante")
    public ArrayList<String> buscarComprobante(
             @WebParam(name = "codigo") String codigo) {
        ArrayList<String> listaDetalles = new ArrayList<>();
        String sql = "select * from cab_comprob where cac_numero=" + "'" + codigo + "'";
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            Object[] ar_objeto = (Object[]) (l1.get(0));

            DateFormat fecha2 = new SimpleDateFormat("yyyy/MM/dd");
            Date fechita = (Date) ar_objeto[1];
            String convertido = fecha2.format(fechita);

            listaDetalles.add(convertido);

            listaDetalles.add(ar_objeto[2].toString());
            
            
            listaDetalles.add("Comprobante encontrado");

        } else {
            listaDetalles.add("");
            listaDetalles.add("");
            listaDetalles.add("No se encontrÃ³ registro");
        }
        sql = "select * from det_comprob where cac_numero=" + codigo;
        qe = em1.createNativeQuery(sql);
        l1 = qe.getResultList();
        if (l1.size() >= 1) {
            for (int i = 0; i < l1.size(); i++) {
                Object[] obj = (Object[]) l1.get(i);
                String art = obj[0].toString() + "," + obj[2].toString() + "," + obj[3].toString() + "," + obj[4].toString();
                listaDetalles.add(art);
            }
        }
        return listaDetalles;
    }
    
    @WebMethod(operationName = "insertarDetalleComprobante")
    public String insertarDetalleComprobante(
            @WebParam(name = "cabComprob") String cabComprob,
            @WebParam(name = "cuenta") String cuenta,
            @WebParam(name = "debe") String debe,
            @WebParam(name = "haber") String haber
            ) {
        String mensaje;
        
        System.out.println(debe+" "+cuenta+" "+haber+" "+cabComprob);
        
        String sql = "INSERT INTO \"KIRA\".\"DET_COMPROB\" (CAC_NUMERO, CNT_CODIGO, DEC_DEBE, DEC_HABER) VALUES ("+cabComprob+","+cuenta+","+debe+","+haber+")";
        
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);

        try {
            qe.executeUpdate();
            em1.getTransaction().commit();
            mensaje = "Se insertÃ³ satisfactoriamente";
        } catch (Exception ex) {
            em1.getTransaction().rollback();
            mensaje = "No se pudo insertar";
            System.out.println(ex.getMessage());
        }
        return mensaje;

    }

    @WebMethod(operationName = "modificarDetalleComprobante")
    public String modificarDetalleComprobante(
            @WebParam(name = "codigoDetalle") String codigoDet,
            @WebParam(name = "cuenta") String cuenta,
            @WebParam(name = "debe") String debe,  
            @WebParam(name = "haber") String haber
            ) {
        String mensaje = "";
        
        String sql = "update det_comprob set dec_haber='" + haber + "', dec_debe='"+debe+"', cnt_codigo='" + cuenta + "' where dec_id='" + codigoDet + "'";

        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);

        int li_filas = qe.executeUpdate();
        if (li_filas >= 1) {
            em1.getTransaction().commit();
            mensaje = "Se actualizÃ³ satisfactoriamente";

        
        } else {
            em1.getTransaction().rollback();
            mensaje = "No se pudo modificar";
        }
        return mensaje;
    }

  
    @WebMethod(operationName = "eliminarDetalleComprobante")
    public String eliminarDetalleComprobante(
            @WebParam(name = "codigoDetalle")  String codigoDetalle            ) {
        String mensaje = "";
        String sql = "delete from  det_comprob where dec_id='" + codigoDetalle + "'";
        em1.getTransaction().begin();
        Query qe = em1.createNativeQuery(sql);

        int li_filas = qe.executeUpdate();
        if (li_filas >= 1) {
            em1.getTransaction().commit();
            mensaje = "Se eliminÃ³ satisfactoriamente";
            
            
        } else {
            em1.getTransaction().rollback();
            mensaje = "No se pudo eliminar";
        }
        return mensaje;
    }
    
    @WebMethod(operationName = "CuentaLista")
    public List<String> cuentaLista() {
        String sql = "select cnt_codigo,cnt_nombre from CUENTA";
        ArrayList<String> array=new ArrayList<>();
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            for (int i = 0; i < l1.size(); i++) {
            Object[] ar_objeto = (Object[]) (l1.get(i));
            array.add(ar_objeto[0].toString()+","+ ar_objeto[1].toString());
            }
            
            return array;
        } else {
            return null;
        }

    }
    
    @WebMethod(operationName = "balanceLista")
    public List<String> balanceLista() {
        String sql = "select	 \"CUENTA\".\"CNT_NOMBRE\" as \"CNT_NOMBRE\",\n" +
"	 \"DET_COMPROB\".\"DEC_DEBE\" as \"DEC_DEBE\",\n" +
"	 \"TIPO_CUENTA\".\"TCT_NOMBRE\" as \"TCT_NOMBRE\",\n" +
"	 \"DET_COMPROB\".\"DEC_HABER\" as \"DEC_HABER\" \n" +
" from	 \"TIPO_CUENTA\" \"TIPO_CUENTA\",\n" +
"	 \"CUENTA\" \"CUENTA\",\n" +
"	 \"DET_COMPROB\" \"DET_COMPROB\" \n" +
" where   \"DET_COMPROB\".\"CNT_CODIGO\"=\"CUENTA\".\"CNT_CODIGO\"\n" +
" and	 \"CUENTA\".\"TCT_CODIGO\"=\"TIPO_CUENTA\".\"TCT_CODIGO\"";
        ArrayList<String> array=new ArrayList<>();
        Query qe = em1.createNativeQuery(sql);
        List l1 = qe.getResultList();
        if (l1.size() >= 1) {
            for (int i = 0; i < l1.size(); i++) {
            Object[] ar_objeto = (Object[]) (l1.get(i));
            array.add(ar_objeto[0].toString()+","+ ar_objeto[1].toString()+","+ar_objeto[2].toString()+","+ar_objeto[3].toString());
            }
            
            return array;
        } else {
            return null;
        }

    }

    
  
}
