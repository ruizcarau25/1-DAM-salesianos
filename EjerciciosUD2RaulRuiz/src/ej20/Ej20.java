package ej20;

import utilidades.Leer;

public class Ej20 {

    public static void main(String[] args) {
        int opc = 1;
        int opcMenu;
        double saldo = 1500.0;
        double cantidad;
        double precioEntrada = 25.50;
        
        do {
            System.out.println("\n=== CAJERO AUTOMÁTICO ===");
            System.out.println("1. Ver saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Comprar entradas");
            System.out.println("4. Ingresar dinero");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcMenu = Leer.datoInt();
            
            switch (opcMenu) {
                case 1:
                    System.out.println("\n--- SALDO ACTUAL ---");
                    System.out.printf("Su saldo es: %.2f € \n", saldo);
                    break;
                    
                case 2: 
                    System.out.println("\n--- RETIRAR DINERO ---");
                    System.out.print("Ingrese la cantidad a retirar: ");
                    cantidad = Leer.datoDouble();
                    
                    if (cantidad <= saldo) {
                        saldo -= cantidad;
                        System.out.printf("Retiro realizado. Nuevo saldo: %.2f € \n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                    
                case 3: 
                    System.out.println("\n--- COMPRAR ENTRADAS ---");
                    System.out.print("Ingrese el número de entradas a comprar: ");
                    int numEntradas = Leer.datoInt();
                    double totalCompra = numEntradas * precioEntrada;
                    
                    if (totalCompra <= saldo) {
                        saldo -= totalCompra;
                        System.out.printf("Compra realizada. %d entradas compradas.\n", numEntradas);
                        System.out.printf("Total gastado: %.2f € \n", totalCompra);
                        System.out.printf("Nuevo saldo: %.2f € \n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente para realizar la compra.");
                    }
                    break;
                    
                case 4:
                    System.out.println("\n--- INGRESAR DINERO ---");
                    System.out.print("Ingrese la cantidad a ingresar: ");
                    cantidad = Leer.datoDouble();
                    
                    saldo += cantidad;
                    System.out.printf("Ingreso realizado. Nuevo saldo: %.2f € \n", saldo);
                    break;
                    
                case 5:
                    opc = 0;
                    break;
                    
                default:
                    System.out.println("Opción no válida.");
            }
            
            if (opcMenu != 5) {
                System.out.println("\nSi desea salir del programa pulse 0");
                System.out.println("Si desea realizar otra operación pulse cualquier otro número");
                opc = Leer.datoInt();
            }
            
        } while (opc != 0);
        
        System.out.println("¡Gracias por usar nuestro cajero automático!");
    }
}