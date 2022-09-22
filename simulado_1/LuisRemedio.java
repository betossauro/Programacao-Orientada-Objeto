package simulado_1;

public class LuisRemedio {
    private String nome;
    private double preco;
    private LuisLaboratorio laboratorio;

    public LuisRemedio(String nome, double preco, LuisLaboratorio laboratorio) {
        super();
        this.nome = nome;
        this.preco = preco;
        this.laboratorio = laboratorio;
    }

    public LuisRemedio() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LuisLaboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(LuisLaboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    @Override
    public String toString() {
        return "\nNome: " + this.getNome()
            + "\nPreço: " + this.getPreco()
            + "\nLaboratorio: " + this.getLaboratorio();
    }
    
}
