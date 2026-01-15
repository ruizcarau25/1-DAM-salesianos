package ej1;

public class App {

	public static void main(String[] args) {
		Ordenador o1 = new Sobremesa(256,4.5,500,"Samsung",50);
		Ordenador o2 = new Portatil(500,4.6,700,"Asus",true,50);
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o1.calcularPVP());
		System.out.println(o2.calcularPVP());

	}

}
