package ejInterfaces;

public class Libro extends Publicaciones{
	
	private String autor;

	public Libro(boolean prestado, int año, String autor) {
		super(prestado, año);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return super.toString() + "Libro [autor=" + autor + "]";
	}
	
	
	

}
