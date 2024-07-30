import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double media;
        String mencao = "";
        String nome;

        System.out.println("Digite seu nome");
        nome = leia.nextLine();
        System.out.println("Digite sua nota da primeira prova");
        nota1 = leia.nextDouble();
        System.out.println("Digite sua nota da segunda prova");
        nota2 = leia.nextDouble();
        System.out.println("Digite sua nota da terceira prova");
        nota3 = leia.nextDouble();
        media = ((nota1 + nota2 + nota3) / 3);

        if (media < 5) {
            mencao = "I";
        } else if (media < 7) {
            mencao = "R";
        } else if (media < 9) {
            mencao = "B";
        } else if (media <= 10) {
            mencao = "MB";
        } 
        System.out.println("O aluno, " + nome + ", teve como média a nota, " + media + ", e com isso a sua menção foi: " + mencao);
    }

}
