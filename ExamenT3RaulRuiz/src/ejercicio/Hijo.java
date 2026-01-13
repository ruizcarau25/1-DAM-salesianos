package ejercicio;

public class Hijo {
	
	private String nombre;
	private int id;
	private int edad;
	private int hEstudiadas;
	
	public Hijo(String nombre, int id, int edad, int hEstudiadas) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
		this.hEstudiadas = hEstudiadas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int gethEstudiadas() {
		return hEstudiadas;
	}

	public void sethEstudiadas(int hEstudiadas) {
		this.hEstudiadas = hEstudiadas;
	}
	
	//Illo esto calcula la paga :)
	
	public double calcularPaga(double cantidad, double porcentaje) {
		double total;
		double den=100;
		total=hEstudiadas*cantidad;
		total=total*porcentaje/den;
		return total;
	}

}
