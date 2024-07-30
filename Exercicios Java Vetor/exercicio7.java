import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);

        int i = 0, codmaiorval = 0, codmenorval = 0;

        double vendastot = 0, maiorval = 0, menorval = 0;

        double[] vendatot = new double[10];

        double[] comivend = new double[10];

        int[] vendecod = new int[10];

        double[] recebe = new double[10];

        for (i = 0; i < 10; i++) {

            System.out.println("Digite o valor total das vendas que o " + (i + 1) + "º vendedor fez");
            vendatot[i] = leia.nextDouble();

        }

        for (i = 0; i < 10; i++) {

            System.out.println("Digite a porcentagem de comissão que o " + (i + 1) + "º vendedor recebe");
            comivend[i] = leia.nextDouble();

        }

        for (i = 0; i < 10; i++) {

            System.out.println("Digite o código do  " + (i + 1) + "º vendedor");
            vendecod[i] = leia.nextInt();

        }

        for (i = 0; i < 10; i++) {

            recebe[i] = vendatot[i] * comivend[i] / 100;

            System.out.println("O código e o valor à receber do " + (i + 1) + "º vendedor são: " + vendecod[i] + " e " + recebe[i]);

            if (recebe[i] > maiorval) {

                maiorval = recebe[i];
                codmaiorval = vendecod[i];
            }

        }

        for (i = 0; i < 10; i++) {

            vendastot = vendatot[i] + vendastot;

        }
        menorval = recebe[0];
        codmenorval = vendecod[0];
        for (i = 0; i < 10; i++) {
            if (recebe[i] < menorval) {

                menorval = recebe[i];
                codmenorval = vendecod[i];

            }
        }

        System.out.println("As vendas totais foram: " + vendastot);
        System.out.println("O maior valor a receber é: " + maiorval + " do vendedor com código: " + codmaiorval);
        System.out.println("O menor valor a receber é: " + menorval + " do vendedor com código: " + codmenorval);
        leia.close();

    }

}
