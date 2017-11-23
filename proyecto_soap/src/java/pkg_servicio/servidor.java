/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_servicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;
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

}
