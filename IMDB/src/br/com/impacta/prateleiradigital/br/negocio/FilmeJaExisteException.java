package br.com.impacta.prateleiradigital.br.negocio;

public class FilmeJaExisteException extends Exception {
    public FilmeJaExisteException(String mensagem) {
        super(mensagem);
    }
}
