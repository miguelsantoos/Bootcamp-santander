public class FacebookMensagem extends ServicoMensagem{
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem do facebook");
        salvarHistoricoMensagem();
    }

    @Override
    public void recebrMensagem() {
        System.out.println("recebendo mensagem do facebook");
    }
}
