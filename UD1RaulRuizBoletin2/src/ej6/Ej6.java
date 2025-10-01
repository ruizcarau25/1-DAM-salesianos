package ej6;

import utilidades.Leer;

public class Ej6 {

	public static void main(String[] args) {
		/*Realizar un programa para calcular y mostrar por pantalla el sueldo de un trabajador. Se deben pedir
todos los datos necesarios por teclado. El sueldo se calcula multiplicando las horas trabajadas por el
precio de la hora "normal" más las horas extras por el precio al que se paga una hora extra (mayor que
una normal).*/
		
		double hTrabajadas, hExtras, pTrabajadas, pExtras, sueldo, fTrabajadas, fExtras;
		
		System.out.println("Vamos a calcular tu nomina");
		System.out.println("Dime cuantas horas has trabajado: ");
		hTrabajadas=Leer.datoDouble();
		System.out.println("Dime cuantas horas extras has trabajado: ");
		hExtras=Leer.datoDouble();
		System.out.println("A cuanto se pagan tus horas normales de trabajo: ");
		pTrabajadas=Leer.datoDouble();
		System.out.println("A cuanto te pagan las horas extras: ");
		pExtras=Leer.datoDouble();
		
		fTrabajadas=hTrabajadas*pTrabajadas;
		fExtras=hExtras*pExtras;
		sueldo=fTrabajadas+fExtras;
		
		System.out.printf("Tu sueldo es de : %.2f este mes",sueldo);

	}

}
