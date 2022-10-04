package lista_classes_abstratas_polimorfismo;

public class TrianguloIsosceles extends Triangulo {

    private double base;
    private double altura;

    public TrianguloIsosceles(String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    public TrianguloIsosceles() {
        super();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (this.getBase() * this.getAltura()) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return (2 *this.getBase()) + (2 * Math.hypot(this.getBase(), this.getAltura()));
    }
}
