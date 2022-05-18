package com.crud.ta24.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trabajador")//en caso que la tabala sea diferente
public class Trabajador {

	//Atributos de la clase Trabajador
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "NOMBRE")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "TRABAJADOR_TIPO")//no hace falta si se llama igual
	private String trabajadorTipo;
	@Column(name = "SALARIO")//no hace falta si se llama igual
	private double salario;


	//Constructores

	public Trabajador() {
		
	}
	
	/**
	 * @param id
	 * @param NOMBRE
	 * @param TRABAJADOR_TIPO
	 * @param SALARIO
	 */
	
	public Trabajador(Long id, String nombre, String trabajadorTipo, double salario) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.trabajadorTipo = trabajadorTipo;
		this.salario = salario;
	}

	// Getters & Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajadorTipo() {
		return trabajadorTipo;
	}

	public void setTrabajadorTipo(String trabajadorTipo) {
		this.trabajadorTipo = trabajadorTipo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", trabajadorTipo=" + trabajadorTipo + ", salario="
				+ salario + "]";
	}
}
	