package com.gs3.evaluation.dto;

import com.gs3.evaluation.enums.TipoTelefoneEnum;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class TelefoneDTO {


    private Long id;

    @NotNull(message = "Número do telefone  é obrigatório")
    @NotEmpty(message = "Número do telefone  é obrigatório")
    private String numeroTelefone;

    @NotNull(message = "Tipo do telefone  é obrigatório")
    private TipoTelefoneEnum tipo;
}
