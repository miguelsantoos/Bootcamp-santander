package edu.miguel.tema.metodos;

public class Usuario {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Qual canal: " + smartTv.canal);
        System.out.println("Qual volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("NOVA AÇAO - TV ligada: " + smartTv.ligada);
    }
}
