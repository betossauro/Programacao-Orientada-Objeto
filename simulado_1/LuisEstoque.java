package simulado_1;

public class LuisEstoque {
    private String responsavel;
    private LuisRemedio[] remedios;

    public LuisEstoque(String responsavel, LuisRemedio[] remedios) {
        super();
        this.responsavel = responsavel;
        this.remedios = remedios;
    }

    public LuisEstoque() {
        super();
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public LuisRemedio[] getRemedios() {
        return remedios;
    }

    public void setRemedios(LuisRemedio[] remedios) {
        this.remedios = remedios;
    }

    public void calcularTotalEstoque() {
        double valorTotal = 0;
        for (int i = 0; i < this.getRemedios().length; i++) {
            valorTotal += this.getRemedios()[i].getPreco();
        }
        System.out.println("O total em reais do estoque de remédios é: R$" + valorTotal);
    }

    public void calcularTotalEstoqueLab(String laboratorio) {
        double valorTotal = 0;
        for (int i = 0; i < this.getRemedios().length; i++) {
            if (laboratorio.equalsIgnoreCase(this.getRemedios()[i].getLaboratorio().getNome())) {
                valorTotal += this.getRemedios()[i].getPreco();
            }
        }
        System.out.println("O total em reais do estoque do laboratório " + laboratorio + " é de: R$" + valorTotal);
    }

    public void buscarInformacoes(String laboratorio) {
        for (int i = 0; i < this.getRemedios().length; i++) {
            if (laboratorio.equals(this.getRemedios()[i].getLaboratorio().getNome())) {
                System.out.println(this.getRemedios()[i].getLaboratorio());
                break;
            }
        }
    }

}
