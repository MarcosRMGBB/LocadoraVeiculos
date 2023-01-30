package alugavel;
import enums.CategoriaAlugavel;

public class MotoAlugavel extends VeiculoAlugavel {
    public MotoAlugavel(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        super.categoria = CategoriaAlugavel.ECONOMICO;
    }
}
