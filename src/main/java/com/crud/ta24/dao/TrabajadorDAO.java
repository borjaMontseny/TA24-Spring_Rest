package com.crud.ta24.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.ta24.dto.Trabajador;

/*
 * @author Borja Montseny
 */

public interface TrabajadorDAO extends JpaRepository<Trabajador, Long>{
	
	//Listar clientes or campo nombre
	public List<Trabajador> findByNombre(String nombre);
	
}