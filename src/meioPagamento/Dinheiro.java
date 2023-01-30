package meioPagamento;

import enums.MeioPagamentoDisponivel;

public class Dinheiro extends Pagamento {
    Enum meioPagamento;
    public Dinheiro(double valor, String data) {
        super(valor, data);
        this.meioPagamento = MeioPagamentoDisponivel.DINHEIRO;
    }

    @Override
    public Enum getMeioPagamento() {
        return meioPagamento;
    }
}
