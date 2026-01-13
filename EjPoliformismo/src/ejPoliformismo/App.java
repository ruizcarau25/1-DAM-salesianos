package ejPoliformismo;

public class App {

	public static void main(String[] args) {
		//Figura f1 = new Figura no se puede es bastracta
		Cuadrado cu = new Cuadrado ("Moi", "Verde",2.0);
		Circulo ci = new Circulo("Chusma", "Rojo", 2.0);
		Figura lista[] = new Figura[2];
		OperacionesFiguras op = new OperacionesFiguras();
		//Poliformismo 
		System.out.println("------------------------------");
		Figura f1 = new Cuadrado("Moi", "Azul", 1.0);
		Figura f2 = new Circulo("Chusma", "Morado", 1.0);
		System.out.println(f1);
		System.out.println(f2);
		//No se puede llamar a mostrarLados porque no es un metodo reescrito
		 
		//lista[0] = new Figura(); No se puede instanciar figuras
		
		lista[0] = new Cuadrado("Yeah","Amarillo",5.0);
		lista[1] = new Circulo("PFF","Negro",5.0);
		
		for (int i = 0; i < lista.length; i++) {
			System.out.printf("El area del "+(i+1)+" es: %.2f \n",op.calcularElAreaDeUnaFigura(lista[i]));
		}
		System.out.printf("La suma de todas las areas es: %.2f", op.sumarAreas(lista));
		
		if (lista[2] instanceof Circulo) {
			((Circulo)lista[2]).mostrarRadianes();
		}
	}

}
