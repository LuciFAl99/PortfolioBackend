package com.PortfolioBackend.Portfolio.Servicios;

import com.PortfolioBackend.Portfolio.Dtos.PersonaDto;

import java.util.List;

public interface PersonaServicio {
    List<PersonaDto> traerPersonas();
    PersonaDto traerPersona(Long id);
}
