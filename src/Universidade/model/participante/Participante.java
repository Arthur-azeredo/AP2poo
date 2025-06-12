package Universidade.model.participante;

import Universidade.model.eventos.Evento;
import java.util.HashSet;
import java.util.Set;

public class Participante {
    private String nome;
    private String cpf;
    private String email;
    private String curso;
    private Set<Evento> eventosInscritos = new HashSet<>();

    public Participante(String nome, String cpf, String email, String curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.curso = curso;
    }

    public boolean inscrever(Evento evento) {
        if (!eventosInscritos.contains(evento)) {
            evento.adicionarParticipante(this);
            eventosInscritos.add(evento);
            return true;
        }
        return false;
    }
}
