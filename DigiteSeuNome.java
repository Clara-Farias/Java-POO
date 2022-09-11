package aulas;
import javax.swing.JOptionPane;
public class DigiteSeuNome {
    public static void main(String[] args) {
        String nome;

        nome = JOptionPane.showInputDialog("Digite Seu Nome Abaixo");
        String mensagem = String.format("Bem-Vinde, %s!!", nome);

        JOptionPane.showMessageDialog(null,mensagem);
    }
}
