package com.gs3.evaluation.controller;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@Api(tags = "Usuários")
public class UsuarioController {

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {

        return ResponseEntity.ok("Hello World");
    }
}
