package meioPagamento;

import enums.MeioPagamentoDisponivel;

public class Transferencia extends Pagamento {
    private String agenciaDestino;
    private String contaDestino;

    public Transferencia(String agenciaDestino, String contaDestino, double valor, String data) {
        super(valor, data);
        super.meioPagamento = MeioPagamentoDisponivel.PIX;
        this.agenciaDestino = agenciaDestino;
        this.contaDestino = contaDestino;
    }
}
