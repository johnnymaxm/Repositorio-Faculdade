package pack;

public class mainmedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1 = 7.5;
		double n2 = 8.5;
		double n3 = 10;
		System.out.println ("soma total: "+soma(n1,n2,n3));
		
	}
	
	private static double soma(double n1, double n2, double n3) {
		// TODO Auto-generated method stub
		double soma = (n1 + n2 + n3)/3;
		return soma;
	}
}