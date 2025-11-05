package ejemploObjetos;

public class Circulo {
	private double radio; //Atributo
	
	//Constructor con parametros
	
	public Circulo (double radio) {  //Radio es una variable, esta en marron
		this.radio=radio;
	}
	
	public void imprimirDatos() {
		System.out.println("Valores: "+radio);
	}
	
	public double calcularArea() {
		double area=0;
		area=Math.PI*Math.pow(radio, 2);
		return area; 
	}
	
	//Version 2, mejor
	public double calcularAreaV2() {
		return Math.PI*Math.pow(radio, 2);
	}
}
