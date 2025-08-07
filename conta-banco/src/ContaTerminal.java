import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: "Importar a classe scanner"
        var scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuario
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Boa tarde!\n Digite o seu nome: ");
        var name = scanner.next();
        
        System.out.println("Digite a agencia: ");
        var agencia = scanner.next();

        System.out.println("Digite a conta: ");
        var numero = scanner.nextInt();

        System.out.println("Qual o valor a colocar: ");
        var saldo = scanner.nextFloat();

        //Exibir a mesnsagem conta criada
        System.out.printf("Olá %s , obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %s e seu saldo %s ja está disponivel para saque.\n\n\n", name, agencia, numero, saldo);

    }
}
