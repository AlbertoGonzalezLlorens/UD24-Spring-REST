package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

enum Trabajo {Jefe,Programador,Becario}

@Entity
@Table(name="empleado")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "trabajo")
	private String trabajo;
	@Column(name = "salario")
	private double salario;
	private String trabajo2;

	
	public Empleado() {
	
	}

	public Empleado(Long id, String nombre, String apellido, String trabajo) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		trabajo2= comprobarTrabajo(trabajo);
		this.trabajo=trabajo2;
		setSalarioTrabajo(trabajo2);
	}

	
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		trabajo2 = comprobarTrabajo(trabajo);
		this.trabajo=trabajo2;
		setSalarioTrabajo(trabajo2);
		
	}

	public double getSalario() {
		return this.salario;
	}
	
	public String comprobarTrabajo(String trabajo) {
		
		for (Trabajo t : Trabajo.values()) {
			if (t.name().equals(trabajo)) {
				return trabajo;
			}
		}
		
		return(""+Trabajo.Becario);
	}
	
	public void setSalarioTrabajo(String trabajo) {
		switch (trabajo) {
			case "Jefe": 
				this.salario = 50000;
				break;
			case "Programador":
				this.salario = 25000;
				break;
			case "Becario":
				this.salario = 10000;
				break;	
		}
			
		/*if (trabajo.Jefe) {
			this.salario = 50000;
		} else if (trabajo.equals("Programador")) {
			this.salario = 25000;
		} else {
			this.salario = 10000;
		}*/
		
	}
	
	public void setSalario(double salario) {
		this.salario = salario;	
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", trabajo=" + trabajo
				+ ", salario=" + salario + "]";
	}
	
	
	
	
	
}