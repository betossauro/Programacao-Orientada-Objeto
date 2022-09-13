package lista_construtores_heranca_2;

public class Martelo extends FerramentaManual{
    
    private double tamanhoMilimetros;

    public Martelo(String modelo, String fabricante, double peso, double fatorDesgaste, String tipo,
            double tamanhoMilimetros) {
        super(modelo, fabricante, peso, fatorDesgaste, tipo);
        this.tamanhoMilimetros = tamanhoMilimetros;
    }

    public Martelo() {
        super();
    }

    public double getTamanhoMilimetros() {
        return tamanhoMilimetros;
    }

    public void setTamanhoMilimetros(double tamanhoMilimetros) {
        this.tamanhoMilimetros = tamanhoMilimetros;
    }

    
}
