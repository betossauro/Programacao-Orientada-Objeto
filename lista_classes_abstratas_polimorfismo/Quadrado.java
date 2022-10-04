package lista_classes_abstratas_polimorfismo;

public class Quadrado extends FormaGeometrica {

    private int lado;

    public Quadrado(String nome, int lado) {
        super(nome);
        this.lado = lado;
    }

    public Quadrado() {
        super();
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.getLado(), 2);
    }

    @Override
    public double calcularPerimetro() {
        return this.getLado() * 4;
    }
}
