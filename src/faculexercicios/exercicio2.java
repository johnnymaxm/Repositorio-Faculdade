package faculexercicios;

import java.util.Scanner;
import java.util.*;

public class exercicio2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite primeiro numero: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite segundo numero: ");
		int num2 = sc.nextInt();
		
		System.out.print("Digite terceiro numero: ");
		int num3 = sc.nextInt();
		
		System.out.print("digite quarto numero: ");
		int num4 = sc.nextInt();
		
		
		int soma1 = num1 + num2 + num3 + num4;
		System.out.println("resultado da soma: " + soma1);
		
		int soma2 = (num1 + num2 + num3 + num4)*4;
		System.out.println("Resultado da multiplicação: " + soma2);
		
		int soma3 = num1 * num2 * num3 * num4;
		System.out.println("Resultado da multiplicação: " + soma3);
			
	}
}
