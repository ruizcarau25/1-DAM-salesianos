package ejPoliformismo;

public class Cuadrado extends Figura {
	
	private double lado;

	public Cuadrado(String nombre, String color, double lado) {
		super(nombre, color);
		this.lado = lado;
	}

	public Cuadrado(String nombre, String color) {
		super(nombre, color);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return super.toString() + "Cuadrado [lado=" + lado + "]";
	}

	@Override
	public double calcularArea() {
		return lado*lado;
	}

	@Override
	public double calcularPerimetro() {
		return lado*4;
	}
	
	
	

}
