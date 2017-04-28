package com.iesvirgendelcarmen.ejercicios.ejercicio2;

public class  Oficial extends Trabajador{
	
	private static final double PAGA_DIARIA = 100;
	private String claseOficial;
	
	public Oficial(String nombreTrabajador, String apellidosTrabajador, String claseOficial) {
		super(nombreTrabajador, apellidosTrabajador);
		this.claseOficial = claseOficial;
	}

	@Override
	public double obtenerSueldoMensual(int diasTrabajados) {
		return PAGA_DIARIA * diasTrabajados;
	}

	public String getClaseOficial() {
		return claseOficial;
	}
	
	
}
