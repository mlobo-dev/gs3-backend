package com.gs3.evaluation.dto;

import lombok.*;

import javax.validation.constraints.NotNull;


@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioDTO {

    @NotNull(message = "Id do usuário é obrigatório.")
    private Long id;
    private String login;
    private String senha;
    private String perfil;
}
