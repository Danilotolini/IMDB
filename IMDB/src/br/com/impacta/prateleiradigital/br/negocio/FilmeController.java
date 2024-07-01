package br.com.impacta.prateleiradigital.br.negocio;

import br.com.impacta.prateleiradigital.br.negocio.Filme;
import br.com.impacta.prateleiradigital.br.negocio.FilmeJaExisteException;
import br.com.impacta.prateleiradigital.br.negocio.FilmeService;

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

    // Outros métodos para interação com o usuário...
}
