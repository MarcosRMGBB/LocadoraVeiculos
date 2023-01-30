package dataBase;

import enums.FuncionarioCargo;
import pessoas.FuncionarioLocador;
import java.util.HashMap;

public class FuncionarioDb extends GuardaCadastro<FuncionarioLocador> implements Cadastros{
    public void cadastra() {
        FuncionarioLocador funciJose = new FuncionarioLocador("José", "000001",
                FuncionarioCargo.VENDEDOR);

        FuncionarioLocador funciAna = new FuncionarioLocador("Ana", "000002",
                FuncionarioCargo.VENDEDOR);

        this.cadastros = new HashMap<>();
        cadastros.put(funciJose.getMatricula(), funciJose);
        cadastros.put(funciAna.getMatricula(), funciAna);
    }
}
