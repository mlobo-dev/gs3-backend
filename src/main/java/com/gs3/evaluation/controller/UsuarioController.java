package com.gs3.evaluation.controller;

import com.gs3.evaluation.domain.Usuario;
import com.gs3.evaluation.dto.UsuarioAuthDTO;
import com.gs3.evaluation.mapper.UsuarioMapper;
import com.gs3.evaluation.service.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.message.AuthException;

@RestController
@RequestMapping("/usuarios")
@Api(tags = "Usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;
    private final UsuarioMapper mapper;

    @PostMapping("/autenticar")
    @ApiOperation("Rota para autenticar o usuário através do login e senha.")
    public ResponseEntity autenticar(@RequestBody UsuarioAuthDTO dto) {
        try {
            Usuario usuarioAutenticado = service.autenticar(dto.getLogin(), dto.getSenha());
            return ResponseEntity.ok(mapper.toDto(usuarioAutenticado));
        } catch (AuthException e) {
            return ResponseEntity.badRequest().body(e.getMessage());

        }
    }

}
