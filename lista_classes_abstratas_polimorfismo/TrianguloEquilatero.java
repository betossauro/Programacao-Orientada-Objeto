package lista_classes_abstratas_polimorfismo;

public class TrianguloEquilatero extends Triangulo {

    private double lado;

    public TrianguloEquilatero(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }

    public TrianguloEquilatero() {
        super();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (Math.pow(this.getLado(), 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public double calcularPerimetro() {
        return (this.getLado() * 3);
    }
}
