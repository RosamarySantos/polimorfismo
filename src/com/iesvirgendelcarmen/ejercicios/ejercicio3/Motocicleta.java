package com.iesvirgendelcarmen.ejercicios.ejercicio3;
//las accesibilidades, hay algunas de tipo packages
public class Motocicleta implements Vehiculo{

	int velocidadMoto = 0;
	int numeroPlazas = 5;
	
	
	
	@Override
	public String frenar(int velocidadADisminuir) {
		// TODO Auto-generated method stub
		velocidadMoto = velocidadMoto - velocidadADisminuir;
		if (velocidadMoto < 0)
			velocidadMoto = 0;
		return "Velocidad actual de la moto: " + velocidadMoto ;
	}

	@Override
	public String acelerar(int velocidadAAumentar) {
		velocidadMoto = velocidadMoto + velocidadAAumentar;
		if (velocidadMoto > VELOCIDAD_MAXIMA)
			velocidadMoto = VELOCIDAD_MAXIMA;
		return "Velocidad actual de la moto: " + velocidadMoto ;
	}
	
	int obtenerNumeroPlazas(){
		return numeroPlazas;
	}

}
