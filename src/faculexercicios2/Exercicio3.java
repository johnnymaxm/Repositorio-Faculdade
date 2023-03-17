package faculexercicios2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um numero: ");
		int teclado = sc.nextInt();

		if (teclado % 2 == 0) {
			System.out.println(teclado + " é numero par");
		} else {
			System.err.println(teclado + " é numero impar");
		}
	}
}
