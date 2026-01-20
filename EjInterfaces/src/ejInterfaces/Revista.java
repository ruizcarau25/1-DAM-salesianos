package ejInterfaces;

public class Revista extends Publicaciones{
	
	private int mes;

	public Revista(boolean prestado, int año, int mes) {
		super(prestado, año);
		this.mes = mes;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	@Override
	public String toString() {
		return super.toString() + "Revista [mes=" + mes + "]";
	}
	
	
	

}
