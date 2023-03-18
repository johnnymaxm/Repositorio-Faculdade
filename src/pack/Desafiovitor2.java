package pack;

import java.util.Scanner;

public class Desafiovitor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Primeiro nome: ");
		var nome = sc.nextLine();
		System.out.println("Sobrenome: ");
		var sobrenome = sc.nextLine();

		if (nome.matches("[a-zA-Z ]+") && sobrenome.matches("[a-zA-Z0-9 ]+")) {
			throw new IllegalArgumentException("Erro: A entrada não pode conter numeros ou caracteres especiais");
		}
		
		if (nome.length() <= 3 || nome.length() >= 15) {
			throw new IllegalArgumentException("Too long or too short name");
		}
		
		if (sobrenome.length() <= 3 || sobrenome.length() >= 15) {	
			throw new IllegalArgumentException("Too long or too short name");
		}
		
		System.out.println(nome + " " + sobrenome);
	}
}