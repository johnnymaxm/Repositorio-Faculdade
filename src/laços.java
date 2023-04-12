import java.util.Scanner;

public class laços {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


//        while (int i = 1; i < 3; i++) {
//            System.out.println("Digite 3: ");
//            i = scan.nextInt();
//            if (i < 0 || i > 100) {
//                throw new IllegalArgumentException("O primeiro numero é menor que 0 ou maior que 100.");
//
//            }
//        }
        int i = 1;
        do {
            System.out.println("Digite 3: ");
            }while (i < 3) ;
            i = scan.nextInt();


            if (i < 0 || i > 100) {
                throw new IllegalArgumentException("O primeiro numero é menor que 0 ou maior que 100.");
            }


        }
    }

