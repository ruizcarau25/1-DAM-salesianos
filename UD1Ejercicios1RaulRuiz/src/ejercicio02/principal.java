package ejercicio02;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largo=50, ancho=21;
		double prof1=2.5;
		double volumen1;
		System.out.println("Vamos a calcular el area de 2 piscinas");
		
		//Primer ejercicio
		volumen1=(double)largo*ancho*prof1;
		System.out.println("El volumen de la primera piscina es: "+ volumen1);
		
		//Segundo ejercicio
		int radio=12;
		double prof2=1.8;
		double volumen2;
		
		volumen2=(double)Math.PI*Math.pow(radio, 2)*prof2;
		System.out.println("El volumen de la segunda piscina es: "+volumen2);
		
		//Calculo de precios
		
	}

}
