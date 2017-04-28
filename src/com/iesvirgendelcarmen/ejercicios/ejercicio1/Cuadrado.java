package com.iesvirgendelcarmen.ejercicios.ejercicio1;

public class Cuadrado extends PoligonoRegular{

	public Cuadrado(int longitudLadoPoligono) {
		super("Cuadrado", 4, longitudLadoPoligono);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularAreaPoligono() {
		// TODO Auto-generated method stub
		return longitudLadoPoligono * longitudLadoPoligono;
	}
	
	
	

}
