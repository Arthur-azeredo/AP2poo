package Universidade.model.eventos;

import Universidade.model.local.Local;
import Universidade.model.pessoas.Apresentador;

import java.time.LocalDate;

public class Seminario extends Evento {
    private String tema;
    private Apresentador apresentador;

    public Seminario(String titulo, int data, int duracaoHoras, double orcamento, Local local, String tema, Apresentador apresentador) {
        super(titulo, LocalDate.ofEpochDay(data), duracaoHoras, orcamento, local);
        this.tema = tema;
        this.apresentador = apresentador;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Seminário: " + titulo + " | Tema: " + tema + " | Local: " + local.getDescricao());
    }
}
