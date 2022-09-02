package lista_revisao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");
        int opcao = 0;
        double totalFaturadoAlcool = 0;
        double totalFaturadoGasolina = 0;
        double totalFaturadoDiesel = 0;
        do {
            String tipoCombustivel = selecionarTipoCombustivel();
            switch (tipoCombustivel) {
                case "A": {
                    double calculoAlcool = calcularValorAlcool();
                    System.out.println("O valor que o cliente deverá pagar é de R$" + formatador.format(calculoAlcool));
                    totalFaturadoAlcool += calculoAlcool;
                    break;
                }
                case "G": {
                    double calculoGasolina = calcularValorGasolina();
                    System.out.println("O valor que o cliente deverá pagar é de R$" + formatador.format(calculoGasolina));
                    totalFaturadoGasolina += calculoGasolina;
                    break;
                }
                case "D": {
                    double calculoDiesel = calcularValorDiesel();
                    System.out.println("O valor que o cliente deverá pagar é de R$" + formatador.format(calculoDiesel));
                    totalFaturadoDiesel += calculoDiesel;
                    break;
                }
                default: {
                    System.out.println("Formato inexistente! Selecione uma opção válida!");
                }
            }
            System.out.print("Deseja realizar uma nova venda? \n1 - Sim | 2 - Não : ");
            opcao = teclado.nextInt();
            teclado.nextLine();
        } while (opcao == 1);
        apresentarFaturamentoDiario(totalFaturadoAlcool, totalFaturadoGasolina, totalFaturadoDiesel);
        teclado.close();
    }

    // Selecionar se quer álcool, gasolina ou diesel
    static String selecionarTipoCombustivel() {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Informe o tipo de combustível que deseja abastecer." +
            "\nA -> Álcool | G -> Gasolina | D -> Diesel : ");
            String escolha = teclado.nextLine();
            return escolha;
        }
    }

    // Calculo de valor de álcool
    static double calcularValorAlcool() {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Infome quantos litros de álcool deseja abastecer: ");
            double litrosAlcool = teclado.nextDouble();
            double valorAlcool = 0;
            if (litrosAlcool <= 30) {
                valorAlcool = (litrosAlcool * 5.50) * 0.98;
            } else {
                valorAlcool = (litrosAlcool * 5.50) * 0.97;
            }
            return valorAlcool;
        }
    }
    
    // Calculo de valor de gasolina
    static double calcularValorGasolina() {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Infome quantos litros de gasolina deseja abastecer: ");
            double litrosGasolina = teclado.nextDouble();
            double valorGasolina = 0;
            if (litrosGasolina <= 30) {
                valorGasolina = (litrosGasolina * 6.0) * 0.97;
            } else {
                valorGasolina = (litrosGasolina * 6.0) * 0.96;
            }
            return valorGasolina;
        }
    }
    
    // Calculo de valor de diesel
    static double calcularValorDiesel() {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Infome quantos litros de diesel deseja abastecer: ");
            double litrosDiesel = teclado.nextDouble();
            double valorDiesel = 0;
            if (litrosDiesel <= 50) {
                valorDiesel = (litrosDiesel * 6.50) * 0.95;
            } else {
                valorDiesel = (litrosDiesel * 6.50) * 0.93;
            }
            return valorDiesel;
        }
    }
    
    // Imprimir faturamento diário
    static void apresentarFaturamentoDiario(double totalFaturadoAlcool, double totalFaturadoGasolina,
            double totalFaturadoDiesel) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("O valor total de Álcool faturado no dia foi de R$" + formatador.format(totalFaturadoAlcool)
        + "\nO valor total de Gasolina faturada no dia foi de R$" + formatador.format(totalFaturadoGasolina)
        + "\nO valor total de Diesel faturado no dia foi de R$" + formatador.format(totalFaturadoDiesel)
        + "\nO total faturado no dia foi de R$" + formatador.format(totalFaturadoAlcool + totalFaturadoGasolina + totalFaturadoDiesel));
    }
}
