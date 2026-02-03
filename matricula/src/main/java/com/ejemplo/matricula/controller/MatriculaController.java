package com.ejemplo.matricula.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.matricula.model.matricula;
import com.ejemplo.matricula.repository.MatriculaRepository;
import com.ejemplo.matricula.service.MatriculaService;

import io.swagger.v3.oas.annotations.Operation;
@RestController
@RequestMapping("/api/matriculas")
public class MatriculaController {

    private final MatriculaService service;
    private final MatriculaRepository repository;

    public MatriculaController(MatriculaService service,MatriculaRepository repository) {
        this.service = service;
        this.repository = repository;
    }
  
    @GetMapping
    @Operation(summary = "Listar matriculados",
               description = "Obtiene todos los estudiantes matriculados")
    public List<matricula> obtenerTodos() {
        return repository.findAll();
    }
    @PostMapping("/{estudiante_id}")
    public matricula matricular(@PathVariable Integer estudiante_id) {
        return service.matricular(estudiante_id);
    }
}

