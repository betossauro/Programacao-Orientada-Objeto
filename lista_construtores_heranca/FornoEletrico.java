package lista_construtores_heranca;

public class FornoEletrico extends Eletrodomestico {
    private double capacidadeLitros;

    public FornoEletrico(String modelo, String fabricante, double consumoEnergia, double capacidadeLitros) {
        super(modelo, fabricante, consumoEnergia);
        this.capacidadeLitros = capacidadeLitros;
    }

    public FornoEletrico() {
        super();
    }

    public double getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(double capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }

    @Override
    public double calcularConsumoEnergiaDiario(int dias) {
        return (super.getConsumoEnergia() * dias) * 1.25;
    }
}
