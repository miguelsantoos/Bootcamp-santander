public class ExemploFor {
    public static void main(String[] args) {

        int contagem = 1;

        // FOR tem siguinificado de PARA...
        for (contagem = 1; contagem <= 10; contagem++){
            if (contagem % 2 == 0 )
                System.out.println(contagem);

            System.out.println("CONTAGEM " + contagem);
        }
    }
}