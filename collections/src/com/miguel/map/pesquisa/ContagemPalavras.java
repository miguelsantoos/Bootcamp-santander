package com.miguel.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> listPalvras;

    public ContagemPalavras() {
        this.listPalvras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer quantidade) {
            listPalvras.put(palavra, quantidade);
    }

    public void removerPalvra(String palavra) {
        if (!listPalvras.isEmpty()) {
            listPalvras.remove(palavra);
        }
        else System.out.println("Sem nenhuma palavra");
    }

    public int exibirContagemPalavras() {
        int contagem = 0;

        if (!listPalvras.isEmpty()) {
            for (int i : listPalvras.values()) {
                contagem += i;
            }
        }
        return contagem;
    }

    public String encontrarPalavraMaisFrequente() {
        int maiorQuantidade = 0;
        String palavraMaisFrequante = null;

        if (!listPalvras.isEmpty()) {
          for (Map.Entry<String, Integer> entry : listPalvras.entrySet()) {
              if (entry.getValue() > maiorQuantidade) {
                  maiorQuantidade = entry.getValue();
                  palavraMaisFrequante = entry.getKey();
              }
          }
        }
        return palavraMaisFrequante;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
