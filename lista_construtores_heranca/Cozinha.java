package lista_construtores_heranca;

public class Cozinha {
    public static void main(String[] args) {
        Geladeira g = new Geladeira("Refriegerador", "Electrolux", 2.3, 382);
        Fogao f = new Fogao("Fogão de Piso", " Consul", 1.3, 4);
        LavaLoucas l = new LavaLoucas("Lava Louça 8 Serviços", "Brastemp", 2.2, 38);
        MicroOndas m = new MicroOndas("Forno Microondas", "Electrolux", 1.7, 20);
        FornoEletrico fe = new FornoEletrico("Forno Grill", "Fischer", 2.1, 44);

        // consumo em 10 dias
        double calculoConsumoEnergia = g.calcularConsumoEnergiaDiario(10) + f.calcularConsumoEnergiaDiario(10)
                + l.calcularConsumoEnergiaDiario(10) + m.calcularConsumoEnergiaDiario(10) + fe.calcularConsumoEnergiaDiario(10);
        System.out.println("O consumo em 10 dias foi de: " + calculoConsumoEnergia);

        // consumo mensal
        double calculoConsumoMensal = g.calcularConsumoEnergiaMensal() + f.calcularConsumoEnergiaMensal()
                + l.calcularConsumoEnergiaMensal() + m.calcularConsumoEnergiaMensal() + fe.calcularConsumoEnergiaMensal();
        System.out.println("O consumo mensal foi de: " + calculoConsumoMensal);
    }
}
