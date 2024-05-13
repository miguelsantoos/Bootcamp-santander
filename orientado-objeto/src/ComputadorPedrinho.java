public class ComputadorPedrinho {

    public static void main(String[] args) {
        MSNMensagem msn = new MSNMensagem();

        msn.validarConectadoInternet();
        msn.enviarMensagem();
        msn.salvarHistoricoMensagem();

        msn.recebrMensagem();
    }

}
