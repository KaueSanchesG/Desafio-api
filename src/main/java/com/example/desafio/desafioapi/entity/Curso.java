package com.example.desafio.desafioapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "tb_cursos", schema = "desafio_api")
public class Curso {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "curso_id", unique = true, nullable = false)
    private Long id;
    @Getter @Setter
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    @Getter @Setter
    @Column(name = "carga_horaria", nullable = false)
    private LocalTime cargaHoraria;
    @Getter @Setter
    @ManyToMany
    @JoinTable(name = "tb_curso_alunos", schema = "desafio_api",
            uniqueConstraints = @UniqueConstraint(
                    columnNames = {
                            "curso_id",
                            "aluno_id"
                    }
            ),
            joinColumns = @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "aluno_id"))
    private List<Aluno> alunos;
}
