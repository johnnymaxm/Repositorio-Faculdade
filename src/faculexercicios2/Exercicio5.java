package faculexercicios2;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Primeira nota: ");
		var nota1 = sc.nextDouble();

		System.out.print("Segunda nota: ");
		var nota2 = sc.nextDouble();

		System.out.print("Terceira nota: ");
		var nota3 = sc.nextDouble();

		System.out.print("Quarta nota: ");
		var nota4 = sc.nextDouble();

		double soma = (nota1 + nota2 + nota3 + nota4) / 4;

		if (soma >= 5) {
			System.out.println("Valor de sua média das 4 avaliações " + soma + ", com isso você foi aprovado!!");
		} else {
			System.out.print("Valor de sua média das 4 avaliações " + soma + ", com isso você foi reprovado!!");

		}
	}
}
