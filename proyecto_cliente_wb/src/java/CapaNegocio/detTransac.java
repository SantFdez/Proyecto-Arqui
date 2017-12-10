/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

/**
 *
 * @author Trancos
 */
public class dettransac {
    String codigodetalle;
    String tipotransac;
    String fechadetalle;
    String valordetalle;

    public String getCodigodetalle() {
        return codigodetalle;
    }

    public void setCodigodetalle(String codigodetalle) {
        this.codigodetalle = codigodetalle;
    }

    public String getTipotransac() {
        return tipotransac;
    }

    public void setTipotransac(String tipotransac) {
        this.tipotransac = tipotransac;
    }

    public String getFechadetalle() {
        return fechadetalle;
    }

    public void setFechadetalle(String fechadetalle) {
        this.fechadetalle = fechadetalle;
    }

    public String getValordetalle() {
        return valordetalle;
    }

    public void setValordetalle(String valordetalle) {
        this.valordetalle = valordetalle;
    }

    public dettransac(String codigodetalle, String tipotransac, String fechadetalle, String valordetalle) {
        this.codigodetalle = codigodetalle;
        this.tipotransac = tipotransac;
        this.fechadetalle = fechadetalle;
        this.valordetalle = valordetalle;
    }

    
    
}
