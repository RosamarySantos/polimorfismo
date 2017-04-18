package com.iesvirgendelcarmen.teoria.ejercicio1;

public class Cuadrado extends Figura4Lados {
	private int lado;

	public Cuadrado(int lado) {
		super("cuadrado", lado, lado, lado, lado);
		this.lado = lado;
	}
	
	public int calcularArea(){
		return lado * lado;
	}

	@Override
	public String toString() {
		return "Cuadrado de lado " + lado;
	}
	
	
}
