package com.PortfolioBackend.Portfolio.Dtos;

import com.PortfolioBackend.Portfolio.Entidades.Proyecto;

import java.time.LocalDate;

public class ProyectoDto {
    private long id;
    private String descripcion;
    private String nombreProyecto;
    private String urlRepo;
    private String urlDeploy;
    private String imagen;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public ProyectoDto(Proyecto proyecto) {
        this.id = proyecto.getId();
        this.descripcion = proyecto.getDescripcion();
        this.nombreProyecto = proyecto.getNombreProyecto();
        this.urlRepo = proyecto.getUrlRepo();
        this.urlDeploy = proyecto.getUrlDeploy();
        this.imagen = proyecto.getImagen();
        this.fechaInicio = proyecto.getFechaInicio();
        this.fechaFin = proyecto.getFechaFin();
    }

    public long getId() {
        return id;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUrlRepo() {
        return urlRepo;
    }

    public String getUrlDeploy() {
        return urlDeploy;
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
}
