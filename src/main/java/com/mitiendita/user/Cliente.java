package com.mitiendita.user;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@DiscriminatorValue("CLIENTE") 
public class Cliente extends Usuario {

    private String direccionEnvio;
    private String telefonoContacto;
}
