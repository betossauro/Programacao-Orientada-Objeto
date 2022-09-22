package simulado_1;

public class LuisExecuavel {
    public static void main(String[] args) {
        // Lab Legrand
        LuisEndereco end1 = new LuisEndereco("Rua dos Remédios", 100, "Centro", "Palhoça", "Santa Catarina");
        LuisLaboratorio l1 = new LuisLaboratorio("Legrand", "12.345.678/0001-11", end1);
        // Lab Medley
        LuisEndereco end2 = new LuisEndereco("Rua da Medicação", 200, "Estreiro", "Florianópolis", "Santa Catarina");
        LuisLaboratorio l2 = new LuisLaboratorio("Medley", "12.345.678/0001-22", end2);
        // Remédios Lab Legrand
        LuisRemedio r1l1 = new LuisRemedio("Rosuvas", 55.00, l1);
        LuisRemedio r2l1 = new LuisRemedio("Glifage", 35.00, l1);
        LuisRemedio r3l1 = new LuisRemedio("Aradois H", 50.00, l1);
        LuisRemedio r4l1 = new LuisRemedio("Trandilax", 10.00, l1);
        // Remédios Lab Medley
        LuisRemedio r1l2 = new LuisRemedio("Rosuvastatina", 50.00, l2);
        LuisRemedio r2l2 = new LuisRemedio("Lexotan", 40.00, l2);
        LuisRemedio r3l2 = new LuisRemedio("Losartana", 45.00, l2);
        LuisRemedio r4l2 = new LuisRemedio("Torsilax", 15.00, l2);
        // Estoque
        LuisRemedio[] listaEstoque = {r1l1, r1l1, r1l1, r1l1, r2l1, r2l1, r2l1, r3l1, r3l1, r4l1, r1l2, r2l2, r2l2, r3l2, r3l2, r3l2, r4l2, r4l2, r4l2, r4l2};
        LuisEstoque e1 = new LuisEstoque("Luciano", listaEstoque); 
        // Farmacia Senac
        LuisEndereco end3 = new LuisEndereco("Rua Jardim Silva", 360, "Centro", "Florianópolis", "Santa Catarina");
        LuisFarmacia f1 = new LuisFarmacia("Farmácia do Senac", "12.345.678/0001-33", end3, e1);
        // Informar responsável por estoque
        f1.identificarResponsavelEstoque();
        // Calcular valor total em reais dos remédios
        f1.calcularValorEstoque();
        // Calcular valor total em reais do lab
        f1.calcularValorEstoqueLab(l1.getNome());
        f1.calcularValorEstoqueLab(l2.getNome());
        System.out.println();
        // Buscar informações do laboratório
        f1.buscarInformacoesLab(l1.getNome());
        System.out.println();
        f1.buscarInformacoesLab(l2.getNome());
    }
}
