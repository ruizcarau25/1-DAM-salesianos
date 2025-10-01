package ej6;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precio=200, descuento=20, dem=100, precioFinal, precioDesc;
		System.out.println("Bienvenido al programa vamos a hacer un descuento");
		precioDesc=precio*descuento/dem;
		precioFinal=precio-precioDesc;
		System.out.println("El precio despues del descuento es: "+precioFinal);
	}

}
