package com.portfolio.CAB.dto;

import javax.validation.constraints.NotBlank;

public class DtoEducacion {
    
    @NotBlank
    private String nombreEdu;
    
    @NotBlank
    private String lugarEdu;
    
    @NotBlank
    private String fechaEdu;
    
    @NotBlank
    private String descripcionEdu;
    
    @NotBlank
    private String imgEdu;

    public DtoEducacion() {
    }

    public DtoEducacion(String nombreEdu, String lugarEdu, String fechaEdu, String descripcionEdu, String imgEdu) {
        this.nombreEdu = nombreEdu;
        this.lugarEdu = lugarEdu;
        this.fechaEdu = fechaEdu;
        this.descripcionEdu = descripcionEdu;
        this.imgEdu = imgEdu;
    }

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public String getLugarEdu() {
        return lugarEdu;
    }

    public void setLugarEdu(String lugarEdu) {
        this.lugarEdu = lugarEdu;
    }

    public String getFechaEdu() {
        return fechaEdu;
    }

    public void setFechaEdu(String fechaEdu) {
        this.fechaEdu = fechaEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getImgEdu() {
        return imgEdu;
    }

    public void setImgEdu(String imgEdu) {
        this.imgEdu = imgEdu;
    }
    
    
}
