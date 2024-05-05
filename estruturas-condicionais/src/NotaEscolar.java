public class NotaEscolar {

    public static void main(String[] args) {

        // TODO: Forma com condições ternarias
        int nota = 6;

        String resultado1 = nota >= 7 ? "Aprovado" : nota <= 7 && nota >=  5 ? "Recuperação" : "Reprovado";
        System.out.println(resultado1);

        /**
         *  Nesse forma ternaria o resultado é armazenado numa variavel
         *  podendo ser usado de varias forma, como imprimir na tela, enviar um sms
         *  ou guardar num arquivo.
         */
        String resultado2 = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado2);



        // TODO: Forma com condições encadeadas
        /*if (nota >= 7) {
            System.out.println("Aprovado");
        }else if(nota < 7 && nota >= 5) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }*/
    }
}
