package com.PortfolioBackend.Portfolio.Dtos;

import com.PortfolioBackend.Portfolio.Entidades.Educacion;

import java.time.LocalDate;

public class EducacionDto {
    private long id;
    private String nombreEducacion;
    private String descripcion;
    private String establecimiento;
    private String imagen;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String certificado;

    public EducacionDto(Educacion educacion){
        this.id = educacion.getId();
        this.nombreEducacion = educacion.getNombreEducacion();
        this.descripcion = educacion.getDescripcion();
        this.establecimiento = educacion.getEstablecimiento();
        this.imagen = educacion.getImagen();
        this.fechaInicio = educacion.getFechaInicio();
        this.fechaFin = educacion.getFechaInicio();
        this.certificado = educacion.getCertificado();
    }

    public long getId() {
        return id;
    }

    public String getNombreEducacion() {
        return nombreEducacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstablecimiento() {
        return establecimiento;
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

    public String getCertificado() {
        return certificado;
    }
}
