import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = "Johnny Max";
        String tipoConta = "Corrente";
        double saldo = 1500.00;
        double transferencia = 0;
        double depositar = 0;
        int opcao = 0;

        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo da conta: " + saldo + "\n");

        String menu = """
                Digite sua opção
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        //Selecionar opções
        while (opcao != 4) {
            System.out.println(menu);
            opcao = scan.nextInt();

            //Consultar saldo
            if (opcao == 1) {
                System.out.println("Seu saldo é: R$" + saldo);
                break;
            }

            //Fazer transferencia
            if (opcao == 2) {
                System.out.println("Digite valor que ira transferir: ");
                transferencia = scan.nextDouble();


                if (saldo >= transferencia) {
                    System.out.println("Valor transferido: " + (transferencia) + "\nSaldo atual da conta: " + (transferencia - saldo));
                    break;
                } else {
                    System.out.println("Saldo insuficiente");
                    break;
                }
            }


            //opção de depositar
            if (opcao == 3) {
                System.out.println("Digite valor que deseja depositar: ");
                depositar = scan.nextDouble();
                System.out.println("Valor depositado: R$" + depositar + "\nValor atual da conta: R$" + (saldo + depositar));
                break;
            }
            if (opcao > 4) {
                System.out.println("Opção invalida");
            }
        }
        //opção de sair
        System.out.println("Atendimento encerrado");
    }
}

