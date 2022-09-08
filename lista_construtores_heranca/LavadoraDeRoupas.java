package lista_construtores_heranca;

public class LavadoraDeRoupas extends Eletrodomestico{

    private double capacidadeKg;

    public LavadoraDeRoupas(String modelo, String fabricante, double KwDia, double capacidadeKg) {
        super(modelo, fabricante, KwDia);
        this.capacidadeKg = capacidadeKg;
    }

    public LavadoraDeRoupas() {
        super();
    }

    public double getCapacidadeKg() {
        return capacidadeKg;
    }

    public void setCapacidadeKg(double capacidadeKg) {
        this.capacidadeKg = capacidadeKg;
    }
}
