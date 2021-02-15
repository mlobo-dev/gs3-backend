package com.gs3.evaluation.service;


import com.gs3.evaluation.domain.Usuario;
import com.gs3.evaluation.exception.ObjectNotFoundException;
import com.gs3.evaluation.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.security.auth.message.AuthException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;


    public Usuario buscarPeloId(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado pelo id " + id));
    }

    public Usuario autenticar(String login, String senha) throws AuthException {
        Optional<Usuario> usuario = repository.findByLogin(login);
        if (!usuario.isPresent()) {
            throw new AuthException("Usuário não encontrado: ");
        }

        if (!usuario.get().getSenha().equals(senha)) {
            throw new AuthException("Senha Inválida.");
        }
        return usuario.get();
    }
}
