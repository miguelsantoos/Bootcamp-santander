package edu.miguel.tema.metodos;

public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void diminuirCanal() {
        canal = --canal;
    }

    public void aumentarCanal() {
        canal = ++canal;
    }

    public void diminuirVolume() {
        volume = --volume;
    }

    public void aumentarVolume() {
        volume = ++volume;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }


}
