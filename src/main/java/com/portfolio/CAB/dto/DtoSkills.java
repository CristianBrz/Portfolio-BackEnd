package com.portfolio.CAB.dto;

import javax.validation.constraints.NotBlank;

public class DtoSkills {
    @NotBlank
    private String nombreSkill;
  
    @NotBlank
    private int progreso;

    public DtoSkills() {
    }

    public DtoSkills(String nombreSkill, int progreso) {
        this.nombreSkill = nombreSkill;
        this.progreso = progreso;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public int getProgreso() {
        return progreso;
    }

    public void setProgreso(int progreso) {
        this.progreso = progreso;
    }
    
    
}
