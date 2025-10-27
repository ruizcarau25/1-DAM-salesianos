package ej17;

import utilidades.Leer;

public class Ej17 {

	public static void main(String[] args) {
		int opc = 1;
        int totalAsig = 6;
        double sumaNotas = 0, nota;
        int contadorSuspensos = 0;
        
        do {
            System.out.println("\n=== GESTIÓN DE NOTAS DEL ALUMNO ===");
            

            for (int i = 1; i <= totalAsig; i++) {
                System.out.print("Ingresa la nota de la asignatura " + i + " (0-10): ");
                nota = Leer.datoDouble();
                
                sumaNotas += nota;
              
                if (nota < 5) {
                    contadorSuspensos++;
                }
            }
            
            double notaMedia = sumaNotas / totalAsig;
            
            System.out.println("\n--- RESULTADOS ---");
            System.out.printf("Nota media: %.2f \n", notaMedia);
            System.out.println("Número de suspensos: " + contadorSuspensos);
            
            System.out.println("\nSi desea salir del programa pulse 0");
            System.out.println("Si desea calcular otra vez pulse cualquier otro número");
            opc = Leer.datoInt();
            
        } while (opc != 0);
        
        System.out.println("¡Programa terminado!");

	}

}
