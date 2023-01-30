package pessoas;

public class ClienteLocatario extends Pessoa {
    private String cpf;
    private String dataNascimento;

    public ClienteLocatario(String nome, String cpf, String dataNascimento) {
        super(nome);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }
}
