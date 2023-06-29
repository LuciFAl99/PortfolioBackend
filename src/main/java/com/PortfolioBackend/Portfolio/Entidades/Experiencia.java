package com.PortfolioBackend.Portfolio.Entidades;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String nombreExperiencia;
    private String descripcion;
    private String compañia;
    private String imagen;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String urlPagina;
    @ManyToOne(fetch = FetchType.EAGER)
    private Persona persona;

    public Experiencia() {
    }

    public Experiencia(String nombreExperiencia, String descripcion, String compañia, String imagen, LocalDate fechaInicio, LocalDate fechaFin, String urlPagina) {
        this.nombreExperiencia = nombreExperiencia;
        this.descripcion = descripcion;
        this.compañia = compañia;
        this.imagen = imagen;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.urlPagina = urlPagina;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreExperiencia() {
        return nombreExperiencia;
    }

    public void setNombreExperiencia(String nombreExperiencia) {
        this.nombreExperiencia = nombreExperiencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getUrlPagina() {
        return urlPagina;
    }

    public void setUrlPagina(String urlPagina) {
        this.urlPagina = urlPagina;
    }
}
