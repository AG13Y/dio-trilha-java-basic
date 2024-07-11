import java.util.Scanner;

public class ContaTerminal {
     //Todo:Conhecer e importar a classe Scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Por favor, digite o número da Agência!");
       String agencia = scanner.nextLine();

       System.out.println("Por favor, digite o número da Conta!");
       int numero = scanner.nextInt();
       scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()

       System.out.println("Por favor, digite o nome do Cliente!");
       String nomeCliente = scanner.nextLine();

       System.out.println("Por favor, digite o saldo da Conta!");
       double saldo = scanner.nextDouble();

        //Exibir as mensagens para o nosso usuario
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
        nomeCliente, agencia, numero, saldo);

        //Obter pela scanner os valores digitados no terminal
        scanner.close();
        
        //Exibir a mensagem conta criada
    }
}
