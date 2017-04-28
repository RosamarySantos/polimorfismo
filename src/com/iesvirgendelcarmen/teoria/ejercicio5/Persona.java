package com.iesvirgendelcarmen.teoria.ejercicio5;

public class Persona implements Comparable<Persona>{

	private String nombreCompleto;
	private String dni;
	private int edad; //lo mas correcto sería la fecha nacimiento
	public Persona(String nombreCompleto, String dni, int edad) {
		this.nombreCompleto = nombreCompleto;
		this.dni = dni;
		this.edad = edad;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "\nPersona [nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", edad=" + edad + "]\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	
	//dos objeto Persona son iguales cuando el atributo dni es el mismo
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return this.edad - o.edad;
	}
	
		
	
	
}
