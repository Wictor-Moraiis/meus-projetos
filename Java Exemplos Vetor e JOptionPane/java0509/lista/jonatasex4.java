import java.util.Scanner;

public class jonatasex4 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        double nota1;
        double nota2;
        double nota3;
        double media; 
        double media2;

        System.out.println("Digite a nota da sua primeira prova: ");
        nota1 = leia.nextDouble();

        System.out.println("Digite a nota da sua segunda prova: ");
        nota2 = leia.nextDouble();

        System.out.println("Digite a nota da sua terceira prova: ");
        nota3 = leia.nextDouble();

        media = nota1 + nota2 + nota3;
        media2 = media / 3;
        long media3 = Math.round(media2);

        if (media2 < 4.9){

            System.out.println("A sua nota final foi " +media3);
            System.out.println("A sua menção final foi I");

        }else if(media2 >= 5 && media2 < 6.9){

            System.out.println("A sua nota final foi " +media3);
            System.out.println("A sua menção final foi R");
        
        }else if(media2 >= 7 && media2 < 8.9){

            System.out.println("A sua nota final foi " +media3);
            System.out.println("A sua menção final foi B");

        }else if(media2 >= 9 && media2 <= 10){

            System.out.println("A sua nota final foi " +media3);
            System.out.println("A sua menção final foi MB");
        }


    }
}
