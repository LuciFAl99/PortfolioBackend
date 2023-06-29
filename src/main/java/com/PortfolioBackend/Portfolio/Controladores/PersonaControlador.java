package com.PortfolioBackend.Portfolio.Controladores;

import com.PortfolioBackend.Portfolio.Dtos.PersonaDto;
import com.PortfolioBackend.Portfolio.Repositorios.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaControlador {
    @Autowired
    PersonaRepositorio personaRepositorio;

    @GetMapping("/api/personas")
    public List<PersonaDto> traerPersonas(){
        return personaRepositorio.findAll().stream().map(persona -> new PersonaDto(persona)).collect(Collectors.toList());
    }
    @GetMapping("/api/personas/{id}")
    public PersonaDto traerPersona(@PathVariable Long id){
        return personaRepositorio.findById(id).map(persona -> new PersonaDto(persona)).orElse(null);
    }
}
