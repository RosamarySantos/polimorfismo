package ejercicio5;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] listaEnteros = {1,2,3,4,0};
		Extremos math = new Math3();
		System.out.printf("El valor mas pequeño de la colección es %d%n",
				math.min(listaEnteros));
		System.out.println(Arrays.toString(listaEnteros));
		double[] listaDoubles = {1.1,2,-3,4,0};
		System.out.printf("El valor mas grande de la colección es %.2f%n",
				math.max(listaDoubles));
		System.out.println(Arrays.toString(listaDoubles));

	}

}
