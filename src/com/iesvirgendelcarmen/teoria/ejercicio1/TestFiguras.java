package com.iesvirgendelcarmen.teoria.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class TestFiguras {

	public static void main(String[] args) {
		
		List<Figura> listaFiguras = new ArrayList<>();
		listaFiguras.add(new Cuadrado(2));
		listaFiguras.add(new Cuadrado(4));
		listaFiguras.add(new Cuadrado(22));
		listaFiguras.add(new Rectangulo(2,1));
		listaFiguras.add(new Rectangulo(3,1));
		listaFiguras.add(new Rectangulo(2,5));
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
		for (Figura figura : listaFiguras) {
			if (figura instanceof Cuadrado)
				valorMedio += ((Cuadrado) figura).calcularArea();
			else
				valorMedio += ((Rectangulo) figura).calcularArea();
		}
		return valorMedio / listaFiguras.size();
	}
	

}
