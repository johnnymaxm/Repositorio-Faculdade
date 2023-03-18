package pack;

import java.util.Scanner;

public class Desafiovitor2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Primeiro nome: ");
		var nome = sc.nextLine();
		System.out.println("Sobrenome: ");
		var sobrenome = sc.nextLine();

		

			if (nome.matches("[a-zA-Z ]+") && sobrenome.matches("[a-zA-Z0-9 ]+")) {
			} else {
				System.out.println("Erro: A entrada não pode conter numeros ou caracteres especiais");
				return;
			}
			
			
			
			if (nome.length() >= 3 && nome.length() <= 15) {
			} else {
				System.out.println("o nome contem minimo de 3 ou maior de 15");
				throw new Exception();
				
			}
			
			
			if (sobrenome.length() >= 3 && sobrenome.length() <= 15) {	
			} else {
				System.out.println("Sobrenome contem minimo de 3 ou maior de 15");
				return;
			}
			
			
			System.out.println(nome + " " + sobrenome);
			
		}
		}
	



	


	



	


