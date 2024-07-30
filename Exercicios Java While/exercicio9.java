import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);

        int i = 1, soma = 0, num = 0, sim = 0, nao = 0;
       
        while(i <= 10) {
            System.out.println("Digite o " + i + "° número");
            num = leia.nextInt();

            if (num >= 10 && num <= 50 ){
                sim = sim + 1;
            } else {
                nao = nao + 1;
            }
            i = i + 1;
        }

        System.out.println("De todos os números digitados " + sim + "estão entre 10 e 50 e " + nao + "não estão entre 10 e 50");

    }
}