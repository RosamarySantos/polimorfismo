package com.iesvirgendelcarmen.teoria.ejercicio4;

public class TestSaludo {

	public static void main(String[] args) {
		
		Saludo saludo1 = new SaludoCorrecto();
		String sal1 = saludo1.saludarAAlguienEnCastellano("pepe");
		String sal2 = saludo1.saludarPorDefecto();
		Saludo saludo2 = new SaludoInformal();
		String sal3 = saludo2.saludarAAlguienEnCastellano("pepe");
		System.out.println(sal1);
		System.out.println(sal2);
		System.out.println(sal3);
		//usando expresiones lambda
		Saludo saludo3 = (nombre) -> "!Eh¡ " + nombre;
		String sal4 = saludo3.saludarAAlguienEnCastellano("pepe");
		System.out.println(sal4);


	}

}
