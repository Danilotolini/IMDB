package br.com.impacta.prateleiradigital.negocio;

/**
 * Classe que representa o conceito de Filme no dom�nio do neg�cio da aplica��o desenvolvida
 *
 */
public class Filme {

		private static final double NOTA_MINIMA = 0;
		private static final double NOTA_MAXIMA = 10;
		
		private String titulo;
		private String diretores;
		private double nota;
		private int duracao;
		private int ano;
		private String generos;
		private int numVotos;
		private String url;
		
	
		public Filme(){}
		
		/**
		 * Construtor que que recebe os dados dos atributos da classe Filme 
		 * 
		 * @param titulo Titulo do filme 
		 * @param diretores Texto contendo os diretores do filme separados por virgula
		 * @param nota Nota m�dia atribu�da ao filme. Nota deve estar compreendida entre 0 e 10 inclusive 
		 * @param duracao Dura��o (em minutos) do filme. A dura��o deve ser maior ou igual a zero
		 * @param ano Ano de lan�amento do filme. O ano deve ser maior ou igual a zero
		 * @param generos  Texto contendo os g�neros nos quais o filme se enquadra separados por virgulas
		 * @param numVotos Numero de votos recebidos pelo filme. O valor deve ser maior ou igual a zero
		 * @param url URL do site que cont�m mais detalhes a respeito do filme 
		 */
		public Filme(String titulo, String diretores, double nota, int duracao, int ano, String generos, int numVotos, String url) {
			this.setTitulo(titulo);
			this.setDiretores(diretores);
			this.setNota(nota);
			this.setDuracao(duracao);
			this.setAno(ano);
			this.setGeneros(generos);
			this.setNumVotos(numVotos);
			this.setUrl(url);
		}
		
		
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		public String getDiretores() {
			return diretores;
		}
		
		public void setDiretores(String diretores) {
			this.diretores = diretores;
		}
		
		public double getNota() {
			return nota;
		}
		
		public void setNota(double nota) {
			if(nota >= NOTA_MINIMA && nota <= NOTA_MAXIMA){
				this.nota = nota;
			}
		}
		
		public int getDuracao() {
			return duracao;
		}
		
		public void setDuracao(int duracao) {
			if(duracao > 0){
				this.duracao = duracao;
			}
		}
		
		public int getAno() {
			return ano;
		}
		
		public void setAno(int ano) {
			if(ano > 0){
				this.ano = ano;
			}
		}
		
		public String getGeneros() {
			return generos;
		}
		
		public void setGeneros(String generos) {
			this.generos = generos;
		}
		
		public int getNumVotos() {
			return numVotos;
		}
		
		public void setNumVotos(int numVotos) {
			if(numVotos > 0){
				this.numVotos = numVotos;
			}
		}
		
		public String getUrl() {
			return url;
		}
		
		public void setUrl(String url) {
			this.url = url;
		}
		

}
