package dataBase;

import alugavel.CaminhaoAlugavel;
import alugavel.CarroAlugavel;
import alugavel.MotoAlugavel;
import alugavel.VeiculoAlugavel;
import java.util.HashMap;

public class VeiculoDb extends GuardaCadastro<VeiculoAlugavel> implements Cadastros {

    @Override
    public void cadastra() {
        CarroAlugavel carro = new CarroAlugavel("Gol", "Bola", 2018);
        MotoAlugavel moto = new MotoAlugavel("Honda", "150 fan", 2022);
        CaminhaoAlugavel caminhao = new CaminhaoAlugavel("Ford", "T", 1919);

        this.cadastros = new HashMap<>();
        cadastros.put(carro.getMarca(), carro);
        cadastros.put(moto.getMarca(), moto);
        cadastros.put(caminhao.getMarca(), caminhao);
    }
}
