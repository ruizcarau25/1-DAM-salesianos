package ej3;

public class Vehiculo {
	
	public int potencia;
	public String emisiones;

	
	public Vehiculo(int potencia, String emisiones) {
		super();
		this.potencia = potencia;
		this.emisiones = emisiones;
	}



	public int getPotencia() {
		return potencia;
	}



	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}



	public String getEmisiones() {
		return emisiones;
	}



	public void setEmisiones(String emisiones) {
		this.emisiones = emisiones;
	}



	public double calcularImpuesto() {
		switch (emisiones.toUpperCase()) {
		case "CERO": {
			return 0.0;
		}
		case "ECO": {
			return 50.0;
		}
		case "B": {
			return 100.0;
		}
		case "C": {
			return 150.0;
		}
		default:
			return -1;
		}
		
	}
	

}
