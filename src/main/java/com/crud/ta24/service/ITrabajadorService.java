package com.crud.ta24.service;

import java.util.List;

import com.crud.ta24.dto.Trabajador;
/**
 * @author Borja Montseny
 *
 */

public interface ITrabajadorService {

	//Metodos del CRUD
	public List<Trabajador> listarTrabajadores(); //Listar ALL
	
	public Trabajador guardarTrabajador(Trabajador trabajador); //Guarda un cliente. CREATE
	
	public Trabajador trabajadorXID(Long id); //Leer los datos de un trabajador. READ
	
	public List<Trabajador> listarTrabajadorNombre(String nombre); //Listar Trabajadores por campo nombre
	
	public Trabajador actualizarTrabajador(Trabajador trabajador); //Actualiza datos del trabajador. UPDATE
	
	public void eliminarTrabajador(Long id);// Elimina el trabajador. DELETE
}
