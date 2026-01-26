package ej1;

public class Suite extends Habitacion {
	
	private double m2;
	private double consumo;
	
	public Suite(double precioBase, boolean ocupada, String nombreCliente, int numeroDias, int numeroOcupantes,
			double m2, double consumo) {
		super(precioBase, ocupada, nombreCliente, numeroDias, numeroOcupantes);
		this.m2 = m2;
		this.consumo = consumo;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "Suite [m2=" + m2 + ", consumo=" + consumo + "]";
	}
	
	public double calcularPrecio(double porcentaje) {
		double cien = 100;
		return super.calcularPrecio() + consumo - (super.calcularPrecio()*porcentaje/cien);
	}


	
	

}
