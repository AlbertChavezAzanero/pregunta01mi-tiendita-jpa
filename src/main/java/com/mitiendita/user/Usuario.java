package com.mitiendita.user;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data 
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) 
@DiscriminatorColumn(name = "TIPO_USUARIO", discriminatorType = DiscriminatorType.STRING)
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombreCompleto;

    @Column(nullable = false, unique = true)
    private String email;

    private String password;

}
