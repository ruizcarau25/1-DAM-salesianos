package ej1;

import utilidades.Leer;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		
		System.out.println("Ingrese el primer numero");
		num1=Leer.datoInt();
		System.out.println("Ingrese el segundo numero");
		num2=Leer.datoInt();
		
		if (num1 > num2) {
			System.out.printf("%d es mayor que %d \n",num1,num2);
		} if (num1 == num2) {
			System.out.println("Son iguales");
		} else {
			System.out.printf("%d es mayor que %d \n",num2,num1);
		}
	}

}
