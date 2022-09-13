package lista_construtores_heranca_2;

public class Alicate extends FerramentaManual{
    
    private double tamanhoPolegadas;

    public Alicate(String modelo, String fabricante, double peso, double fatorDesgaste, String tipo,
            double tamanhoPolegadas) {
        super(modelo, fabricante, peso, fatorDesgaste, tipo);
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

    public Alicate() {
        super();
    }

    public double getTamanhoPolegadas() {
        return tamanhoPolegadas;
    }

    public void setTamanhoPolegadas(double tamanhoPolegadas) {
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

        
}
