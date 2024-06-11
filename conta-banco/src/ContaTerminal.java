import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        // Obter pelo scanner os valores digitados no terminal

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        // Exibir a mensagem conta criada

        System.out.println("Olá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + agencia + ", conta " + numero + " e seu saldo " 
            + saldo + " já está disponível para saque.");
    }
}
