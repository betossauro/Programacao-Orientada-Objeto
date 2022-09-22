package simulado_1;

public class LuisEmpresa {
    private String nome;
    private String cnpj;
    private LuisEndereco endereco;
    
    public LuisEmpresa(String nome, String cnpj, LuisEndereco endereco) {
        super();
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public LuisEmpresa() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public LuisEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(LuisEndereco endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "\nEmpresa:"
            + "\nNome: " + this.getNome()
            + "\nCNPJ: " + this.getCnpj()
            + "\nEndereço: " + this.getEndereco();
    }

}
