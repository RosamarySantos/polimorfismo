package com.iesvirgendelcarmen.teoria.ejercicio2;

public abstract class FiguraCircular extends Figura {

	private int eje1;
	private int eje2;
		
	public FiguraCircular(String nombre, int eje1, int eje2) {
		super(nombre);
		this.eje1 = eje1;
		this.eje2 = eje2;
	}

	@Override
	public String toString() {
		return super.toString() + "\nFiguraCircular " + eje1 + ", " + eje2;
	}

	@Override
	public abstract double calcularArea();

}
