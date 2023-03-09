package pack;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		int count = 0;
		while (count < 100) {
		    count++;
		    if (count % 10 == 0) {
		        continue;
		    }
		    System.out.println(count);
		}


	}
}