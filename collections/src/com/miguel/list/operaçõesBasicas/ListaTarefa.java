package com.miguel.list.operaçõesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa elemento : tarefaList){
            if (elemento.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(elemento);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de tarefas na lista é:" + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.adicionarTarefa("Cagar");
        listaTarefa.adicionarTarefa("Nadar");
        listaTarefa.adicionarTarefa("Jantar");
        listaTarefa.adicionarTarefa("Correr");
        listaTarefa.adicionarTarefa("Brincar");
        listaTarefa.adicionarTarefa("Pular");
        listaTarefa.adicionarTarefa("Chorar");
        System.out.println("O numero total de tarefas na lista é:" + listaTarefa.obterNumeroTotalDeTarefas());
        listaTarefa.obterDescricoesTarefas();


        listaTarefa.adicionarTarefa("cagar");
        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("cagar");

        System.out.println("O numero total de tarefas na lista é:" + listaTarefa.obterNumeroTotalDeTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
