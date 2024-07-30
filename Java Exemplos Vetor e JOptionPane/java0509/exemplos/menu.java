import java.util.Scanner;

public class menu{
    public static void main(String[] args) {
        
        int op = 0, codigo;
        String nome, cpf;
    
        while(op !=5){
            System.out.println("1 - Cadastrar \n2- Consultar\n3 - Alterar \n4 - Excluir \n5 - Sair");
            op = leia.next();
        
            if(op == 1){
                System.out.println("Cadastro de Usúario \n");
                System.out.println("Digite o nome do usúario");
                nome = leia.next();
                System.out.println("Digite o CPF do usuário");
                cpf = leia.next();
                System.out.println("Digite o código do usúario");
                codigo = leia.nextInt();
            }else if(op == 2){
                System.out.println("Consultar usuario");

            }else if(op == ){
                System.out.println("Alterar usuario");
            }

            }
        }
}
