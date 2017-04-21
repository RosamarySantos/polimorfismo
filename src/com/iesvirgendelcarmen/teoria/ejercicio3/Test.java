package com.iesvirgendelcarmen.teoria.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<>();
		Persona p1 = new Estudiante("estudiante uno", LocalDate.of(2000,12,1));
		Persona p2 = new EstudianteFP("estudianteFP1", LocalDate.of(2002,12,1), "nombreCiclo1");
		Persona p3 = new Trabajador("trabajador 1", "122222", LocalDate.of(1985,12,1));
		Persona p4 = new Estudiante("estudiante dos", LocalDate.of(2008,10,1));
		Persona p5 = new EstudianteFP("estudianteFP2", LocalDate.of(2000,1,1), "nombreCiclo1");
		Persona p6 = new Trabajador("trabajador 2", "1222223", LocalDate.of(1975,9,10));
		lista.add(p1); lista.add(p2);lista.add(p3);
		lista.add(p4); lista.add(p5);lista.add(p6);
		imprimirDatos(lista);
		List<Persona> listaMayorEdad = obtenerMayoresEdad(lista);
		System.out.println("\n\nLISTA DE MAYORES DE EDAD");
		imprimirDatos(listaMayorEdad);
	}
	
	public static void imprimirDatos(List<Persona> lista){
		
		for (Persona persona : lista) {
			System.out.println(persona.obtenerDatos());
			System.out.println("----------------------------");
		}
		
	}
	
	public static List<Persona> obtenerMayoresEdad(List<Persona> lista){
		List<Persona> listaMayorEdad = new ArrayList<>();
		for (Persona persona : lista) {
			if (persona.esMayorEdad(persona.getFechaNacimiento()))
				listaMayorEdad.add(persona);
		}
		return listaMayorEdad;
	}
	
}
