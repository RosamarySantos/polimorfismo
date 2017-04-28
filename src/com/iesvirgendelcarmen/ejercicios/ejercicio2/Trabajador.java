package com.iesvirgendelcarmen.ejercicios.ejercicio2;

public abstract class Trabajador {

	private String nombreTrabajador;
	private String apellidosTrabajador; 
	
	public Trabajador(String nombreTrabajador, String apellidosTrabajador) {
		this.nombreTrabajador = nombreTrabajador;
		this.apellidosTrabajador = apellidosTrabajador;
	}
	
	protected String obtenerNombreApellidosTrabajador(){
		return apellidosTrabajador + ", " + nombreTrabajador;
	}
	
	public abstract double obtenerSueldoMensual(int diasTrabajados);
}
