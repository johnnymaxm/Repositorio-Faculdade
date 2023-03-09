package pack;

import java.util.Scanner;

public class Salario {
	
	public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	
	System.out.println ("Digite seu nome: ");
	var name = sc.next();
	
	System.out.println ("Digite seu salário: ");
	double salario = sc.nextDouble();
	
	System.out.println ("Digitar a porcentagem do aumento: ");
	double porcentagem = sc.nextDouble();

	System.out.println ("Salario com aumento: = "+ soma(salario,porcentagem));
	}

	
	public static double soma(double salario, double porcentagem) {
		var soma = (salario * porcentagem)/100 + salario;
		return soma;
	}
}