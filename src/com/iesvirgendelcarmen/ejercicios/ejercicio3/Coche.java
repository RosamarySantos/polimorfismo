package com.iesvirgendelcarmen.ejercicios.ejercicio3;

public  class Coche implements Vehiculo {
	
	int velocidadCoche = 0;
	int numeroPlazas = 5;
	
	
	
	@Override
	public String frenar(int velocidadADisminuir) {
		// TODO Auto-generated method stub
		velocidadCoche = velocidadCoche - velocidadADisminuir;
		if (velocidadCoche < 0)
			velocidadCoche = 0;
		return "Velocidad actual del coche: " + velocidadCoche ;
	}

	@Override
	public String acelerar(int velocidadAAumentar) {
		velocidadCoche = velocidadCoche + velocidadAAumentar;
		if (velocidadCoche > VELOCIDAD_MAXIMA)
			velocidadCoche = VELOCIDAD_MAXIMA;
		return "Velocidad actual del coche: " + velocidadCoche ;
	}
	
	int obtenerNumeroPlazas(){
		return numeroPlazas;
	}

}
