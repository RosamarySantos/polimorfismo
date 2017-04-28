package com.iesvirgendelcarmen.ejercicios.ejercicio2;

public class Tecnico extends Trabajador {
	
	private static final double PAGA_DIARIA = 200;
	private boolean titulacionSuperior;
	
	

	public Tecnico(String nombreTrabajador, String apellidosTrabajador, boolean titulacionSuperior) {
		super(nombreTrabajador, apellidosTrabajador);
		this.titulacionSuperior = titulacionSuperior;
	}



	@Override
	public double obtenerSueldoMensual(int diasTrabajados) {
		return PAGA_DIARIA * diasTrabajados;
	}

}
