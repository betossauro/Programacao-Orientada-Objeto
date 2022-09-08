package lista_construtores_heranca;

public class FornoEletrico extends Eletrodomestico {
    
    private double capacidadeLitros;

    public FornoEletrico(String modelo, String fabricante, double KwDia, double capacidadeLitros) {
        super(modelo, fabricante, KwDia);
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
    public double calcularConsumo(int dias) {
        return (super.getKwDia() * dias) * 1.25;
    }
}
