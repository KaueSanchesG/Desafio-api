package com.example.desafio.desafioapi.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_contatos", schema = "desafio_api")
public class Contato {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contato_id",nullable = false, unique = true)
    private Long id;
    @Getter @Setter
    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;
    @Getter @Setter
    @Column(name = "valor", nullable = false, length = 50)
    private String valor;
    @Getter @Setter
    @ManyToOne
    @JoinColumn(name = "id_aluno", nullable = false)
    private Aluno aluno;
}
