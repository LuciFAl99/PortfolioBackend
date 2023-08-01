package com.PortfolioBackend.Portfolio.Controladores;

import com.PortfolioBackend.Portfolio.Dtos.PersonaDto;
import com.PortfolioBackend.Portfolio.Servicios.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaControlador {
    @Autowired
    PersonaServicio personaServicio;
    @GetMapping("/api/personas")
    public List<PersonaDto> traerPersonas(){
        return personaServicio.traerPersonas();
    }
    @GetMapping("/api/personas/{id}")
    public PersonaDto traerPersona(@PathVariable Long id){
        return personaServicio.traerPersona(id);
    }
}
