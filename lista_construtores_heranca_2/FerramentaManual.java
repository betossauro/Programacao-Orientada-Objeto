package lista_construtores_heranca_2;

public class FerramentaManual extends Ferramenta{

    private String tipo;

    public FerramentaManual(String modelo, String fabricante, double peso, double fatorDesgaste,
            String tipo) {
        super(modelo, fabricante, peso, fatorDesgaste);
        this.tipo = tipo;
    }

    public FerramentaManual() {
        super();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
