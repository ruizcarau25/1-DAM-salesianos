package ej5;

import utilidades.Leer;

public class Sala {
    
    private int idSala;
    private int totalEntradas;
    private Entrada entrada;
    private Entrada[] entradas;
    private double caja; 
    private String cartelera; 
    
    public Sala(int idSala, int totalEntradas, double precioBase, String cartelera) {
        this.idSala = idSala;
        this.totalEntradas = totalEntradas;
        this.cartelera = cartelera;
        this.caja = 0;
        entradas = new Entrada[totalEntradas];
        
        int fila = 1;
        int butaca = 1;
        for (int i = 0; i < totalEntradas; i++) {
            entradas[i] = new Entrada(i + 1, precioBase, true, fila, butaca);
            butaca++;
            if (butaca > 10) { 
                butaca = 1;
                fila++;
            }
        }
    }
    
    public void verCartelera() {
        System.out.println("Película en cartelera: " + cartelera);
    }
    
    public void comprarEntrada() {
        System.out.println("Ingrese número de entrada (1 a " + totalEntradas + "):");
        int num = Leer.datoInt();
        if (num < 1 || num > totalEntradas) {
            System.out.println("Número inválido.");
            return;
        }
        Entrada e = entradas[num - 1];
        if (!e.isLibre()) {
            System.out.println("La entrada ya está ocupada.");
        } else {
            e.setLibre(false);
            caja += e.getPrecio();
            System.out.println("Entrada comprada. Precio: " + e.getPrecio() + "€");
        }
    }
    
    public void comprarVariasEntradas() {
        System.out.println("Ingrese número de entradas a comprar:");
        int cantidad = Leer.datoInt();
        if (cantidad < 1) {
            System.out.println("Cantidad inválida.");
            return;
        }
        
        int compradas = 0;
        double precioTotal = 0;
        
        while (compradas < cantidad) {
            System.out.println("Ingrese número de entrada (1 a " + totalEntradas + "):");
            int num = Leer.datoInt();
            if (num < 1 || num > totalEntradas) {
                System.out.println("Número inválido.");
                continue;
            }
            Entrada e = entradas[num - 1];
            if (!e.isLibre()) {
                System.out.println("La entrada ya está ocupada.");
            } else {
                e.setLibre(false);
                precioTotal += e.getPrecio();
                compradas++;
                System.out.println("Entrada comprada: " + e);
            }
        }
        
        
        if (cantidad > 5) {
            precioTotal *= 0.9;
            System.out.println("Se aplica un 10% de descuento.");
        }
        
        caja += precioTotal;
        System.out.println("Total a pagar: " + precioTotal + "€");
    }
    
    public void modificarPrecio() {
        System.out.println("Ingrese número de entrada (1 a " + totalEntradas + "):");
        int num = Leer.datoInt();
        if (num < 1 || num > totalEntradas) {
            System.out.println("Número inválido.");
            return;
        }
        System.out.println("Ingrese nuevo precio:");
        double nuevoPrecio = Leer.datoDouble();
        entradas[num - 1].setPrecio(nuevoPrecio);
        System.out.println("Precio actualizado.");
    }
    
    public void gananciasTotales() {
        System.out.println("Ganancias totales: " + caja + "€");
    }
}