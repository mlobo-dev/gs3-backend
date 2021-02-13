package com.gs3.evaluation.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_CLIENTE")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "CPF")
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "COD_ENDERECO")
    private Endereco endereco;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "TB_CLIENTE_TELEFONES",
            joinColumns = @JoinColumn(name = "COD_CLIENTE"),
            inverseJoinColumns = @JoinColumn(name = "COD_TELEFONE")
    )
    private List<Telefone> telefones = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "TB_CLIENTE_EMAILS",
            joinColumns = @JoinColumn(name = "COD_CLIENTE"),
            inverseJoinColumns = @JoinColumn(name = "COD_EMAIL")
    )
    private List<Email> emails = new ArrayList<>();
}
