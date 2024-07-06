package br.com.impacta.prateleiradigital.apresentacao;

import java.util.Scanner;

import br.com.impacta.prateleiradigital.controle.FilmeController;

public class CriarFilmeConsole {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** CADASTRO DE FILME ***");
		System.out.println("Titulo do filme:");
		String titulo = scan.nextLine();
		System.out.println("Diretores:");
		String diretores = scan.nextLine();
		double nota = ConsultarFilmeConsole.validarNumero("Nota:",scan);
		int duracao =  (int)ConsultarFilmeConsole.validarNumero("Duração (min):",scan);
		int ano =  (int)ConsultarFilmeConsole.validarNumero("Ano:",scan);
		System.out.println("Gêneros:");
		String generos = scan.nextLine();
		int votos =  (int)ConsultarFilmeConsole.validarNumero("Número de votos:",scan);
		System.out.println("URL:");
		String url = scan.nextLine();
		
		FilmeController controller = new FilmeController();
		controller.criarFilme(titulo, diretores, nota, duracao, ano, generos, votos, url);
		
		System.out.println("...");
		System.out.println("Filme criado com sucesso!");
		
		
	}

}
