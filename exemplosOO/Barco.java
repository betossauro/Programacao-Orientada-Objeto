package exemplosOO;

public class Barco extends Veiculo{
    private double tamanhoPopa;

    public Barco(String fabricante, String modelo, int ano, String placa, double tamanhoPopa) {
        super(fabricante, modelo, ano, placa);
        this.tamanhoPopa = tamanhoPopa;
    }

    public Barco() {
        super();
    }

    public double getTamanhoPopa() {
        return this.tamanhoPopa;
    }

    public void setTamanhoPopa(double tamanhoPopa) {
        this.tamanhoPopa = tamanhoPopa;
    }
    
}
