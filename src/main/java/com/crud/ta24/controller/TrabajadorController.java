package com.crud.ta24.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.ta24.service.TrabajadorServiceImpl;
import com.crud.ta24.dto.Trabajador;

@RestController
@RequestMapping("/api")
public class TrabajadorController {

	@Autowired
	TrabajadorServiceImpl trabajadorServiceImpl;
	
	@GetMapping("/trabajadores")
	public List<Trabajador> listarTrabajadores(){
		return trabajadorServiceImpl.listarTrabajadores();
	}
	
	//listar Trabajadores por campo nombre
	@GetMapping("/trabajadores/nombre/{nombre}")
	public List<Trabajador> listarClienteNombre(@PathVariable(name="NOMBRE") String nombre) {
	    return trabajadorServiceImpl.listarTrabajadorNombre(nombre);
	}
	
	@PostMapping("/trabajadores")
	public Trabajador salvarTrabajador(@RequestBody Trabajador trabajador) {
		
		return trabajadorServiceImpl.guardarTrabajador(trabajador);
	}
	
	@GetMapping("/trabajadores/{id}")
	public Trabajador trabajadorXID(@PathVariable(name="PK_ID_TRABAJADOR") Long id) {
		
		Trabajador trabajador_xid = new Trabajador();
		
		trabajador_xid = trabajadorServiceImpl.trabajadorXID(id);
		
		System.out.println("Trabajador X ID: " + trabajador_xid);
		
		return trabajador_xid;
	}
	
	@PutMapping("/trabajadores/{id}")
	public Trabajador actualizarCliente(@PathVariable(name="PK_ID_TRABAJADOR")Long id,@RequestBody Trabajador trabajador) {
		
		Trabajador trabajador_seleccionado= new Trabajador();
		Trabajador trabajador_actualizado= new Trabajador();
		
		trabajador_seleccionado = trabajadorServiceImpl.trabajadorXID(id);
		
		trabajador_seleccionado.setNombre(trabajador.getNombre());
		trabajador_seleccionado.setTrabajadorTipo(trabajador.getTrabajadorTipo());
		
		trabajador_actualizado = trabajadorServiceImpl.actualizarTrabajador(trabajador_seleccionado);
		
		System.out.println("El trabajador actualizado es: "+ trabajador_actualizado);
		
		return trabajador_actualizado;
	}
	
	@DeleteMapping("/trabajadores/{id}")
	public void eleiminarCliente(@PathVariable(name="PK_ID_TRABAJADOR")Long id) {
		trabajadorServiceImpl.eliminarTrabajador(id);
	}
}
