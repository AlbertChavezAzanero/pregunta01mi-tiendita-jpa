package com.mitiendita.user;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data // Anotación de Lombok para generar getters, setters, toString, etc.
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Estrategia de Herencia
@DiscriminatorColumn(name = "TIPO_USUARIO", discriminatorType = DiscriminatorType.STRING)
// Columna que diferenciará el tipo de usuario (Admin o Cliente)
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