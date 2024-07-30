import java.util.Scanner;

public class se_senao {
    public static void main(String[] args) throws Exception {
     Scanner leia = new Scanner(System.in);
     
     int num;

     System.out.println("Digite um número");
     num = leia.nextInt();

     if(num < 0){

        System.out.println("O número "+num+" é negativo");
     }else if(num == 0){
        System.out.println("O número "+num+" é neutro");
     }else{
        System.out.println("O número "+num+" é positivo");
     }

    }
}
