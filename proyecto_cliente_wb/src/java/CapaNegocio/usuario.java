/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import pkg_servicio.Servidor;
import pkg_servicio.Servidor_Service;

/**
 *
 * @author neos
 */
@ManagedBean()
@SessionScoped

public class usuario {
    public String nombre="";
    public String password="";
    public String mensaje="";
    public String rol="";
    public String origen="";
    
    private Servidor_Service service = new Servidor_Service();
    private Servidor port = service.getServidorPort();

    


    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    

    

    public String buscar()
    {
       String msj=port.validarUsuario(nombre,password);
       String[] datos=msj.split(",");
       String resp;
       
       if (datos[0].equals("1"))
        {
            this.rol=datos[1];
            resp="/menu";
        }
        else
        {
            resp="index";
            mensaje="Usuario o contraseña incorrecto";
        }
       return resp;
    }

}
