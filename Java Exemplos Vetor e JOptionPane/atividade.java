import java.util.Scanner;

public class atividade {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);


    
        int i = 0, qtd = 0;
        String nome;

        System.out.println("Quantos nomes deseja digitar?");
        qtd = leia.nextInt();

        while (i < qtd) {
            System.out.println("Digite o" + 1 + "° nome");
            nome = leia.next();
            i++;
        }

        while (i != 2) {
            System.out.println("Digite o nome");
            nome = leia.next();

            System.out.println("Deseja continuar...? 1 - Sim ou 2 - Não");
            i = leia.nextInt();
        }
    }

}
