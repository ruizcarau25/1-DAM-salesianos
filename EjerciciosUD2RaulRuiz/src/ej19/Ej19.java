package ej19;

import utilidades.Leer;

public class Ej19 {

    public static void main(String[] args) {
        int opc = 1;
        double sueldoFijo = 1000.0;
        double porcentaje = 0.20;
        double comisionVentas;
        double salarioTotal;
        double totalVentas;
        
        do {
            System.out.println("\n=== CÁLCULO DE SALARIO DE VENDEDOR ===");
            
            System.out.print("Ingrese el total de ventas realizadas este mes (en euros): ");
            totalVentas = Leer.datoDouble();
            
            comisionVentas = totalVentas * porcentaje;
            salarioTotal = sueldoFijo + comisionVentas;
            
            System.out.println("\n--- DESGLOSE DEL SALARIO ---");
            System.out.println("Sueldo fijo: " + sueldoFijo + " €");
            System.out.println("Ventas totales: " + totalVentas + " €");
            System.out.printf("Comisión por ventas (20%%): %.2f € \n", comisionVentas);
            System.out.printf("SALARIO TOTAL: %.2f € \n", salarioTotal);
            
            System.out.println("\nSi desea salir del programa pulse 0");
            System.out.println("Si desea calcular otro salario pulse cualquier otro número");
            opc = Leer.datoInt();
            
        } while (opc != 0);
        
        System.out.println("¡Programa terminado!");
    }
}
