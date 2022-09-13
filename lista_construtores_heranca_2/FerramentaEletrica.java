package lista_construtores_heranca_2;

public class FerramentaEletrica extends Ferramenta{

    private int rotacaoRPM;
    private int potenciaWatts;
    private int tensaoVolts;

    public FerramentaEletrica(String modelo, String fabricante, double peso, double fatorDesgaste,
            int rotacaoRPM, int potenciaWatts, int tensaoVolts) {
        super(modelo, fabricante, peso, fatorDesgaste);
        this.rotacaoRPM = rotacaoRPM;
        this.potenciaWatts = potenciaWatts;
        this.tensaoVolts = tensaoVolts;
    }

    public FerramentaEletrica() {
        super();
    }

    public int getRotacaoRPM() {
        return rotacaoRPM;
    }

    public void setRotacaoRPM(int rotacaoRPM) {
        this.rotacaoRPM = rotacaoRPM;
    }

    public int getPotenciaWatts() {
        return potenciaWatts;
    }

    public void setPotenciaWatts(int potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }

    public int getTensaoVolts() {
        return tensaoVolts;
    }

    public void setTensaoVolts(int tensaoVolts) {
        this.tensaoVolts = tensaoVolts;
    }

}
