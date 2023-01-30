package servico;

import alugavel.VeiculoAlugavel;
import meioPagamento.Pagamento;
import pessoas.ClienteLocatario;
import pessoas.FuncionarioLocador;

public class AlugaVeiculo {
    FuncionarioLocador funcionario;
    ClienteLocatario cliente;
    VeiculoAlugavel veiculo;
    Pagamento pagamento;
    String dataRetirada;
    int numeroDias;
    String dataDevolucao;
    double totalPagar;

    public AlugaVeiculo(FuncionarioLocador funcionario, ClienteLocatario cliente, VeiculoAlugavel veiculo,
                        Pagamento pagamento, String dataRetirada, int numeroDias, String dataDevolucao,
                        double totalPagar) {
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.pagamento = pagamento;
        this.dataRetirada = dataRetirada;
        this.numeroDias = numeroDias;
        this.dataDevolucao = dataDevolucao;
        this.totalPagar = totalPagar;
    }

    public String toString() {
        return "*****Parabéns, veículo alugado com sucesso!*****" + "\n" +
                "Funcionáiro: " + this.funcionario.getNome() + "\n" +
                "Cliente: " + this.cliente.getNome() + "\n" +
                "Veículo: " + this.veiculo.getMarca() + ", " + this.veiculo.getModelo() + ", " + this.veiculo.getAno() + "\n" +
                "Data de retirada: " + this.dataRetirada + "\n" +
                "Dias alugado: " + this.numeroDias + "\n" +
                "Data de devolução: " + this.dataDevolucao + "\n" +
                "Meio de pagamento: " + this.pagamento.getMeioPagamento() + "\n" +
                "Total a pagar: " + this.totalPagar + "\n" +
                "************************************************";
    }
}
