package com.example.desafio.desafioapi.repository;

import com.example.desafio.desafioapi.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
