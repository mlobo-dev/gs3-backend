package com.gs3.evaluation.dto;

import lombok.*;


@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioDTO {

    private Long id;
    private String login;
    private String senha;
    private String perfil;
}
