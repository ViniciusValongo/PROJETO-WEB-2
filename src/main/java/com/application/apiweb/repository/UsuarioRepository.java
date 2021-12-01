package com.application.apiweb.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.apiweb.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByUsuario(String usuario);
	
}