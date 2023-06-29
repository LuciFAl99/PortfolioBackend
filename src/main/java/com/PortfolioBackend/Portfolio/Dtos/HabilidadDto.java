package com.PortfolioBackend.Portfolio.Dtos;

import com.PortfolioBackend.Portfolio.Entidades.Habilidad;

public class HabilidadDto {
    private long id;
    private String nombreHabilidad;
    private int nivel;
    public HabilidadDto(Habilidad habilidad){
        this.id = habilidad.getId();
        this.nombreHabilidad = habilidad.getNombreHabilidad();
        this.nivel = habilidad.getNivel();
    }

    public long getId() {
        return id;
    }

    public String getNombreHabilidad() {
        return nombreHabilidad;
    }

    public int getNivel() {
        return nivel;
    }
}
