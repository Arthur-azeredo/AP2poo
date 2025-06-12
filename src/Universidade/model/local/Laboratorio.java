package Universidade.model.local;

public class Laboratorio extends Local {
    private int computadoresDisponiveis;
    private String categoria;

    public Laboratorio(String nome, int capacidade, String bloco, int computadoresDisponiveis, String categoria) {
        super(nome, capacidade, bloco);
        this.computadoresDisponiveis = computadoresDisponiveis;
        this.categoria = categoria;
    }

    @Override
    public String getDescricao() {
        return "Computadores Disponíveis: " + computadoresDisponiveis + " | Categoria do laboratório: " + categoria;
    }
}
