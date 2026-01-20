package ej1;

public class Electronica extends Producto{
	
	private double impuesto;

	public Electronica(double precioUnitario, String nombre, int id, double impuesto) {
		super(precioUnitario, nombre, id);
		this.impuesto = impuesto;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public String toString() {
		return "Electronica [impuesto=" + impuesto + "]";
	}

	@Override
	public double calcularPrecio() {
		
		return super.getPrecioUnitario()+impuesto;
	}
	
	

}
