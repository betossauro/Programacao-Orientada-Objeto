package lista_construtores_heranca;

public class Fogao extends Eletrodomestico{

    private int qtdeBocas;

    public Fogao(String modelo, String fabricante, double KwDia, int qtdeBocas) {
        super(modelo, fabricante, KwDia);
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
