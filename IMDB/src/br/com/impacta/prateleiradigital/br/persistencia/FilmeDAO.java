package br.com.impacta.prateleiradigital.persistencia;

import java.util.ArrayList;
import java.util.List;

import br.com.impacta.prateleiradigital.negocio.Filme;
import br.com.impacta.prateleiradigital.negocio.FiltroFilme;

/**
 * Representa a classe que realiza o procedimento de mapeamento objeto-relacional da classe Filme 
 */
public class FilmeDAO {
 public static void main(String[] args) {
	//TODO C�digo para inserir um novo filme na base de dados 
		}
 /**
	 * Realiza uma consulta no reposit�rio de dados baseado no objeto filtro informado no par�metro
	 * 
	 * @param tituloParcial Parte do titulo do filme. Sendo o padr�o informado fazendo parte de qualquer parte do texto do titulo original 
	 * @param genero Um dos generos em que o filme se enquadra
	 * @param anoInicial Ano representando o limite inferior (inclusive) do ano de lan�amento do filme. Valor maior que zero 
	 * @param anoFinal Ano representando o limite superior (inclusive) do ano de lan�amento do filme. Valor maior que o anoInicial
	 * 
	 * @return Filme que atende crit�rios 
	 */
	public List<Filme> consultar(String tituloParcial, String genero, int anoInicial, int anoFinal) {
		// TODO Inserir C�digo para consultar o filme baseado no filtro informado
		return null;
	}
	
	
	/**
	 * Executa a a��o de remover o filme do reposit�rio de dados.
	 * 
	 * @param filme Filme inst�ncia do filme que deve ser removido do reposit�rio
	 */
	public void remover(Filme filme) {
		// TODO C�digo para remo��o do filme informado como par�metro
		
	}
	
	/**
	 * 
	 * @param genero G�nero desejado 
	 * @param diretor Diretor ou um dos diretores do filme 
	 * @param notaMinima Nota m�nima para ser considerada na busca
	 * @param numeroVotosMinimo N�mero minimo de votos desejado 

	 * @return Filme que atende aos crit�rios informados
	 */
	public List<Filme> consultar(String genero, String diretor, double notaMinima, int numeroVotosMinimo) {
		List<Filme> filmes = new ArrayList<Filme>();
		// TODO Gerar a busca baseada nas informa��es do par�metro
		return null;
	}
	public void adicionar(Filme filme) {
		// TODO Auto-generated method stub
		
	}

}