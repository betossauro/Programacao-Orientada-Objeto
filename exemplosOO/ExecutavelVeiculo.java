package exemplosOO;

public class ExecutavelVeiculo {
    public static void main(String[] args) {
        Carro carro1 = new Carro("LAMBORGHINI", "Gallardo Coupe", 2010, "HTJ-3751", 544);
        Carro carro2 = new Carro("Bugre", "Buggy VII/VII BIG", 2008, "HZC-0919", 150);
        Carro carro3 = new Carro("LOBINI", "H1 1.8 20V Turbo 180cv 2p", 2005, "JLW-9452", 180);
        Carro carro4 = new Carro("Porsche", "911 Carrera Coup", 1992, "JZT-3915", 370);

        Moto moto1 = new Moto("Mitsubishi", "Lancer GLX", 1993, "HQL-2773", 180);
        Moto moto2 = new Moto("Honda", "CR-V LX 2.0 16V 2WD Mec.", 2012, "MQM-4068", 155);
        Moto moto3 = new Moto("Honda", "CITY Sedan DX 1.5 Flex 16V Mec.", 2011, "HOR-6017", 544);
        Moto moto4 = new Moto("Mitsubishi", "Colt GLXi", 1995, "AKO-1535", 250);

        Barco barco1 = new Barco("Chrysler", "TOWN & COUNTRY Touring 3.6 V6 Aut.", 1993, "KJE-0862", 20);
        Barco barco2 = new Barco("TAC", "Stark 2.3 4WD 127cv TDI Diesel 3p", 2010, "HGU-1752", 10);
        Barco barco3 = new Barco("Daihatsu", "Charade TX 1.3 16V", 1995, "LWJ-6096", 13);
        Barco barco4 = new Barco("Mahindra", "SCORPIO 2.6 CS/ Chassi TB Dies. CRDe 4x4", 2008, "MZV-5037", 15);

        Carro[] listaCarros = { carro1, carro2, carro3, carro4 };
        Moto[] listaMotos = { moto1, moto2, moto3, moto4 };
        Barco[] listaBarcos = { barco1, barco2, barco3, barco4 };

        // Identificar carro com maior potencia
        Carro carroMaiorPotencia = listaCarros[0];
        for (int i = 0; i < listaCarros.length; i++) {
            if (listaCarros[i].getPotenciaCV() > carroMaiorPotencia.getPotenciaCV()) {
                carroMaiorPotencia = listaCarros[i];
            }
        }
        System.out.println("O carro com maior potência é o: " + carroMaiorPotencia);
        System.out.println();

        // Identificar moto com menor potencia
        Moto motoMenorPotencia = listaMotos[0];
        for (int i = 0; i < listaMotos.length; i++) {
            if (listaMotos[i].getPotenciaCilindrada() < motoMenorPotencia.getPotenciaCilindrada()) {
                motoMenorPotencia = listaMotos[i];
            }
        }
        System.out.println("A moto com menor potência é a: " + motoMenorPotencia);
        System.out.println();

        // Identificar veiculo mais antigo
        Carro carroMaisAntigo = listaCarros[0];
        Moto motoMaisAntiga = listaMotos[0];
        Barco barcoMaisAntigo = listaBarcos[0];

        for (int i = 0; i < listaCarros.length; i++) {
            if (listaCarros[i].getAno() < carroMaisAntigo.getAno()) {
                carroMaisAntigo = listaCarros[i];
            }
        }
        for (int i = 0; i < listaMotos.length; i++) {
            if (listaMotos[i].getAno() < motoMaisAntiga.getAno()) {
                motoMaisAntiga = listaMotos[i];
            }
        }
        for (int i = 0; i < listaBarcos.length; i++) {
            if (listaBarcos[i].getAno() < barcoMaisAntigo.getAno()) {
                barcoMaisAntigo = listaBarcos[i];
            }
        }
        if (carroMaisAntigo.getAno() < motoMaisAntiga.getAno()) {
            if (carroMaisAntigo.getAno() < barcoMaisAntigo.getAno()) {
                System.out.println("O veiculo mais antigo é o: " + carroMaisAntigo);
            }
        } else {
            if (motoMaisAntiga.getAno() < barcoMaisAntigo.getAno()) {
                System.out.println("O veiculo mais antigo é o: " + motoMaisAntiga);
            } else {
                System.out.println("O veiculo mais antigo é o: " + barcoMaisAntigo);
            }
        }
    }
}
