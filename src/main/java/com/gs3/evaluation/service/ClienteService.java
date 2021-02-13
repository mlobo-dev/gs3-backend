package com.gs3.evaluation.service;

import com.gs3.evaluation.domain.Cliente;
import com.gs3.evaluation.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClienteService {

    private final ClienteRepository repository;

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public Cliente buscarPeloId(Long id) {
        return repository.findById(id).orElse(null);
    }
}
