public class NotaEscolar {

    public static void main(String[] args) {

        int nota = 4;

        if (nota >= 7) {
            System.out.println("Aprovado");
        }else if(nota < 7 && nota >= 5) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
    }
}
