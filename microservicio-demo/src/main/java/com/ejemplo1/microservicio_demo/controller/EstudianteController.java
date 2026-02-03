package com.ejemplo1.microservicio_demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo1.microservicio_demo.model.Estudiante;
import com.ejemplo1.microservicio_demo.repository.EstudianteRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/estudiante") // Ruta base para todos los endpoints de este controlador
@Tag(name = "Estudiantes", description = "API para la gestión de estudiantes")
public class EstudianteController {

  private final EstudianteRepository repository;

    public EstudianteController(EstudianteRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    @Operation(summary = "Listar estudiantes",
               description = "Obtiene todos los estudiantes registrados")
    public List<Estudiante> obtenerTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener estudiante por ID")
    public Estudiante obtenerPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }
}