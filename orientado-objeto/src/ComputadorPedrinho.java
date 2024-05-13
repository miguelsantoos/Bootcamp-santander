public class ComputadorPedrinho {

    public static void main(String[] args) {
        MSNMensagem msn = new MSNMensagem();
        msn.enviarMensagem();
        msn.recebrMensagem();
        System.out.println("");

        FacebookMensagem fcb = new FacebookMensagem();
        fcb.enviarMensagem();
        fcb.recebrMensagem();
        System.out.println("");

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.recebrMensagem();
    }

}
