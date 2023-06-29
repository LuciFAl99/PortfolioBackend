package com.PortfolioBackend.Portfolio.Controladores;

import com.PortfolioBackend.Portfolio.Dtos.HabilidadDto;
import com.PortfolioBackend.Portfolio.Repositorios.HabilidadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HabilidadControlador {
    @Autowired
    HabilidadRepositorio habilidadRepositorio;
    @GetMapping("/api/habilidades")
    public List<HabilidadDto> traerHabilidades(){
        return habilidadRepositorio.findAll().stream().map(habilidad -> new HabilidadDto(habilidad)).collect(Collectors.toList());
    }
}
