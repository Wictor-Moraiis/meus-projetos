import java.util.Scanner;

public class vetor2 {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);

        int[]num = new int[5];
        int valor = 0;

        for(int i = 0; i<5;i++){

            System.out.println("Digite um número");
            num[i] = leia.nextInt();

            
        }
        System.out.println("\n");
         for(int i = 0; i<5;i++){
            System.out.print(num[i]);


            
        
        }System.out.println("\n");
        System.out.println("Escolha o número a ser localizado");
        valor = leia.nextInt();
        System.out.println("\n");

         for(int i = 0; i<5;i++){
            if(valor == num [i]){
                System.out.println("A posição no vetor do número "+valor+"é ");

            }
        }
    }
}
