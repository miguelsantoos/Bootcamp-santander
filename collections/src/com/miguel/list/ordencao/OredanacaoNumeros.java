package com.miguel.list.ordencao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OredanacaoNumeros {

    private List<Integer> listNumeros;

    public OredanacaoNumeros() {
        this.listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listNumeros.add(numero);
    }

    public List<Integer> numerosAscendente() {
        List<Integer> listAscendente = new ArrayList<>(listNumeros);
        Collections.sort(listAscendente);
        return listAscendente;
    }

    public List<Integer> numerosDescente() {
        List<Integer> listAscendente = new ArrayList<>(listNumeros);
        listAscendente.sort(Collections.reverseOrder());
        return listAscendente;
    }

    public static void main(String[] args) {
        OredanacaoNumeros on = new OredanacaoNumeros();
        on.adicionarNumero(2);
        on.adicionarNumero(1);
        on.adicionarNumero(5);
        on.adicionarNumero(8);
        on.adicionarNumero(3);
        on.adicionarNumero(6);
        on.adicionarNumero(4);
        on.adicionarNumero(7);
        on.adicionarNumero(10);
        on.adicionarNumero(9);

        System.out.println("ORDENADO ASECENDENTE");
        System.out.println(on.numerosAscendente());


        System.out.println("");
        System.out.println("ORDENADO DESCENDENTE");
        System.out.println(on.numerosDescente());
    }
}
