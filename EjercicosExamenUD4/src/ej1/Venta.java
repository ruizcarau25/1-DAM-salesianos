package ej1;

import java.util.ArrayList;

public class Venta {
	
	private ArrayList<LineaDeVenta> lineas = new ArrayList<LineaDeVenta>();
	

	public Venta(ArrayList<LineaDeVenta> lineas) {
		super();
		this.lineas = lineas;
	}
	
	public Venta() {
		
	}


	public ArrayList<LineaDeVenta> getLineas() {
		return lineas;
	}



	public void setLineas(ArrayList<LineaDeVenta> lineas) {
		this.lineas = lineas;
	}

	
	@Override
	public String toString() {
		return "Venta [lineas=" + lineas + "]";
	}



	public void agregarLineaVenta (LineaDeVenta linea) {
		lineas.add(linea);
	}
	
	public void imprimirLinea(int num) {
		System.out.println(lineas.get(num));
	}

}
