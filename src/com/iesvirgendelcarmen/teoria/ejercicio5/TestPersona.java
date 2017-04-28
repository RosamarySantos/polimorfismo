package com.iesvirgendelcarmen.teoria.ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona("joaquin garcía", "11111111", 16);
		Persona p2 = new Persona("joaquin garcía", "21111111", 19);
		Persona p3 = new Persona("juan garcía", "11111111", 18);
		System.out.println("Comparando referencias");
		System.out.println((p1 == p2) + "  Debe devolver falso");
		System.out.println((p1 == p3) + "  Debe devolver falso");
		System.out.println((p3 == p2) + "  Debe devolver falso");
		System.out.println("Comparando objetos");
		System.out.println(p1.equals(p2) + "  Debe devolver falso");
		System.out.println(p1.equals(p3) + "  Debe devolver cierto");
		System.out.println(p3.equals(p2) + "  Debe devolver falso");
		
		//defino una colección de personas, de tipo Set
		// NO permite objetos iguales
		Set<Persona> conjuntoPersonas = new HashSet<>();
		conjuntoPersonas.add(p1);
		conjuntoPersonas.add(p2);
		conjuntoPersonas.add(p3);
		
		System.out.println("Imprimimos el conjunto de personas");
		System.out.println(conjuntoPersonas);

		//defino una colección de personas, de tipo List
		// SI permite objetos iguales
		
		List<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		
		System.out.println("Imprimimos la lista de personas sin ordenar");
		System.out.println(listaPersonas);

		//comparamos a las personas
		System.out.println("Comparamos la edad de las personas");
		System.out.println(p1.compareTo(p2) + " debe dar 3");
		System.out.println(p3.compareTo(p2) + " debe dar 1");

		System.out.println("Imprimimos la lista de personas ordenadas");
		Collections.sort(listaPersonas);
		System.out.println(listaPersonas);



	}

}
