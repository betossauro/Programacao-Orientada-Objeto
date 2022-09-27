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
        this.getEstoque().calcularTotalEstoque();
    }

    public void calcularValorEstoqueLab(String laboratorio) {
        this.getEstoque().calcularTotalEstoqueLab(laboratorio);
    }

    public LuisLaboratorio exibirInformacoesLab(String laboratorio) {
        return this.getEstoque().buscarInformacoes(laboratorio);
    }
}
