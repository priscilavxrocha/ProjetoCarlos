package com.priscila.curso.demo.multa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priscila.curso.demo.multa.model.Multa;

public interface MultaRepository extends JpaRepository<Multa, Long>{

}
