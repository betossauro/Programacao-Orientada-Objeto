package lista_classes_abstratas_polimorfismo;

public class Circulo extends FormaGeometrica {

    private double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    public Circulo() {
        super();
    }

    public double getRaio() {
        return raio;
    }

    public void setLRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.getRaio(), 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.getRaio();
    }
}
