package com.mitiendita.user;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true) // Importante para que Lombok incluya los campos del padre
@DiscriminatorValue("ADMIN") // Valor que se guardará en la columna TIPO_USUARIO para esta clase
public class Administrador extends Usuario {

    private String nivelAcceso;
    private String departamento;
}