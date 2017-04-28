package com.iesvirgendelcarmen.ejercicios.ejercicio4;

import java.util.Arrays;

public class ArrayReales implements Estadistitica {
	
	private double[] listaDoubles;
	private double[] listaOriginal;
	
	
	public ArrayReales(double[] listaDoubles) {
		
		this.listaDoubles = listaDoubles;
		listaOriginal = listaDoubles.clone();
		Arrays.sort(this.listaDoubles);
		//las referencias del original y el clon son distintas
		System.out.println(listaDoubles);
		System.out.println(listaOriginal);

	}

	@Override
	public double minimo() {
		return listaDoubles[0];
	}

	@Override
	public double maximo() {
		return listaDoubles[listaDoubles.length -1];
	}

	@Override
	public double sumatorio() {
		double suma = 0;
		for (double d : listaDoubles) {
			suma += d;
		}
		return suma;
	}

}
