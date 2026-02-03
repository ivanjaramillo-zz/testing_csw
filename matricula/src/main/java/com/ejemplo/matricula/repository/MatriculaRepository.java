package com.ejemplo.matricula.repository;
import com.ejemplo.matricula.model.matricula;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MatriculaRepository
        extends JpaRepository<matricula, Integer> {
}
