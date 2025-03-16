import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        // Declaração de variáveis
        String nome;
        int conta;
        String agencia;
        double saldo;

        // Criar um objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome!");
        nome = scanner.next();

        System.out.println("Por favor, digite o número da conta!");
        conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência!");
        agencia = scanner.next();

        System.out.println("Por favor, digite seu saldo!");
        saldo = scanner.nextDouble();

        scanner.close();

        // Mensagem final
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
            + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
