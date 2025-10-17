package ejemploCargaArrrays;

import utilidades.Leer;

public class EjemploCargaArrays {

	public static void main(String[] args) {
		
		int listado[];
		int tam;
		
		System.out.println("Cuantos datos vamos a tener");
		tam=Leer.datoInt();

		listado = new int [tam];
		
		for (int i=0; i<listado.length; i++) {
			System.out.println("Ingrese un numero");
			listado[i]=Leer.datoInt();
		}
		
		for (int i=0; i<listado.length; i++) {
			System.out.println("El resultado es: "+listado[i]);
		}
	}

}
