package com.iesvirgendelcarmen.ejercicios.ejercicio1;

import com.iesvirgendelcarmen.ejercicios.Hexagono;

public class TestPoligonoRegular {

	public static void main(String[] args) {
		
		ListaPoligonoRegular lista = new ListaPoligonoRegular();
		
		PoligonoRegular p1 = new TrianguloEquilatero(10);
		PoligonoRegular p2 = new TrianguloEquilatero(11);
		PoligonoRegular p3 = new TrianguloEquilatero(11);
		PoligonoRegular p4 = new Cuadrado(2);
		PoligonoRegular p5 = new Cuadrado(3);
		PoligonoRegular p6 = new Cuadrado(11);
		PoligonoRegular p7 = new Hexagono(6);
		PoligonoRegular p8 = new Hexagono(6);
		PoligonoRegular p9 = new Hexagono(4);
		
		lista.annadirPoligono(p1);
		lista.annadirPoligono(p2);
		lista.annadirPoligono(p3);
		lista.annadirPoligono(p4);
		lista.annadirPoligono(p5);
		lista.annadirPoligono(p6);
		lista.annadirPoligono(p7);
		lista.annadirPoligono(p8);
		lista.annadirPoligono(p9);

		
		System.out.println(lista);

		System.out.println("------------------------");
		System.out.println(p2.equals(p3) + "  debe devolver true");
		System.out.println(p2.equals(p6) + "  debe devolver false");
		System.out.println("------------------------");
		System.out.println(p2.compareTo(p3) + "  debe devolver 0");
		System.out.println(p2.compareTo(p6) + "  debe devolver -1");

	}

}
