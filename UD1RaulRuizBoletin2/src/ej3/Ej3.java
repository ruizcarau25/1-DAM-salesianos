package ej3;

import utilidades.Leer;

public class Ej3 {

	public static void main(String[] args) {
		/*Realizar un programa que lea por teclado un valor correspondiente a una distancia en millas marinas
(con decimales) y las escriba expresadas en metros. Sabiendo que 1 milla marina equivale a 1852
metros.*/

		double millas, metros=1852, total;
		
		System.out.println("Ingrese las millas : ");
		millas=Leer.datoDouble();
		
		total=millas*metros;
		
		System.out.printf("Equivale a %.2f metros",total);
	}

}
