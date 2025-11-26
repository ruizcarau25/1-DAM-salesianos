package ej3;


public class Vendedor {
	
	private Movil moviles [];
	private int totalVendido;
	
	public Vendedor(Movil[] moviles, int totalVendido) {
		super();
		this.moviles = moviles;
		this.totalVendido = totalVendido;
	}

	public Movil[] getMoviles() {
		return moviles;
	}

	public void setMoviles(Movil[] moviles) {
		this.moviles = moviles;
	}

	public int getTotalVendido() {
		return totalVendido;
	}

	public void setTotalVendido(int totalVendido) {
		this.totalVendido = totalVendido;
	}
	
	public int movilesVendidos () {
		int cont=0;
		for (int i = 0; i < moviles.length; i++) {
			if (moviles[i].isVendido()) {
				cont++;
			}
		}
		return cont;
	}
	
	public double precioFinal (int opcVender) {
		if (moviles[opcVender].isNuevo()) {
			return moviles[opcVender].getPrecioUnitario();
		} else {
			return moviles[opcVender].getPrecioUnitario()-50;
		}
	}
	
	public double dineroBolsillo () {
		double total=0;
		for (int i = 0; i < moviles.length; i++) {
			if (moviles[i].isVendido()) {
				total+=moviles[i].getPrecioUnitario();
			}
		}
		return total;
	}
	
	public Movil[] movilesPorVender () {
		int cont=0;
		for (int i = 0; i < moviles.length; i++) {
			if (!moviles[i].isVendido()) {
				cont++;
			}
		}
		
		Movil movilesNoVendidos [] = new Movil [cont];
		int index=0;
		
		for (int i = 0; i < moviles.length; i++) {
			if (!moviles[i].isVendido()) {
				movilesNoVendidos[index] = moviles[i];
				index++;
			}
		}
		return movilesNoVendidos;
	}

}
