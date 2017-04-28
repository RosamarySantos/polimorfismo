package com.iesvirgendelcarmen.ejercicios.ejercicio1;


public abstract class PoligonoRegular implements Comparable<PoligonoRegular>{

	private String nombrePoligono;
	private int numeroLadosPoligono;
	protected int longitudLadoPoligono;
	
	public PoligonoRegular(String nombrePoligono, int numeroLadosPoligono, int longitudLadoPoligono) {
		if (numeroLadosPoligono > 2 && longitudLadoPoligono > 0){
			this.nombrePoligono = nombrePoligono;
			this.numeroLadosPoligono = numeroLadosPoligono;
			this.longitudLadoPoligono = longitudLadoPoligono;
		}
		else
			throw new RuntimeException("No se puede crear un polígono de esas características");
	}
	
	public int calcularPerimetroPoligono(){
		return numeroLadosPoligono * longitudLadoPoligono;
	}
	
	public abstract double calcularAreaPoligono();
	
	@Override
	public String toString() {
		return "nombrePoligono=" + nombrePoligono + ", longitudLadoPoligono=" + longitudLadoPoligono
				+ ", Perimetro=" + calcularPerimetroPoligono() + ", Area=" + calcularAreaPoligono() + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + longitudLadoPoligono;
		result = prime * result + numeroLadosPoligono;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoligonoRegular other = (PoligonoRegular) obj;
		if (longitudLadoPoligono != other.longitudLadoPoligono)
			return false;
		if (numeroLadosPoligono != other.numeroLadosPoligono)
			return false;
		return true;
	}

	@Override
	public int compareTo(PoligonoRegular o) {
		// TODO Auto-generated method stub
		return this.numeroLadosPoligono - o.numeroLadosPoligono;
	}
	
	
	
}
