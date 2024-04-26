package edu.miguel.tema.anatomiaclasses;

public class AulaIDentacao {

    public static void main(String[] args) {

        int nota = 7;

        if (nota < 6) {
            System.out.println("REPROVADO");
        } else if (nota == 6) {
            System.out.println("NA MEDIA");
        }else {
            System.out.println("APROVADO");
        }

    }
}
