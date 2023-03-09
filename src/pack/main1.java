package pack;
import java.util.Scanner;
public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("coloque 4 numeros: ");
		var n1 = sc.nextInt();
		var n2 = sc.nextInt();
		var n3 = sc.nextInt();
		var n4 = sc.nextInt();
		//var soma =  n1 + n2 + n3 + n4;
		System.out.println("soma total: "+soma(n1,n2,n3,n4));
	}


	public static int soma(int n1, int n2, int n3, int n4) {
		var soma = n1 + n2 + n3 + n4;
		return soma;
		
	}
}