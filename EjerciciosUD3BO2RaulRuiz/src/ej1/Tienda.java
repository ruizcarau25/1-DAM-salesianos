package ej1;

import java.util.Arrays;

public class Tienda {
	
	private Producto productos [];

	public Tienda(ej1.Producto[] producto) {
		super();
		this.productos = producto;
	}

	public Producto[] getProducto() {
		return productos;
	}

	public void setProducto(Producto[] producto) {
		productos = producto;
	}

	@Override
	public String toString() {
		return "Tienda [Producto=" + Arrays.toString(productos) + "]";
	}
	
	public String listarProductos() {
		String lista = "";
		for (int i = 0; i < productos.length; i++) {
			if (productos[i]!=null) {
				lista += productos[i].getNombre() + "\n";
			}	
		}
		return lista;
	}
	
	public boolean esFragil(int posicion) {
	    if (posicion < 0 || posicion >= productos.length) {
	        System.out.println("Posición inválida.");
	        return false;
	    }
	    if (productos[posicion] == null) {
	        System.out.println("No hay producto en esa posición.");
	        return false;
	    }
	    return productos[posicion].isFragil();
	}
	
	public void agregarProducto (Producto p) {
		for (int i = 0; i < productos.length; i++) {
			if (productos [i]==null) {
				productos[i]=p;	
				return;
			}
		}
		
	}
	
	public double calcularCantidad(int posicion) {
	    if (posicion < 0 || posicion >= productos.length || productos[posicion] == null) {
	        System.out.println("Posición inválida o sin producto.");
	        return 0;
	    }

	    Producto p = productos[posicion];
	    return p.getPrecio() * p.getCantidad();
	}
	
	
	public double calcularGanancias (double porcentaje) {
		double venta=0;
		double fabrica=0;
		
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {
				fabrica += productos[i].getPrecio() * productos[i].getCantidad();
				venta += productos[i].calcularPVP(porcentaje) * productos[i].getCantidad();
			}
		}
		
		return venta-fabrica;
	}

}
