package modelos;

public class Serie  extends Titulo{
    private int temporada, epPorTemporada, minPorEpsodio;
    private boolean ativa;

    //Como Serie extends Titula ela vai Herdar o contrutor da sua classe mãe
    public Serie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }


    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpPorTemporada() {
        return epPorTemporada;
    }

    public void setEpPorTemporada(int epPorTemporada) {
        this.epPorTemporada = epPorTemporada;
    }

    public int getMinPorEpsodio() {
        return minPorEpsodio;
    }

    public void setMinPorEpsodio(int minPorEpsodio) {
        this.minPorEpsodio = minPorEpsodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporada * epPorTemporada * minPorEpsodio;
    }

    @Override
    public String toString() {
        return "\nNOME DA SERIE: " + this.getNome() + "("+this.getAnoLancamento()+")" + " ANO DE LANÇAMENTO";
    }
}
