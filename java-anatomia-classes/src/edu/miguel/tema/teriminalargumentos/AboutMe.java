package edu.miguel.tema.teriminalargumentos;

public class AboutMe {

    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        String idade = args[3];
        String alturra = args[4];

        System.out.println("Olá, me chamo " + nome + sobrenome);
        System.out.println("Tenho de " + idade + " idade");
        System.out.println("E tenho " + alturra + " de altura");

    }
}
