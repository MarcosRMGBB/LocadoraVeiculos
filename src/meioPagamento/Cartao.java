package meioPagamento;

public abstract class Cartao extends Pagamento {
    protected String bandeira;
    protected String numero;
    protected String codigoSeguranca;
    protected String dataVencimento;

    public Cartao(double valor, String data, String bandeira, String numero, String codigoSeguranca, String dataVencimento) {
        super(valor, data);
        this.bandeira = bandeira;
        this.numero = numero;
        this.codigoSeguranca = codigoSeguranca;
        this.dataVencimento = dataVencimento;
    }
}
