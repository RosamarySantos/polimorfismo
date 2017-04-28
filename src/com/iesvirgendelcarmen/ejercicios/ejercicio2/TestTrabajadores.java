package com.iesvirgendelcarmen.ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class TestTrabajadores {

	public static void main(String[] args) {
		
		List<Trabajador> listaTrabajadores = new ArrayList<>();
		listaTrabajadores.add(new Oficial("josé", "carrillo", "oficial primera"));
		listaTrabajadores.add(new Oficial("jacinto", "pedrosa", "oficial segunda"));
		listaTrabajadores.add(new Oficial("maría", "valverde", "oficial primera"));
		listaTrabajadores.add(new Tecnico("josé", "molina", true));
		listaTrabajadores.add(new Tecnico("rocío", "cárdenas", true));
		listaTrabajadores.add(new Tecnico("vicenta", "muñoz", false));
		imprimirDatosTrabajadores(listaTrabajadores);
		
	}
	
	public static void imprimirDatosTrabajadores(List<Trabajador> listaTrabajadores){
		for (Trabajador trabajador : listaTrabajadores) {
			System.out.println(trabajador.obtenerNombreApellidosTrabajador());
			if (trabajador instanceof Oficial)
				System.out.println("CLASE: " + ((Oficial) trabajador).getClaseOficial());
		}
	}
}
