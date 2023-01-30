import alugavel.VeiculoAlugavel;
import dataBase.ClienteDb;
import dataBase.FuncionarioDb;
import dataBase.VeiculoDb;
import meioPagamento.CartaoCredito;
import meioPagamento.Dinheiro;
import meioPagamento.Pix;
import pessoas.ClienteLocatario;
import pessoas.FuncionarioLocador;
import servico.AlugaVeiculo;

public class LocadoraApp {
    public static void main(String[] args) {
        // Cadastro do funcionario
        FuncionarioDb funciDb = new FuncionarioDb();
        funciDb.cadastra();
        FuncionarioLocador jose = funciDb.recuperaCadastro("000001");
        FuncionarioLocador ana = funciDb.recuperaCadastro("000002");

        // Cadastro do cliente
        ClienteDb clienteDb = new ClienteDb();
        clienteDb.cadastra();
        ClienteLocatario maria = clienteDb.recuperaCadastro("001.002.003-04");
        ClienteLocatario mario = clienteDb.recuperaCadastro("002.003.004-05");

        // Veiculo disponível
        VeiculoDb veiculoDb = new VeiculoDb();
        veiculoDb.cadastra();
        VeiculoAlugavel carro = veiculoDb.recuperaCadastro("Gol");
        VeiculoAlugavel moto = veiculoDb.recuperaCadastro("Honda");
        VeiculoAlugavel caminhao = veiculoDb.recuperaCadastro("Ford");

        // Meio pagamento
        Dinheiro dinheiro = new Dinheiro(500, "01-01-2023");
        Pix pix = new Pix(500, "01-01-2023", "mail@mail.com");
        CartaoCredito cartao = new CartaoCredito(300, "01-01-2023", "Visa", "000.001.002",
                                                "123", "01-07-2023");

        // Primeiro aluguel
        AlugaVeiculo aluga = new AlugaVeiculo(jose, maria, carro, dinheiro, "05-01-2023",
                                               7, "11-01-2023", 500);

        // Segundo aluguel
        AlugaVeiculo aluga_2 = new AlugaVeiculo(ana, mario, moto, pix, "05-01-2023",
                7, "11-01-2023", 500);

        // Terceiro aluguel
        AlugaVeiculo aluga_3 = new AlugaVeiculo(jose, maria, caminhao, cartao, "05-01-2023",
                7, "11-01-2023", 500);

        System.out.println(aluga);
        System.out.println(aluga_2);
        System.out.println(aluga_3);
    }
}
