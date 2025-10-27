package ej16;

import utilidades.Leer;

public class Ej16 {

	public static void main(String[] args) {
		int opc=1;
        int suma = 0;
        int producto = 1;
        int numero;
		
		do {
            System.out.println("\n=== SUMA Y PRODUCTO DE 10 NÚMEROS ==="); 
            
            for (int i = 1; i <= 10; i++) {
                System.out.print("Ingresa el número " + i + ": ");
                numero = Leer.datoInt();

                suma += numero;  
                producto *= numero;  
            }
            

            System.out.println("\n--- RESULTADOS ---");
            System.out.println("La suma de los 10 números es: " + suma);
            System.out.println("El producto de los 10 números es: " + producto);
            

            System.out.println("Si desea salir del programa pulse 0");
            opc=Leer.datoInt();
        } while (opc!=0);
		
        System.out.println("¡Programa terminado!");

	}

}
