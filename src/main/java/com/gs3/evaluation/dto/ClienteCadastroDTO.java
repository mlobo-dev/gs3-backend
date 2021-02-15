package com.gs3.evaluation.dto;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
public class ClienteCadastroDTO {


    private Long id;

    @NotNull(message = "Nome é obrigatório")
    @NotEmpty(message = "Nome é obrigatório")
    @Size(min = 3, max = 100, message = "O nome deve conter entre 3 e 100 caracteres")
    private String nome;

    @CPF(message = "Cpf inválido")
    @NotNull(message = "cpf é obrigatório")
    @NotEmpty(message = "cpf é obrigatório")
    private String cpf;

    @NotNull(message = "Nome é obrigatório")
    @NotEmpty(message = "Nome é obrigatório")
    private String cep;

    private String complementoEndereco;

    @NotNull(message = "Ao menos 1 telefone deve ser cadastrado")
    private List<@Valid TelefoneDTO> telefones = new ArrayList<>();

    @NotNull(message = "Ao menos 1 email deve ser cadastrado")
    private List<@Valid EmailDTO> emails = new ArrayList<>();
}
