package com.iesvirgendelcarmen.ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ListaPoligonoRegular {

	private List<PoligonoRegular> listaPoligonosRegulares = new ArrayList<>();
	
	public boolean annadirPoligono(PoligonoRegular p){
		return listaPoligonosRegulares.add(p);
	}

	@Override
	public String toString() {
		return listaPoligonosRegulares.toString();
	}
	
	
}
