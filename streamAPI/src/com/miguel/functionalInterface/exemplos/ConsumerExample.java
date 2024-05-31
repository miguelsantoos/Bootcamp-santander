package com.miguel.functionalInterface.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Usa o Consumer para imprimir números pares no Stream
        // Com expresão lambda e simplificada
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);


         /* Sem usar functinal interface e expresões lambdas
        for (Integer i : numeros) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/
    }
}
