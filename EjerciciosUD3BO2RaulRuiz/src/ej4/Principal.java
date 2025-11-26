package ej4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int opc, edad, opcActivo;
		String dni, nombre, apellidos;
		boolean activo;
		double peso, altura;
		Cliente listaClientes[] = new Cliente [100];
		Gimnasio g = new Gimnasio(listaClientes);
		
		do {
			System.out.println("""
					0.-Salir
					1.-Calcular IMC del cliente
					2.-Mostrar lista de clientes no activos
					3.-Agregar cliente a la lista
					4.-Dar de baja
					5.-Calcular media IMC de clientes (activos)
					""");
			opc=Leer.datoInt();
			
			switch (opc) {
				case 0:
					opc=0;
					break;
				case 1:
					System.out.println("Ingrese el dni del cliente");
					dni=Leer.dato();
					System.out.printf("\nEl imc del cliente es: %.2f\n",g.findByDni(dni)); ;
					break;
				case 2:
					System.out.println("La lista de los no activos es:");
					System.out.println(g.listaNoActivos());
					break;
				case 3:
					System.out.println("Diga su DNI");
					dni=Leer.dato();
					System.out.println("Diga su Nombre");
					nombre=Leer.dato();
					System.out.println("Diga su Apellido");
					apellidos=Leer.dato();
					System.out.println("Si el usuario es activo pulse 1 si no pulse otro numero");
					opcActivo=Leer.datoInt();
					if (opcActivo==1) {
						activo=true;
					} else {
						activo=false;
					}
					System.out.println("Diga su edad");
					edad=Leer.datoInt();
					System.out.println("Diga su pero en KG");
					peso=Leer.datoDouble();
					System.out.println("Diga su altura");
					altura=Leer.datoDouble();
					Cliente c = new Cliente(dni, nombre, apellidos, activo, edad, peso, altura);
					g.agregarCliente(c);
					break;
				case 4:
					System.out.println("Ingrese el dni del cliente:");
					dni=Leer.dato();
					g.darBaja(dni);
					break;
				case 5:
					System.out.printf("\nLa media de los clientes activos es: %.2f\n",g.calcularMedia());
					break;
				default:
					System.out.println("Entrada de datos incorrecta");
					break;
			}
			
		} while (opc!=0);

	}

}
