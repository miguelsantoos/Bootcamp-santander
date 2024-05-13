public class Telegram extends ServicoMensagem{
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem do Telegram");
        salvarHistoricoMensagem();
    }

    @Override
    public void recebrMensagem() {
        System.out.println("Recebendo mensagem do Telegram");
    }
}
