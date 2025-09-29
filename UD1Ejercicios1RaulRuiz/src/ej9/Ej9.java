package ej9;

import utilidades.Leer;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int navas, capacidad;
		String nombreP, lugar;
		double total;
		
		System.out.println("Introduce el nombre de tu pueblo");
		nombreP=Leer.dato();
		System.out.println("Introduce el número de habitantes de tu pueblo");
		navas=Leer.datoInt();
		System.out.println("Introduce el nombre del lugar");
		lugar=Leer.dato();
		System.out.println("Introduce la capacidad del lugar");
		capacidad=Leer.datoInt();
		
		total=(double)capacidad/navas;
		System.out.printf("\nEn %s caben %.2f veces la capacidad de %s",lugar,total,nombreP);
		System.out.println("Gracias por utilizar este programa");
	}

}
