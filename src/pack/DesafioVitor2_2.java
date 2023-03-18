package pack;

import java.util.Scanner;

public class DesafioVitor2_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		int num1, num2, num3 = (0);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		
		//var num1 = sc.nextInt();
		
		if ((num1 >= 0 && num1 <= 100)  && num2 >= 0 && num2 <= 100 ){
		} else {
			System.out.println("Este numero é invalido");
			return;
		}
	}
}
