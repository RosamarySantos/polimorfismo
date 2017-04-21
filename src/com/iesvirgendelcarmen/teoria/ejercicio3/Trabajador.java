package com.iesvirgendelcarmen.teoria.ejercicio3;

import java.time.LocalDate;

public class Trabajador implements Persona {
	
	private String nombreCompleto;
	private String naas; //nº afiliacion a la Seguridad Social
	//private String nAfiliacionSS
	private LocalDate fechaNacimiento;

	public Trabajador(String nombreCompleto, String naas, LocalDate fechaNacimiento) {
		this.nombreCompleto = nombreCompleto;
		this.naas = naas;
		this.fechaNacimiento = fechaNacimiento;
	}

	
	@Override
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}



	@Override
	public String obtenerDatos() {
		// TODO Auto-generated method stub
		return "NOMBRE COMPLETO: " + nombreCompleto + "\n" + 
				"Nº AFILIACION SS: " + naas;
	}

	

	/*@Override
	public boolean esMayorEdad() {
		return Auxiliar.calcularTiempoDesdeActual(fechaNacimiento) > 17;
	}*/

}
