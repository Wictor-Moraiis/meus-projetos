import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);

        int i = 0, a = 0;

        double vendatot = 0;

        int[] peca = new int[10];

        double[] preco = new double[10];

        double[] vendas = new double[10];

        for (i = 0; i < 10; i++) {

            System.out.println("Digite a quantidade de peças que o " + (i + 1) + "º vendedor vendeu");
            peca[i] = leia.nextInt();

        }

        for (i = 0; i < 10; i++) {

            System.out.println("Digite o preço de cada peça que o " + (i + 1) + "º vendedor vendeu");
            preco[i] = leia.nextDouble();

        }

        for (a = 0; a < 10; a++) {
            vendas[a] = preco[a] * peca[a];

        }

        for (a = 0; a < 10; a++) {
            vendatot = vendatot + vendas[a];

        }

        System.out.println("As vendas totais foram: " + vendatot);

        for (a = 0; a < 10; a++) {
            System.out.println("As vendas do " + (a + 1) + "º vendedor foram: " + vendas[a]);
        }
        leia.close();

    }

}
