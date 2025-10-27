package ej12;


import utilidades.Leer;

public class Ej12 {

	public static void main(String[] args) {
		int opcion, idioma;
		double peso, resultado, mercurio=0.38, venus=0.91, tierra=1, marte=0.38, jupiter=2.53, saturno=1.06, urano=0.92, neptuno=1.2;
		String p1="mercurio", p2="venus", p3="tierra", p4="marte", p5="jupiter", p6="saturno", p7="urano", p8="neptuno";
		
		System.out.println("Vamos a calcular cuanto pesa en otros planetas");
		
		System.out.println("Ingrese su peso");
		peso=Leer.datoInt();
		
		System.out.println("Pulse 1 para "+p1);
		System.out.println("Pulse 2 para "+p2);
		System.out.println("Pulse 3 para "+p3);
		System.out.println("Pulse 4 para "+p4);
		System.out.println("Pulse 5 para "+p5);
		System.out.println("Pulse 6 para "+p6);
		System.out.println("Pulse 7 para "+p7);
		System.out.println("Pulse 8 para "+p8);
		opcion=Leer.datoInt();
		
		switch (opcion) {
			case 1: {
				resultado=peso*mercurio;
				System.out.println("En que idioma quiere el resultado");
				System.out.println("Pulse 1 para que se le muestre en ingles");
				System.out.println("Pulse 2 para mostrar en español");
				idioma=Leer.datoInt();
					switch (idioma) {
						case 1: {
							System.out.printf("The result is : %.2f \n",resultado);
							break;
						}
						case 2: {
							System.out.printf("El resultado es: %.2f \n",resultado);
							break;
						}
						default: {
							System.out.println("Idioma no disponible");
						}
					}
				break;
			}
			case 2: {
				resultado=peso*venus;
				System.out.printf("El resultado es: %.2f \n",resultado);
				break;
			}
			case 3: {
				resultado=peso*tierra;
				System.out.printf("El resultado es: %.2f \n",resultado);
				break;
			}
			case 4: {
				resultado=peso*marte;
				System.out.printf("El resultado es: %.2f \n",resultado);
				break;
			}
			case 5: {
				resultado=peso*jupiter;
				System.out.printf("El resultado es: %.2f \n",resultado);
				break;
			}
			case 6: {
				resultado=peso*saturno;
				System.out.printf("El resultado es: %.2f \n",resultado);
				break;
			}
			case 7: {
				resultado=peso*urano;
				System.out.printf("El resultado es: %.2f \n",resultado);
				break;
			}
			case 8: {
				resultado=peso*neptuno;
				System.out.printf("El resultado es: %.2f \n",resultado);
				break;
			}
			default: {
				System.out.println("El dato es invalido");
			}
			
		}
	
		
	}

}
