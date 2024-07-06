package br.com.impacta.prateleiradigital.apresentacao;

import java.util.*;

import br.com.impacta.prateleiradigital.controle.FilmeController;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class ConsultarFilmeConsole {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("*** CONSULTA DE FILME ***");
		System.out.println("Titulo (total ou parcial) :");
		String titulo = scan.nextLine();
		System.out.println("Genero:");
		String genero = scan.nextLine();

		int anoDe = (int) validarNumero("Ano (de:) :", scan);
		int anoAte = (int) validarNumero("Ano (Ate:) :", scan);
		
		FilmeController controller = new FilmeController();
		List<Filme> filmes = new ArrayList<Filme>();
		filmes = controller.consultarFilme(titulo, genero, anoDe, anoAte);
		System.out.println("...");
		System.out.println("Filme consultado com sucesso!");
	}
	public static double validarNumero(String texto, Scanner scan) {
		double num = 0;
		boolean passou=false;
		do {
			try {
				System.out.println(texto);				
				num = Double.parseDouble(scan.nextLine());
				passou=true;
			}catch (NumberFormatException e) {
				System.out.println("Digite apenas números!!!");
			}
		}while(passou==false);				
		return num;
	}
} 

		
