import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        
        System.out.println("Selecione a operação que deseja calcular:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int escolha = leia.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = leia.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = leia.nextDouble();

        double resultado = 0;

        if (escolha == 1) {
            resultado = num1 + num2;
        } else if (escolha == 2) {
            resultado = num1 - num2;
        } else if (escolha == 3) {
            resultado = num1 * num2;
        } else if (escolha == 4) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
                System.exit(1); 
            }
        } else {
            System.out.println("Escolha de operação inválida.");
            System.exit(1); 
        }

        System.out.println("O resultado da operação é: " + resultado);

        leia.close();
    }
}