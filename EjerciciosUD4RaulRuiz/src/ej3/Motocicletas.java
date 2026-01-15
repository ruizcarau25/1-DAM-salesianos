package ej3;

public class Motocicletas extends Vehiculo{
	
	private int cilindrada;



	public Motocicletas(int potencia, String emisiones, int cilindrada) {
		super(potencia, emisiones);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public double calcularImpuesto() {
		return super.calcularImpuesto() + cilindrada*60/100;
		
	}
	
	
	

}
