package ej1;

public class Cabecera {
	
	private String nombreAsig;
	private String aula;
	private String fecha;

	//Vamos a crear los constructores con ciertos parametros
	
	public Cabecera ( String nombreAsig, String aula, String fecha) {
		this.nombreAsig=nombreAsig;
		this.aula=aula;
		this.fecha=fecha;
				
	}
	//Vacio
	public Cabecera () {
		
	}
	
	public Cabecera (String nombreAsig, String aula) {
		this.nombreAsig=nombreAsig;
		this.aula=aula;
	}
	
	//Getters and setters 
	
	public String getNombreAsig() {
		return nombreAsig;
	}
	
	public void setNombreAsig(String nombreAsig) {
		this.nombreAsig = nombreAsig;
		
	}
	
	public String getAula () {
		return aula;
	}
	
	public void setAula (String aula) {
		this.aula=aula;
	}
	
	public String getFecha () {
		return fecha;
	}
	
	public void setFecha (String fecha) {
		this.fecha=fecha;
	}
	

	public void cabecera () {
		
        System.out.println("====================================");
        System.out.println("       CENTRO ESCOLAR - EXAMEN");
        System.out.println("====================================");
        System.out.println("Asignatura: " + nombreAsig);
        System.out.println("Aula: " + aula);
        System.out.println("Fecha: " + fecha);
        System.out.println("====================================");
	}
	
}
