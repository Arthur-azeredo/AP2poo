package Universidade.model.local;

public class Auditorio extends Local {
    private boolean temSistemaDeSom;
    private boolean temTraducaoSimultanea;

    public Auditorio(String nome, int capacidade, String bloco, boolean temSistemaDeSom, boolean temTraducaoSimultanea) {
        super(nome, capacidade, bloco);
        this.temSistemaDeSom = temSistemaDeSom;
        this.temTraducaoSimultanea = temTraducaoSimultanea;
    }

    @Override
    public String getDescricao() {
        return "Sistema de som: " + temSistemaDeSom + " | Tradução Simultânea: " + temTraducaoSimultanea;
    }
}
