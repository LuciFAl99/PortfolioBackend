package com.PortfolioBackend.Portfolio.Seguridad.JWT;

import com.PortfolioBackend.Portfolio.Seguridad.Entidades.UsuarioPrincipal;
import io.jsonwebtoken.*;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;


@Component
public class JWTProvider {
    private final static Logger logger = LoggerFactory.getLogger(JWTProvider.class);
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private int expiration;
    public String generateToken(Authentication authentication) {
        UsuarioPrincipal usuarioPrincipal = (UsuarioPrincipal) authentication.getPrincipal();
        String token = Jwts.builder()
                .setSubject(usuarioPrincipal.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + expiration * 1000))
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();

        logger.info("Token generado: " + token);
        return token;
    }
    public String gerNombreUsuarioFromToken(String token) {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
    }
    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            logger.info("Token válido: " + token);
            return true;
        } catch (MalformedJwtException e) {
            logger.error("Token mal formado");
        } catch (UnsupportedJwtException e) {
            logger.error("Token no soportado");
        } catch (ExpiredJwtException e) {
            logger.error("Token expirado");
        } catch (IllegalArgumentException e) {
            logger.error("Token vacío");
        } catch (SignatureException e) {
            logger.error("Firma no válida");
        }

        logger.error("Token inválido: " + token);
        return false;
    }
}
