package com.gs3.evaluation.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ClienteDTO {


    private Long id;
    private String nome;
    private String cpf;
    private EnderecoDTO enderecoDTO;
    private List<TelefoneDTO> telefoneDTOS = new ArrayList<>();
    private List<EmailDTO> emailDTOS = new ArrayList<>();
}
