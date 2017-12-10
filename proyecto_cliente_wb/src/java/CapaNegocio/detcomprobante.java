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
public class detcomprobante {
    String codigodetalle;
    String tipocuenta;
    String debe;
    String haber;

    public detcomprobante(String codigodetalle, String tipocuenta, String debe, String haber) {
        this.codigodetalle = codigodetalle;
        this.tipocuenta = tipocuenta;
        this.debe = debe;
        this.haber = haber;
    }

    public String getCodigodetalle() {
        return codigodetalle;
    }

    public void setCodigodetalle(String codigodetalle) {
        this.codigodetalle = codigodetalle;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
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

    public void setHaber(String haber) {
        this.haber = haber;
    }

    

    
    
}
