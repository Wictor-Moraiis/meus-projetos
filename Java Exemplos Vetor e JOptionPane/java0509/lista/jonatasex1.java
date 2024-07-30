import java.util.Scanner;

public class jonatasex1 {
    public static void main(String[] args) {
        
    
    Scanner leia = new Scanner(System.in);

    int peso;
    double alt;
    double imc;

    System.out.println("Digite seu peso: ");
        peso = leia.nextInt();

    System.out.println("Digite sua altura: ");
        alt = leia.nextDouble();

    imc = peso / (alt * alt);

    System.out.println("O seu IMC é igual a " +imc);

    if (imc < 18.5){
        
        System.out.println("Você esta abaixo do peso ideal");
   
    }else if(imc >= 18.6 && imc < 24.9){
        
        System.out.println("Você esta no peso ideal");
   
    }else if(imc >= 25.0 && imc < 29.9){
        
        System.out.println("Você esta acima do peso (sobrepeso)");
    
    }else if(imc >= 30 && imc < 34.9){
        
        System.out.println("Obesidade Grau I");
    
    }else if(imc >= 35 && imc < 39.9){
        
        System.out.println("Obesidade Grau II");
    
    }else if(imc >= 40){
        System.out.println("Obesidade Grau III");
    }



    
    }
}
