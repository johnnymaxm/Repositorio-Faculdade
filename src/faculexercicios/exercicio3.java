package faculexercicios;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Valor em dolar: ");
		double dollar = sc.nextDouble();
		
		double resultado = (dollar * 5.75);
		System.out.print("Resultado em Reais: R$" + resultado);
				
	}
}
