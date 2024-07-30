import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        double peso;
        double altura;

        System.out.println("Digite seu peso em KG");
        peso = leia.nextDouble();
        System.out.println("Digite sua altura em Metros");
        altura = leia.nextDouble();

        if (peso / (altura*altura) < 18.5) {

            System.out.println("Você está abaixo do peso ideal");
        } else if (peso / (altura*altura) < 25) {
            System.out.println("Parabéns você está em seu peso normal");
        } else if (peso / (altura*altura)< 30) {
            System.out.println("Você está acima de seu peso (sobrepeso)");
        } else if (peso / (altura*altura)< 35) {
            System.out.println("Você está com obesidade grau I");
        } else if (peso / (altura*altura)< 40) {
            System.out.println("Você está com obesidade grau II");
        } else if (peso / (altura*altura) >= 40) {
            System.out.println("Você está com obesidade grau III");
        }
    }

}
