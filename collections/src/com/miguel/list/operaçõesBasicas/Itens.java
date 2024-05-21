package com.miguel.list.operaçõesBasicas;

public class Itens {

    private String nome;
    private int preco;
    private int quantidade;

    public Itens(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return nome + " R$" +
                preco + " " +
                 quantidade;
    }
}
