package com.mitiendita.user;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true) 
@DiscriminatorValue("ADMIN") 
public class Administrador extends Usuario {

    private String nivelAcceso;
    private String departamento;
}
