import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);

        int i = 1000, num = 0;

    
        while (num <20) {
            if(i % 11 == 5){
                System.out.println(i);
                num++;
            }
            i = i + 1;
            

        }
        
    }
}