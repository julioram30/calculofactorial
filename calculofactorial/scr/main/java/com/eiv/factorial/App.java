package com.eiv.factorial;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long resultado;
		String sTrentero;
		Scanner entrada = new Scanner(System.in);
		sTrentero=entrada.nextLine();
		int entero=Integer.parseInt(sTrentero);
		CalculoFactorialAlt2Impl Factorial =new CalculoFactorialAlt2Impl();
		
		resultado=Factorial.Calcular(entero);
	    System.out.println(resultado);
	}

}
