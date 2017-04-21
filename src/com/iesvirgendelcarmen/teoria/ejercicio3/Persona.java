package com.iesvirgendelcarmen.teoria.ejercicio3;

import java.time.LocalDate;

public interface Persona {
	String obtenerDatos();
	LocalDate getFechaNacimiento();
	//en java 8 se permite implementar métodos denominados default
	//puede haber todos los que necesitemos. 
	//No es obligatorio que exita uno.
	default boolean esMayorEdad(LocalDate fechaNacimiento){
		return Auxiliar.calcularTiempoDesdeActual(fechaNacimiento) > 17;
	};
}
