package com.PortfolioBackend.Portfolio.Repositorios;

import com.PortfolioBackend.Portfolio.Entidades.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EducacionRepositorio extends JpaRepository<Educacion, Long> {
}
