package br.com.myrmidao.api.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(name = "Usuarios", description = "Controller para usuários")
@RestController
public class UsuariosController {

	@Operation(
		summary = "Cadastro de usuários.",
		description = "ENDPOINT para cadastro de usuários."
	)
	@PostMapping("/api/usuarios")
	public ResponseEntity<Object> post() {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(null);
	}
	
	@Operation(
		summary = "Atualização de usuários.",
		description = "ENDPOINT para atualização de usuários."
	)
	@PutMapping("/api/usuarios")
	public ResponseEntity<Object> put() {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(null);
	}
	
	@Operation(
		summary = "Consulta de usuários.",
		description = "ENDPOINT para consulta de usuários."
	)
	@GetMapping("/api/usuarios")
	public ResponseEntity<List<Object>> getAll() {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(null);
	}
	
	@Operation(
		summary = "Consulta de um usuário.",
		description = "ENDPOINT para consulta de um usuário específico, através de seu id."
	)
	@GetMapping("/api/usuarios/{id}")
	public ResponseEntity<Object> getById() {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(null);
	}
	
}
