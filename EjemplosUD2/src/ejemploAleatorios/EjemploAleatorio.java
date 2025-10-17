package ejemploAleatorios;

import java.util.Random;

import utilidades.Leer;

public class EjemploAleatorio {

	public static void main(String[] args) {
		int hasta, desde, numAleatorio, aleatorios [], tam;
		
		System.out.println("Ingrese el maximo :");
		hasta=Leer.datoInt();
		System.out.println("Ingrese el minimo: ");
		desde=Leer.datoInt();
		System.out.println("Ingrese la cantidad de numero que quiere");
		tam=Leer.datoInt();
		
		aleatorios = new int [tam];
		
		Random r = new Random(System.nanoTime());
		
		numAleatorio=r.nextInt(hasta-desde+1)+desde;

		System.out.println("Numero aleatorio: "+numAleatorio);
		
		for (int i = 0; i < aleatorios.length; i++) {
			aleatorios [i] = r.nextInt(hasta-desde+1)+desde;
		}
		
		System.out.println("Datos del array: ");
		
		for (int i = 0; i < aleatorios.length; i++) {
			System.out.println(aleatorios [i]);
		}
		
	}

}
