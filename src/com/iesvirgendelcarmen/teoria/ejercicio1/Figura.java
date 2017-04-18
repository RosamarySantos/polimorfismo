package com.iesvirgendelcarmen.teoria.ejercicio1;

public class Figura {
	private String nombre;

	public Figura(String nombre) {
		this.nombre = nombre;
	}
	//getters y setters

	@Override
	public String toString() {
		return "Figura: " + nombre;
	}
	
}
