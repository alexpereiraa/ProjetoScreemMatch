package principal;
import calculos.FiltroDeRecomendacao;
import calculos.TempoDeDuracao;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        System.out.println();
        var meusFilmes = new Filme("Amanhecer parte 2", 2001);
        meusFilmes.fichatecnica();
        meusFilmes.avaliacao(8);
        meusFilmes.avaliacao(5);
        meusFilmes.avaliacao(10);
        System.out.println("Total de avaliações: " + meusFilmes.getTotalAvaliacao());
        System.out.println(meusFilmes.pegarMedia());

        System.out.println();
        var novoFilme = new Filme("Gato de Botas", 2002);
        novoFilme.fichatecnica();
        novoFilme.avaliacao(10);
        novoFilme.avaliacao(9.5);
        novoFilme.avaliacao(8.5);
        System.out.println("Total de avaliações " + novoFilme.getTotalAvaliacao());
        System.out.println("Media de avaliação " + novoFilme.pegarMedia());


        System.out.println();
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.setDuracaoEmMinutos(60);

        System.out.println();
        var minhaSerie = new Serie("The lest of us", 2023);
        minhaSerie.setTemporada(8);
        minhaSerie.setEpPorTemporada(10);



        System.out.println();
        TempoDeDuracao calculadora = new TempoDeDuracao();
        calculadora.inclui(meusFilmes);
        calculadora.inclui(novoFilme);
        calculadora.inclui(novoFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendacao filtra = new FiltroDeRecomendacao();
        filtra.filtra(meusFilmes);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setTotalDeVisualizacao(300);
        filtra.filtra(episodio);

        //ArrayList
        ArrayList<Filme> minhaLista = new ArrayList<>();
        minhaLista.add(meusFilmes);
        minhaLista.add(novoFilme);
        minhaLista.add(outroFilme);

        System.out.println();
        System.out.println("Total de filme na lista: " + minhaLista.size());
        System.out.println("Segundo filme da lista: " + minhaLista.get(1).getNome());
        System.out.println(minhaLista);

    }
}
