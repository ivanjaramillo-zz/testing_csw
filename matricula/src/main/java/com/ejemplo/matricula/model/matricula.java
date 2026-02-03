package com.ejemplo.matricula.model;
import java.time.LocalDate;

import jakarta.persistence.Entity; // ¡Añade esta importación!
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer estudiante_id;
    private LocalDate fecha_matricula;

    // getters y setters
       // 3. Getters y Setters (Necesarios para JPA, aunque pueden omitirse si usas Lombok)
    // Getters and Setters
    public Integer  getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer  getEstudianteId() { return estudiante_id; }
    public void setEstudianteId(Integer estudiante_id) { this.estudiante_id = estudiante_id; }
    public LocalDate  geFecha() { return fecha_matricula; }
    public void setFecha(LocalDate fecha_matricula) { this.fecha_matricula = fecha_matricula; }  
 
}
