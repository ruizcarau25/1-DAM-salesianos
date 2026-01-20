package ejInterfaces;

public class Publicaciones implements ILibreria{
	
	private boolean prestado;
	private int año;
	
	public Publicaciones(boolean prestado, int año) {
		super();
		this.prestado = prestado;
		this.año = año;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Publicaciones [prestado=" + prestado + ", año=" + año + "]";
	}

	@Override
	public int cuentaPrestados(Publicaciones[] listaPublicaciones) {
		int prestados=0;
		for (int i = 0; i < listaPublicaciones.length; i++) {
			if (listaPublicaciones[i].prestado) {
				prestados++;
			}
		}
		return prestados;
	}

	@Override
	public int publicacionesAnterioresA(Publicaciones[] listaPublicaciones, int año) {
		int anteriores=0;
		for (int i = 0; i < listaPublicaciones.length; i++) {
			if (listaPublicaciones[i].año < año) {
				anteriores++;
			}
		}
		return anteriores;
	}
	
	

}
