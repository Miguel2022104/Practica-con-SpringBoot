package com.example.practica;

import com.example.practica.model.Usuario;
import com.example.practica.repository.UsuarioRepository;
import com.example.practica.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UsuarioServiceTest {

    @Autowired
    UsuarioService service;

    @Autowired
    UsuarioRepository repo;

    @Test
    void guardaUsuario() {
        Usuario u = new Usuario();
        u.setNombre("Miguel");

        service.crearUsuario(u);

        assertEquals(1, repo.count());
    }

    @Test
    void rollbackSiFalla() {
        Usuario u = new Usuario();
        u.setNombre("error");

        assertThrows(RuntimeException.class,
                () -> service.crearUsuarioConError(u));

        assertEquals(0, repo.count());
    }
}
