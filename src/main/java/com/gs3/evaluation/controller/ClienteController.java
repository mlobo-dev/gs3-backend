package com.gs3.evaluation.controller;

import com.gs3.evaluation.dto.ClienteCadastroDTO;
import com.gs3.evaluation.dto.ClienteDTO;
import com.gs3.evaluation.mapper.ClienteMapper;
import com.gs3.evaluation.service.ClienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clientes")
@Api(tags = "Clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;
    private final ClienteMapper mapper;

    @GetMapping
    @ApiOperation("Recupera uma lista de clientes")
    public ResponseEntity<List<ClienteDTO>> listarTodos() {
        return ResponseEntity.ok(mapper.toDto(service.listarTodos()));
    }

    @GetMapping("/{id}")
    @ApiOperation("Recupera um cliente pelo id")
    public ResponseEntity<ClienteDTO> buscarPeloId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(mapper.toDto(service.buscarPeloId(id)));
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Recupera um cliente pelo id")
    public ResponseEntity<ClienteDTO> deletarPeloId(@PathVariable("id") Long id) {
        service.deletarPeloId(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    @ApiOperation("Salva um novo cliente")
    public ResponseEntity<ClienteDTO> salvar(@Valid @RequestBody ClienteCadastroDTO dto) {
        return ResponseEntity.ok(mapper.toDto(service.salvar(dto)));
    }

    @PutMapping
    @ApiOperation("Atualiza os dados de um cliente")
    public ResponseEntity<ClienteDTO> atualizar(@RequestBody ClienteDTO dto) {
        return ResponseEntity.ok(mapper.toDto(service.editar(dto)));
    }
}
