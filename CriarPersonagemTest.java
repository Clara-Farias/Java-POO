package aulas;
import java.util.Scanner;
public class CriarPersonagemTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CriarPersonagem personagem = new CriarPersonagem();
        //NOME DO PERSONAGEM
        System.out.println("Qual Será o Nome do Seu Personagem? ");
        String theName = input.nextLine();
        personagem.setNomePersonagem(theName);
        System.out.println();

        // HABILIDADE
        System.out.printf("%s Pode Obter uma Habilidade, Faça sua Escolha.\n", personagem.getNomePersonagem());
        String theHabilidade = input.nextLine();
        personagem.setHabilidade(theHabilidade);
        System.out.printf("\n%s Tem Habilidade de %s !!",personagem.getNomePersonagem(), personagem.getHabilidade());
    
        //Ataque e Defesa
        System.out.printf("\n\nDigite Quanto de Ataque Inicial %s Deve Possuir\n", personagem.getNomePersonagem());
        int theAtaque = input.nextInt();
        personagem.setAtaque(theAtaque);
        System.out.printf("\n\nDigite Quanto de Defesa Inicial %s Deve Possuir\n", personagem.getNomePersonagem());
        int theDefesa = input.nextInt();
        personagem.setDefesa(theDefesa);

        System.out.printf("\n\nPersonagem %s\nCom Habilidade de %s\n%d de Ataque e %d de Defesa.",personagem.getNomePersonagem(),personagem.getHabilidade(), personagem.getAtaque(),personagem.getDefesa());

    }
}