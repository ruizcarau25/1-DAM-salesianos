package ej10;

import utilidades.Leer;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precio, descuento=3, cien=100, total, precioDes, precioFinal;
		int cantidad;
		
		System.out.println("Bienvenido al programa de pagos");
		System.out.println("Ingrese el precio del producto: ");
		precio=Leer.datoDouble();
		System.out.println("Ingrese la cantidad del producto: ");
		cantidad=Leer.datoInt();
		
		total=precio*cantidad;
		precioDes=total*descuento/cien;
		precioFinal=total-precioDes;
		
		System.out.println("----------------------");
		System.out.println("Gracias por su compra");
		System.out.println("----------------------");
		System.out.printf("Subtotal: %.2f \n", total);
		System.out.printf("Descuento: %.2f \n", precioDes);
		System.out.printf("Total: %.2f \n", precioFinal);
	}

}
