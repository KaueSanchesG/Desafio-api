package com.example.desafio.desafioapi.repository;

import com.example.desafio.desafioapi.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
