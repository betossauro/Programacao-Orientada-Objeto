package lista_revisao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int[][] driver = new int [3][3];
        int[][] overdriver = new int [3][3];
        preencherMatrizDriver(driver);
        preencherOverdriver(overdriver, driver);
        System.out.println("Driver");
        imprimirMatriz(driver);
        System.out.println("----------");
        System.out.println("Overdriver");
        imprimirMatriz(overdriver);

    }
   

    // Preencher a matriz driver
    private static void preencherMatrizDriver(int[][] driver) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < driver.length; i++) { 
            for (int j = 0; j < driver[i].length; j++) {
                System.out.print("Informe o valor da matriz [" + i + "][" + j + "]: ");
                driver[i][j] = teclado.nextInt();
            }
        }
        teclado.close();
    }

    // Calcular a média da matriz driver
    private static int calcularMedia(int[][] driver) {
        int soma = 0;
        for (int i = 0; i < driver.length; i++) {
            for (int j = 0; j < driver.length; j++) {
                soma += driver[i][j];
            }
        }
        int media = soma / (driver.length * driver[0].length);
        return media;
    }

    // Preencher matriz overdriver
    private static void preencherOverdriver(int[][] overdriver, int[][] driver) {
        int media = calcularMedia(driver);
        System.out.println("Média: " + media);
        for (int i = 0; i < driver.length; i++) {
            for (int j = 0; j < driver[i].length; j++) {
                if (i == j){
                    overdriver[i][j] += (driver[i][j] * media);
                } else{
                    overdriver[i][j] += (driver[i][j] * 2);
                }
            }
        }
    }
     
    private static void imprimirMatriz(int[][] matriz) {
        System.out.println("------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
