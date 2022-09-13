package lista_construtores_heranca_2;

public class Lixadeira extends FerramentaEletrica{

    public Lixadeira(String modelo, String fabricante, double peso, double fatorDesgaste, int rotacaoRPM,
            int potenciaWatts, int tensaoVolts) {
        super(modelo, fabricante, peso, fatorDesgaste, rotacaoRPM, potenciaWatts, tensaoVolts);
    }

    public Lixadeira() {
        super();
    }
    
}
