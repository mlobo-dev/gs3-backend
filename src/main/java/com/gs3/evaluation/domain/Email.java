package com.gs3.evaluation.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_EMAIL")
    private Long id;

    @Column(name = "ENDERECO_EMAIL")
    private String endereco;

}
