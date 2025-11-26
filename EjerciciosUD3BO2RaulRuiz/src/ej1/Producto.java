package ej1;

public class Producto {
	private String nombre;
	private double precio;
	private boolean fragil;
	private String categoria;
	private int cantidad;
	
	public Producto(String nombre, double precio, boolean refrigerado, String categoria, int cantidad, boolean fragil) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.fragil = fragil;
		this.categoria = categoria;
		this.cantidad = cantidad;
	}

	public Producto() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", fragil=" + fragil + ", categoria=" + categoria
				+ ", cantidad=" + cantidad + "]";
	}
	
	public double calcularPVP(double porcentaje) {
		double den=100;
		return precio+precio*porcentaje/den;
	}

}
