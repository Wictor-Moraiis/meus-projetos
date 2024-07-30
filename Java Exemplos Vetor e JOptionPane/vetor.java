import java.util.Scanner;

public class vetor {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);

        int i, y = 10;
        int[] primos = { 2, 3, 7, 11, 13, 17, 19, 23, 29, 31 };

        int[] num = new int[11];

        int[] somas = new int[11];

        for (i = 0; i < 11; i++) {

            System.out.println("Digite a " + (i + 1) + "º posição do vetor");
            num[i] = leia.nextInt();
             somas[i] = primos[y] + num[i];
            y--;
           
        }
  


        System.out.println("Vetor de números primos");
        for (i = 0; i < 11; i++) {
            System.out.println(primos[i] + "-");
        }
        System.out.println("\n");
        System.out.println("Vetor de números");
        for (i = 0; i < 11; i++) {
            System.out.println(num[i] + "-");
        }

    }

}
