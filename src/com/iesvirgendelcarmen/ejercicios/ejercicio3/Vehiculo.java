package com.iesvirgendelcarmen.ejercicios.ejercicio3;
//hay que refactorizar mucho código
public interface Vehiculo {

	//public, static y final
	int VELOCIDAD_MAXIMA = 100;
	
	String frenar(int velocidadADisminuir);
	String acelerar(int velocidadAAumentar);
	
}
