package ej3;



import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opc, totalVendido=0, opcVender;
		Movil moviles [] = {
				new Movil("Xiaomi","J3", true, false,130),
				new Movil("Xiaomi","J2",false,true,150),
				new Movil("Iphone","13",false,true,350),
				new Movil("Iphone","12",false,true,250),
				new Movil("Samsung","J2",true,false,200),
		};
		Vendedor v = new Vendedor(moviles, totalVendido);
		
		
		do {
			
			System.out.println("0.-Salir");
			System.out.println("1.-Comprobar cuantos moviles se han vendido");
			System.out.println("2.-Mostrar precio final");
			System.out.println("3.-Calcular dinero en el bolsillo");
			System.out.println("4.-Ver moviles que quedan por vender");
			opc=Leer.datoInt();
			
			switch (opc) {
				case 0:
					opc=0;
					break;
				case 1:
					System.out.printf("\nLa cantidad de moviles vendidos es: %d \n",v.movilesVendidos());
					break;
				case 2:
					System.out.println("Selecione la posicion del movil que quiere comprar");
					opcVender=Leer.datoInt();
					System.out.printf("\nEl precio final del movil que quiere vender es: %.2f\n",v.precioFinal(opcVender-1));
					break;
				case 3:
					System.out.printf("\nEl dinero en el bolsillo es: %.2f\n",v.dineroBolsillo());
					break;
				case 4: 
					Movil porVender[] = v.movilesPorVender();
					if (porVender.length==0) {
						System.out.println("No quedan moviles por vender ");
					} else {
						for (int i = 0; i < porVender.length; i++) {
							System.out.println(porVender[i].getMarca() +" "+porVender[i].getModelo());
						}
					}

				default:
				
					break;
			}
			
		} while (opc!=0);

	}

}
