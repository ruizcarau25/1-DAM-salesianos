package ejInterfaces;

public class App {

	public static void main(String[] args) {
		Publicaciones listaPublicaciones[] = new Publicaciones[4];
		Publicaciones l1 = new Libro(true,2005,"Moi");
		Publicaciones l2 = new Libro(false,1990,"Chusma");
		Publicaciones r1 = new Revista(true,2005,4);
		Publicaciones r2 = new Revista(false,1995,12);
		
		listaPublicaciones[0] = l1;
		listaPublicaciones[1] = l2;
		listaPublicaciones[2] = r1;
		listaPublicaciones[3] = r2;
		
		System.out.println(listaPublicaciones[0].cuentaPrestados(listaPublicaciones));
		System.out.println(listaPublicaciones[0].publicacionesAnterioresA(listaPublicaciones, 2000));
	}

}
