package com.PortfolioBackend.Portfolio.Entidades;


import net.bytebuddy.asm.Advice;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String nombreProyecto;
    private String descripcion;
    private String urlRepo;
    private String urlDeploy;
    private String imagen;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    @ManyToOne(fetch = FetchType.EAGER)
    private Persona persona;
    public Proyecto() {
    }
    public Proyecto(String nombreProyecto, String descripcion, String urlRepo, String urlDeploy, String imagen, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.urlRepo = urlRepo;
        this.urlDeploy = urlDeploy;
        this.imagen = imagen;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlRepo() {
        return urlRepo;
    }

    public void setUrlRepo(String urlRepo) {
        this.urlRepo = urlRepo;
    }

    public String getUrlDeploy() {
        return urlDeploy;
    }

    public void setUrlDeploy(String urlDeploy) {
        this.urlDeploy = urlDeploy;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
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
}
