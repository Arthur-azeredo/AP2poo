package Universidade.model.pessoas;

public abstract class PessoaResponsavel {
    private String nome;
    private String email;

    public PessoaResponsavel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
