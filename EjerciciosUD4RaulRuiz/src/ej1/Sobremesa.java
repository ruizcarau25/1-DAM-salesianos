package ej1;

public class Sobremesa extends Ordenador {
	
	private double precioMontaje;

	public Sobremesa(double capacidadDisco, double frecuenciaProcesador, double precioBase, String marca,
			double precioMontaje) {
		super(capacidadDisco, frecuenciaProcesador, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}

	public Sobremesa(double capacidadDisco, double frecuenciaProcesador, double precioBase, String marca) {
		super(capacidadDisco, frecuenciaProcesador, precioBase, marca);
	}

	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}

	@Override
	public String toString() {
		return super.toString() + "Sobremesa [precioMontaje=" + precioMontaje + "]";
	}

	@Override
	public double calcularPVP() {
		return super.getPrecioBase()+super.getPrecioBase()*10/100+precioMontaje;
	}
	
	

}
