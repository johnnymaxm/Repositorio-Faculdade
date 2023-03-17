package faculexercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args){
		
		var sc = new Scanner(System.in);
		var df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		System.out.print("Temperature F: ");
		double f = sc.nextDouble();
		

		
		double soma = (f-32)*5/9;
		System.out.print("Temperatura em C: " + df.format(soma));
	}
	
	//public static void Print(String parameter){
		//System.out.print(parameter);
	//}
}
