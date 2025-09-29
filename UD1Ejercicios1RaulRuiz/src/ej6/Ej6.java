package ej6;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		double precio=200;
		double descuento=20;
		double precioFinal;
		double den=100;
		
		System.out.println("Bienvenido vamos a hacer el 20% de descuento de un producto ");
		descuento=descuento*precio/den;
		precioFinal=precio-descuento;
		System.out.println("El precio final es: "+precioFinal);
	}

}
