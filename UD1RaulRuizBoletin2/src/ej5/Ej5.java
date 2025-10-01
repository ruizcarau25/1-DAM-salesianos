package ej5;

import utilidades.Leer;

public class Ej5 {

	public static void main(String[] args) {
		/* ¿Qué saldo tendré al final del año en el banco si he abierto una cuenta pago de mantenimiento un 1 %
del saldo con la que la abrí inicialmente al año y tengo unos intereses del 3 % del saldo inicial? Hacer
un programa que calcule esto y lo muestre por pantalla leyendo por teclado el saldo inicial con el que
se quiere abrir la cuenta.*/
		
		double saldoInic, mantenimiento=1, intereses=3, cien=100, saldoFinal, resulMant, resulInt;
		
		System.out.println("Ingrese el saldo inicial: ");
		saldoInic=Leer.datoDouble();
		
		resulMant=saldoInic*mantenimiento/cien;
		resulInt=saldoInic*intereses/cien;
		saldoFinal=saldoInic+resulInt-resulMant;
		
		System.out.printf("Su saldo al final del año sera: %.2f",saldoFinal);
		
	}

}
