package com.mballem.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/") //contexto e'chamado root
	public String home() {
		return "home"; //so adiciona o nome da pagina sem .html
		
	}
	

}
