package aulas;

public class PersonagemTeste {
    public static void main(String[] args) {
        Personagem PersonagemA = new Personagem();

        PersonagemA.nome = "Astrid";
        PersonagemA.level = 92;
        PersonagemA.genero = "Feminino";
        PersonagemA.classe = "Assasino";
        PersonagemA.faccao = "Dark Brotherhood";
        PersonagemA.raca = "Nórdico";
        PersonagemA.forca = 800;

        System.out.println("----------------Personagens------------------------\n");
        System.out.printf("Personagem -> %s\nLevel %d\nGênero : %s\nClasse : %s\nFacção : %s\nRaça : %s\nForça : %d\n--------------------------------\n", PersonagemA.nome,PersonagemA.level,PersonagemA.genero,PersonagemA.classe,PersonagemA.faccao,PersonagemA.raca,PersonagemA.forca);
    
        Personagem PersonagemB = new Personagem();

        PersonagemB.nome = "Cicero";
        PersonagemB.level = 100;
        PersonagemB.genero = "Masculino";
        PersonagemB.classe = "Assasino";
        PersonagemB.faccao = "Dark Brotherhood";
        PersonagemB.raca = "Imperial";
        PersonagemB.forca = 930;

        System.out.printf("Personagem -> %s\nLevel %d\nGênero : %s\nClasse : %s\nFacção : %s\nRaça : %s\nForça : %d", PersonagemB.nome,PersonagemB.level,PersonagemB.genero,PersonagemB.classe,PersonagemB.faccao,PersonagemB.raca,PersonagemB.forca);
    }
}