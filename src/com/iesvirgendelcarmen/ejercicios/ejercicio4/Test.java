package com.iesvirgendelcarmen.ejercicios.ejercicio4;

public class Test {

	public static void main(String[] args) {

		double[] lista = {1, 2, 3.2, 1, 25, 0.5};
		ArrayReales arraysRealaes = new ArrayReales(lista);
		
		System.out.printf("El valor máximo de la lista es %.2f%n",
				arraysRealaes.maximo());
		System.out.printf("El valor mínimo de la lista es %.2f%n",
				arraysRealaes.minimo());
		System.out.printf("La suma de los valores de la lista es %.2f%n",
				arraysRealaes.sumatorio());
	}

}
