package com.PortfolioBackend.Portfolio.Seguridad.Servicios;

import com.PortfolioBackend.Portfolio.Seguridad.Entidades.Usuario;
import com.PortfolioBackend.Portfolio.Seguridad.Repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UsuarioServicio {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return usuarioRepositorio.findByNombreUsuario(nombreUsuario);
    }
    public boolean exitsByNombreUsuario(String nombreUsuario){
        return usuarioRepositorio.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existsByEmail(String email){
        return usuarioRepositorio.existsByEmail(email);
    }
    public void save(Usuario usuario){
        usuarioRepositorio.save(usuario);
    }
}
