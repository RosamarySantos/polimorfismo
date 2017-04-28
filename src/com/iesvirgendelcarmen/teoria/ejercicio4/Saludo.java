package com.iesvirgendelcarmen.teoria.ejercicio4;
//interfaz funcional, pues solo tiene un método abstracto
//método que posteriormente hay que implementar

@FunctionalInterface
public interface Saludo {

	public String saludarAAlguienEnCastellano(String alguien);
	
	//puede haber otros métodos, pero sería default o static
	
	public default String saludarPorDefecto(){
		return "Hola";
	}
	
}
