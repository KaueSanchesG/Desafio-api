package com.example.desafio.desafioapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_enderecos", schema = "desafio_api")
public class Endereco {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "endereco_id", unique = true, nullable = false)
    private Long id;
    @Getter @Setter
    @Column(name = "rua", nullable = false, length = 50)
    private String rua;
    @Getter @Setter
    @Column(name = "numero", nullable = false)
    private String numero;
    @Getter @Setter
    @Column(name = "bairro", nullable = false)
    private String bairro;
    @Getter @Setter
    @Column(name = "cep", nullable = false)
    private String cep;
}
