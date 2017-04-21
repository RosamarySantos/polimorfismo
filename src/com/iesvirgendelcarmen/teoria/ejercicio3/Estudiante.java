package com.iesvirgendelcarmen.teoria.ejercicio3;

import java.time.LocalDate;

public class Estudiante implements Persona {
	
	private String nombreCompleto;
	private LocalDate fechaNacimiento;
	
	
	
	public Estudiante(String nombreCompleto, LocalDate fechaNacimiento) {
		this.nombreCompleto = nombreCompleto;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	@Override
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}



	@Override
	public String obtenerDatos() {
		
		return "NOMBRE COMPLETO: " + nombreCompleto +"\n" +
		"EDAD: " + Auxiliar.calcularTiempoDesdeActual(fechaNacimiento) +
		" años";
		
	}

	/*@Override
	public boolean esMayorEdad() {
	
		return Auxiliar.calcularTiempoDesdeActual(fechaNacimiento) > 17;
		
	}*/

	

}
