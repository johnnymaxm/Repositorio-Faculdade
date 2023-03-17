package faculexercicios2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é capital do Brasil: ");
		var nome = sc.nextLine();
	
		if (nome.equals("Brasilia")) {
			System.out.println("Resposta correta!");
		} else {
			System.out.println("Resposta errada!");
		}
		
	}
}
