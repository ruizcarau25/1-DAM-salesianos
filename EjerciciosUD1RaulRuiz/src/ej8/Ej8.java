package ej8;

import utilidades.Leer;

public class Ej8 {

	public static void main(String[] args) {
		/* Haz un programa que calcule la longitud de una circunferencia de radio 3 metros y el área de un círculo 
		de radio 5.2 metros. Puedes hacer infinidad de ejercicios como este con fórmulas matemáticas como 
		áreas, volúmenes, teoremas (Pitágoras, por ejemplo), etc. */
		double longitud, radio1, dos=2, radio2, area;
		
		//Primer circulo
		System.out.println("Bienvenido al programa de calculos vamos a medir la longitud de una circunferencia");
		System.out.println("Ingrese el radio de la circunferencia: ");
		radio1=Leer.datoDouble();
		
		longitud=dos*Math.PI*radio1;
	
		System.out.printf("La longitud de la primera circunferencia es: %.2f \n \n", longitud);
		
		
		//Segundo circulo
		System.out.println("Ahora vamos a calcular el area de un circulo");
		System.out.println("Ingresa el radio del circulo: ");
		radio2=Leer.datoDouble();
		
		area=Math.PI*Math.pow(radio2, 2);
		
		System.out.printf("El area del circulo es: %.2f", area);
		
	}

}
