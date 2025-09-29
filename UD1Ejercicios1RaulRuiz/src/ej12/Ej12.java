package ej12;


import utilidades.Leer;

public class Ej12 {

	public static void main(String[] args) {
		// Variables
		String producto1, producto2, producto3, nombreEmple="John snow", fecha="29/09/25";
		double preciop1, preciop2, preciop3, totalp1, totalp2, totalp3, descuento=0, totalabsoluto, entregado, devolucion;
		int cantidadp1, cantidadp2, cantidadp3;
		
		//Datos ingresados
		System.out.println("Bienvenido al programa de auto cobro");
		
		System.out.println("Ingrese el nombre del primer producto");
		producto1=Leer.dato();
		System.out.println("Ingrese el nombre del segundo producto");
		producto2=Leer.dato();
		System.out.println("Ingrese el nombre del tercer producto");
		producto3=Leer.dato();
		
		System.out.println("Ingrese el precio del primer producto");
		preciop1=Leer.datoDouble();
		System.out.println("Ingrese el precio del segundo producto");
		preciop2=Leer.datoDouble();
		System.out.println("Ingrese el precio del tercer producto");
		preciop3=Leer.datoDouble();
		
		System.out.println("Ingrese la cantidad del primer producto");
		cantidadp1=Leer.datoInt();
		System.out.println("Ingrese la cantidad del segundo producto");
		cantidadp2=Leer.datoInt();
		System.out.println("Ingrese la cantidad del tercer producto");
		cantidadp3=Leer.datoInt();
		
		System.out.println("Dinero entregado");
		entregado=Leer.datoDouble();
		
		//Calculos
		totalp1=preciop1*cantidadp1;
		totalp2=preciop2*cantidadp2;
		totalp3=preciop3*cantidadp3;
		totalabsoluto=totalp1+totalp2+totalp3;
		devolucion=entregado-totalabsoluto;
		
		
		//Ticket
		System.out.println("Tienda salesianos Triana");
		System.out.println("------------------------");
		System.out.println("Le atendió: "+nombreEmple);
		System.out.println("Fecha:      "+fecha);
		System.out.println("------------------------");
		System.out.println("Nombre  Unidades  P/U  Descuento  Subtotal");
		System.out.println("******************************************");
		System.out.printf("%s  %d  %.2f \t %.2f \t %.2f \n",producto1,cantidadp1,preciop1,descuento,totalp1);
		System.out.printf("%s \t %d  %.2f \t %.2f \t %.2f \n",producto2,cantidadp2,preciop2,descuento,totalp2);
		System.out.printf("%s \t %d  %.2f \t %.2f \t %.2f \n",producto3,cantidadp3,preciop3,descuento,totalp3);
		System.out.println("******************************************");
		System.out.printf("\t \t \tSubtotal: %.2f\n",totalabsoluto);
		System.out.printf("\t \t \tEntregado: %.2f\n",entregado);
		System.out.printf("\t \t \tDevolución %.2f\n",devolucion);
		
	}

}
