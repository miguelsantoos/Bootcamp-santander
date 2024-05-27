package com.miguel.set.operaçoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosPalavrasUnicas {

    private Set<String> setPalvras;

    public ConjuntosPalavrasUnicas() {
        this.setPalvras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        setPalvras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (setPalvras.contains(palavra)){
            setPalvras.remove(palavra);
        }
    }

    public void verificarPalavra(String palavra) {
        if (setPalvras.contains(palavra)) {
            System.out.println("palavra cadastrada");
        }
    }

    public void exibirPalavras() {
            System.out.println(setPalvras);
    }

    public static void main(String[] args) {
        ConjuntosPalavrasUnicas cpu = new ConjuntosPalavrasUnicas();

        cpu.adicionarPalavra("um");
        cpu.adicionarPalavra("dois");
        cpu.adicionarPalavra("tres");
        cpu.adicionarPalavra("quatro");
        cpu.adicionarPalavra("cinco");
        cpu.adicionarPalavra("cinco");

        cpu.verificarPalavra("um");

        cpu.exibirPalavras();

        cpu.removerPalavra("cinco");

        cpu.exibirPalavras();
    }
}
