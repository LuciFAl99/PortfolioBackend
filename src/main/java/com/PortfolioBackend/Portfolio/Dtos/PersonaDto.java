package com.PortfolioBackend.Portfolio.Dtos;

import com.PortfolioBackend.Portfolio.Entidades.Persona;
import org.hibernate.tool.schema.spi.ExecutionOptions;

import java.util.List;
import java.util.stream.Collectors;

public class PersonaDto {
    private long id;
    private String nombre;
    private String apellido;
    private String email;
    private String titulo;
    private long telefono;
    private String imagen;
    private List<EducacionDto> educaciones;
    private List<ExperienciaDto> experiencias;
    private List<HabilidadDto> habilidades;
    private List<ProyectoDto> proyectos;
    public PersonaDto(Persona persona) {
        this.id = persona.getId();
        this.nombre = persona.getNombre();
        this.apellido = persona.getApellido();
        this.email = persona.getEmail();
        this.titulo = persona.getTitulo();
        this.telefono = persona.getTelefono();
        this.imagen = persona.getImagen();
        this.educaciones = persona.getEducaciones().stream().map(educacion -> new EducacionDto(educacion)).collect(Collectors.toList());
        this.experiencias = persona.getExperiencias().stream().map(experiencia -> new ExperienciaDto(experiencia)).collect(Collectors.toList());
        this.habilidades = persona.getHabilidades().stream().map(habilidad -> new HabilidadDto(habilidad)).collect(Collectors.toList());
        this.proyectos = persona.getProyectos().stream().map(proyecto -> new ProyectoDto(proyecto)).collect(Collectors.toList());
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }
    public String getTitulo() {
        return titulo;
    }
    public long getTelefono() {
        return telefono;
    }

    public String getImagen() {
        return imagen;
    }

    public List<EducacionDto> getEducaciones() {
        return educaciones;
    }

    public List<ExperienciaDto> getExperiencias() {
        return experiencias;
    }

    public List<HabilidadDto> getHabilidades() {
        return habilidades;
    }

    public List<ProyectoDto> getProyectos() {
        return proyectos;
    }
}
