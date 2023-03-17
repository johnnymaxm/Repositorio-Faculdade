package faculexercicios2;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int num1 = sc.nextInt();

		if (num1 > 0) {
			System.out.println(num1 + " é positivo!");
		} else {
			if (num1 < 0) {
				;
				System.out.println(num1 + " é negativo!");
			} else {
				System.out.println(num1 + " é nulo");
			}

		}
	}
}