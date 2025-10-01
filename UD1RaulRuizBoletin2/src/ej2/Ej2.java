package ej2;

import utilidades.Leer;

public class Ej2 {

	public static void main(String[] args) {
		/*Realizar un programa que lea un valor entero por teclado y muestre por pantalla su doble, su triple y
su mitad.*/
		double num, doble, triple, mitad, dos=2, tres=3;
		
		System.out.println("Ingresa un numero");
		num=Leer.datoDouble();
		
		doble=num*dos;
		triple=num*tres;
		mitad=num/dos;
		
		System.out.printf("El doble del numero es: %.2f\n El triple es: %.2f\n La mitad es: %.2f",doble,triple,mitad);
				
		
	}

}
