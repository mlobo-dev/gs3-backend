package com.gs3.evaluation.service;

import com.gs3.evaluation.domain.Cliente;
import com.gs3.evaluation.dto.ClienteCadastroDTO;
import com.gs3.evaluation.dto.ClienteDTO;
import com.gs3.evaluation.exception.ObjectAlreadyExistsException;
import com.gs3.evaluation.exception.ObjectNotFoundException;
import com.gs3.evaluation.mapper.ClienteCadastroMapper;
import com.gs3.evaluation.mapper.ClienteMapper;
import com.gs3.evaluation.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.gs3.evaluation.utils.StringValidator.isEmptyOrNull;

@RequiredArgsConstructor
@Service
public class ClienteService {

    private final ClienteRepository repository;
    private final ClienteCadastroMapper cadastroMapper;
    private final EnderecoService enderecoService;
    private final ClienteMapper clienteMapper;

    @Transactional
    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public Cliente buscarPeloId(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new ObjectNotFoundException("Cliente não localizado pelo id " + id)
        );
    }

    public void deletarPeloId(Long id) {
        repository.deleteById(id);
    }

    public Cliente salvar(ClienteCadastroDTO dto) {
        if (repository.existsByCpf(dto.getCpf())) {
            throw new ObjectAlreadyExistsException("Cliente já castrado");
        }
        Cliente cliente = cadastroMapper.toEntity(dto);
        cliente.setEndereco(enderecoService.buscarViaCep(dto.getCep()));
        if (!isEmptyOrNull(dto.getComplementoEndereco())) {
            cliente.getEndereco().setComplemento(dto.getComplementoEndereco());
        }
        return repository.save(cliente);
    }

    public Cliente editar(ClienteDTO dto) {
        return repository.save(atualizarDados(buscarPeloId(dto.getId()), clienteMapper.toEntity(dto)));
    }

    private Cliente atualizarDados(Cliente cliente, Cliente dto) {
        cliente.setEndereco(dto.getEndereco() != null ? dto.getEndereco() : cliente.getEndereco());
        cliente.setTelefones(dto.getTelefones() != null ? dto.getTelefones() : cliente.getTelefones());
        cliente.setEmails(dto.getEmails() != null ? dto.getEmails() : cliente.getEmails());
        cliente.setCpf(!isEmptyOrNull(dto.getCpf()) ? dto.getCpf() : cliente.getCpf());
        cliente.setNome(!isEmptyOrNull(dto.getNome()) ? dto.getCpf() : cliente.getNome());
        return cliente;
    }
}
