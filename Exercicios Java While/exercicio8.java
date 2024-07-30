import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);

        int i = 1, soma = 0, num = 0;

        while (i <= 4) {
            System.out.println("Digite o terceiro número:");
            num = leia.nextInt();

            if (num % 2 == 0) {
                soma = num + soma;
               
            }
            i = i + 1;
        }

        System.out.println("A soma dos números pares é "+soma);

    }
}