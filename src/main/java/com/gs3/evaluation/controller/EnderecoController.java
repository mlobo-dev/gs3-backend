package com.gs3.evaluation.controller;

import com.gs3.evaluation.dto.EnderecoDTO;
import com.gs3.evaluation.mapper.EnderecoMapper;
import com.gs3.evaluation.service.EnderecoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enderecos")
@Api(tags = "Endereços")
@RequiredArgsConstructor
public class EnderecoController {

    private final EnderecoService enderecoService;
    private final EnderecoMapper mapper;

    @GetMapping("/{cep}")
    @ApiOperation("Rota para consultar na ViaCep Ws o endereco informando o CEP.")
    public ResponseEntity<EnderecoDTO> buscarViaCep(@PathVariable("cep") String cep) {
        return ResponseEntity.ok(mapper.toDto(enderecoService.buscarViaCep(cep)));
    }

}
