package ej18;

import utilidades.Leer;

public class Ej18 {

    public static void main(String[] args) {
        int opc = 1;
        double precioNormal = 16.0;
        double precioExtra = 20.0;
        int hNormales = 40;
        double salario;
        double horasExtra;
        
        do {
            System.out.println("\n=== CÁLCULO DE SALARIO SEMANAL ===");
            
            System.out.print("Ingrese el número de horas trabajadas esta semana: ");
            double horasTrabajadas = Leer.datoDouble();
            
            if (horasTrabajadas <= hNormales) {
                salario = horasTrabajadas * precioNormal;
            } else {
              horasExtra = horasTrabajadas - hNormales;
                salario = (hNormales * precioNormal) + (horasExtra * precioExtra);
            }
            
            System.out.println("\n--- RESULTADO ---");
            System.out.println("Horas trabajadas: " + horasTrabajadas + " horas");
            System.out.printf("Salario correspondiente: %.2f € \n",salario);
            
            System.out.println("\nSi desea salir del programa pulse 0");
            System.out.println("Si desea calcular otro salario pulse cualquier otro número");
            opc = Leer.datoInt();
            
        } while (opc != 0);
        
        System.out.println("¡Programa terminado!");
    }
}