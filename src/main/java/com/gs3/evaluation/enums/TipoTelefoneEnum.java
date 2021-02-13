package com.gs3.evaluation.enums;

import lombok.Getter;

@Getter
public enum TipoTelefoneEnum {

    RESIDENCIAL("Residencial"),
    COMERCIAL("Comercial"),
    CELULAR("celular");


    private final String descricao;

    TipoTelefoneEnum(String descricao) {
        this.descricao = descricao;
    }
}
