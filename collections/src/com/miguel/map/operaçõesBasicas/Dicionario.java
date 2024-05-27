package com.miguel.map.operaçõesBasicas;

public class Dicionario {

    private String palavra;
    private String significado;

    public Dicionario(String palavra, String significado) {
        this.palavra = palavra;
        this.significado = significado;
    }

    public String getPalavra() {
        return palavra;
    }

    public String getSignificado() {
        return significado;
    }
}
