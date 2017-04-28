package com.iesvirgendelcarmen.ejercicios;

import com.iesvirgendelcarmen.ejercicios.ejercicio1.PoligonoRegular;

public class Hexagono extends PoligonoRegular {

	
	
	public Hexagono(int longitudLadoPoligono) {
		super("Hexágono", 6, longitudLadoPoligono);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularAreaPoligono() {
		// TODO Auto-generated method stub
		return 3.0 * Math.sqrt(3) * Math.pow(longitudLadoPoligono, 2) / 2.0;
	}

}
