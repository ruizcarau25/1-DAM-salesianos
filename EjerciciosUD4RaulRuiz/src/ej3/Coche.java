package ej3;

public class Coche extends Vehiculo{

	private String marca;
	
	public Coche(int potencia, String emisiones, String marca) {
		super(potencia, emisiones);
		this.marca = marca;
	}



	@Override
	public double calcularImpuesto() {
		return super.calcularImpuesto() + super.potencia*25/100;
	}
	
	
}
