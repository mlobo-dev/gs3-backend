package com.gs3.evaluation.enums;

import lombok.Getter;

@Getter
public enum PerfilEnum {

    COMUN("Comun"),
    ADMINISTRADOR("Administrador");


    private final String descricao;

    PerfilEnum(String descricao) {
        this.descricao = descricao;
    }
}
