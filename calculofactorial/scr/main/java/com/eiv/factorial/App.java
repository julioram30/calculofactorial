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
		CalculoFactorialImpl Factorial =new CalculoFactorialImpl();
		
		resultado=Factorial.Calcular(entero);
	    System.out.println(resultado);
	}

}
