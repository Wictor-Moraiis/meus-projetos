import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
    
        int num;
        String nome;

        System.out.println("Digite um nome: ");
        nome = leia.nextLine().toUpperCase();

        if(nome.equals("Denilson")){
            System.out.println("O seu nome é igual a Denilson");
        }else{
            System.out.println("O seu nome não é Denilson");
        }
    
    }
}
