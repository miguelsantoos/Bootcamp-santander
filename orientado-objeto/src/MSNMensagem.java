public class MSNMensagem {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }

    public void recebrMensagem() {
        System.out.println("Recebendo mensagem");
    }

    private void validarConectadoInternet() {
        System.out.println("Verificando se estar conectado na internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando historico de mensagem");
    }
}