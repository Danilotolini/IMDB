package br.com.impacta.prateleiradigital.br.negocio;

public class Filme {
	  private String titulo;
	    private int ano;
	    private String diretor;
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		public String getDiretor() {
			return diretor;
		}
		public void setDiretor(String diretor) {
			this.diretor = diretor;
		}
		public Filme(String titulo, int ano, String diretor) {
			super();
			this.titulo = titulo;
			this.ano = ano;
			this.diretor = diretor;
		} 
		
		public Filme() {
			super();
		} 
	    
	    
}
