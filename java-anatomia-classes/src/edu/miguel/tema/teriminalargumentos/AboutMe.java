package edu.miguel.tema.teriminalargumentos;

import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        String nome;
        String sobrenome;
        String idade;
        String alturra;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome; ");
        nome = scanner.next();

        System.out.println("Digite seu sobrenome; ");
        sobrenome = scanner.next();

        System.out.println("Digite sua idade; ");
        idade = scanner.next();

        System.out.println("Digite sua altura; ");
        alturra = scanner.next();

        System.out.println("Olá, me chamo " + nome + sobrenome);
        System.out.println("Tenho de " + idade + " idade");
        System.out.println("E tenho " + alturra + " de altura");

    }
}
