import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in,"CP850");

        
        String time;

        System.out.println("Digite o seu time de futebol");
        time = leia.nextLine().toUpperCase();

        if (time.equals("SANTOS")) {

            System.out.println("Você é santista");

        } else if (time.equals("SÃO PAULO")){

            System.out.println("Você é são paulino");
        
        }  else if (time.equals("CORINTHIANS")){

            System.out.println("Você é corinthiano");
        
        }  else if (time.equals("PALMEIRAS"))

            System.out.println("Você é palmeirense");
        
    }
}