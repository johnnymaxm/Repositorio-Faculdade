import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*
         * Pedir o usuario que coloque o nome e sobrenome Validações( 3 a 15 sem
         * caracteres especiais) validar os numero Não menor que 0 e não maior que 100 E
         * apresentar mensagem de erro
         */

        Scanner scan = new Scanner(System.in);

        // Validação do nome
        System.out.println("Digite seu nome: ");
        var firstName = scan.nextLine();

        var isNomeValido = validacoesNome(firstName); // false
        if(!isNomeValido){
            System.out.print("DJSKALDJASLJKDSA");
            return;
        }

        // Validação do sobrenome
        System.out.println("Digite seu sobrenome: ");
        var lastName = scan.nextLine();

        var isSobrenomeValido = validacoesSobrenome(lastName);
        if(!isSobrenomeValido){
            System.out.print("DJSKALDJASLJKDSA");
            return;
        }

        // Validação dos numeros
        System.out.println("Digite um numero ");
        var userInput1 = scan.nextInt();
        if ((userInput1 < 0 || userInput1 > 100)) {
            System.out.println("Numero é melhor que 0 ou maior que 100");
            return;
        }

        System.out.println("Digite o segundo numero: ");
        var userInput2 = scan.nextInt();
        if ((userInput2 < 0 || userInput2 > 100)) {
            System.out.println("Numero é melhor que 0 ou maior que 100");
            return;
        }

        System.out.println("Digite o terceiro numero: ");
        var userInput3 = scan.nextInt();
        if ((userInput3 < 0 || userInput3 > 100)) {
            System.out.println("Numero é melhor que 0 ou maior que 100");
            return;
        }
        System.out.println(firstName + " " + lastName);
        System.out.println("Numeros digitado: " + userInput1 + " " + userInput2 + " " + userInput3);
    }


    public static boolean validacoesNome(String nome) {
        if (nome.length() <= 2 || nome.length() >= 15) {
            return false;
        }

//        if (sobrenome.length() <= 2 || sobrenome.length() >= 15) {
//            return false;
//        }

        if (!Pattern.matches("[a-zA-Z]+", nome)) {
            return false;
        }

//        if (!Pattern.matches("[a-zA-Z]+", sobrenome)) {
//            return false;
//        }

        return true;
    }

    public static boolean validacoesSobrenome(String sobrenome) {
//        if (nome.length() <= 2 || nome.length() >= 15) {
//            return false;
//        }

        if (sobrenome.length() <= 2 || sobrenome.length() >= 15) {
            return false;
        }

//        if (!Pattern.matches("[a-zA-Z]+", nome)) {
//            return false;
//        }

        if (!Pattern.matches("[a-zA-Z]+", sobrenome)) {
            return false;
        }

        return true;
    }
}