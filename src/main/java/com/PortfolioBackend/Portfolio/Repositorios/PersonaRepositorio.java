package com.PortfolioBackend.Portfolio.Repositorios;

import com.PortfolioBackend.Portfolio.Entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface PersonaRepositorio extends JpaRepository<Persona, Long> {
}
