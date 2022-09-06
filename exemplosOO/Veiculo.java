package exemplosOO;

public class Veiculo {
    private String fabricante;
    private String modelo;
    private int ano;
    private String placa;

    public Veiculo(String fabricante, String modelo, int ano, String placa) {
        super();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public Veiculo() {
        super();
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "\nFabricante: " + this.getFabricante()
                + "\nModelo: " + this.getModelo()
                + "\nAno: " + this.getAno()
                + "\nPlaca: " + this.getPlaca();
    }

}