package Universidade.model.eventos;

import Universidade.model.local.Local;
import Universidade.model.pessoas.Palestrante;

import java.time.LocalDate;

public class Palestra extends Evento {
    private Palestrante palestrante;

    public Palestra(String titulo, int data, int duracaoHoras, double orcamento, Local local, Palestrante palestrante) {
        super(titulo, LocalDate.ofEpochDay(data), duracaoHoras, orcamento, local);
        this.palestrante = palestrante;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Palestra: " + titulo + " | Local: " + local.getDescricao());
    }
}
