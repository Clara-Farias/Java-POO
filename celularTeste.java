package aulas;

public class celularTeste {
    public static void main(String[]args){
        celular CelularA = new celular();

        CelularA.nome = "Iphone 12";
        CelularA.tamanhoDeTela = 6.1f;
        CelularA.espacoArmazenamento = 256;
        CelularA.so = "IOS";

        System.out.format("--------------------------------------\nCelular %s\nCom Tela de %f\n%dGB\nSistema Operacional %s\n--------------------------------------",CelularA.nome,CelularA.tamanhoDeTela,CelularA.espacoArmazenamento, CelularA.so);

        celular CelularB = new celular();

        CelularB.nome = "Galaxy A03";
        CelularB.tamanhoDeTela = 6.5f;
        CelularB.espacoArmazenamento = 258;
        CelularB.so = "Android";

        System.out.format("--------------------------------------\nCelular %s\nCom Tela de %f\n%dGB\nSistema Operacional %s\n--------------------------------------",CelularA.nome,CelularA.tamanhoDeTela,CelularA.espacoArmazenamento, CelularA.so);

        celular CelularC = new celular();

        CelularC.nome = "Redmi Note 7";
        CelularC.tamanhoDeTela = 6.3f;
        CelularC.espacoArmazenamento = 158;
        CelularC.so = "Android 9.0";

        System.out.format("--------------------------------------\nCelular %s\nCom Tela de %f\n%dGB\nSistema Operacional %s\n--------------------------------------",CelularC.nome,CelularC.tamanhoDeTela,CelularC.espacoArmazenamento, CelularC.so);
    }
}
