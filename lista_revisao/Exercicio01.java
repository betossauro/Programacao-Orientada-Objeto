package lista_revisao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");
        int opcao = 0;
        double faturamento = 0;
        double faturamentoLaranja = 0;
        double faturamentoMorango = 0;
        double faturamentoMaca = 0;
        do {
            System.out.print("Informe a quantidade de laranjas compradas em quilos: ");
            double qntdLaranjas = teclado.nextDouble();
            System.out.print("Informe a quantidade de morangos compradas em quilos: ");
            double qntdMorangos = teclado.nextDouble();
            System.out.print("Informe a quantidade de maças compradas em quilos: ");
            double qntdMacas = teclado.nextDouble();
            double valorLaranja = calcularValorLaranjas(qntdLaranjas);
            faturamentoLaranja += valorLaranja;
            double valorMorango = calcularValorMorangos(qntdMorangos);
            faturamentoMorango += valorMorango;
            double valorMaca = calcularValorMacas(qntdMacas);
            faturamentoMaca += valorMaca;
            double valorTotal = calcularValorCompra(valorLaranja, valorMorango, valorMaca);
            faturamento += valorTotal;
            System.out.println("O valor total a ser pago pelo cliente é de: R$" + formatador.format(valorTotal));
            System.out.print("Deseja realizar mais uma venda de frutas?\n1 - Sim | 2- Não - ");
            opcao = teclado.nextInt();
        } while (opcao == 1);
        apresentarFaturamento(faturamento, faturamentoLaranja, faturamentoMorango, faturamentoMaca);
        teclado.close();
    }

    // Calculo de valor de laranjas com seus respectivos descontos
    static double calcularValorLaranjas(double qntdLaranjas) {
        double valorLaranjas = 0;
        if (qntdLaranjas < 2.0) {
            valorLaranjas = (4.50 * qntdLaranjas);
        } else {
            if (qntdLaranjas >= 2.0 && qntdLaranjas <= 5.0) {
                valorLaranjas = (4.25 * qntdLaranjas);
            } else {
                valorLaranjas = (4.0 * qntdLaranjas);
            }
        }
        return valorLaranjas;
    }

    // Calculo de valor de morangos com seus respectivos descontos
    static double calcularValorMorangos(double qntdMorangos) {
        double valorMorangos = 0;
        if (qntdMorangos < 2.0) {
            valorMorangos = (6.0 * qntdMorangos);
        } else {
            if (qntdMorangos >= 2.0 && qntdMorangos <= 5.0) {
                valorMorangos = (5.75 * qntdMorangos);
            } else {
                valorMorangos = (5.50 * qntdMorangos);
            }
        }
        return valorMorangos;
    }

    // Calculo de valor de maças com seus respectivos descontos
    static double calcularValorMacas(double qntdMacas) {
        double valorMacas = 0;
        if (qntdMacas < 2.0) {
            valorMacas = (5.50 * qntdMacas);
        } else {
            if (qntdMacas >= 2.0 && qntdMacas <= 5.0) {
                valorMacas = (5.25 * qntdMacas);
            } else {
                valorMacas = (5.0 * qntdMacas);
            }
        }
        return valorMacas;
    }

    // Calcular o valor da compra utilizando os valores adquiridos para cada fruta
    static double calcularValorCompra(double valorLaranja, double valorMorango, double valorMaca) {
        double valorTotal = (valorLaranja + valorMorango + valorMaca);
        return valorTotal;
    }

    // Mensagem para o usuário saber o faturamento diário
    static void apresentarFaturamento(double faturamento, double faturamentoLaranja, double faturamentoMorango, double faturamentoMaca) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("O faturamento do dia foi R$" + formatador.format(faturamento) + ", sendo um total de R$" 
        + formatador.format(faturamentoLaranja) + " para laranjas, R$" + formatador.format(faturamentoMorango)
        + " para morangos e R$" + formatador.format(faturamentoMaca) + " para maçãs.");
    }
}