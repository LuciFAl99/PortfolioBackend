package com.PortfolioBackend.Portfolio.Seguridad.Enums;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum RolNombre {
    @Enumerated(EnumType.STRING)
    ROL_ADMIN,
    @Enumerated(EnumType.STRING)
    ROL_USUARIO
}
