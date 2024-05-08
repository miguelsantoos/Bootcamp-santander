package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();


        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();;
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();


        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.servindoMesa();


        cliente.pagarConta();
        atendente.receberPagamento();
    }
}