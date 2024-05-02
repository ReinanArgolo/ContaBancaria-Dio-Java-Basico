import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        DadosDoUsuario dadosDoUsuario = new DadosDoUsuario();

        System.out.println("Digite o número da agência!");
        dadosDoUsuario.numeroAgencia = scanner.nextInt();

        System.out.println("Digite o número da Conta!");
        dadosDoUsuario.numeroConta = scanner.next();

        System.out.println("Digite o nome do Usuário!");
        dadosDoUsuario.nome = scanner.next();

        System.out.println("Digite o seu Saldo!");
        dadosDoUsuario.saldo = scanner.nextDouble();

        System.out.println("Olá, " + dadosDoUsuario.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + dadosDoUsuario.numeroAgencia + ", conta " + dadosDoUsuario.numeroConta + " e seu saldo atual disponível R$" + dadosDoUsuario.saldo+"!");


    }
}
