package exemplosOO;

public class Moto extends Veiculo {

    private double potenciaCilindrada;

    public Moto(String fabricante, String modelo, int ano, String placa, double potenciaCilindrada) {
        super(fabricante, modelo, ano, placa);
        this.potenciaCilindrada = potenciaCilindrada;
    }

    public Moto() {
        super();
    }

    public double getPotenciaCilindrada() {
        return this.potenciaCilindrada;
    }

    public void setPotenciaCilindrada(double potenciaCilindrada) {
        this.potenciaCilindrada = potenciaCilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPotencia Cilindrada: " + this.getPotenciaCilindrada();
    }

}
