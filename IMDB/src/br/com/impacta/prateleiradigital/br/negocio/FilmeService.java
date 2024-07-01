package br.com.impacta.prateleiradigital.br.negocio;

import java.util.ArrayList;
import java.util.List;

public class FilmeService {
    private List<Filme> filmes = new ArrayList<>();

    // Método para adicionar filme
    public void adicionarFilme(Filme filme) throws FilmeJaExisteException {
        if (filmeExiste(filme)) {
            throw new FilmeJaExisteException("O filme já existe na lista.");
        }
        filmes.add(filme);
    }

    // Método para buscar filmes por diretor
    public List<Filme> buscarFilmesPorDiretor(String diretor) {
        List<Filme> resultado = new ArrayList<>();
        for (Filme filme : filmes) {
            if (filme.getDiretor().equalsIgnoreCase(diretor)) {
                resultado.add(filme);
            }
        }
        return resultado;
    }

    // Verifica se o filme já existe na lista
    private boolean filmeExiste(Filme filme) {
        return filmes.contains(filme);
    }
}
