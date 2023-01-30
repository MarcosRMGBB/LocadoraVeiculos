package pessoas;

public class FuncionarioLocador extends Pessoa {
    private String matricula;
    Enum cargo;

    public FuncionarioLocador(String nome, String matricula, Enum cargo) {
        super(nome);
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public Enum getCargo() {
        return this.cargo;
    }
}
