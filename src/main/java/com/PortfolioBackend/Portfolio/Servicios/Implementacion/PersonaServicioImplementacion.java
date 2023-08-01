package com.PortfolioBackend.Portfolio.Servicios.Implementacion;

import com.PortfolioBackend.Portfolio.Dtos.PersonaDto;
import com.PortfolioBackend.Portfolio.Repositorios.PersonaRepositorio;
import com.PortfolioBackend.Portfolio.Servicios.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaServicioImplementacion implements PersonaServicio {
    @Autowired
    PersonaRepositorio personaRepositorio;
    @Override
    public List<PersonaDto> traerPersonas() {
        return personaRepositorio.findAll().stream().map(persona -> new PersonaDto(persona)).collect(Collectors.toList());
    }
    @Override
    public PersonaDto traerPersona(Long id) {
        return personaRepositorio.findById(id).map(persona -> new PersonaDto(persona)).orElse(null);
    }
}
