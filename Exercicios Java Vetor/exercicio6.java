import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);

        int quant = 0, media = 0;

        double mediapreco = 0, precomedia = 0;

        double[] preco = new double[5];

        int[] cod = new int[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Insira o preço do " + (i + 1) + "º produto");
            preco[i] = leia.nextDouble();

        }

        for (int i = 0; i < 5; i++) {

            System.out.println("Insira o codigo do " + (i + 1) + "º produto");
            cod[i] = leia.nextInt();

        }

        for (int i = 0; i < 5; i++) {

            if (preco[i] < 50) {

                quant++;

            }
        }
        System.out.println("A quantidade de produtos com preço inferior a R$ 50 é: " + quant);
        System.out.println("\n");
        System.out.println("O código dos produtos entre R$ 50 e R$ 100 é: ");
        for (int i = 0; i < 5; i++) {

            if (preco[i] >= 50 && preco[i] <= 100) {

                System.out.print(+cod[i] + " ");

            }
        }

        for (int i = 0; i < 5; i++) {

            if (preco[i] > 100) {

                media++;

                precomedia = precomedia + preco[i];

                mediapreco = precomedia / media;

            }
        }
        System.out.println("\n");
        System.out.println("A média dos preços de produtos com preço maior que R$ 100 é: " + mediapreco);
        leia.close();

    }

}
