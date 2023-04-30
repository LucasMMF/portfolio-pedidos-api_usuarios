package br.com.myrmidao.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Autenticar", description = "Controller autenticação de usuários.")
@RestController
public class AutenticarController {

	@Operation(
		summary = "Autenticação de usuários.",
		description = "ENDPOINT para autenticação de usuários."
	)
	@PostMapping("/api/autenticar")
	public ResponseEntity<Object> post() {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(null);
	}
	
}
