package dataBase;

import pessoas.ClienteLocatario;
import java.util.HashMap;

public class ClienteDb extends GuardaCadastro<ClienteLocatario> implements Cadastros{
    public void cadastra() {
        ClienteLocatario clienteAna = new ClienteLocatario("Ana Maria", "001.002.003-04", "01-01-2001");
        ClienteLocatario clienteMario = new ClienteLocatario("Mario", "002.003.004-05", "01-01-2005");

        this.cadastros = new HashMap<>();
        this.cadastros.put(clienteAna.getCpf(), clienteAna);
        this.cadastros.put(clienteMario.getCpf(), clienteMario);
    }
}
