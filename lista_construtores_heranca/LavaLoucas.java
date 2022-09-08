package lista_construtores_heranca;

public class LavaLoucas extends Eletrodomestico{

    private double capacidadeLitros;

    public LavaLoucas(String modelo, String fabricante, double KwDia, double capacidadeLitros) {
        super(modelo, fabricante, KwDia);
        this.capacidadeLitros = capacidadeLitros;
    }
    
    public LavaLoucas() {
        super();
    }

    public double getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(double capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }
}
