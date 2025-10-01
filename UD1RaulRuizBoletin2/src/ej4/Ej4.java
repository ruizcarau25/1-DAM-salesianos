package ej4;

import utilidades.Leer;

public class Ej4 {

	public static void main(String[] args) {
		/*Calcular la edad de una persona en días. Se usará una variable edad cuyo valor leeremos por teclado y
		mostraremos por pantalla el número de días suponiendo que todos los años tienen 365 días*/
		int edad, año=365, total;
		
		System.out.println("Ingrese su edad");
		edad=Leer.datoInt();
		
		total=edad*año;
		
		System.out.printf("Usted ha vivido %d dias",total);

	}

}
