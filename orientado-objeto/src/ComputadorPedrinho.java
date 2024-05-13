import java.util.Scanner;

public class ComputadorPedrinho {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual app: ");
        String appEscolhido = scanner.next();

        ServicoMensagem sm = null;

        if (appEscolhido.equals("MSN")) {
            sm = new MSNMensagem();
        } else if (appEscolhido.equals("Face")) {
            sm = new FacebookMensagem();
        }else if (appEscolhido.equals("tele"))
            sm = new Telegram();

        sm.enviarMensagem();
        sm.recebrMensagem();
    }

}
