package lista_construtores_heranca_2;

public class Furadeira extends FerramentaEletrica{

    public Furadeira(String modelo, String fabricante, double peso, double fatorDesgaste, int rotacaoRPM,
            int potenciaWatts, int tensaoVolts) {
        super(modelo, fabricante, peso, fatorDesgaste, rotacaoRPM, potenciaWatts, tensaoVolts);
    }

    public Furadeira() {
        super();
    }
    
}
