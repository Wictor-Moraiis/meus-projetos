import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);

        int num = 0;
        String nome;

        System.out.println("Digite um nome");
        nome = leia.nextLine().toUpperCase();

        if (nome.equals("WICTOR")) {

            System.out.println("O nome está correto");

        } else{

            System.out.println("O nome está incorreto");
        }

        if(num > 10 && num < 20){


        }

        if(num == 10 || num == 20){

            
        }
    }
}
