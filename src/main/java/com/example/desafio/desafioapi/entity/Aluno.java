package com.example.desafio.desafioapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "tb_alunos", schema = "desafio_api")
public class Aluno {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aluno_id",nullable = false, unique = true)
    private Long id;
    @Getter @Setter
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    @Getter @Setter
    @Column(name = "cpf", nullable = false, length = 50, unique = true)
    private String cpf;
    @Getter @Setter
    @OneToOne
    @JoinColumn(name = "tb_endereco", nullable = false)
    private Endereco endereco;
}
