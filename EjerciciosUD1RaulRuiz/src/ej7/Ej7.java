package ej7;

import claseleer.Leer;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kmRecorridos, precioGas, valorFinal, consumo=7.5;
		
		System.out.println("Inserte el numero de km recorridos durante el viaje");
		kmRecorridos=Leer.datoDouble();
		System.out.println("Inserte el precio de la gasolina");
		precioGas=Leer.datoDouble();
		
		valorFinal=(kmRecorridos/consumo)*precioGas;
		
		System.out.printf("El precio del viaje ha sido: %.2f",valorFinal);
	}

}
