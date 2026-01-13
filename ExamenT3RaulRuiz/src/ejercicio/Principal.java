package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int opc, nHs=0, id, edad ,hEstudiadas, hEModif;
		String nombre;
		double cantidad, porcentaje;
		Hijo listaH[] = new Hijo[100];
		GestionFamiliar g = new GestionFamiliar(listaH, 2000);
		listaH[0] = new Hijo("Raul", 0, 20, 14);
		
		
		do {
			System.out.println("""
						0.-Salir
						1.-Agregar hijo
						2.-Buscar y devolver hijo por id
						3.-Buscar y devolver hijos menores de 14 años
						4.-Calcular gasto en pagas con solo hijos mayores de 14 años
						5.-Modificar numero de horas estudiadas
						6.-Calcular presupuesto restante
						7.-Mostrar los datos de todos los hijos
						8.-Calcular porcentaje del presupuesto
						9.-Comprobar paga
					""");
			opc=Leer.datoInt();
			
			switch (opc) {
				case 0:
					opc=0;
					break;
				case 1:
					System.out.println("Introduzca el nombre de su hijo");
					nombre=Leer.dato();
					System.out.println("Que id le quiere asignar");
					id=Leer.datoInt();
					System.out.println("Que edad tiene");
					edad=Leer.datoInt();
					System.out.println("Que numero de horas ha estudiado");
					hEstudiadas=Leer.datoInt();
					nHs++;
					Hijo h = new Hijo(nombre, id, edad, hEstudiadas);
					
					g.agregarHijo(h, nHs);
								
					break;
				case 2:
					System.out.println("Ingrese el id de su hijo para ver su nombre");
					id=Leer.datoInt();
					System.out.println("El nombre de su hijo con el id asignado es: "+g.buscarHijo(id));
					break;
				case 3:
					System.out.println("Los hijos menores de 14 años son: ");
					for (int i = 0; i < listaH.length; i++) {
						System.out.println(g.buscarMenores());
					}
					break;
				case 4: 
					System.out.println("Ingrese la cantidad que quiere dar de paga");
					cantidad=Leer.datoDouble();
					System.out.println("Que porcentaje quiere restar a sus hijos");
					porcentaje=Leer.datoDouble();
					System.out.println("En los mayores de 14 gastara: "+g.calcularGastoMayores(cantidad, porcentaje));
					break;
				case 5: 
					System.out.println("Vamos a modificar las horas de estudio");
					System.out.println("Ingrese el id");
					id=Leer.datoInt();
					System.out.println("Cuantas horas de estudio quiere ponerle");
					hEModif=Leer.datoInt();
					g.modificarHoras(hEModif, id);
					break;
				case 6: 
					System.out.println("Ingrese la cantidad que quiere dar de paga");
					cantidad=Leer.datoDouble();
					System.out.println("Que porcentaje quiere restar a sus hijos");
					porcentaje=Leer.datoDouble();
					System.out.println("El presupuesto restante es: "+g.calcularPRestante(cantidad, porcentaje));
					break;
				case 7:
					System.out.printf("Vamos a mostrar los datos de todos sus hijos	",g.mostrarDatos());
					System.out.println("\n"+g.mostrarDatos());
					break;
				case 8:
					System.out.println("Vamos a calcular el porcentaje de presupuesto uno de sus hijos");
					System.out.println("Ingrese la id");
					id=Leer.datoInt();
					System.out.println("Ingrese la cantidad");
					cantidad=Leer.datoDouble();
					System.out.println("Ingrese el porcentaje");
					porcentaje=Leer.datoDouble();
					System.out.println("El porcentaje es: ");
					g.calcularPorcentaje(id, cantidad, porcentaje);
					
					break;
				case 9:
					System.out.println("Ingrese su id");
					id=Leer.datoInt();
					System.out.println("Ingrese la cantidad");
					cantidad=Leer.datoDouble();
					System.out.println("Ingrese el porcentaje");
					porcentaje=Leer.datoDouble();
					g.comprobarPaga(id, cantidad, porcentaje);
					break;

				default:
					System.out.println("Datos introduccidos incorrectos");
					break;
			}
			
		} while (opc!=0);
		
	}

}
