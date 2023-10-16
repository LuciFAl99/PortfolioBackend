package com.PortfolioBackend.Portfolio.Controladores;

import com.PortfolioBackend.Portfolio.Dtos.PersonaDTO2;
import com.PortfolioBackend.Portfolio.Dtos.PersonaDto;
import com.PortfolioBackend.Portfolio.Entidades.Persona;
import com.PortfolioBackend.Portfolio.Seguridad.Controladores.Mensaje;
import com.PortfolioBackend.Portfolio.Servicios.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/api/crear")
    public ResponseEntity<?> crearPersona(@RequestBody PersonaDTO2 personaDTO2) {
        if (personaServicio.existsByEmail(personaDTO2.getEmail())) {
            return new ResponseEntity<>(new Mensaje("La persona ya existe"), HttpStatus.BAD_REQUEST) ;
        } else {
            Persona persona = new Persona();
            persona.setNombre(personaDTO2.getName());
            persona.setApellido(personaDTO2.getLastName());
            persona.setEmail(personaDTO2.getEmail());

            personaServicio.savePersona(persona);

            return new ResponseEntity<>(new Mensaje("La persona fue creada correctamente"), HttpStatus.CREATED);
        }
    }


}
