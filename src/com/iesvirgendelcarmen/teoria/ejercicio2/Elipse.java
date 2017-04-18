package com.iesvirgendelcarmen.teoria.ejercicio2;

public class Elipse extends FiguraCircular {

	private int ejeMenor;
	private int ejeMayor;
	public Elipse(int ejeMenor, int ejeMayor) {
		super("elipse", ejeMenor, ejeMayor);
		this.ejeMenor = ejeMenor;
		this.ejeMayor = ejeMayor;
	}
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * ejeMayor * ejeMenor;
	}
	
	
	
}
