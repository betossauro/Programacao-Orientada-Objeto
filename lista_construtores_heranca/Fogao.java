package lista_construtores_heranca;

public class Fogao extends Eletrodomestico{

    private int qtdeBocas;

    public Fogao(String modelo, String fabricante, double consumoEnergia, int qtdeBocas) {
        super(modelo, fabricante, consumoEnergia);
        this.qtdeBocas = qtdeBocas;
    }

    public Fogao() {
        super();
    }

    public int getQtdeBocas() {
        return qtdeBocas;
    }

    public void setQtdeBocas(int qtdeBocas) {
        this.qtdeBocas = qtdeBocas;
    }
}
