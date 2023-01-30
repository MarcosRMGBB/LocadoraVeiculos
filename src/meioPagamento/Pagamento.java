package meioPagamento;

public abstract class Pagamento {
    public double valor;
    public String data;
    public Enum meioPagamento;

    public Pagamento(double valor, String data) {
        this.valor = valor;
        this.data = data;
    }

    public Enum getMeioPagamento() {
        return meioPagamento;
    };
}
