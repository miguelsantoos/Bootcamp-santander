package com.miguel.set.ordenação;

import javax.management.MBeanAttributeInfo;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> listAlunos;

    public GerenciadorAlunos() {
        this.listAlunos = new HashSet<>();
    }

    public void adicionarAlunos(String nome, Long matricula, double nota) {
        listAlunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Set<Aluno> alnosRemover = new HashSet<>();

        if (!listAlunos.isEmpty()) {
            for (Aluno a : listAlunos) {
                if (a.getMatricula().equals(matricula)) {
                    alnosRemover.add(a);
                    break;
                }
            }
            listAlunos.remove(alnosRemover);
        }else System.out.println("Lista vazia!");
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosNome = new TreeSet<>(listAlunos);
        System.out.println(alunosNome);
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunoNota = new TreeSet<>(new ComparePorNota());
        alunoNota.addAll(listAlunos);
        System.out.println(alunoNota);
    }

    public static void main(String[] args) {
        GerenciadorAlunos ga = new GerenciadorAlunos();

        ga.adicionarAlunos("Henrique", 123456879L, 10);
        ga.adicionarAlunos("Gustavo", 12345687L, 40);
        ga.adicionarAlunos("Raquel", 1234568L, 60);
        ga.adicionarAlunos("Alex", 123456L, 70);
        ga.adicionarAlunos("Alex Silva", 123456L, 100);
        ga.adicionarAlunos("Miguel", 1234568790L, 30);

        ga.exibirAlunosPorNome();
        ga.exibirAlunosPorNota();
    }
}
