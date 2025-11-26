package ej5;

import utilidades.Leer;

public class Principal {

    public static void main(String[] args) {
        Sala sala = new Sala(1, 50, 8.0, "Avatar 3");
        int opc;
        
        do {
            System.out.println("""
                    0.- Salir
                    1.- Ver cartelera
                    2.- Comprar una entrada
                    3.- Comprar varias entradas
                    4.- Modificar precio de entrada
                    5.- Ganancias totales
                    """);
            opc = Leer.datoInt();
            
            switch(opc) {
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    sala.verCartelera();
                    break;
                case 2:
                    sala.comprarEntrada();
                    break;
                case 3:
                    sala.comprarVariasEntradas();
                    break;
                case 4:
                    sala.modificarPrecio();
                    break;
                case 5:
                    sala.gananciasTotales();
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            
        } while(opc != 0);
    }
}