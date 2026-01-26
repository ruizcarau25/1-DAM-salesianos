package ej1;

public class Apartamento extends Habitacion {
	
	private double servicioLimpieza;

	public Apartamento(double precioBase, boolean ocupada, String nombreCliente, int numeroDias, int numeroOcupantes,
			double servicioLimpieza) {
		super(precioBase, ocupada, nombreCliente, numeroDias, numeroOcupantes);
		this.servicioLimpieza = servicioLimpieza;
	}

	public double getServicioLimpieza() {
		return servicioLimpieza;
	}

	public void setServicioLimpieza(double servicioLimpieza) {
		this.servicioLimpieza = servicioLimpieza;
	}

	@Override
	public String toString() {
		return "Apartamento [servicioLimpieza=" + servicioLimpieza + "]";
	}
	
	public double calcularPrecio() {
		return super.calcularPrecio()+servicioLimpieza;
	}

}
