package com.iesvirgendelcarmen.teoria.ejercicio1;

public class Figura4Lados extends Figura {
	private int lado1;
	private int lado2;
	private int lado3;
	private int lado4;
	public Figura4Lados(String nombre, int lado1, int lado2, 
			int lado3, int lado4) {
		super(nombre);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	@Override
	public String toString() {
		return super.toString() + "\nFigura4Lados: " + lado1 + ", " + lado2 + ", "
				+ lado3 + ", " + lado4;
	}
	
}
