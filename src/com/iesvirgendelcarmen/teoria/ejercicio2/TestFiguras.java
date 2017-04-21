package com.iesvirgendelcarmen.teoria.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class TestFiguras {

	public static void main(String[] args) {
		Figura f1 = new Circulo(0);
	//	Figura f2 = new Figura("hola"); no se puede instanciar 
		//objetos de una clase abstracta
		List<Figura> listaFiguras = new ArrayList<>();
		listaFiguras.add(new Circulo(2));
		listaFiguras.add(new Circulo(4));
		listaFiguras.add(new Circulo(22));
		listaFiguras.add(new Elipse(2,1));
		listaFiguras.add(new Elipse(3,1));
		listaFiguras.add(new Elipse(2,5));
		imprimirFiguras(listaFiguras);
		System.out.printf("El valor medio de las áreas de las figuras "
				+ "vale %.2f%n", calcuarValorMedioAreasFiguras(listaFiguras));
		
	}
	
	public static void imprimirFiguras(List<Figura> listaFiguras){
		
		for (Figura figura : listaFiguras)
			System.out.println(figura);
	}
	
	public static double calcuarValorMedioAreasFiguras(List<Figura> listaFiguras){
		
		double valorMedio = 0.0;
		for (Figura figura : listaFiguras) 
			valorMedio += figura.calcularArea();
		return valorMedio / listaFiguras.size();
	}
	

}
