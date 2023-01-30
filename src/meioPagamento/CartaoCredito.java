package meioPagamento;
import enums.TipoPagamentoCartao;

public class CartaoCredito extends Cartao {
    public CartaoCredito(double valor, String data, String bandeira, String numero, String codigoSeguranca,
                         String dataVencimento) {
        super(valor, data, bandeira, numero, codigoSeguranca, dataVencimento);
        super.meioPagamento = TipoPagamentoCartao.CREDITO;
    }
}
