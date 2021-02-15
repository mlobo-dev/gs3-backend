package com.gs3.evaluation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class EnderecoDTO {


    private Long id;

    @NotNull(message = "cep é obrigatório")
    @NotEmpty(message = "cep é obrigatório")
    private String cep;

    @NotNull(message = "logradouro é obrigatório")
    @NotEmpty(message = "logradouro é obrigatório")
    private String logradouro;

    @NotNull(message = "bairro é obrigatório")
    @NotEmpty(message = "bairro é obrigatório")
    private String bairro;

    @NotNull(message = "cidade é obrigatório")
    @NotEmpty(message = "cidade é obrigatório")
    private String cidade;

    @NotNull(message = "uf é obrigatório")
    @NotEmpty(message = "uf é obrigatório")
    private String uf;

    private String complemento;
}
