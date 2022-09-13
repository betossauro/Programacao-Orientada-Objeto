package lista_construtores_heranca_2;

public class Serrote extends FerramentaManual{
    
    private double tamanhoPolegadas;
    private int qtdeDentes;

    public Serrote(String modelo, String fabricante, double peso, double fatorDesgaste, String tipo,
            double tamanhoPolegadas, int qtdeDentes) {
        super(modelo, fabricante, peso, fatorDesgaste, tipo);
        this.tamanhoPolegadas = tamanhoPolegadas;
        this.qtdeDentes = qtdeDentes;
    }

    public Serrote() {
        super();
    }

    public double getTamanhoPolegadas() {
        return tamanhoPolegadas;
    }

    public void setTamanhoPolegadas(double tamanhoPolegadas) {
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

    public int getQtdeDentes() {
        return qtdeDentes;
    }

    public void setQtdeDentes(int qtdeDentes) {
        this.qtdeDentes = qtdeDentes;
    }

    
}
