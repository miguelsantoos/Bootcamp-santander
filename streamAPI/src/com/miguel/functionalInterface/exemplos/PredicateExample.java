package com.miguel.functionalInterface.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Miguel", "Max", "Naty", "Natalia", "Raquel","Maxmillina");

        palavras.stream()
                .filter(s -> s.length() > 5)
                 .forEach(System.out::println);
    }
}
