package br.com.impacta.prateleiradigital.br.negocio;

import java.util.Objects;

public class Filme implements Comparable<Filme> {
    private String titulo;
    private int ano;
    private String diretor;

    // Construtores
    public Filme(String titulo, int ano, String diretor) {
        this.titulo = titulo;
        this.ano = ano;
        this.diretor = diretor;
    }

    public Filme() {
        // Construtor padrão
    }

    // Getters e Setters
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

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Filme filme = (Filme) obj;
        return ano == filme.ano &&
               Objects.equals(titulo, filme.titulo) &&
               Objects.equals(diretor, filme.diretor);
    }

    // Método hashCode
    @Override
    public int hashCode() {
        return Objects.hash(titulo, ano, diretor);
    }

    // Método compareTo
    @Override
    public int compareTo(Filme outroFilme) {
        return this.titulo.compareTo(outroFilme.titulo);
    }

    // Método toString para representação textual
    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", ano=" + ano +
                ", diretor='" + diretor + '\'' +
                '}';
    }
}
