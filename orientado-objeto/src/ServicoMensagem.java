public abstract class ServicoMensagem {

    public abstract void enviarMensagem();
    public abstract void recebrMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Verificando se estar conectado na internet");
    }

    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando historico de mensagem");
    }
}
