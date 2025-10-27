package proyectoUD2;

import utilidades.Leer;

public class ProyectoUD2 {

	public static void main(String[] args) {
		String userF, passF, userL, passL;
		int opc=1;
		double saldo = 0, ingresar, retirar;
		
		System.out.println("Bienvenido a Oráculo Deportivo");
		System.out.println("Primero debe registarse");
		System.out.println("Introduzca su usuario: ");
		userF=Leer.dato();
		System.out.println("Introduzca su contraseña: ");
		passF=Leer.dato();
		System.out.println("Ahora vamos a iniciar sesion");
		
		do {
			
			System.out.println("Introduzca su usuario: ");
			userL=Leer.dato();
			System.out.println("Introduzca su contraseña: ");
			passL=Leer.dato();
		
			if (userF.equals(userL) && passF.equals(passL)) {
				System.out.println("Sesion iniciada correctamente");
				opc=0;
			} else {
				System.out.println("Usuario o contraseña incorrectos");
			}
		} while (opc!=0);
		opc=1;
		
		System.out.println("------Monedero------");
		do {
			System.out.println("0.- Salir ");
			System.out.println("1.- Consultar Saldo");
			System.out.println("2.- Ingresar Saldo");
			System.out.println("3.- Retirar Saldo");
			opc=Leer.datoInt();
			
			switch (opc) {
			case 0:
				opc=0;
				break;
			case 1: 
				System.out.println("------Consultar------");
				System.out.printf("Su saldo es de: %.2f \n",saldo);
				break;
			case 2: 
				System.out.println("------Ingresar------");
				System.out.println("Cuanto saldo quiere ingresar: ");
				ingresar=Leer.datoDouble();
				saldo += ingresar;
				System.out.printf("Saldo actual: %.2f \n",saldo);
				break;
			case 3:
				System.out.println("------Retirar------");
				System.out.println("Cuanto saldo quiere retirar: ");
				retirar=Leer.datoDouble();
				saldo -= retirar;
				System.out.printf("Saldo actual: %.2f \n",saldo);
				break;
			default:
				System.out.println("Datos incorrectos");
				break;
			}
		} while (opc!=0);
		
	}

}
