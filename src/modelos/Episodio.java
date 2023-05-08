package modelos;

import calculos.Classificavel;

public class Episodio implements Classificavel {
    private  String nome;
    private int numero, TotalDeVisualizacao;
    private Serie serie;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTotalDeVisualizacao() {
        return TotalDeVisualizacao;
    }

    public void setTotalDeVisualizacao(int totalDeVisualizacao) {
        TotalDeVisualizacao = totalDeVisualizacao;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao(){
        if(this.TotalDeVisualizacao > 100){
            return  4;
        }else {
            return 2;
        }
    }


}
