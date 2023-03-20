import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*
         * Pedir o usuario que coloque o nome e sobrenome Validações( 3 a 15 sem
         * caracteres especiais) validar os numero Não menor que 0 e não maior que 100 E
         * apresentar mensagem de erro
         */

        Scanner sc = new Scanner(System.in);

        // Validação do nome
        System.out.println("Digite seu nome: ");
        var firstName = sc.nextLine();

        // Validação do sobrenome
        System.out.println("Digite seu sobrenome: ");
        var lastName = sc.nextLine();

        var esseNomeValido = validacoesNome(firstName, lastName);

        // Validação dos numeros
        System.out.println("Digite um numero ");
        var userInput1 = sc.nextInt();
        if ((userInput1 < 0 || userInput1 > 100)) {
            System.out.println("Numero é melhor que 0 ou maior que 100");
            return;
        }

        System.out.println("Digite o segundo numero: ");
        var userInput2 = sc.nextInt();
        if ((userInput2 < 0 || userInput2 > 100)) {
            System.out.println("Numero é melhor que 0 ou maior que 100");
            return;
        }

        System.out.println("Digite o terceiro numero: ");
        var userInput3 = sc.nextInt();
        if ((userInput3 < 0 || userInput3 > 100)) {
            System.out.println("Numero é melhor que 0 ou maior que 100");
            return;
        }
        System.out.println(firstName + " " + lastName);
        System.out.println("Numeros digitado: " + userInput1 + " " + userInput2 + " " + userInput3);
    }


    public static boolean validacoesNome(String nome, String sobrenome) {
        if ((nome.length() < 2 || nome.length() > 15)) {
            System.out.println("Nome contêm menos de 2 ou maior de 15 digitos");
            return false;
        }

        if ((sobrenome.length() < 2 || sobrenome.length() > 15)) {
            System.out.println("Sobrenome contêm menos de 2 ou maior de 15 digitos");
            return false;
        }

        if (!Pattern.matches("[a-zA-Z]+", nome)) {
            System.out.println("Erro: Contêm caracteres especiais");
            return false;
        }

        if (!Pattern.matches("[a-zA-Z]+", sobrenome)) {
            System.out.println("Erro: Contêm caracteres especiais");
            return false;
        }

        return true;
    }
}