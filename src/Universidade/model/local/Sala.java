package Universidade.model.local;

public class Sala extends Local{
    private String numeroSala;
    private boolean temMultimidia;

    public Sala(String nome, int capacidade, String bloco, String numeroSala, boolean temMultimidia) {
        super(nome, capacidade, bloco);
        this.numeroSala = numeroSala;
        this.temMultimidia = temMultimidia;
    }

    @Override
    public String getDescricao() {
        return "Sala " + numeroSala + " | Multimídia: " + temMultimidia;
    }
}
