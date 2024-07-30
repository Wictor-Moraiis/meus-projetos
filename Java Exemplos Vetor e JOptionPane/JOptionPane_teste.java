import java.util.Scanner;

import javax.swing.JOptionPane;

public class JOptionPane_teste {

    public static void main(String[] agrs) {

        JOptionPane.showMessageDialog(null,"Aqui esta a Mensagem", "Título", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showConfirmDialog(null, "mensagem");

        Object[] op = {"um","dois","três","quatro"};

        JOptionPane.showInputDialog(null, "Escolha", "TOPERSON", JOptionPane.QUESTION_MESSAGE, null,op,"um");

        Object[] opcoes = {"Um","Dois","Tres","Quatro"};

        JOptionPane.showOptionDialog(null, "Escolha", "Título", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE, null,opcoes,"tres");

        
    }
    
}
