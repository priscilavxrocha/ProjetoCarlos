package com.priscila.curso.demo.multa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priscila.curso.demo.multa.repository.MultaRepository;

@Service
public class MultaService {
	
	@Autowired
	private MultaRepository repository;

}
