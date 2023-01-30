package alugavel;
import enums.CategoriaAlugavel;


public class CaminhaoAlugavel extends VeiculoAlugavel {
    public CaminhaoAlugavel(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        super.categoria = CategoriaAlugavel.CARGA;
    }
}
