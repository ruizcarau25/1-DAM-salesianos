package ejemploFor;

import utilidades.Leer;

public class EjemploFor {

	public static void main(String[] args) {
		int tope;
		String frase;
		
		System.out.println("Que frase quieres decir");
		frase=Leer.dato();
		
		System.out.println("Cuantas veces quieres repetir la frase ");
		tope=Leer.datoInt();
		
		for(int i=0; i<tope; i++) {
			
			System.out.println((i+1)+" "+frase);
			
		}

	}

}
