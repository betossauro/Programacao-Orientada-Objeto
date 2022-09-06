package lista_construtores_heranca;

public class Eletrodomestico {
    private String modelo;
    private String fabricante;
    private double consumoEnergia;

    public Eletrodomestico(String modelo, String fabricante, double consumoEnergia) {
        super();
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
    }

    public Eletrodomestico() {
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

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public double calcularConsumoEnergiaMensal(){
        return this.getConsumoEnergia() * 30;
    }

    public double calcularConsumoEnergiaDiario(int dias){
        return this.getConsumoEnergia() * dias;
    }
}
