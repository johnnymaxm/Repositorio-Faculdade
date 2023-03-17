package faculexercicios2;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		var num = sc.nextInt();

		if (num >= 1 && num <= 10) {
			System.out.println(num + "  está entre 1 e 10!");
		} else {
			System.out.println(num + " não está entra 1 e 10!");
		}
	}
}
