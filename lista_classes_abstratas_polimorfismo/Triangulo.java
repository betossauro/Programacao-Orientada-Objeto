package lista_classes_abstratas_polimorfismo;

public abstract class Triangulo extends FormaGeometrica {

    public Triangulo(String nome) {
        super(nome);
    }

    public Triangulo() {
        super();
    }

    @Override
    public abstract double calcularArea();

    @Override
    public abstract double calcularPerimetro();
}
