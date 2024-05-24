package com.miguel.list.pesquisaList;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listNumeros;

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "listNumeros=" + listNumeros +
                '}';
    }

    public SomaNumeros() {
        this.listNumeros = new ArrayList<>();
    }

    public void adiconarNumero(int numero) {
        listNumeros.add(numero);
    }

    public int somarNumero() {
        int soma = 0;
        for (Integer numero : listNumeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        List<Integer> listMaior = new ArrayList<>();
        int maiorNumero = Integer.MIN_VALUE;

        for (Integer maior : listNumeros) {
            if (maior > maiorNumero) {
                maiorNumero = maior;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;

        for (Integer menor : listNumeros) {
            if (menor < menorNumero) {
                menorNumero = menor;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        for (int i = 0; i < listNumeros.size(); i++) {
            System.out.println(listNumeros.get(i));
        }
    }

    public static void main(String[] args) {
        SomaNumeros somarNumeros = new SomaNumeros();

        somarNumeros.adiconarNumero(7);
        somarNumeros.adiconarNumero(3);
        somarNumeros.adiconarNumero(2);
        somarNumeros.adiconarNumero(5);

        System.out.println("O maior numero é: "+ somarNumeros.encontrarMaiorNumero());
        System.out.println("O menor numero é: "+ somarNumeros.encontrarMenorNumero());

        System.out.println("A soma é: " + somarNumeros.somarNumero());
        somarNumeros.exibirNumeros();

    }


}


