package com.PortfolioBackend.Portfolio.Seguridad.Servicios;

import com.PortfolioBackend.Portfolio.Seguridad.Entidades.Rol;
import com.PortfolioBackend.Portfolio.Seguridad.Enums.RolNombre;
import com.PortfolioBackend.Portfolio.Seguridad.Repositorios.RolRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolServicio {
    @Autowired
    RolRepositorio rolRepositorio;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepositorio.findByRolNombre(rolNombre);
    }
    public void save(Rol rol){
        rolRepositorio.save(rol);
    }
}
