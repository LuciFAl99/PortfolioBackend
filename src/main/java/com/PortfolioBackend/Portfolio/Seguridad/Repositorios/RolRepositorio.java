package com.PortfolioBackend.Portfolio.Seguridad.Repositorios;

import com.PortfolioBackend.Portfolio.Seguridad.Entidades.Rol;
import com.PortfolioBackend.Portfolio.Seguridad.Enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.Optional;

@RepositoryRestResource
public interface RolRepositorio extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
