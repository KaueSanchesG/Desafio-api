package com.example.desafio.desafioapi.repository;

import com.example.desafio.desafioapi.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
