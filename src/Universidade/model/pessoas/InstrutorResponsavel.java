package Universidade.model.pessoas;

public class InstrutorResponsavel extends PessoaResponsavel {
    private String formacao;
    private String areaEspecializacao;

    public InstrutorResponsavel(String nome, String email, String formacao, String areaEspecializacao) {
        super(nome, email);
        this.formacao = formacao;
        this.areaEspecializacao = areaEspecializacao;
    }
}
