package com.miguel.map.ordenação;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Eventos> agendaEventos;

    public AgendaEventos() {
        this.agendaEventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaEventos.put(data, new Eventos(nome, atracao));
    }

    public void exibirAgenda() {
        if (!agendaEventos.isEmpty()) {
            Map<LocalDate, Eventos> treeMapEventos = new TreeMap<>(agendaEventos);
            System.out.println(treeMapEventos);
        }
        else System.out.println("Nenhum evento marcado!");
    }

    public void obterProximoEvento() {
        Map<LocalDate, Eventos> treeMapEventos = new TreeMap<>(agendaEventos);

        LocalDate localDate = LocalDate.now();
        LocalDate date = null;
        String atracao = null;

        if (!treeMapEventos.isEmpty()) {
            for (Map.Entry<LocalDate,Eventos> entry : treeMapEventos.entrySet()) {
                if (entry.getKey().isEqual(localDate) || entry.getKey().isAfter(localDate)) {
                    date = entry.getKey();
                    atracao = entry.getValue().getAtracao();
                    System.out.println("A proxima atração é " + atracao + ", no dia " + date);
                    break;
                }
            }
        }else System.out.println("Sem nenhum evento marcado!");
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        // Adiciona eventos à agenda
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        // Exibe a agenda completa de eventos
        agendaEventos.exibirAgenda();

        // Obtém e exibe o próximo evento na agenda
        agendaEventos.obterProximoEvento();
    }
}
