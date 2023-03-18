package pack;

import java.util.Scanner;

public class Desafiovitor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Primeiro nome: ");
		var nome = sc.nextLine();
		System.out.println("Sobrenome: ");
		var sobrenome = sc.nextLine();
		
		if (nome.length() <= 3 || nome.length() >= 15) {
			throw new IllegalArgumentException("Too long or too short name");
		}
		
		if (sobrenome.length() <= 3 || sobrenome.length() >= 15) {	
			throw new IllegalArgumentException("Too long or too short name");
		}

		if(Pattern.matches(".*[a-zA-Z]+.*", name)){
            throw new IllegalArgumentException("It's not possible to insert special character.");
        }
		
		System.out.println(nome + " " + sobrenome);
	}
}