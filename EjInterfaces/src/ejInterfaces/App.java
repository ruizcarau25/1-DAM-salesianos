package ejInterfaces;

public class App {

	public static void main(String[] args) {
		Publicaciones listaPublicaciones[] = new Publicaciones[7];
		Publicaciones l1 = new Libro(true,2005,"Moi");
		Publicaciones l2 = new Libro(false,1990,"Chusma");
		Publicaciones r1 = new Revista(true,2005,4);
		Publicaciones r2 = new Revista(false,1995,12);
		Publicaciones p1 = new Publicaciones(false,2011);
		Libro l3 = new Libro(true,2012,"Angel");
		Revista r3 = new Revista(true,2020,10);
		
		listaPublicaciones[0] = l1;
		listaPublicaciones[1] = l2;
		listaPublicaciones[2] = r1;
		listaPublicaciones[3] = r2;
		listaPublicaciones[4] = p1;
		listaPublicaciones[5] = l3;
		listaPublicaciones[6] = r3;
		
		System.out.println(listaPublicaciones[0].cuentaPrestados(listaPublicaciones));
		System.out.println(listaPublicaciones[0].publicacionesAnterioresA(listaPublicaciones, 2000));
	}

}
