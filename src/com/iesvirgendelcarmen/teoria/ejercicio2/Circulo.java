package com.iesvirgendelcarmen.teoria.ejercicio2;

public class Circulo extends FiguraCircular {
	
	private int radio;
	
	public Circulo(int radio) {
		super("circulo", radio, radio);
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo de radio " + radio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * radio * radio;
	}

}
