package com.miguel.set.pesquisa;

public class Tarefas {

    private String descricao;
    private Boolean status;

    public Tarefas(String descricao) {
        this.descricao = descricao;
        this.status = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  descricao + '\'' +
                  status;
    }
}
