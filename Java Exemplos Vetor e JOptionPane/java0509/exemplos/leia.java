import java.util.Scanner;

public class leia {
    public static void main(String[] args) {
        
    Scanner leia = new Scanner(System.in);
    
    int num;
    int conta;
    String nome;

    System.out.println("Digite um número: ");
    num = leia.nextInt();
    System.out.println("Digite o seu nome: ");
    nome = leia.next();

    System.out.println("O seu nome é " +nome);
    System.out.println("O seu número é " +num);

    conta = num + 1999;
    System.out.println("O seu numero somado a 20001 é igual a " +conta);

    if (conta < 2000)
    System.out.println("O valor total da sua conta é menor que 2000");

    if (conta > 2000)
    System.out.println("O valor total da sua conta é maior que 2000");

    



    }
}
