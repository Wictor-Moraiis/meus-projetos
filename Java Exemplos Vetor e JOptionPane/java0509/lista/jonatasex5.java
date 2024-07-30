import java.util.Scanner;

public class jonatasex5 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in,"CP850");
        
        String time;

        
        System.out.println("Corinthians");
        System.out.println("São Paulo");
        System.out.println("Palmeiras");
        System.out.println("Santos");
        System.out.println("Digite o time para qual você torce:");
        time = leia.nextLine().trim();
        

        if(time.equalsIgnoreCase("Corinthians")){
            System.out.println("Você é corintiano!");
        }
        else if(time.equalsIgnoreCase("São Paulo")){
            System.out.println("Você é São Paulino");
        }

        else if(time.equalsIgnoreCase("Palmeiras")){
            System.out.println("Você é palmeirense");
        }
        else if(time.equalsIgnoreCase("Santos")){
            System.out.println("Você é santista");
        
    }else{
        System.out.println("O time que você digitou não foi reconhecido ou não faz parte desses: Corinthians, São Paulo, Palmeiras e Santos");
    }
    }
}
