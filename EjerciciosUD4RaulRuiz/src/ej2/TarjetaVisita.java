package ej2;

public class TarjetaVisita extends Documento {
	
	private String nombre;
	private String telefono;
	
	
	
	public TarjetaVisita(String nombre, String telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}



	@Override
	public void cabecera() {
		super.cabecera();
		System.out.println("Nombre: " + nombre);
		System.out.println("Telefono: " + telefono);
	}

}
