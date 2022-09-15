package com.portfolio.CAB.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEd;

    private String tituloEd;
    private int fechaEd;
    private String descEd;
    private String imagenEd;

    public Educacion() {
    }

    public Educacion(Long idEd, String tituloEd, int fechaEd, String descEd, String imagenEd) {
        this.idEd = idEd;
        this.tituloEd = tituloEd;
        this.fechaEd = fechaEd;
        this.descEd = descEd;
        this.imagenEd = imagenEd;
    }

}

