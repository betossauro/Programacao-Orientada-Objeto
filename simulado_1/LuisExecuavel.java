package simulado_1;

public class LuisExecuavel {
    public static void main(String[] args) {
        // Lab Legrand
        LuisEndereco endLegrand = new LuisEndereco("Rua dos Remédios", 100, "Centro", "Palhoça", "Santa Catarina");
        LuisLaboratorio legrand = new LuisLaboratorio("Legrand", "12.345.678/0001-11", endLegrand);
        // Remédios Lab Legrand
        LuisRemedio rosuvas = new LuisRemedio("Rosuvas", 55.00, legrand);
        LuisRemedio glifage = new LuisRemedio("Glifage", 35.00, legrand);
        LuisRemedio araDoisH = new LuisRemedio("Aradois H", 50.00, legrand);
        LuisRemedio trandilax = new LuisRemedio("Trandilax", 10.00, legrand);
        
        // Lab Medley
        LuisEndereco endMedley = new LuisEndereco("Rua da Medicação", 200, "Estreiro", "Florianópolis", "Santa Catarina");
        LuisLaboratorio medley = new LuisLaboratorio("Medley", "12.345.678/0001-22", endMedley);
        // Remédios Lab Medley
        LuisRemedio rosuvastatina = new LuisRemedio("Rosuvastatina", 50.00, medley);
        LuisRemedio lexotan = new LuisRemedio("Lexotan", 40.00, medley);
        LuisRemedio losartana = new LuisRemedio("Losartana", 45.00, medley);
        LuisRemedio torsilax = new LuisRemedio("Torsilax", 15.00, medley);

        // Estoque
        LuisRemedio[] listaEstoque = {rosuvas, rosuvas, rosuvas, rosuvas, glifage, glifage, glifage, araDoisH, araDoisH, trandilax, rosuvastatina, lexotan, lexotan, losartana, losartana, losartana, torsilax, torsilax, torsilax, torsilax};
        LuisEstoque estoque = new LuisEstoque("Luciano", listaEstoque); 

        // Farmacia Senac
        LuisEndereco endFarmacia = new LuisEndereco("Rua Jardim Silva", 360, "Centro", "Florianópolis", "Santa Catarina");
        LuisFarmacia farmacia = new LuisFarmacia("Farmácia do Senac", "12.345.678/0001-33", endFarmacia, estoque);
        
        // Informar responsável por estoque
        farmacia.identificarResponsavelEstoque();

        // Calcular valor total em reais dos remédios
        farmacia.calcularValorEstoque();

        // Calcular valor total em reais do lab
        farmacia.calcularValorEstoqueLab("Medley");
        farmacia.calcularValorEstoqueLab("Legrand");

        // Buscar informações do laboratório
        System.out.println("Dados do Laboratório:");
        System.out.println(farmacia.exibirInformacoesLab("Medley"));
        System.out.println(farmacia.exibirInformacoesLab("Legrand"));
    }
}
