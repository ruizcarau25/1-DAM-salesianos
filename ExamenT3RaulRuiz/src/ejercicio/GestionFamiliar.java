package ejercicio;


public class GestionFamiliar {
	
	private Hijo listaH[];
	private double presupuesto;
	
	public GestionFamiliar(Hijo[] listaH, double presupuesto) {
		super();
		this.listaH = listaH;
		this.presupuesto = presupuesto;
	}

	public Hijo[] getListaH() {
		return listaH;
	}

	public void setListaH(Hijo[] listaH) {
		this.listaH = listaH;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	public void agregarHijo(Hijo h, int nHs) {
		listaH[nHs]=h;
	}
	
	public String buscarHijo(int id) {
		String nombreEncontrado = null;
		for (int i = 0; i < listaH.length; i++) {
			if (listaH[i]!=null && listaH[i].getId()==id) {
				nombreEncontrado=listaH[i].getNombre();
			}
		}
		return nombreEncontrado;
	}
	
	public Hijo[] buscarMenores() {
		Hijo listaMenores[] = new Hijo [100];
		for (int i = 0; i < listaH.length; i++) {
			if (listaH[i]!=null && listaH[i].getEdad()<14) {
				listaMenores[i]=listaH[i];
			}
		}
		return listaMenores;
	}
	
	public double calcularGastoMayores(double cantidad, double porcentaje) {
		double gasto=0;
		for (int i = 0; i < listaH.length; i++) {
			if (listaH[i]!=null && listaH[i].getEdad()>14) {
				gasto+=listaH[i].calcularPaga(cantidad, porcentaje);
			}
		}
		return gasto;
	}
	
	public void modificarHoras(int hEModif, int id) {
		for (int i = 0; i < listaH.length; i++) {
			if (listaH[i]!=null && listaH[i].getId()==id) {
				listaH[i].sethEstudiadas(hEModif);
			}
		}
	}
	
	public double calcularPRestante (double cantidad, double porentaje) {
		double total=0;
		for (int i = 0; i < listaH.length; i++) {
			if (listaH[i]!=null) {
				total+=listaH[i].calcularPaga(cantidad, porentaje);
			}
		}
		return presupuesto-total;
	}
	
	public String mostrarDatos () {
		String listaNombre="";
		String listaID="";
		String listaEdad="";
		String listaHEstudiadas="";
		
		for (int i = 0; i < listaH.length; i++) {
			if (listaH[i]!=null) {
				listaNombre+=listaH[i].getNombre()+ " ";
				listaID+=listaH[i].getId()+ " ";
				listaEdad+=listaH[i].getEdad()+ " ";
				listaHEstudiadas+=listaH[i].gethEstudiadas()+ " ";
			}
		}
		String listaCompleta=listaNombre + "\n" + listaID + "\n" + listaEdad + "\n" + listaHEstudiadas + "\n";
		return listaCompleta;
	}
	
	public String comprobarPaga (int id, double cantidad, double porcentaje) {
		boolean encontrado;
		for (int i = 0; i < listaH.length; i++) {
			if (listaH[i]!=null && listaH[i].getId()==id && listaH[i].calcularPaga(cantidad, porcentaje)>10) {
				encontrado=true;
			} else {
				encontrado=false;
			}
		}
		if (encontrado=true) {
			return "Tengo para chuches";
		} else {
			return "No tengo ni pa pipas";
		}
	}
	
	public double calcularPorcentaje (int id, double cantidad, double porcentaje) {
		double paga=0;
		double mul=100;
		for (int i = 0; i < listaH.length; i++) {
			if (listaH[i]!=null && listaH[i].getId()==id) {
				paga=listaH[i].calcularPaga(cantidad, porcentaje);
			}
		}
		return paga*mul/presupuesto;
	}
	
}
