package com.gs3.evaluation.domain;

import com.gs3.evaluation.enums.TipoTelefoneEnum;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_TELEFONE")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_TELEFONE")
    private Long id;

    @Column(name = "NUMERO_TELEFONE")
    private String numeroTelefone;

    @Column(name = "TIPO_TELEFONE")
    private TipoTelefoneEnum tipo;
}
