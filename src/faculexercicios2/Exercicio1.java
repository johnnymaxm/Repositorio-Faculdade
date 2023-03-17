package faculexercicios2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		var num = sc.nextDouble();

		if (num > 20) {
			num = num / 2;
		}
		System.out.println(num);
	}
}
