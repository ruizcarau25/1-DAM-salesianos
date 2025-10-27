package practica;

import java.util.Random;

import utilidades.Leer;

public class Practica {

	public static void main(String[] args) {
		int numero [], tam, max, min, numAle;
		
		System.out.println("Ingrese el tamaño del array: ");
		tam=Leer.datoInt();
		
		numero = new int [tam];
		
		System.out.println("Ingrese un minimo y un maximo");
		min=Leer.datoInt();
		max=Leer.datoInt();
		
		Random r = new Random();
		
		for (int i = 0; i < numero.length; i++) {
			numAle = r.nextInt(max-min+1)+min;
			numero[i]=numAle;
			System.out.println(numero[i]);
		}

	}

}
