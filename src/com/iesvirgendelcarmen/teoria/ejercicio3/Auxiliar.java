package com.iesvirgendelcarmen.teoria.ejercicio3;

import java.time.LocalDate;
import java.time.Period;

public class Auxiliar {
	public static int calcularTiempoDesdeActual(LocalDate fecha){
		LocalDate hoy = LocalDate.now();
		Period p = Period.between(fecha, hoy);
		return p.getYears();
	}
}
