import java.util.Scanner;

public class Digitos {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);

        int i = 0, somadigI = 0, somadigII = 0, digiI = 0, digiII = 0, digitoposi = 9, digitoposii = 10;
        int[] fixosI = { 10, 9, 8, 7, 6, 5, 4, 3, 2 };

        int[] fixosII = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 };

        int[] cpfI = new int[9];

        int[] cpfII = new int[10];

        int[] cpfIII = new int[11];

        for (i = 0; i < 9; i++) {

            System.out.println("Digite o " + (i + 1) + "º dígito do cpf para descobrir os dígitos verificadores");
            cpfI[i] = leia.nextInt();

        }

        for (i = 0; i < 9; i++) {
            fixosI[i] = cpfI[i] * fixosI[i];

        }

        for (i = 0; i < 9; i++) {
            somadigI = somadigI + fixosI[i];

        }

        if (somadigI % 11 < 2) {

            digiI = 0;

        } else {

            somadigI = somadigI % 11;
            digiI = 11 - somadigI;
        }

        for (i = 0; i < 9; i++) {

            cpfII[i] = cpfI[i];

        }

        cpfII[digitoposi] = digiI;
        System.out.println(+digiI);

        for (i = 0; i < 10; i++) {
            fixosII[i] = cpfII[i] * fixosII[i];

        }

        for (i = 0; i < 10; i++) {
            somadigII = somadigII + fixosII[i];

        }

        if (somadigII % 11 < 2) {

            digiII = 0;

        } else {

            somadigII = somadigII % 11;
            digiII = 11 - somadigII;
        }
        cpfIII[digitoposi] = digiI;

        cpfIII[digitoposii] = digiII;

        for (i = 0; i < 9; i++) {

            cpfIII[i] = cpfI[i];

        }

        System.out.println("O cpf gerado é: ");
        for (i = 0; i < 3; i++) {

            System.out.print(cpfIII[i]);

        }
        System.out.print(".");
        for (i = 3; i < 6; i++) {

            System.out.print(cpfIII[i]);

        }
        System.out.print(".");
        for (i = 6; i < 9; i++) {

            System.out.print(cpfIII[i]);

        }
        System.out.print("-");
        for (i = 9; i < 11; i++) {

            System.out.print(cpfIII[i]);

        }

    }

}
