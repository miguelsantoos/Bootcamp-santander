package edu.miguel.tema.operadores;


public class Main {

    public static void main(String[] args) {
        int numero = 0;
        String sim;
        while (numero < 11) {
            sim = "sim";

            if (sim.equals("nao")){
                numero++;
                System.out.println(numero);
            }else {
                break;
            }
        }

        int resultado = numero < 11 ? numero++ : 0;
        System.out.println(resultado);
        }


    }
}
