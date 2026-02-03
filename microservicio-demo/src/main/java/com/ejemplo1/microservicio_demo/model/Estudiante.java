package com.ejemplo1.microservicio_demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue; // ¡Añade esta importación!
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // 1. Marca la clase como una tabla en la DB
@Table(name = "estudiante") // <-- Especifica el nombre de la tabla
public class Estudiante {

    @Id // 2. Marca este campo como la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;

    // 3. Getters y Setters (Necesarios para JPA, aunque pueden omitirse si usas Lombok)
    // Getters and Setters
    public Long  getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    // Constructor vacío (necesario para JPA)
    //public Estudiante() {}
    
    // Getters y Setters para id, nombre y precio
    // ...
}