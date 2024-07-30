import java.util.Scanner;

public class positivo_negativo_mod {
    public static void main(String[] args) {
        
    Scanner leia = new Scanner(System.in);

    int num;

    System.out.println("Digite um número: ");
    num = leia.nextInt();
    

    //mod VisualG armazena o resto de uma divisão
    //no java é %
    //se (num mod 2 = 0) entao
    //= par

    if (num % 2 == 0){
        System.out.println("O numero " +num+ " é par");
    }else{
        System.out.println("O numero " +num+ " é impar");
    }
    }

}
