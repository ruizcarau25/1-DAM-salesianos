package ejemploObjetos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c;
		double total;
		
		System.out.println("Cual es el radio del circulo");
		double radio = Leer.datoDouble();
		c = new Circulo(radio);
		c.imprimirDatos();
		total=c.calcularAreaV2();
		System.out.println("El area es: "+total);
	}

}
