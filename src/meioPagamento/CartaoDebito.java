package meioPagamento;
import enums.TipoPagamentoCartao;

public class CartaoDebito extends Cartao {
    public CartaoDebito(double valor, String data, String bandeira, String numero, String codigoSeguranca, String dataVencimento) {
        super(valor, data, bandeira, numero, codigoSeguranca, dataVencimento);
        super.meioPagamento = TipoPagamentoCartao.DEBITO;
    }
}
