package ej1;


public class App {

	public static void main(String[] args) {
		
		
		Producto e1 = new Electronica(200,"GPU",1,25);
		Producto e2 = new Electronica(100,"CPU",2,25);
		Producto a1 = new Alimentacion(5,"Barrita Energetica",3,2,1);
		Producto a2 = new Alimentacion(20, "Chuleton", 4, 10, 4);
		
		LineaDeVenta v1 = new LineaDeVenta(e1, 2);
		LineaDeVenta v2 = new LineaDeVenta(e2, 1);
		LineaDeVenta v3 = new LineaDeVenta(a1, 5);
		LineaDeVenta v4 = new LineaDeVenta(a2, 3);
		
		LineaDeVenta lista[] = {v1, v2, v3, v4};
		
		Venta v = new Venta();
		
		for (int i = 0; i < lista.length; i++) {
			v.agregarLineaVenta(lista[i]); 
		}
		
		v.imprimirLinea(0);

	}

}
