package com.PortfolioBackend.Portfolio.Servicios;

import com.PortfolioBackend.Portfolio.Dtos.PersonaDto;
import com.PortfolioBackend.Portfolio.Entidades.Persona;

import java.util.List;

public interface PersonaServicio {
    List<PersonaDto> traerPersonas();
    PersonaDto traerPersona(Long id);
    void savePersona(Persona persona);
    boolean existsByEmail(String email);
}
