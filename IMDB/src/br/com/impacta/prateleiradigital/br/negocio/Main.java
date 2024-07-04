package br.com.impacta.prateleiradigital.br.negocio;

public class Main {
	    public static void main(String[] args) {
	        FilmeController controller = new FilmeController();
	        String caminhoArquivo = "caminho/para/seu/arquivo.csv"; // Altere para o caminho correto do seu arquivo CSV

	        // Testando a importação de filmes
	        controller.importarFilmes(caminhoArquivo);
	    }
}
