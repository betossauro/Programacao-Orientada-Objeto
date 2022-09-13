package lista_construtores_heranca_2;

public class Ferramenta {
    private String modelo;
    private String fabricante;
    private double peso;
    private double fatorDesgaste;
    
    public Ferramenta(String modelo, String fabricante, double peso, double fatorDesgaste) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.peso = peso;
        this.fatorDesgaste = fatorDesgaste;
    }

    public Ferramenta() {
        super();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getFatorDesgaste() {
        return fatorDesgaste;
    }

    public void setFatorDesgaste(double fatorDesgaste) {
        this.fatorDesgaste = fatorDesgaste;
    }

    public double calcularVidaUtil(){
        return 100 / this.getFatorDesgaste();
    }

    public double calcularVidaUtil(String periodo){
        double resultado = 0;
        if (periodo.toUpperCase().equals("DIA")) {
            resultado = this.calcularVidaUtil() / 24;
        } else{
            resultado = (this.calcularVidaUtil() / 24) / 7;
        }
        return resultado;
    }
}
