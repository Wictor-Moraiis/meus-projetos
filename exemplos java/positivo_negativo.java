import java.util.Scanner;

public class positivo_negativo{
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);
     
     int num;

     System.out.println("Digite um número");
     num = leia.nextInt();

     if(num % 2 == 0){

       System.out.println("O número "+num+" é par"); 

     }else{

        System.out.println("O número "+num+" é ímpar"); 
     }

    }

}