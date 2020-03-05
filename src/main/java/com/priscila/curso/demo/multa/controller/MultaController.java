package com.priscila.curso.demo.multa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.priscila.curso.demo.multa.service.MultaService;






@Controller
@RequestMapping("/multas")
public class MultaController {
	
	@Autowired
	private MultaService service;
	
	@GetMapping
	public String multas() {
		return "multas";
	}

}
