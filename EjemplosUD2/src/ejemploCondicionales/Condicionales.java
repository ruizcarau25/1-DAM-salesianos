package ejemploCondicionales;

import utilidades.Leer;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad, mayoria=18;
		
		System.out.println("Hola diga su edad");
		edad=Leer.datoInt();
		
		if (edad>=mayoria) {
			System.out.println("Puedes entrar");
		} else {
			System.out.println("No puede entrar");
		}
	}

}
