package com.miguel.map.operaçõesBasicas;

import java.util.HashMap;
import java.util.Map;

public class DicionarioService {

    private Map<String, String> dicionario;

    public DicionarioService() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String significado) {
        dicionario.put(palavra, significado);
    }

    public void removerPalavra(String palavra) {
        if (!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        }
        else System.out.println("Dicionario vazio!");
    }

    public void exibirPalavras() {
        if (!dicionario.isEmpty()) {
            System.out.println(dicionario);
        }
        else System.out.println("Dicionario vazio!");
    }

    public void pesquisarPorPalavra(String palavra) {
        if (!dicionario.isEmpty()) {
            String significado = dicionario.get(palavra);
            System.out.println(significado);
        }
        else System.out.println("Dicionario vazio!");
    }

    public static void main(String[] args) {
        DicionarioService ds = new DicionarioService();

        ds.adicionarPalavra("Amor", "natalia");
        ds.adicionarPalavra("Gostoso", "miguel");
        ds.adicionarPalavra("Linda", "raquel");
        ds.adicionarPalavra("Exemplo", "sergio");
        ds.adicionarPalavra("Parceira", "maria");

        ds.exibirPalavras();
        ds.pesquisarPorPalavra("Linda");
        ds.removerPalavra("Parceira");
        ds.exibirPalavras();

    }
}
