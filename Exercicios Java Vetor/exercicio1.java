import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);

        int ngvt = 0;

        double soma = 0;

        double[] num = new double[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite a " + (i + 1) + "º posição do vetor");
            num[i] = leia.nextDouble();

        }

        for (int i = 0; i < 10; i++) {

            if (num[i] >= 0) {

                soma = soma + num[i];

            } else {

                ngvt++;
            }
        }

        System.out.println("A soma dos números positivos é: " + soma);
        System.out.println("A quantidade de números negativos é: " + ngvt);
        leia.close();

    }

}
