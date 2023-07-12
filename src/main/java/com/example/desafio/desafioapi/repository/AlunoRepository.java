package com.example.desafio.desafioapi.repository;

import com.example.desafio.desafioapi.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {}
