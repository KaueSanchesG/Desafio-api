package com.example.desafio.desafioapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tb_professores", schema = "desafio_api")
public class Professor {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "professor_id", unique = true, nullable = false)
    private Long id;
    @Getter @Setter
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    @Getter @Setter
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "tb_professor_alunos", schema = "desafio_api",
            uniqueConstraints = @UniqueConstraint(
                    columnNames = {
                            "professor_id",
                            "aluno_id"
                    }
            ),
            joinColumns = @JoinColumn(name = "professor_id"),
            inverseJoinColumns = @JoinColumn(name = "aluno_id", unique = false))
    private List<Aluno> alunos;
}
