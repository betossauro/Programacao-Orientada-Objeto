package lista_classes_abstratas_polimorfismo;

public abstract class FormaGeometrica {
    
    private String nome;

    public FormaGeometrica(String nome) {
        super();
        this.nome = nome;
    }

    public FormaGeometrica() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}
