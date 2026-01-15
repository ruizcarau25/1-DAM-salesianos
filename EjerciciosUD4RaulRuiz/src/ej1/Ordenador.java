package ej1;

public abstract class Ordenador {
	
	private double capacidadDisco;
	private double frecuenciaProcesador;
	private double precioBase;
	private String Marca;
	
	public Ordenador(double capacidadDisco, double frecuenciaProcesador, double precioBase, String marca) {
		super();
		this.capacidadDisco = capacidadDisco;
		this.frecuenciaProcesador = frecuenciaProcesador;
		this.precioBase = precioBase;
		Marca = marca;
	}

	public Ordenador() {
		super();
	}

	public double getCapacidadDisco() {
		return capacidadDisco;
	}

	public void setCapacidadDisco(double capacidadDisco) {
		this.capacidadDisco = capacidadDisco;
	}

	public double getFrecuenciaProcesador() {
		return frecuenciaProcesador;
	}

	public void setFrecuenciaProcesador(double frecuenciaProcesador) {
		this.frecuenciaProcesador = frecuenciaProcesador;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	@Override
	public String toString() {
		return "Ordenador [capacidadDisco=" + capacidadDisco + ", frecuenciaProcesador=" + frecuenciaProcesador
				+ ", precioBase=" + precioBase + ", Marca=" + Marca + "]";
	}
	
	public abstract double calcularPVP ();
			
	
	
	

}
