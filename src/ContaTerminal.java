import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite a agência exemplo: 123-4");
        String agencia = sc.next();

        System.out.println("Por favor, digite Nome Cliente!");
        String nomeCliente = sc.next().toUpperCase();

        System.out.println("Por favor, digite o Saldo!");
        double saldo = sc.nextDouble();

        String mensagem = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
            nomeCliente, agencia, numero, saldo
        );

        System.out.println(mensagem);

        sc.close();
    }
}
