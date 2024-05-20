package com.miguel.list;

import java.util.ArrayList;
import java.util.List;

public class GenericExempleList {

    public static void main(String[] args) {

        // Lista sem generic
        List listaSemGeneric = new ArrayList();

        listaSemGeneric.add("Elemento 1");
        listaSemGeneric.add(10);

        // Lista com generic
        List <String> listaGeneric = new ArrayList<>();

        listaGeneric.add("Elemento 1");
        listaGeneric.add("Elemento 2");

        for (String elemento : listaGeneric){
            System.out.println(elemento);
        }

        for (Object elemento : listaSemGeneric) {
            System.out.println(elemento);
        }
    }
}
