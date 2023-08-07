package com.PortfolioBackend.Portfolio.Seguridad.Controladores;

import com.PortfolioBackend.Portfolio.Seguridad.DTOs.JwtDTO;
import com.PortfolioBackend.Portfolio.Seguridad.DTOs.LoginUsuario;
import com.PortfolioBackend.Portfolio.Seguridad.Entidades.Rol;
import com.PortfolioBackend.Portfolio.Seguridad.Enums.RolNombre;
import com.PortfolioBackend.Portfolio.Seguridad.JWT.JWTProvider;
import com.PortfolioBackend.Portfolio.Seguridad.Servicios.RolServicio;
import com.PortfolioBackend.Portfolio.Seguridad.Servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@CrossOrigin
public class AuthController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UsuarioServicio usuarioServicio;
    @Autowired
    RolServicio rolServicio;
    @Autowired
    JWTProvider jwtProvider;

    @PostMapping("/auth/login")
    public ResponseEntity<JwtDTO> login(@RequestBody LoginUsuario loginUsuario, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return  new ResponseEntity(new Mensaje("Campos mal puestos"), HttpStatus.BAD_REQUEST);
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUsuario.getNombreUsuario(), loginUsuario.getContrasena()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtProvider.generateToken(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        JwtDTO jwtDTO = new JwtDTO(jwt, userDetails.getUsername(), userDetails.getAuthorities());

        Set<Rol> roles = new HashSet<>();
        roles.add(rolServicio.getByRolNombre(RolNombre.ROL_USUARIO).get());

        if(loginUsuario.getNombreUsuario().equals("admin@admin.com")){
            roles.add(rolServicio.getByRolNombre(RolNombre.ROL_ADMIN).get());
        }

        return new ResponseEntity(jwtDTO, HttpStatus.OK);

    }


}
