package com.ejemplo1.microservicio_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo1.microservicio_demo.model.Estudiante;

@Repository // Opcional, pero buena práctica
// Extiende JpaRepository, pasándole la Entidad (estudiante) y el tipo de la PK (Long)
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

    // Spring Data genera automáticamente los métodos CRUD (findAll, findById, save, delete, etc.)

    // Además, podrías definir métodos personalizados aquí, por ejemplo:
    // List<Producto> findByNombre(String nombre); 
}