package aulas;
import javax.swing.JOptionPane;
public class NomeCidadeIdade {
    public static void main(String[] args){

    String nome, cidade;
    int idade;
    double altura;

    nome = JOptionPane.showInputDialog("Digite o Seu Nome : ");
    cidade = JOptionPane.showInputDialog("Digite a sua Cidade : ");
    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Sua Idade :"));
    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a Sua Altura :"));

    String message = String.format("Bem-Vinde, %s!\nVocê Mora Em %\nTem %d Anos\nE %.2f de Altura",nome,cidade,idade,altura);

    JOptionPane.showMessageDialog(null, message);
    }
} 