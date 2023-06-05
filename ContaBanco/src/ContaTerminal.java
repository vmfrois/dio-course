import java.math.BigDecimal;
import java.util.Scanner;


//2. Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //2.1
        //Permita que os dados sejam inseridos via terminal sendo
        // que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
        System.out.println("Irei pedir alguns dados seus para criar a conta.");
        System.out.print("Por favor, digite seu Nome:");
        String name = sc.nextLine();

        System.out.println(name+" Por favor, digite o número da Agência:");
        String agencia = sc.nextLine();

        System.out.println("Número da conta:");
        int numero = sc.nextInt();

        System.out.println("Quanto de saldo:");
        BigDecimal saldo = sc.nextBigDecimal();


        //3
        //Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
        String retorno = "Olá ".concat(name).concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia).concat(", conta ").concat(String.valueOf(numero))
                .concat(" e seu saldo ").concat(String.valueOf(saldo)).concat(" já esta disponível para saque.");
        System.out.println(retorno);
    }
}
