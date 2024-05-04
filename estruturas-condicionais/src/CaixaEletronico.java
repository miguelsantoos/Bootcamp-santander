public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 100.00;
        double valorSolicitado = 250.00;

        if (saldo >= valorSolicitado) {

            saldo = saldo - valorSolicitado;
            System.out.println(saldo);

        }else {
            System.out.println("Seu saldo é insulficiente");
        }
    }
}