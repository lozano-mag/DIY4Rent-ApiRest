package com.diy4rent.backend.services;

import com.diy4rent.backend.model.Usuario;
import com.diy4rent.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario getUser(String email) throws UsernameNotFoundException {
        Usuario user = usuarioRepository.findByCorreo(email);

        return user;
    }
}
