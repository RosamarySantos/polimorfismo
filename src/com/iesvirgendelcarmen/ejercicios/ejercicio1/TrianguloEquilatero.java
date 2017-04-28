package com.iesvirgendelcarmen.ejercicios.ejercicio1;

public class TrianguloEquilatero extends PoligonoRegular {

	
	
	public TrianguloEquilatero(int longitudLadoPoligono) {
		super("Triangulo Equilatero", 3, longitudLadoPoligono);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularAreaPoligono() {
		// TODO Auto-generated method stub
		return longitudLadoPoligono / 2.0 * Math.sqrt(5);
	}

}
