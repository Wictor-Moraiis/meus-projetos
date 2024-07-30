import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);

        int i = 0, soma = 0;

        while(i <= 1000) {
            soma = i + soma;
            i = i + 1;
            System.out.println(soma);



        }

    }
}
