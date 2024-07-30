import java.util.Scanner;

public class jonatasex2 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
    
        int num;
        String nome;

        System.out.println("Digite um nome: ");
        nome = leia.nextLine();

        if(nome.equalsIgnoreCase("Jonatas")){
            System.out.println("O seu nome é igual a Jonatas");
        }else{
            System.out.println("O seu nome não é igual a Jonatas");
        }
    
    }
}

