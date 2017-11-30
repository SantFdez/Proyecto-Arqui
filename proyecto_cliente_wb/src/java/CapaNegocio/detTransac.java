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
class detTransac {
    private String codigoDetalle;
    
    private String tipoTransac;
    private String fechaDetalle;
    private String valorDetalle;

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

    public detTransac(String codigoDetalle,  String tipoTransac, String fechaDetalle, String valorDetalle) {
        this.codigoDetalle = codigoDetalle;
        
        this.tipoTransac = tipoTransac;
        this.fechaDetalle = fechaDetalle;
        this.valorDetalle = valorDetalle;
    }
    
    
    
    
    
}
