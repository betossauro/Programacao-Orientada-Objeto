package lista_revisao;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número inteiro positivo: ");
        int decimal = teclado.nextInt();

        // Método utilizando imprimirBinário
        if (decimal < 0) {
            System.out.println("Informe um número inteiro positivo!");
        } else {
            System.out.print("O número " + decimal + " convertido para binário é: ");
            converterDecimalBinário(decimal);
        }
        // Método utilizando objeto
        // String bin = Integer.toBinaryString(decimal);
        // System.out.println(bin);
        teclado.close();
    }

    private static void converterDecimalBinário(int decimal) {
        if (decimal > 0) {
            converterDecimalBinário(decimal / 2);
            System.out.print(decimal % 2);
        }
    }
}
