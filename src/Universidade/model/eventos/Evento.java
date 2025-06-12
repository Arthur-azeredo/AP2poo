package Universidade.model.eventos;

import Universidade.model.local.Local;
import Universidade.model.participante.Participante;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public abstract class Evento {
    protected String titulo;
    protected LocalDate data;
    protected int duracaoHoras;
    protected double orcamento;
    protected Local local;
    protected Set<Participante> participantes = new HashSet<>();

    public Evento(String titulo, LocalDate data, int duracaoHoras, double orcamento, Local local) {
        this.titulo = titulo;
        this.data = data;
        this.duracaoHoras = duracaoHoras;
        this.orcamento = orcamento;
        this.local = local;
    }

    public boolean temVagas() {
        return participantes.size() < local.getCapacidade();
    }

    public void adicionarParticipante(Participante participante) {
            participantes.add(participante);
        }

    public abstract void exibirDetalhes();
}
