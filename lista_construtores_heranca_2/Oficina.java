package lista_construtores_heranca_2;

public class Oficina {
    public static void main(String[] args) {
        Furadeira f1 = new Furadeira("GSB13RE", "Bosh", 2, 3, 4000, 650, 200);
        Lixadeira l1 = new Lixadeira("Orbital", "Skill", 2, 25, 5000, 200, 110);
        Serra s1 = new Serra("DWE560", "Dewalt", 5, 20, 7000, 1400, 220);
        Alicate a1 = new Alicate("Amarelo", "Tramontina", 0.3, 10, "Universal", 8);
        Alicate a2 = new Alicate("Vermelho", "Bosh", 0.2, 15, "Corte", 5);
        Martelo m1 = new Martelo("Madeira", "Tramontina", 0.25, 18, "Cunha", 6);
        Martelo m2 = new Martelo("Ferro", "Tramontina", 0.25, 12, "Pena", 8);
        Serrote st1 = new Serrote("Serrotinho", "Cortag", 0.35, 40, "De ponta", 12, 60);

        double consumoEletrico = (f1.getPotenciaWatts() * 3) + (l1.getPotenciaWatts() * 2)
                + (s1.getPotenciaWatts() * 4);
        System.out.println("Consumo Mensal: " + (consumoEletrico * 30));
        System.out.println("Consumo Semanal: " + (consumoEletrico * 7));

        System.out.println("Ferramenta com maior vida útil");
        if (a1.calcularVidaUtil() > a2.calcularVidaUtil()) {
            if (a1.calcularVidaUtil() > m1.calcularVidaUtil()) {
                if (a1.calcularVidaUtil() > m2.calcularVidaUtil()) {
                    if (a1.calcularVidaUtil() > st1.calcularVidaUtil()) {
                        System.out.println("Ferramenta " + a1.getModelo()
                                + "\n Vida útil: " + a1.calcularVidaUtil());
                    } else {
                        System.out.println("Ferramenta " + st1.getModelo()
                                + "\n Vida útil: " + st1.calcularVidaUtil());
                    }
                } else {
                    if (m2.calcularVidaUtil() > st1.calcularVidaUtil()) {
                        System.out.println("Ferramenta " + m2.getModelo()
                                + "\n Vida útil: " + m2.calcularVidaUtil());
                    } else {
                        System.out.println("Ferramenta " + st1.getModelo()
                                + "\n Vida útil: " + st1.calcularVidaUtil());
                    }
                }

            } else {
                if (m1.calcularVidaUtil() > m2.calcularVidaUtil()) {
                    if (m1.calcularVidaUtil() > st1.calcularVidaUtil()) {
                        System.out.println("Ferramenta " + m1.getModelo()
                                + "\n Vida útil: " + m1.calcularVidaUtil());
                    } else {
                        System.out.println("Ferramenta " + st1.getModelo()
                                + "\n Vida útil: " + st1.calcularVidaUtil());
                    }
                } else {
                    if (m2.calcularVidaUtil() > st1.calcularVidaUtil()) {
                        System.out.println("Ferramenta " + m2.getModelo()
                                + "\n Vida útil: " + m2.calcularVidaUtil());
                    } else {
                        System.out.println("Ferramenta " + st1.getModelo()
                                + "\n Vida útil: " + st1.calcularVidaUtil());
                    }

                }
            }
        } else {
            if (a2.calcularVidaUtil() > m1.calcularVidaUtil()) {
                if (a2.calcularVidaUtil() > m2.calcularVidaUtil()) {
                    if (a2.calcularVidaUtil() > st1.calcularVidaUtil()) {
                        System.out.println("Ferramenta " + a2.getModelo()
                                + "\n Vida útil: " + a2.calcularVidaUtil());
                    } else {
                        System.out.println("Ferramenta " + st1.getModelo()
                                + "\n Vida útil: " + st1.calcularVidaUtil());
                    }
                } else {
                    if (m2.calcularVidaUtil() > st1.calcularVidaUtil()) {
                        System.out.println("Ferramenta " + m2.getModelo()
                                + "\n Vida útil: " + m2.calcularVidaUtil());
                    } else {
                        System.out.println("Ferramenta " + st1.getModelo()
                                + "\n Vida útil: " + st1.calcularVidaUtil());
                    }
                }
            } else {
                if (m1.calcularVidaUtil() > m2.calcularVidaUtil()) {
                    if (m1.calcularVidaUtil() > st1.calcularVidaUtil()) {
                        System.out.println("Ferramenta " + m1.getModelo()
                                + "\n Vida útil: " + m1.calcularVidaUtil());
                    } else {
                        System.out.println("Ferramenta " + st1.getModelo()
                                + "\n Vida útil: " + st1.calcularVidaUtil());
                    }
                } else {
                    if (m2.calcularVidaUtil() > st1.calcularVidaUtil()) {
                        System.out.println("Ferramenta " + m2.getModelo()
                                + "\n Vida útil: " + m2.calcularVidaUtil());
                    } else {
                        System.out.println("Ferramenta " + st1.getModelo()
                                + "\n Vida útil: " + st1.calcularVidaUtil());
                    }
                }
            }
        }
    }
}