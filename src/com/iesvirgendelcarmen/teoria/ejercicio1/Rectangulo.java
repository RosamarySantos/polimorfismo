package com.iesvirgendelcarmen.teoria.ejercicio1;

public class Rectangulo extends Figura4Lados{
	private int lado1;
	private int lado2;
	public Rectangulo(int lado1, int lado2) {
		super("rectángulo", lado1, lado2, lado1, lado2);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public int calcularArea(){
		return lado1 * lado2;
	}
	
	
}
