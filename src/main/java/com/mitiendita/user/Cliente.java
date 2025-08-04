package com.mitiendita.user;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@DiscriminatorValue("CLIENTE") // Valor que se guardará en la columna TIPO_USUARIO para esta clase
public class Cliente extends Usuario {

    private String direccionEnvio;
    private String telefonoContacto;
}