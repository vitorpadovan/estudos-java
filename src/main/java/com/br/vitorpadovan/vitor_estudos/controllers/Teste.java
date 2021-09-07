package com.br.vitorpadovan.vitor_estudos.controllers;

import java.sql.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teste {
	
	@GetMapping("/teste")
	public String teste() {
		return "CD/CI Completo";
	}
	
	@GetMapping("/")
	public String teste2() {
		return "CD/CI Completo";
	}
}
