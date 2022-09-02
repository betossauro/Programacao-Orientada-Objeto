package lista_revisao;

import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {
        int[][] undervolt_1 = new int[4][4];
        int[][] undervolt_2 = new int[4][4];
        preencherUndervolt(undervolt_1);
        preencherUndervolt(undervolt_2);
        System.out.println("Undervolt 1");
        chamarMatriz(undervolt_1);
        System.out.println();
        System.out.println("Undervolt 2");
        chamarMatriz(undervolt_2);
        System.out.println();
        int[][] super_undervolt = new int[4][4];
        preencherSuperUndervolt(super_undervolt, undervolt_1, undervolt_2);
        System.out.println("Super Undervolt");
        chamarMatriz(super_undervolt);
        System.out.println();
        System.out.println("Números primos");
        identificarPrimos(super_undervolt);

    }

    // Preencher a matriz undervolt
    private static int[][] preencherUndervolt(int[][] undervolt) {
        Random gerador = new Random();
        for (int i = 0; i < undervolt.length; i++) {
            for (int j = 0; j < undervolt[i].length; j++) {
                undervolt[i][j] += gerador.nextInt(9) + 1;
            }
        }
        return undervolt;
    }

    // Imprimir undervolt_1
    private static void chamarMatriz(int[][] undervolt) {
        System.out.println("-----------");
        for (int i = 0; i < undervolt.length; i++) {
            for (int j = 0; j < undervolt[i].length; j++) {
                System.out.print(undervolt[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Preencher matriz super_undervolt
    private static void preencherSuperUndervolt(int[][] super_undervolt, int[][] undervolt_1, int[][] undervolt_2) {
        for (int i = 0; i < super_undervolt.length; i++) {
            for (int j = 0; j < super_undervolt[i].length; j++) {
                super_undervolt[i][j] = undervolt_1[i][j] + undervolt_2[i][j];
            }
        }
    }

    // Método para verificar se o número é primo
    static boolean isPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0 || i == 1) {
                return false;
            }
        }
        return true;
    }

    // Identificar os números primos na matriz super_undervolt
    private static void identificarPrimos(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (isPrimo(matriz[i][j])) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }
}
