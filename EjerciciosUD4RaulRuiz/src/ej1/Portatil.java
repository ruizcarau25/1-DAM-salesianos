package ej1;

public class Portatil extends Ordenador{
	
	private boolean seguroPantalla;
	private double precioSeguro;
	
	
	public Portatil(double capacidadDisco, double frecuenciaProcesador, double precioBase, String marca,
			boolean seguroPantalla, double precioSeguro) {
		super(capacidadDisco, frecuenciaProcesador, precioBase, marca);
		this.seguroPantalla = seguroPantalla;
		this.precioSeguro = precioSeguro;
	}


	public Portatil(double capacidadDisco, double frecuenciaProcesador, double precioBase, String marca) {
		super(capacidadDisco, frecuenciaProcesador, precioBase, marca);
	}


	public boolean isSeguroPantalla() {
		return seguroPantalla;
	}


	public void setSeguroPantalla(boolean seguroPantalla) {
		this.seguroPantalla = seguroPantalla;
	}


	public double getPrecioSeguro() {
		return precioSeguro;
	}


	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}


	@Override
	public String toString() {
		return super.toString() + "Portatil [seguroPantalla=" + seguroPantalla + ", precioSeguro=" + precioSeguro + "]";
	}


	@Override
	public double calcularPVP() {
		if (seguroPantalla) {
			return super.getPrecioBase()+precioSeguro+super.getPrecioBase()*10/100;
		} else {
			return super.getPrecioBase() + super.getPrecioBase()*10/100;
		}
	}
	
	
	

}
