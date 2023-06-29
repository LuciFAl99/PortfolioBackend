package com.PortfolioBackend.Portfolio.Repositorios;

import com.PortfolioBackend.Portfolio.Entidades.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ExperienciaRepositorio extends JpaRepository<Experiencia, Long> {
}
