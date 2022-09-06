package lista_construtores_heranca;

public class Geladeira extends Eletrodomestico{

    private double capacidadeLitros;

    public Geladeira(String modelo, String fabricante, double consumoEnergia, double capacidadeLitros) {
        super(modelo, fabricante, consumoEnergia);
        this.capacidadeLitros = capacidadeLitros;
    }

    public Geladeira() {
        super();
    }

    public double getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(double capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }
}
