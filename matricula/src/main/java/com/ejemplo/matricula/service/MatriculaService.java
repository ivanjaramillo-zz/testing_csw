package com.ejemplo.matricula.service;
import java.time.LocalDate;

import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.ejemplo.matricula.model.matricula;
import com.ejemplo.matricula.repository.MatriculaRepository;
@Service
public class MatriculaService {

    private final MatriculaRepository repo;
    private final RestTemplate restTemplate;

    public MatriculaService(MatriculaRepository repo,
                            RestTemplate restTemplate) {
        this.repo = repo;
        this.restTemplate = restTemplate;
    }

    public matricula matricular(Integer estudiante_id) {

        String url = "http://localhost:8081/api/estudiante/"
                     + estudiante_id;

   
        try {
            // Si existe → 200 OK
            restTemplate.getForObject(url, Object.class);

        } catch (HttpClientErrorException.NotFound e) {
            // Si no existe → 404
            throw new RuntimeException("Estudiante NO apto para matrícula");
        }

        matricula m = new matricula();
        m.setEstudianteId(estudiante_id);
        m.setFecha(LocalDate.now());

        return repo.save(m);
    }
}

