package br.com.myrmidao.api.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Log", description = "Controller para logs de usuários")
@RestController
public class LogUsuariosController {
	
	@Operation(
		summary = "Retorna todos os logs.",
		description = "ENDPOINT para retornar todos os logs de todos os usuários, ordenando pelo mais recente."
	)
	@GetMapping("/api/log-usuarios")
	public ResponseEntity<List<Object>> getAll() {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(null);
	}
	
	@Operation(
		summary = "Retorna logs do usuário.",
		description = "ENDPOINT para retornar apenas os logs de um usuário específico, ordenando pelo mais recente."
	)
	@GetMapping("/api/log-usuarios/{id}")
	public ResponseEntity<List<Object>> getByIdUsuario() {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(null);
	}

}
