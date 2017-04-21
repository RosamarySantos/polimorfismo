package com.iesvirgendelcarmen.teoria.ejercicio3;

import java.time.LocalDate;

public class EstudianteFP extends Estudiante {

	private String nombreCiclo;

	public EstudianteFP(String nombreCompleto, LocalDate fechaNacimiento, String nombreCiclo) {
		super(nombreCompleto, fechaNacimiento);
		this.nombreCiclo = nombreCiclo;
	}

	@Override
	public String obtenerDatos() {
		// TODO Auto-generated method stub
		return super.obtenerDatos() + "\n" + 
					"NOBRE DE CICLO: " + nombreCiclo;
	}
	
	
	
}
