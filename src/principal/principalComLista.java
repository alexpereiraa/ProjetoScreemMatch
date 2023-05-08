package principal;

import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class principalComLista {
    public static void main(String[] args) {
        var meusFilmes = new Filme("Amanhecer parte 2 ", 2008);
        meusFilmes.avaliacao(10);
        var novoFilme = new Filme("Gato de Botas ", 2001);
        novoFilme.avaliacao(10);
        var outroFilme = new Filme("Avatar ",2010);
        outroFilme.avaliacao(8);
        var minhaSerie = new Serie("The lest of us ", 2023);
        minhaSerie.avaliacao(9);

          /*
            Como a minha lista é de filme e nesse caso Serie não é Filme,o meu programa daria um erro.
            Para corrigir isso, sabendo que as minhas duas clases Herdam da classe Titulo
            eu posso passar no meu generic <Titulo>. Dessa forma tudo que herdar de Titula sera incluso na lista.
         */
        ArrayList<Titulo> preferidos = new ArrayList<>();
        preferidos.add(meusFilmes);
        preferidos.add(novoFilme);
        preferidos.add(outroFilme);
        preferidos.add(minhaSerie);

        /*
            Nesse trecho do codigo estou fazendo uma conversão de tipo
            já que a seria The lest Of Us não é um filme.
         */
        for (Titulo lista: preferidos) {
            if(lista instanceof Filme filme){
                System.out.println("Classificação: " + ((Filme) lista).getClassificacao());
            }
            System.out.println(lista.getNome());
        }

        System.out.println("Lista de titulos em ordem alfabetica");
        Collections.sort(preferidos);
        System.out.println(preferidos);

        System.out.println("Lista de Titúlos ordenados por ano de lançamento");
        preferidos.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println(preferidos);

    }
}
