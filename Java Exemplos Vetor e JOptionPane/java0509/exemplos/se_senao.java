import java.util.Scanner;

public class se_senao {
 public static void main(String[] args) {
    
    Scanner leia = new Scanner(System.in);

    int num;

    System.out.println("Digite um número para verificar se é negativo ou positivo:");
    num = leia.nextInt();

    if (num > 0) {
        
        System.out.println("O seu número "+num+ " é positivo!");
    
    }else if(num == 0){
        
        System.out.println("O seu número é neutro igual a zero");
    
    }else{
        
        System.out.println("O seu número "+num+  " é negativo");
    
       
}
 }
}