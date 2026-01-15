package ej2;

public class App {

	public static void main(String[] args) {
		Documento d = new Documento();
		Documento t = new TarjetaVisita("Raul", "644392350");
		Documento c = new Carta("Moi");
		
		d.cabecera();
		System.out.println("-----------------------------");
		t.cabecera();
		System.out.println("-----------------------------");
		c.cabecera();
	}

}
