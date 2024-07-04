package br.com.impacta.prateleiradigital.br.negocio;

import java.util.List;

public class FilmeController {
    private FilmeService filmeService = new FilmeService();

    public void adicionarFilme(String titulo, int ano, String diretor) {
        Filme filme = new Filme(titulo, ano, diretor);
        try {
            filmeService.adicionarFilme(filme);
            System.out.println("Filme adicionado com sucesso!");
        } catch (FilmeJaExisteException e) {
            System.out.println("Erro ao adicionar filme: " + e.getMessage());
        }
    }

    public void importarFilmes(String caminhoArquivo) {
        List<Filme> filmes = CSVProcessor.processarCSV(caminhoArquivo);

        for (Filme filme : filmes) {
            try {
                filmeService.adicionarFilme(filme);
                System.out.println("Filme importado: " + filme.getTitulo());
            } catch (FilmeJaExisteException e) {
                System.out.println("Erro ao importar filme: " + e.getMessage());
            }
        }
    }
}
