package ej1;

public class Alimentacion extends Producto{
	
	private double descuento;
	private int diasParaCaducar;
	


	public Alimentacion(double precioUnitario, String nombre, int id, double descuento, int diasParaCaducar) {
		super(precioUnitario, nombre, id);
		this.descuento = descuento;
		this.diasParaCaducar = diasParaCaducar;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public int getDiasParaCaducar() {
		return diasParaCaducar;
	}

	public void setDiasParaCaducar(int diasParaCaducar) {
		this.diasParaCaducar = diasParaCaducar;
	}

	@Override
	public String toString() {
		return "Alimentacion [descuento=" + descuento + ", diasParaCaducar=" + diasParaCaducar + "]";
	}

	@Override
	public double calcularPrecio() {
		if (diasParaCaducar < 2) {
			return super.getPrecioUnitario()-descuento;
		} else {
			return super.getPrecioUnitario();
		}
		
	}
	
	

}
