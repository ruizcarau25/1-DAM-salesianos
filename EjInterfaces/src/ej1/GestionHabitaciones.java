package ej1;

import java.util.ArrayList;

public class GestionHabitaciones {
	
	private ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();

	public GestionHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
		super();
		this.listaHabitaciones = listaHabitaciones;
	}
	

	public GestionHabitaciones() {
		super();
	}


	public ArrayList<Habitacion> getListaHabitaciones() {
		return listaHabitaciones;
	}

	public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}

	@Override
	public String toString() {
		return "GestionHabitaciones [listaHabitaciones=" + listaHabitaciones + "]";
	}
	
	public void añadirHabitacion(Habitacion h) {
		listaHabitaciones.add(h);
	}
	
	public void loquemesalgadelnabo() {
		listaHabitaciones.get(0);
	}

}
