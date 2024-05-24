package com.miguel.list.operaçõesBasicas;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Itens> listaDeItens;

    public CarrinhoDeCompras() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, int preco, int quantidade) {
        listaDeItens.add(new Itens(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Itens> listaParaRemover = new ArrayList<>();


        if (!listaDeItens.isEmpty()){
            for (Itens elemento : listaDeItens) {
                if (elemento.getNome().equalsIgnoreCase(nome)){
                    listaParaRemover.add(elemento);
                }
            }
            listaDeItens.removeAll(listaParaRemover);
        }
        else System.out.println("Lista vazia");
    }

    public void calcularValorTotal() {
        int valorCarrinho = 0;

        if (!listaDeItens.isEmpty()) {
            for (Itens elemento : listaDeItens) {
                valorCarrinho = valorCarrinho + (elemento.getPreco()* elemento.getQuantidade());
            }
            System.out.println("Valor total do carrinho é: " + valorCarrinho);
        }
        else System.out.println("Lista vazia");
    }

    public void descricaoCarrinho(){
        System.out.println("Alimento " + " Preço " + " Unidades ");
        for (int i = 0; i < listaDeItens.size(); i++) {
            System.out.println(listaDeItens.get(i));
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        CarrinhoDeCompras listadeItens = new CarrinhoDeCompras();

        listadeItens.adicionarItem("Arroz", 20, 5);
        listadeItens.adicionarItem("Feijao", 30, 10);
        listadeItens.adicionarItem("Macarrão", 40, 20);

        listadeItens.descricaoCarrinho();

        listadeItens.removerItem("Arroz");
        listadeItens.descricaoCarrinho();

        listadeItens.calcularValorTotal();
    }


}



