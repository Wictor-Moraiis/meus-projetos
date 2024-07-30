import java.util.Scanner;

public class enquanto {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);

        int i=0, tab = 0;

        System.out.println("Digite a tabuada desejada");
        tab = leia.nextInt();

        while (i <= 10) {
          System.out.println(tab + " X " + 1 + " = " + (tab*i));
          i = i + 1;

        }

        //do {

         //   System.out.println(i);
         // i = i + 1;
            
        //} while (i<0);

    }

}