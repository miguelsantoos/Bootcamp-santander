public class MSNMensagem extends ServicoMensagem{
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem do MSN");
        salvarHistoricoMensagem();
    }

    @Override
    public void recebrMensagem() {
        System.out.println("Recebendo mensagem do MSN");
    }
}