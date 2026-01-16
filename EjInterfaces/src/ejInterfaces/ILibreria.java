package ejInterfaces;

public interface ILibreria {

	public int cuentaPrestados(Publicaciones[] listaPublicaciones);
	public int publicacionesAnterioresA(Publicaciones[] listaPublicaciones, int año);
	
}
