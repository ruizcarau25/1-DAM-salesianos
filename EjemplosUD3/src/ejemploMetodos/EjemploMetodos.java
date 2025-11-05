package ejemploMetodos;

import utilidades.Leer;

public class EjemploMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total, num1, num2, resta, multiplicacion, division;
		Operaciones op= new Operaciones (); //Instanciar objeto
		
		System.out.println("Escriba los 2 numeros que quiera sumar");
		num1=Leer.datoInt();
		num2=Leer.datoInt();
		
		total=op.sumarParametros(num1, num2);
		resta=op.restarParametros(num1, num2);
		multiplicacion=op.multiplicarParametros(num1, num2);
		division=op.dividirParametros(num1, num2);
		
		
		
		
		//Opcion A
		//Guardo el resultado en una variable y la imprimo
		//Mejor opcion de momento
		System.out.println("Resultado: "+total);
		System.out.println("Resultado resta: "+resta);
		System.out.println("Resultado multiplicacion: "+multiplicacion);
		System.out.println("Resultado division: "+division);
		
		//Opcion B
		//Mostrar directamente en un syso
		//System.out.println("Resultado : "+op.sumarParametros(2, 7));
	}

}
