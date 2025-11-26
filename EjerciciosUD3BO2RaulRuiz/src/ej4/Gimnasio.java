package ej4;

public class Gimnasio {
	
	private Cliente listaClientes[];

	public Gimnasio(Cliente[] listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}

	public Cliente[] getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Cliente[] listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	public void agregarCliente(Cliente c) {
		for (int i = 0; i < listaClientes.length; i++) {
			if (listaClientes[i]==null) {
				listaClientes[i]=c;
				return;
			}
		}
	}
	
	public Double findByDni (String dni) {
		double imc=0;
		for (int i = 0; i < listaClientes.length; i++) {
			if (listaClientes[i]!=null && listaClientes[i].getDni().equalsIgnoreCase(dni)) {
				imc=listaClientes[i].calcularIMC();
			}
		}
		if (imc>0) {
			return imc;
		} else {
			return -1.00;
		}
	}
	
	public String listaNoActivos() {
		String lista = "";
		for (int i = 0; i < listaClientes.length; i++) {
			if (listaClientes[i]!=null && !listaClientes[i].isActivo()) {
				lista+=listaClientes[i].getNombre()+ "\n";
			}
		}
		return lista;
	}
	
	public void darBaja (String dni) {
		for (int i = 0; i < listaClientes.length; i++) {
			if (listaClientes[i]!=null && listaClientes[i].getDni().equalsIgnoreCase(dni)) {
				listaClientes[i].setActivo(false);
				return;
			}
		}
	}
	
	public double calcularMedia () {
		double media=0;
		int cont=0;
		for (int i = 0; i < listaClientes.length; i++) {
			if (listaClientes[i]!=null && listaClientes[i].isActivo()) {
				media+=listaClientes[i].calcularIMC();
				cont++;
			}
		}
		return media/cont;
	}

}
