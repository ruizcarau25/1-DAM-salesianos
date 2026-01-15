package ej3;

public class Furgoneta extends Vehiculo{
	
	private double impuestoTransporte;
	
	

	public Furgoneta(int potencia, String emisiones, double impuestoTransporte) {
		super(potencia, emisiones);
		this.impuestoTransporte = impuestoTransporte;
	}



	@Override
	public double calcularImpuesto() {
		return super.calcularImpuesto() + impuestoTransporte;
	}

}
