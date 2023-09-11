import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 234.563;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número da Agência: ");
		String agencia = input.next();
		
		System.out.print("Digite o número da conta: ");
		int numero = input.nextInt();
		
		System.out.printf("Digite o nome do cliente: ");
		String nomeCliente = input.next();
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
		System.out.println("[Agência: " + agencia + "]" + " | [Conta: " + numero + "] |"
				+ " [Saldo disponível: $ " + saldo + "]");
		System.out.println("--------------------------------------------------------------");
    }
}
