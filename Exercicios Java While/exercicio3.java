import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0;

        System.out.println("Digite o primeiro número:");
        num1 = leia.nextInt();

        System.out.println("Digite o segundo número:");
        num2 = leia.nextInt();

        System.out.println("Digite o terceiro número:");
         num3 = leia.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println(+ num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(+ num1 + " " + num3 + " " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println(+ num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(+ num2 + " " + num3 + ", " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println(+ num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(+ num3 + " " + num2 + " " + num1);
            }
        }
    }
}