package com.PortfolioBackend.Portfolio.Entidades;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String nombre;
    private String apellido;
    private String email;
    private String titulo;
    private long telefono;
    private String imagen;
    @OneToMany(mappedBy = "persona", fetch = FetchType.EAGER)
    private Set<Experiencia> experiencias = new HashSet<>();
    @OneToMany(mappedBy = "persona", fetch = FetchType.EAGER)
    private Set<Proyecto> proyectos = new HashSet<>();
    @OneToMany(mappedBy = "persona", fetch = FetchType.EAGER)
    private Set<Habilidad> habilidades = new HashSet<>();
    @OneToMany(mappedBy = "persona", fetch = FetchType.EAGER)
    private Set<Educacion> educaciones = new HashSet<>();

    public Persona() {
    }
    public Persona(String nombre, String apellido, String email, String titulo, long telefono, String imagen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.titulo = titulo;
        this.telefono = telefono;
        this.imagen = imagen;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Set<Experiencia> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(Set<Experiencia> experiencias) {
        this.experiencias = experiencias;
    }

    public Set<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(Set<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public Set<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Set<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public Set<Educacion> getEducaciones() {
        return educaciones;
    }

    public void setEducaciones(Set<Educacion> educaciones) {
        this.educaciones = educaciones;
    }

    public void añadirExperiencia(Experiencia experiencia){
        experiencia.setPersona(this);
        experiencias.add(experiencia);
    }
    public void añadirProyecto(Proyecto proyecto){
        proyecto.setPersona(this);
        proyectos.add(proyecto);
    }
    public void añadirEducacion(Educacion educacion){
        educacion.setPersona(this);
        educaciones.add(educacion);
    }
    public void añadirHabilidad(Habilidad habilidad){
        habilidad.setPersona(this);
        habilidades.add(habilidad);
    }
}
