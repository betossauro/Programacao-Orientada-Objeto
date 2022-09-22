package simulado_1;

public class LuisFarmacia extends LuisEmpresa{

    private LuisEstoque estoque;

    public LuisFarmacia(String nome, String cnpj, LuisEndereco endereco, LuisEstoque estoque) {
        super(nome, cnpj, endereco);
        this.estoque = estoque;
    }

    public LuisFarmacia() {
        super();
    }

    public LuisEstoque getEstoque() {
        return estoque;
    }

    public void setEstoque(LuisEstoque estoque) {
        this.estoque = estoque;
    }

    public void identificarResponsavelEstoque() {
        System.out.println("O nome do responsável pelo estoque é: " + this.getEstoque().getResponsavel());
    }   

    public void calcularValorEstoque(){
        double valorTotal = 0;
        for (int i = 0; i < this.estoque.getRemedios().length; i++) {
            valorTotal += this.estoque.getRemedios()[i].getPreco();
        }
        System.out.println("O total em reais do estoque de remédios é: R$" + valorTotal);
    }

    public void calcularValorEstoqueLab(String laboratorio) {
        double valorTotal = 0;
        for (int i = 0; i < this.estoque.getRemedios().length; i++) {
            if (laboratorio.equals(this.estoque.getRemedios()[i].getLaboratorio().getNome())) {
                valorTotal += estoque.getRemedios()[i].getPreco();
            }
        }
        System.out.println("O total em reais do estoque do laboratório " + laboratorio + " é de: R$" + valorTotal);
    }

    public void buscarInformacoesLab(String laboratorio) {
        for (int i = 0; i < this.estoque.getRemedios().length; i++) {
            if (laboratorio.equals(this.estoque.getRemedios()[i].getLaboratorio().getNome())) {
                System.out.println(this.estoque.getRemedios()[i].getLaboratorio());
                break;
            }
        }
    }


    
}
