package Universidade.model.eventos;

import Universidade.model.local.Local;
import Universidade.model.pessoas.Instrutor;

import java.time.LocalDate;
import java.util.List;

public class Minicurso extends Evento {
    private List<Instrutor> instrutores;
    private int cargaHoraria;
    private List<String> materiaisApoio;

    public Minicurso(String titulo, int data, int duracaoHoras, double orcamento, Local local, List<Instrutor> instrutores, int cargaHoraria, List<String> materiaisApoio) {
        super(titulo, LocalDate.ofEpochDay(data), duracaoHoras, orcamento, local);
        this.instrutores = instrutores;
        this.cargaHoraria = cargaHoraria;
        this.materiaisApoio = materiaisApoio;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Minicurso: " + titulo + " | Instrutores: " + instrutores.size() + " | Local: " + local.getDescricao());
    }
}
