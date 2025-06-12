package Universidade.app;

import Universidade.model.eventos.*;
import Universidade.model.local.*;
import Universidade.model.pessoas.*;
import Universidade.model.participante.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Local sala = new Sala("Sala 1", 30, "Bloco A", "100", true);
        Local auditorio = new Auditorio("Auditório", 100, "Bloco C", true, true);
        Local laboratorio = new Laboratorio("Laboratório", 20, "Bloco B", 20, "Informática");

        Palestrante palestrante = new Palestrante("Doctor Jhon Silvestre", "jhon@outlook.com", "USP");

        Evento palestra = new Palestra("IA", 10/ 2 /2025, 2, 2500, auditorio, palestrante);

        Instrutor mari = new Instrutor("Maria");
        Instrutor carlo = new Instrutor("Carlos");
        List<Instrutor> instrutores = Arrays.asList(mari, carlo);

        Evento minicurso = new Minicurso("Java", 12/ 6 / 2025, 3, 3000, laboratorio, instrutores, 6, Arrays.asList("Slides", "Códigos de exemplo"));

        Apresentador apresentador = new Apresentador("Ana", "Professor Richarlison");

        Evento seminario = new Seminario("Estudo de CDIA", 25 / 12/ 2025, 4, 1500, sala, "Usar intelliJ com java", apresentador);

        Participante p1 = new Participante("Lucas", "111111111-22", "lucas@gmail.com", "Engenharia da Computação");
        Participante p2 = new Participante("Fernanda", "222222222-33", "fernanda@hotmail.com", "Ciência da Dados");

        p1.inscrever(palestra);
        p1.inscrever(minicurso);
        p1.inscrever(seminario);

        p2.inscrever(palestra);
        p2.inscrever(seminario);

        System.out.println("Status do Evento:");
        palestra.exibirDetalhes();
        minicurso.exibirDetalhes();
        seminario.exibirDetalhes();
    }
}


