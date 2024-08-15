import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO
       Scanner scanner = new Scanner(System.in);
       int numeroConta = 0;
       String agencia = "";
       String nomeCliente = "";
       double saldoConta = 0.0;
       System.out.println("Por Favor, digite o número da agencia!");
       agencia = scanner.next();
       System.out.println("Por Favor, digite o número da conta!");
       numeroConta = scanner.nextInt();
       System.out.println("Por Favor, digite seu nome!");
       nomeCliente = scanner.next();
       System.out.println("Por Favor, digite seu saldo!");
       saldoConta = scanner.nextDouble();
       System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+", conta "+ numeroConta+" e seu saldo "+ saldoConta+" já está disponivel para saque.");

    }
}
