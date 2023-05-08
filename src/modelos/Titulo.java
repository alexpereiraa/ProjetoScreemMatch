package modelos;

import java.util.Comparator;
import java.util.concurrent.CompletableFuture;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoLancamento, duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double totalAvaliacao, somaAvaliacao;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setTotalAvaliacao(double totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    public double getSomaAvaliacao() {return somaAvaliacao;}

    public void setSomaAvaliacao(double somaAvaliacao) {
        this.somaAvaliacao = somaAvaliacao;
    }

    public void fichatecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avaliacao(double nota){
        somaAvaliacao += nota;
        totalAvaliacao++;
    }

    public double pegarMedia(){
        return somaAvaliacao / totalAvaliacao;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
