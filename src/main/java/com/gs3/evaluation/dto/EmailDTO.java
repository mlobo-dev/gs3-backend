package com.gs3.evaluation.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_EMAIL")
    private Long id;

    @Column(name = "ENDERECO_EMAIL")
    private String endereco;

}
