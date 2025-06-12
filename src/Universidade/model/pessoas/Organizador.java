package Universidade.model.pessoas;

public class Organizador extends PessoaResponsavel {
    private String funcaoAdministrativa;

    public Organizador(String nome, String email, String funcaoAdministrativa) {
        super(nome, email);
        this.funcaoAdministrativa = funcaoAdministrativa;
    }
}
