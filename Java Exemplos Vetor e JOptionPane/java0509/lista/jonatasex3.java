import java.util.Scanner;

public class jonatasex3 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int num1;
        int num2;
        int op;
        int res;

        System.out.println("Digite o número corresponde a operação que você deseja: ");
        System.out.println("1 - Soma | 2 - Subtração | 3 - Divisão | 4 - Multiplicação");
        op = leia.nextInt();
        
        System.out.println("Digite o primeiro número da sua operação: ");
        num1 = leia.nextInt();

        System.out.println("Digite o segundo número da sua operação: ");
        num2 = leia.nextInt();

        if (op == 1){
            res = num1 + num2;

            System.out.println("O resultado da sua operação é "+res);
            System.out.println(num1+ " + " +num2+ " = " +res);
        
        }else if(op == 2){
            res = num1 - num2;

            System.out.println("O resultado da sua operação é " +res);
            System.out.println(num1+ " - " +num2+ " = " +res);
        
        }else if(op == 3){
            res = num1 / num2;

            System.out.println("O resultado da sua operação é " +res);
            System.out.println(num1+ " ÷ " +num2+ " = " +res);

        }else if(op == 4){
            res = num1 * num2;

            System.out.println("O resultado da sua operação é " +res);
            System.out.println(num1+ " X " +num2+ " = " +res);
        }
    
    }
}
