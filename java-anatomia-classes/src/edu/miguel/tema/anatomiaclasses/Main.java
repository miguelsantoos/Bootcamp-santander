package edu.miguel.tema.anatomiaclasses;

public class Main {

    public static void main(String[] args) {

        String primeiroNome = "Miguel";
        String segundoNome = "Maxmillian";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto ( String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}