package ej1;

import utilidades.Leer;

public class Ej1 {

	public static void main(String[] args) {
		String nombreAsig, aula, fecha;
		/*º
		Cabecera cabecera = new Cabecera();
		
		System.out.println("Ingrese el nombre de la asignatura");
		nombreAsig=Leer.dato();	
		System.out.println("Ingrese el aula");
		aula=Leer.dato();
		System.out.println("Ingrese la fecha");
		fecha=Leer.dato();
		
		
		cabecera.cabecera();
		
		*/
		//2. Leyendo datos por teclado
		Cabecera c4;
		
		System.out.println("Ingrese el nombre de la asignatura");
		nombreAsig=Leer.dato();	
		System.out.println("Ingrese el aula");
		aula=Leer.dato();
		System.out.println("Ingrese la fecha");
		fecha=Leer.dato();
		
		c4 = new Cabecera (nombreAsig, aula, fecha);
		
		c4.cabecera();
		
		//Set y get
		
		c4.getNombreAsig();
		System.out.println("Nombre Asignatura: "+c4.getNombreAsig());
		
		c4.setNombreAsig("Lenguaje de Marcas");
		System.out.println("Nombre Asignatura cambiado: "+c4.getNombreAsig());
		
		

	}
	

}
