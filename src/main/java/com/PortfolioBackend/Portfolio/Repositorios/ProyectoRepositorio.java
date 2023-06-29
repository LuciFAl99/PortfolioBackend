package com.PortfolioBackend.Portfolio.Repositorios;

import com.PortfolioBackend.Portfolio.Entidades.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProyectoRepositorio extends JpaRepository<Proyecto, Long> {
}
