package alugavel;
import enums.CategoriaAlugavel;

public class CarroAlugavel extends VeiculoAlugavel {
    public CarroAlugavel(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        super.categoria = CategoriaAlugavel.ECONOMICO;
    }
}