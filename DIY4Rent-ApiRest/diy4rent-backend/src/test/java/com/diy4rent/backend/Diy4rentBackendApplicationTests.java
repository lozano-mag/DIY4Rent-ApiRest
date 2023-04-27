package com.diy4rent.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;


import com.diy4rent.backend.model.Herramienta;
import com.diy4rent.backend.repository.HerramientaRepository;

import com.diy4rent.backend.model.Usuario;
import com.diy4rent.backend.repository.UsuarioRepository;

@SpringBootTest
class Diy4rentBackendApplicationTests {
	
    @Autowired
    private HerramientaRepository herramientaRepository;
    
    @Autowired
    private UsuarioRepository usuarioRepository;

	@Test
	void testHerramienta() {
	}

}
