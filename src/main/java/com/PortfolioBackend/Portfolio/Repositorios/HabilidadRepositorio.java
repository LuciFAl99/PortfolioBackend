package com.PortfolioBackend.Portfolio.Repositorios;

import com.PortfolioBackend.Portfolio.Entidades.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HabilidadRepositorio extends JpaRepository<Habilidad, Long> {
}
