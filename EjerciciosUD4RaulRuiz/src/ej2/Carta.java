package ej2;

public class Carta extends Documento{
	
	private String procedencia;

	
	public Carta(String procedencia) {
		super();
		this.procedencia = procedencia;
	}


	@Override
	public void cabecera() {
		super.cabecera();
		System.out.println("Esta carta viene de parte de: " + procedencia);
	}

}
