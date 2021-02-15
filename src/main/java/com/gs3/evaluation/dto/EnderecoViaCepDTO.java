package com.gs3.evaluation.dto;


import lombok.Data;

@Data
public class EnderecoViaCepDTO {


    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private String complemento;
}
