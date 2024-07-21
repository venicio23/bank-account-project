import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {


        //Pegar dados do usuário
        Scanner entradaNumeros = new Scanner(System.in);
        Scanner entradasTextos = new Scanner(System.in);

        System.out.println("Por favor, Digite o número da sua conta: ");
        int numero = entradaNumeros.nextInt();

        System.out.println("Por favor, Digite o número da sua agencia: ");
        String agencia = entradasTextos.nextLine();

        System.out.println("Por favor, Digite o seu nome: ");
        String nomeCliente = entradasTextos.nextLine();

        System.out.println("Por favor, Digite o seu saldo: ");
        double saldo = entradaNumeros.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência "+ agencia +
                " Conta "+ numero + " e o seu saldo " + saldo + " já está disponivel para saque.");

    }
}
