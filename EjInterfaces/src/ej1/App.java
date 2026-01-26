package ej1;

public class App {

	public static void main(String[] args) {
		Habitacion h = new Habitacion(200, false, null, 0, 0);
		Habitacion s = new Suite(500,true,"Raul",3,2,50,30);
		Habitacion a = new Apartamento(150, true, "Moi",5 , 4, 50);
		
		Habitacion habitaciones[] = {h,s,a};
		
		GestionHabitaciones g = new GestionHabitaciones();
		
		for (int i = 0; i < habitaciones.length; i++) {
			g.añadirHabitacion(habitaciones[i]);
		}
		
		
		

	}

}
