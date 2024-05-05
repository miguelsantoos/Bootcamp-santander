public class PlanoOperadora {

    public static void main(String[] args) {
        String plano = "G";

        /**
         *  Exeplo de onde o switch case é comumente usado,
         *  as vezes confundido com o uso do if, mas sempre deve ser analisado
         *  qual se enquadra melhor
         */

        switch (plano) {
            case "T": {
                System.out.println("5g de youtube");
            }
            case "M": {
                System.out.println("Whats gratis");
            }
            case "G": {
                System.out.println("100 ligações gratis");
            }
        }
    }
}
