package Universidade.model.local;

public abstract class Local {
    private String nome;
    private int capacidade;
    private String bloco;

    public Local(String nome, int capacidade, String bloco) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.bloco = bloco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public abstract String getDescricao();
}
