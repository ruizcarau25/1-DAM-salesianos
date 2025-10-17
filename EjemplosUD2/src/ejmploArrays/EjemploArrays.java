package ejmploArrays;


import utilidades.Leer;

public class EjemploArrays {

	public static void main(String[] args) {
		int tam;
		int listaEdades []; //Declaramos
		double precios [] = {22, 30, 40, 10, 1, 3};

		System.out.println("Cuantas edades va a guardar");
		tam=Leer.datoInt();
		listaEdades = new int [tam]; //Instanciamos
		System.out.println(listaEdades[3]);
		
		for (int i=0; i<precios.length ; i++) {
			System.out.println("Edad: "+precios[i]);
		}
			
	}

}
