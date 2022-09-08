package lista_construtores_heranca;

public class Cozinha {
    public static void main(String[] args) {
        Geladeira g = new Geladeira("Refriegerador", "Electrolux", 2.3, 382);
        Fogao f = new Fogao("Fogão de Piso", " Consul", 1.3, 4);
        LavaLoucas l = new LavaLoucas("Lava Louça 8 Serviços", "Brastemp", 2.2, 38);
        MicroOndas m = new MicroOndas("Forno Microondas", "Electrolux", 1.7, 20);
        FornoEletrico fe = new FornoEletrico("Forno Grill", "Fischer", 2.1, 44);

        // consumo em 10 dias
        double calculoConsumoPeriodo = g.calcularConsumo(10) + f.calcularConsumo(10)
                + l.calcularConsumo(10) + m.calcularConsumo(10) + fe.calcularConsumo(10);
        System.out.println("O consumo em 10 dias foi de: " + calculoConsumoPeriodo);

        // consumo mensal
        double calculoConsumoMensal = g.calcularConsumo() + f.calcularConsumo()
                + l.calcularConsumo() + m.calcularConsumo() + fe.calcularConsumo();
        System.out.println("O consumo mensal foi de: " + calculoConsumoMensal);
    }
}
