package ej2;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables piscina olimpica
		double largoOlim=50, anchoOlim=21, profOlim=2.5, volumRectangular;
		//Variables piscina circular 
		double radio=12, profCircular=1.8, volumCircular;
		//Precio
		double m3=1.8, precioRectangular, precioCircular;
		
		System.out.println("Te voy a dar el valor de 2 piscinas :)");
		volumRectangular=largoOlim*anchoOlim*profOlim;
		System.out.println("El Volumen de la piscina olimpica es: "+volumRectangular);
		volumCircular=Math.PI*Math.pow(radio, 2)*profCircular;
		System.out.printf("El Volumen de la piscina circular es: %.2f ",volumCircular);
		System.out.println(" ");
		
		System.out.println("Ahora vamos a calcular el precio por m3");
		precioRectangular=volumRectangular*m3;
		System.out.println("El precio de llenar la piscina rectangular es: "+precioRectangular);
		precioCircular=volumCircular*m3;
		System.out.println("El precio de llenar la piscina circular es: "+precioCircular);
		
		
	}

}
