import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);

        
        String nome;

        System.out.println("Digite o nome correto");
        nome = leia.nextLine().toUpperCase();

        if (nome.equals("WICTOR")) {

            System.out.println("O nome está correto");

        } else{

            System.out.println("O nome está incorreto");
        }
    }
}