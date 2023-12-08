package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "<b>Hello World! :)</b>";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "As BSMs que trabalhamos no Bootcamp da Generation são: Orientação ao futuro; Mentalidade de Crescimento; Responsabilidade Pessoal e Persistênia. ";
	}
	
	@GetMapping("/objs")
	public String objs() {
		return "Meus objetivos de aprendizagem da semana são: Bancas de dados relacionais e não-relacionais; STS; Métodos HTTP  e Revisão geral. ";
	}

}
