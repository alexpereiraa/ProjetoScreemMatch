package modelos;

import calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegarMedia() / 2;
    }

    @Override
    public String toString() {
        return "\nNOME DO FILME: " + this.getNome()
                + "(" + this.getAnoLancamento() + ") ANO DE LANÇAMENTO";
    }
}
