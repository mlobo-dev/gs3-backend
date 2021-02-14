package com.gs3.evaluation.service;

import com.gs3.evaluation.domain.Endereco;
import com.gs3.evaluation.dto.EnderecoDTO;
import com.gs3.evaluation.dto.EnderecoViaCepDTO;
import com.gs3.evaluation.service.feign.ViaCepFeignService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EnderecoService {

    private final ViaCepFeignService viaCepFeignService;


    public Endereco buscarViaCep(String cep) {
        EnderecoViaCepDTO viaCep = viaCepFeignService.consultarEndereco(cep);
        return Endereco.builder()
                .bairro(viaCep.getBairro())
                .cep(viaCep.getCep())
                .cidade(viaCep.getLocalidade())
                .logradouro(viaCep.getLogradouro())
                .uf(viaCep.getUf())
                .complemento(viaCep.getComplemento())
                .build();
    }

}
