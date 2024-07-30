import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);

        int[] num = new int[7];

        for (int i = 0; i < 7; i++) {

            System.out.println("Digite a " + (i + 1) + "º posição do vetor");
            num[i] = leia.nextInt();

        }
        System.out.println("Os números multiplos de dois são:");
        for (int i = 0; i < 7; i++) {

            if (num[i] % 2 == 0) {

                System.out.print(+num[i] + " ");
            }

        }
        System.out.println("\n");
        System.out.println("Os números multiplos de três são:");
        for (int i = 0; i < 7; i++) {

            if (num[i] % 3 == 0) {

                System.out.print(+num[i] + " ");
            }

        }
        System.out.println("\n");
        System.out.println("Os números multiplos de dois e três são:");
        for (int i = 0; i < 7; i++) {

            if (num[i] % 2 == 0 && num[i] % 3 == 0) {

                System.out.print(+num[i] + " ");
            }

        }
        leia.close();

    }

}
