package ej11;

import utilidades.Leer;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double m3=1000, ls, tiempo, cantidad, minuto=60, hora=60;
		
		System.out.println("En este programa vamos a calcular cuánta agua consume tu pueblo");
		System.out.println("Ingresa el caudal del pozo");
		ls=Leer.datoDouble();
		System.out.println("Di cuantas horas permanece abierto");
		tiempo=Leer.datoDouble();
		
		cantidad=(ls*minuto*hora*tiempo)/m3;
		
		System.out.printf("La cantidad de volumen que ocupa es: %.2f m3 \n",cantidad);
		System.out.println("Gracias por utilizar este programa");
	}

}
