import java.util.Scanner;

public class vetor1 {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);

        int[]num = new int[5];
        int soma = 0;

        for(int i = 0; i<5;i++){

            System.out.println("Digite um número");
            num[i] = leia.nextInt();

            soma = soma + num[i];
        }
        System.out.println("A soma dos números é "+soma);
    }
}
