package calculos;

import modelos.Titulo;

public class TempoDeDuracao {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionar duração em minutos " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
