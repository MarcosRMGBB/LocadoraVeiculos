package alugavel;

public abstract class VeiculoAlugavel {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected Enum categoria;

    public VeiculoAlugavel(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public Enum getCategoria() {
        return this.categoria;
    }
}

