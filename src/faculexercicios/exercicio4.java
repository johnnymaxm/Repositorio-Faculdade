package faculexercicios;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num1 = sc.nextInt();
		
		System.out.print("Numero sucessor: " + (num1 + 1));
		
		System.out.println("\nNumero antecessor: " + (num1 - 1));
  }
}
