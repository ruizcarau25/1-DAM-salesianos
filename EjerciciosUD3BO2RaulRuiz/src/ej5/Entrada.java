package ej5;

public class Entrada {
    
    private int id;
    private double precio;
    private boolean libre;
    private int fila;
    private int butaca;
    
    public Entrada(int id, double precio, boolean libre, int fila, int butaca) {
        this.id = id;
        this.precio = precio;
        this.libre = libre;
        this.fila = fila;
        this.butaca = butaca;
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public int getFila() {
        return fila;
    }

    public int getButaca() {
        return butaca;
    }

    @Override
    public String toString() {
        return "Fila: " + fila + ", Butaca: " + butaca + ", Precio: " + precio + "€, " + (libre ? "Libre" : "Ocupada");
    }
}