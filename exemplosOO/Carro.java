package exemplosOO;

public class Carro extends Veiculo {

    private double potenciaCV;

    public Carro(String fabricante, String modelo, int ano, String placa, double potenciaCV) {
        super(fabricante, modelo, ano, placa);
        this.potenciaCV = potenciaCV;
    }
    
    public Carro() {
        super();
    }

    public double getPotenciaCV() {
        return this.potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString(){
        return "\nFabricante: " + this.getFabricante()
        + "\nModelo: " + this.getModelo()
        + "\nAno: " + this.getAno()
        + "\nPlaca: " + this.getPlaca()
        + "\nPotenciaCV: " + this.getPotenciaCV();
    }

}
