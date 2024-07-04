package br.com.impacta.prateleiradigital.br.negocio;
import java.util.*; 
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;
public class CSVProcessor {
	   public static List<Filme> processarCSV(String caminhoArquivo) {
	        List<Filme> filmes = new ArrayList<>();

	        try (Scanner scanner = new Scanner(Files.newBufferedReader(Paths.get(caminhoArquivo)))) {
	            while (scanner.hasNextLine()) {
	                String linha = scanner.nextLine();
	                String[] dados = linha.split(",");

	                if (dados.length == 3) { // Supondo que o CSV tem 3 colunas: titulo, ano, diretor
	                    String titulo = dados[0].trim();
	                    int ano = Integer.parseInt(dados[1].trim());
	                    String diretor = dados[2].trim();

	                    Filme filme = new Filme(titulo, ano, diretor);
	                    filmes.add(filme);
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return filmes;
	    }
	}