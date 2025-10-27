package ej2;

import utilidades.Leer;

public class Ej2 {

	public static void main(String[] args) {
		double num1, num2, resultado;
		
		System.out.println("Ingrese numero 1");
		num1=Leer.datoInt();
		System.out.println("Ingrese numero 2");
		num2=Leer.datoInt();
		
		resultado=num1/num2;
		
		if (num2==0) {
			System.out.println("La division no es posible");
		} else {
			System.out.printf("El resultado es: %.2f",resultado);
		}
	}

}
