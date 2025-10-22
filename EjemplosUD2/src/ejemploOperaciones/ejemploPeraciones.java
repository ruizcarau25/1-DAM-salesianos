package ejemploOperaciones;



import utilidades.Leer;

public class ejemploPeraciones {

	public static void main(String[] args) {
		int  edades [], tam = 0, opc, resultado=0;
		double media=0;
		
	 
	 System.out.println("Ingrese el tamaño del array");
	 tam=Leer.datoInt();
	 edades = new int [tam];
	 
	 for (int i = 0; i < edades.length; i++) {
		System.out.println("Ingrese un numero");
		edades [i] = Leer.datoInt();
	 }
		System.out.println("Ahora vamos a imprimir el array");
		
	 for (int i = 0; i < edades.length; i++) {
		System.out.println(edades[i]);
	 }
	 for (int i = 0; i < edades.length; i++) {
		if (edades[i] == 18 ) {
			edades [i] = 0;
		}
	
	 }
	 for (int i = 0; i < edades.length; i++) {
		System.out.println(edades[i]);
	 }
	 System.out.println("Elije una opcion");
	 opc=Leer.datoInt();
	 System.out.println("La opcion es: "+edades[opc-1]);
	 
	 for (int i = 0; i < edades.length; i++) {
		resultado += edades[i];
	}
	 System.out.println("La suma vale: "+resultado);
	 media = (double)resultado/edades.length;
	 System.out.printf("La media es: %.2f",media);
	}

}
