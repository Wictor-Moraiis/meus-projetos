import java.util.Scanner;

public class para {

    public static void main(String[] agrs) {

        int i, tab;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a tabuada desejada");
        tab = leia.nextInt();

        for(i = 0; i<=10; i++){

            System.out.println(tab+"X"+i+"="+(i*tab));



        }
    }
}