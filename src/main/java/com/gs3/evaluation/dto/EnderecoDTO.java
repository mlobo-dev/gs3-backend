package com.gs3.evaluation.dto;

import lombok.Data;

import javax.persistence.*;

@Data
public class EnderecoDTO {


    private Long id;
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;
    private String complemento;
}
