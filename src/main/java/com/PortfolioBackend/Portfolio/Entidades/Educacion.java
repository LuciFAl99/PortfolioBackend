package com.PortfolioBackend.Portfolio.Entidades;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String nombreEducacion;
    private String descripcion;
    private String establecimiento;
    private String imagen;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String certificado;
    @ManyToOne(fetch = FetchType.EAGER)
    private Persona persona;

    public Educacion() {
    }

    public Educacion(String nombreEducacion, String descripcion, String establecimiento, String imagen, LocalDate fechaInicio, LocalDate fechaFin, String certificado) {
        this.nombreEducacion = nombreEducacion;
        this.descripcion = descripcion;
        this.establecimiento = establecimiento;
        this.imagen = imagen;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.certificado = certificado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreEducacion() {
        return nombreEducacion;
    }

    public void setNombreEducacion(String nombreEducacion) {
        this.nombreEducacion = nombreEducacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
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

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }
}
