package br.com.jopaulo.apispring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuario")
public class IndexController {
	
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity init() {
		return new ResponseEntity<>("Projeto Spring Boot", HttpStatus.OK);
	}

}