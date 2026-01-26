package ej1;

public class Habitacion {
	
	private double precioBase;
	private boolean ocupada;
	private String nombreCliente;
	private int numeroDias;
	private int numeroOcupantes;
	
	public Habitacion(double precioBase, boolean ocupada, String nombreCliente, int numeroDias, int numeroOcupantes) {
		super();
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.nombreCliente = nombreCliente;
		this.numeroDias = numeroDias;
		this.numeroOcupantes = numeroOcupantes;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}

	public int getNumeroOcupantes() {
		return numeroOcupantes;
	}

	public void setNumeroOcupantes(int numeroOcupantes) {
		this.numeroOcupantes = numeroOcupantes;
	}

	@Override
	public String toString() {
		return "Habitacion [precioBase=" + precioBase + ", ocupada=" + ocupada + ", nombreCliente=" + nombreCliente
				+ ", numeroDias=" + numeroDias + ", numeroOcupantes=" + numeroOcupantes + "]";
	}
	
	public double calcularPrecio() {
		return precioBase * numeroDias;
	}
	

}
