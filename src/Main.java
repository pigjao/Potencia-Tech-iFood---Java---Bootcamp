import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String nome = leitor.nextLine();

        System.out.println("Digite o número de sua agência bancária");
        String agencia = leitor.nextLine();

        System.out.println("Digite o número de sua conta bancária");
        int numero = leitor.nextInt();


        double saldo = 237.48;


        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e o seu saldo disponível é " + saldo);
    }

}
    