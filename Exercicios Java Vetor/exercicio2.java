import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);

        int i = 0;

        int[] num = new int[5];

        for (i = 0; i < 5; i++) {

            System.out.println("Digite a " + (i + 1) + "º posição do vetor");
            num[i] = leia.nextInt();

        }
        System.out.println("Os números positivos são:");
        for (i = 0; i < 5; i++) {

            if (num[i] >= 0) {

                System.out.print(" " + num[i]);

            }

        }
        leia.close();

    }

}
