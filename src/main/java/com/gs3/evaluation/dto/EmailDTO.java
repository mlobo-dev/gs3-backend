package com.gs3.evaluation.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class EmailDTO {


    private Long id;

    @Email(message = "Email inválido")
    @NotNull(message = "Endereço do email é obrigatório")
    @NotEmpty(message = "Endereço do email é obrigatório")
    private String enderecoEmail;

}
