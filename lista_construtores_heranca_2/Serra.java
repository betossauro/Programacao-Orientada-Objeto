package lista_construtores_heranca_2;

public class Serra extends FerramentaEletrica{

    public Serra(String modelo, String fabricante, double peso, double fatorDesgaste, int rotacaoRPM,
            int potenciaWatts, int tensaoVolts) {
        super(modelo, fabricante, peso, fatorDesgaste, rotacaoRPM, potenciaWatts, tensaoVolts);
    }

    public Serra() {
        super();
    }
    
}
