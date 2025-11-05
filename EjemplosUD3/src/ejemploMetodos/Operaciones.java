package ejemploMetodos;

public class Operaciones {

	
	public int sumarParametros (int num1, int num2 ) {
		int resul;
		resul=num1+num2;
		return resul;
	}
	
	public int restarParametros (int num1, int num2) {
		int resul;
		resul=num1-num2;
		return resul;
	}
	
	public int multiplicarParametros (int num1, int num2) {
		int resul;
		resul=num1*num2;
		return resul;
	}
	
	public int dividirParametros (int num1, int num2) {
		int resul = 0;
		if (num2!=0 || num1!=0) {
			resul=num1/num2;
		}
		return resul;
		
	}
	
}
