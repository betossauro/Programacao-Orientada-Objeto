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

}
