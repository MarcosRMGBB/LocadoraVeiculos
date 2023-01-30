package meioPagamento;

import enums.MeioPagamentoDisponivel;

public class Pix extends Pagamento {
    private String chavePixDestino;

    public Pix(double valor, String data, String chavePixDestino) {
        super(valor, data);
        super.meioPagamento = MeioPagamentoDisponivel.PIX;
        this.chavePixDestino = chavePixDestino;
    }

    @Override
    public Enum getMeioPagamento() {
        return this.meioPagamento;
    }
}
