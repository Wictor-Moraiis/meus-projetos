import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);

        int i = 0, y = 4;

        int[] num1 = new int[5];

        int[] num2 = new int[5];

        int[] soma = new int[5];

        int somaa = 0;

        for (i = 0; i < 5; i++) {

            System.out.println("Digite o " + (i + 1) + "º número do vetor A");
            num1[i] = leia.nextInt();

        }

        for (i = 0; i < 5; i++) {

            System.out.println("Digite o " + (i + 1) + "º  número do vetor B");
            num2[i] = leia.nextInt();

        }

        for (i = 0; i < 5; i++) {

            soma[i] = num1[i] - num2[y];
            somaa = soma[i] + somaa;

            y--;

        }
        System.out.println("A soma da subtração das posições opostas do vetor A e B é igual a: " + somaa);
        leia.close();
    }

}
