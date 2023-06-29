package com.PortfolioBackend.Portfolio.Dtos;

import com.PortfolioBackend.Portfolio.Entidades.Experiencia;

import java.time.LocalDate;

public class ExperienciaDto {
    private long id;
    private String nombreExperiencia;
    private String descripcion;
    private String compañia;
    private String imagen;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String urlPagina;

    public ExperienciaDto(Experiencia experiencia){
        this.id = experiencia.getId();
        this.nombreExperiencia = experiencia.getNombreExperiencia();
        this.descripcion = experiencia.getDescripcion();
        this.compañia = experiencia.getCompañia();
        this.imagen = experiencia.getImagen();
        this.fechaInicio = experiencia.getFechaInicio();
        this.fechaFin = experiencia.getFechaFin();
        this.urlPagina = experiencia.getUrlPagina();
    }

    public long getId() {
        return id;
    }

    public String getNombreExperiencia() {
        return nombreExperiencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCompañia() {
        return compañia;
    }

    public String getImagen() {
        return imagen;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public String getUrlPagina() {
        return urlPagina;
    }
}
