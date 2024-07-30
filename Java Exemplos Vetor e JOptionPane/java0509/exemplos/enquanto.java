import java.util.Scanner;

public class enquanto{
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int i=0, tab= 0;

        System.out.println("Digite a tabuada desejada");
        tab = leia.nextInt();

        while(i <= 1000){
            System.out.println(tab+" X "+i+" = "+(tab*i));
            i++;
        }



        
    }
}