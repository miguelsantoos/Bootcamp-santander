package edu.miguel.tema.metodos;

public class Usuario {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Qual canal: " + smartTv.canal);
        System.out.println("Qual volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("NOVA AÇAO - TV ligada: " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("NOVA AÇAO - TV ligada: " + smartTv.ligada);

        smartTv.mudarCanal(13);
        System.out.println("NOVA AÇAO - Qual canal: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("NOVA AÇAO - Qual canal: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("NOVA AÇAO - Qual canal: " + smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("NOVA AÇAO - Qual volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("NOVA AÇAO - Qual volume: " + smartTv.volume);


    }
}
