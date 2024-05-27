package com.miguel.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefas> listTarefas;

    public ListaTarefas() {
        this.listTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        listTarefas.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao) {
        for (Tarefas d : listTarefas){
            if (d.equals(descricao))
                listTarefas.remove(descricao);
        }
    }

    public void exibirTarefas() {
        System.out.println(listTarefas);
    }

    public int contarTarefa() {
        return listTarefas.size();
    }

    public void marcarTarefaComoConcluida(String descricao) {
        for (Tarefas t : listTarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setStatus(true);
            }
        }
    }

    public void marcarTarefaComoPendente(String descricao) {
        Set<String> tarefasPendentes = new HashSet<>();

        for (Tarefas t : listTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasPendentes.add(descricao);
            }
        }
    }

    public Set<Tarefas> obterTarefasComoPendente() {
        Set<Tarefas> tarefasPendentes = new HashSet<>();

        for (Tarefas t : listTarefas) {
            if (t.getStatus()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public Set<Tarefas> obterTarefasConcluidas() {
        Set<Tarefas> tarefasConcluidas = new HashSet<>();

        for (Tarefas t : listTarefas) {
            if (t.getStatus())
                tarefasConcluidas.add(t);
        }
        return tarefasConcluidas;
    }

    public static void main(String[] args) {
        ListaTarefas t = new ListaTarefas();

        t.adicionarTarefa("cagar");
        t.adicionarTarefa("orar");
        t.marcarTarefaComoConcluida("cagar");
        t.obterTarefasComoPendente();
        t.exibirTarefas();

    }
}






