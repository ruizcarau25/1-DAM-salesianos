package ej15;

import utilidades.Leer;

public class Ej15 {

	public static void main(String[] args) {
		int tope=11, opc=1, num, resultado;
		
		do {
			System.out.println("Ingrese el numero de la tabla de multiplicar que quiere mostrar");
			num=Leer.datoInt();
			for (int i = 1; i < tope; i++) {
				resultado=num*i;
				System.out.println(num+"*"+i+"="+resultado);
			}
			System.out.println("Si quiere salir pulse 0");
			opc=Leer.datoInt();
		} while (opc!=0);
		
	}

}
