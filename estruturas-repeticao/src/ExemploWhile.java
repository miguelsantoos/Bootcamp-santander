import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50.00;

        while (mesada > 0) {

            double valorDoce = valorAleatorio();
            if(valorDoce>mesada)
                valorDoce = mesada;

            System.out.println("Valor do doce " + valorAleatorio());
            mesada = mesada - valorDoce;
        }

        System.out.println("mesada " + mesada);
        System.out.println("Joao gastou toda sua mesada em doces");

    }

    public static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,15);
    }

}
