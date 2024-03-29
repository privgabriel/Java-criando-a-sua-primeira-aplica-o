import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        int opcao = 0;

        String nome = "Clark Kent";

        String tipoConta = "Corrente";

        double saldo = 1599.99;

        System.out.println("************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("\n************************");

        String menu = """
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            System.out.println("Digite sua opção: ");
            opcao = leitura.nextInt();
            if (opcao == 1){
                System.out.println("Saldo em sua conta R$" + saldo);
            } else if (opcao == 2) {
                System.out.printf("Valor que deseja retirar: R$");
                double valor = leitura.nextDouble();
                if (saldo > valor){
                    saldo -= valor;
                    System.out.println("Saldo Atual R$" + saldo);
                } else {
                    System.out.println("Saldo insuficiente!");
                }

            } else if (opcao == 3) {
                System.out.printf("Valor que deseja depositar: R$");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo Atual R$" + saldo);
            } else if (opcao == 4) {
                System.out.println("Obrigado por usar nosso banco!");
            } else {
                System.out.println("Comando invalido!");
            }
        }

    }
}
