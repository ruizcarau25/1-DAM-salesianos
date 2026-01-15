package ej3;

public class App {

	public static void main(String[] args) {
		Vehiculo m1 = new Motocicletas(45,"ECO",400);
		Vehiculo c1 = new Coche(90,"CERO", "Opel");
		Vehiculo f1 = new Furgoneta(150,"B",200);
		
		System.out.println(m1.calcularImpuesto());
		System.out.println(c1.calcularImpuesto());
		System.out.println(f1.calcularImpuesto());

	}

}
