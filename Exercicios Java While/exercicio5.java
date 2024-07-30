import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] agrs) {

        Scanner leia = new Scanner(System.in);

        int i = 1, aluno = 0, somaaluno = 0;
        double media = 0;

        while(i <= 10) {
            System.out.println("Digite a idade do " + i + "° aluno");
            aluno = leia.nextInt();
            i = i + 1;
            somaaluno = aluno + somaaluno;
        }
        media = somaaluno / 10;

        System.out.println("A media da idade dos alunos é "+ media );

    }
}

