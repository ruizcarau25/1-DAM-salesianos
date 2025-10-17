package doWhile;

import utilidades.Leer;

public class DoWhile {

	public static void main(String[] args) {
		int opncion;
		
		do {
			System.out.println("\nPulse 0 para salir del programa");
			System.out.println("\nSi quiere un chiste pulse 1");
			System.out.println("\nSi quiere un refran pulse 2");
			opncion=Leer.datoInt();
			
			switch (opncion) {
			case 0:
				System.out.println("Gracias por usar el programa");
				break;
			case 1:
				System.out.println("Que es rojo y malo para los dientes");
				System.out.println("Un ladrillo :)");
				break;
				
			case 2:
				System.out.println("A buen entendedor, pocas palabras bastan");
				break;

			default:
				System.out.println("Error al introducir datos");
				break;
			}
			
		} while(opncion!=0);
	}

}
