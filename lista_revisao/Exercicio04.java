package lista_revisao;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] meses = { "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro" };
        double[] temperatura = new double[meses.length];
        double[] chuva = new double[meses.length];
        double[] umidade = new double[meses.length];

        preencherCondicaoClimatica(meses, temperatura, "Temperaturas");
        preencherCondicaoClimatica(meses, chuva, "Chuvas");
        preencherCondicaoClimatica(meses, umidade, "Umidades");

        classificarCondicaoClimatica(meses, temperatura, chuva, umidade);
        teclado.close();
    }

    // Preencher array de condição climática
    static void preencherCondicaoClimatica(String[] meses, double[] condicaoClimatica, String titulo) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Informações das " + titulo + " dos Meses do Ano");
            for (int i = 0; i < meses.length; i++) {
                System.out.print("Informe a média do mês " + meses[i] + ": ");
                condicaoClimatica[i] = teclado.nextDouble();
            }
        }
    }

    // Calculo de média de condição climática
    static double calcularMediaCondicaoClimatica(double[] condicaoClimatica) {
        double acumulador = 0;
        for (int i = 0; i < condicaoClimatica.length; i++) {
            acumulador += condicaoClimatica[i];
        }
        return acumulador / condicaoClimatica.length;
    }

    // Lista os meses com suas respectivas classificações de anomalias
    static void classificarCondicaoClimatica(String[] meses, double[] temperatura, double[] chuva, double[] umidade) {
        double mediaAnualTemperatura = calcularMediaCondicaoClimatica(temperatura);
        double mediaAnualChuva = calcularMediaCondicaoClimatica(chuva);
        double mediaAnualUmidade = calcularMediaCondicaoClimatica(umidade);
        System.out.println("Temperatura Média Anual: " + mediaAnualTemperatura);
        System.out.println("Chuva Média Anual: " + mediaAnualChuva);
        System.out.println("Umidade Média Anual: " + mediaAnualUmidade);

        for (int i = 0; i < meses.length; i++) {
            if (temperatura[i] < mediaAnualTemperatura
                    && chuva[i] < mediaAnualChuva
                    && umidade[i] < mediaAnualUmidade) {
                System.out.println("Condição climática do mês " + meses[i] + ": Anomalia Extrema.");
            }
            if (temperatura[i] < mediaAnualTemperatura
                    && chuva[i] < mediaAnualChuva
                    && umidade[i] > mediaAnualUmidade) {
                System.out.println("Condição climática do mês " + meses[i] + ": Anomalia Forte.");
            }
            if (temperatura[i] < mediaAnualTemperatura
                    && chuva[i] > mediaAnualChuva
                    && umidade[i] < mediaAnualUmidade) {
                System.out.println("Condição climática do mês " + meses[i] + ": Anomalia Suave.");
            }
            if (temperatura[i] < mediaAnualTemperatura
                    && chuva[i] > mediaAnualChuva
                    && umidade[i] > mediaAnualUmidade) {
                System.out.println("Condição climática do mês " + meses[i] + ": Sem Anomalia.");
            }
            if (temperatura[i] > mediaAnualTemperatura
                    && chuva[i] < mediaAnualChuva
                    && umidade[i] < mediaAnualUmidade) {
                System.out.println("Condição climática do mês " + meses[i] + ": Sem Anomalia.");
            }
            if (temperatura[i] > mediaAnualTemperatura
                    && chuva[i] < mediaAnualChuva
                    && umidade[i] > mediaAnualUmidade) {
                System.out.println("Condição climática do mês " + meses[i] + ": Anomalia Suave.");
            }
            if (temperatura[i] > mediaAnualTemperatura
                    && chuva[i] > mediaAnualChuva
                    && umidade[i] < mediaAnualUmidade) {
                System.out.println("Condição climática do mês " + meses[i] + ": Anomalia Forte.");
            }
            if (temperatura[i] > mediaAnualTemperatura
                    && chuva[i] > mediaAnualChuva
                    && umidade[i] > mediaAnualUmidade) {
                System.out.println("Condição climática do mês " + meses[i] + ": Anomalia Extrema.");
            }
        }
    }
}
