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

        // Validação do sobrenome
        System.out.println("Digite seu sobrenome: ");
        var lastName = scan.nextLine();

        validacoesNome(firstName, lastName);

        // Validação dos numeros
        System.out.println("Digite um numero ");
        var userInput1 = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        var userInput2 = scan.nextInt();

        System.out.println("Digite o terceiro numero: ");
        var userInput3 = scan.nextInt();

        validacoesNum(userInput1, userInput2, userInput3);

        System.out.println(firstName + " " + lastName);
        System.out.println("Numeros digitado: " + userInput1 + " " + userInput2 + " " + userInput3);
    }

    public static boolean validacoesNome(String nome, String sobrenome) {
        if (nome.length() <= 2 || nome.length() >= 15) {
            throw new IllegalArgumentException("O nome que você escolheu é muito curto, muito grande.");
        }

        if (sobrenome.length() <= 2 || sobrenome.length() >= 15) {
            throw new IllegalArgumentException("O sobrenome que você escolheu é muito curto, muito grande.");
        }

        if (!Pattern.matches("[a-zA-Z]+", nome)) {
            throw new IllegalArgumentException("O nome contém caracteres especiais.");
        }

        if (!Pattern.matches("[a-zA-Z]+", sobrenome)) {
            throw new IllegalArgumentException("O sobrenome contém caracteres especiais.");
        }
        return true;
    }

    public static boolean validacoesNum(int num, int num2, int num3) {
        if (num < 0 || num > 100) {
            throw new IllegalArgumentException("O primeiro numero é menor que 0 ou maior que 100.");
        }
        if (num2 < 0 || num2 > 100) {
            throw new IllegalArgumentException("O segundo numero é menor que 0 ou maior que 100.");
        }
        if (num3 < 0 || num3 > 100) {
            throw new IllegalArgumentException("O terceiro número é menor que 0 ou maior que 100.");
        }

        return true;

    }
}