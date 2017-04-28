package com.iesvirgendelcarmen.ejercicios.ejercicio3;

public class TestVehiculos {

	public static void main(String[] args) {
		
		Vehiculo coche1 = new Coche();
		System.out.println(coche1.acelerar(25));
		System.out.println(coche1.frenar(12));
		System.out.println(coche1.acelerar(225));

		Vehiculo moto1 = new Motocicleta();
		System.out.println(moto1.acelerar(85));
		System.out.println(moto1.frenar(11));
		System.out.println(moto1.acelerar(22));

	}

}
