package dataBase;

import java.util.HashMap;

public abstract class GuardaCadastro<T> {
    HashMap<String, T> cadastros;

    public T recuperaCadastro(String id) {
        return this.cadastros.get(id);
    }
}
