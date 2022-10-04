package lista_classes_abstratas_polimorfismo;

public class Losango extends FormaGeometrica {

    private double ladoA;
    private double ladoB;
    private double diagonalMenor;
    private double diagonalMaior;

    public Losango(String nome, double ladoA, double ladoB, double diagonalMenor, double diagonalMaior) {
        super(nome);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.diagonalMenor = diagonalMenor;
        this.diagonalMaior = diagonalMaior;
    }

    public Losango() {
        super();
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double getDiagonalMaior() {
        return diagonalMaior;
    }

    public void setDiagonalMaior(double diagonalMaior) {
        this.diagonalMaior = diagonalMaior;
    }

    @Override
    public double calcularArea() {
        return (this.getDiagonalMaior() * this.getDiagonalMenor()) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * this.getLadoA()) + (2 * this.getLadoB());
    }
}
