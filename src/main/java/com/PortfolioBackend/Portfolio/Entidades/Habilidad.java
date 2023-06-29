package com.PortfolioBackend.Portfolio.Entidades;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String nombreHabilidad;
    private int nivel;
    @ManyToOne(fetch = FetchType.EAGER)
    private Persona persona;

    public Habilidad() {
    }
    public Habilidad(String nombreHabilidad, int nivel) {
        this.nombreHabilidad = nombreHabilidad;
        this.nivel = nivel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreHabilidad() {
        return nombreHabilidad;
    }

    public void setNombreHabilidad(String nombreHabilidad) {
        this.nombreHabilidad = nombreHabilidad;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
