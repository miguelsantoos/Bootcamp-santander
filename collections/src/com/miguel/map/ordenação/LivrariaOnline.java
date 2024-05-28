package com.miguel.map.ordenação;

import java.util.*;

public class LivrariaOnline {

    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livros.put(link, livro);
    }

    public void removerLivro(String titulo) {
        List<String> listRemover = new ArrayList<>();

        if (!livros.isEmpty()) {

            for (Map.Entry<String, Livro> entry : livros.entrySet()) {
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    listRemover.add(entry.getKey());
                    break;
                }
            }
            for (String chave : listRemover) {
                livros.remove(chave);
            }

        }else System.out.println("Nenhum livro a venda!");
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livros.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco, new ExibirLivrosOrdenadoPorAutor());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public List<Map.Entry<String, Livro>> exibirLivrosOrdenadoPorAutor() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livros.entrySet());

        Collections.sort(livrosParaOrdenarPorAutor, new ExibirLivrosOrdenadosPorPreco());

        Map<String, Livro> livroOrdenarPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
            livroOrdenarPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrosParaOrdenarPorAutor;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getAutor().equals(autor)) {
                Livro livro = entry.getValue();
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livrosMaisCaro = new ArrayList<>();
        double maiorPreco = Double.MIN_VALUE;

        for (Livro livro : livros.values()) {
            if (livro.getPreco() > maiorPreco) {
                maiorPreco = livro.getPreco();
            }
        }

        for(Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getPreco() == maiorPreco) {
                livrosMaisCaro.add(livros.get(entry.getKey()));
                break;
            }
        }
        return livrosMaisCaro;
    }

    public List<Livro> exibirLivroMaisBarato() {
        List<Livro> livrosMaisBarato = new ArrayList<>();
        double menorPreco = Double.MAX_VALUE;

        for (Livro livro : livros.values()){
            if (livro.getPreco() < menorPreco){
                menorPreco = livro.getPreco();
            }
        }

        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getPreco() == menorPreco) {
                livrosMaisBarato.add(livros.get(entry.getKey()));
            }
        }
        return livrosMaisBarato;
    }


    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        //Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadoPorAutor());

        // Pesquisa livros por autor
        String autorPesquisa = "Agatha Christie";
        System.out.println("Livro pesquisado por autor: \n" +livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa));

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: \n" + livrariaOnline.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: \n" + livrariaOnline.exibirLivroMaisBarato());

        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livros);
        //System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadoPorAutor());


    }

}
