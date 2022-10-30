package com.portfolio.CAB.dto;

import javax.validation.constraints.NotBlank;

public class DtoExperiencia {

    @NotBlank
    private String nombreExp;

    @NotBlank
    private String lugarExp;

    @NotBlank
    private String fechaExp;

    @NotBlank
    private String descripcionExp;

    @NotBlank
    private String imgExp;

    public DtoExperiencia() {
    }

    public DtoExperiencia(String nombreExp, String lugarExp, String fechaExp, String descripcionExp, String imgExp) {
        this.nombreExp = nombreExp;
        this.lugarExp = lugarExp;
        this.fechaExp = fechaExp;
        this.descripcionExp = descripcionExp;
        this.imgExp = imgExp;
    }

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public String getLugarExp() {
        return lugarExp;
    }

    public void setLugarExp(String lugarExp) {
        this.lugarExp = lugarExp;
    }

    public String getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }

}
