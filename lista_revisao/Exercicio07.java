package lista_revisao;

import java.util.Arrays;
import java.util.Random;

public class Exercicio07 {
    public static void main(String[] args) {
        int[] arrayPrimos = new int[10];
        preencherArrayPrimos(arrayPrimos);
        exibirArray(arrayPrimos);
        Arrays.sort(arrayPrimos);
        exibirArrayOrdenado(arrayPrimos);
        int media = calcularMedia(arrayPrimos);
        System.out.println("A média dos elementos do array é: " + media);
        identificarMenor(arrayPrimos);
        identificarMaior(arrayPrimos);
        identificarParesAbaixoMedia(arrayPrimos, media);
        identificarImparesAcimaMedia(arrayPrimos, media);

    }

    // Método para preencher o Array utilizando os números primos gerados por Random
    private static void preencherArrayPrimos(int[] array) {
        Random gerador = new Random();
        int contador = 0;
        while (contador < 10) {
            int num = gerador.nextInt(100) + 1;
            if (Exercicio06.isPrimo(num)) {
                array[contador] = num;
                contador++;
            }
        }
    }

    // Impressão do Array na ordem gerada
    private static void exibirArray(int[] arrayPrimos) {
        System.out.println("Array de Números Primos");
        System.out.println("-----------------------");
        for (int i = 0; i < arrayPrimos.length; i++) {
            System.out.print(arrayPrimos[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    // Impressão do Array de forma crescente
    private static void exibirArrayOrdenado(int[] arrayPrimos) {
        System.out.println("Array de Números Primos - Ordenado");
        System.out.println("----------------------------------");
        for (int i = 0; i < arrayPrimos.length; i++) {
            System.out.print(arrayPrimos[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    // Calculo de média dos elementos do Array
    private static int calcularMedia(int[] arrayPrimos) {
        int soma = 0;
        for (int i = 0; i < arrayPrimos.length; i++) {
            soma += arrayPrimos[i];
        }
        int media = soma / arrayPrimos.length;
        return media;
    }

    // Identificação do menor elemento do Array
    private static void identificarMenor(int[] arrayPrimos) {
        System.out.println("O menor elemento do Array é o: " + arrayPrimos[0]);
    }

    // Identificação do maior elemento do Array
    private static void identificarMaior(int[] arrayPrimos) {
        System.out.println("O maior elemento do Array é o: " + arrayPrimos[arrayPrimos.length - 1]);
    }

    // Método que identifica os números pares que estão abaixo da média calculada
    private static void identificarParesAbaixoMedia(int[] arrayPrimos, int media) {
        int contador = 0;
        int[] pares = new int[arrayPrimos.length];
        for (int i = 0; i < arrayPrimos.length; i++) {
            if (arrayPrimos[i] < media) {
                if (arrayPrimos[i] % 2 == 0 && arrayPrimos[i] != 0) {
                    pares[contador] = arrayPrimos[i];
                    contador++;
                }
            }
        }
        System.out.print("Lista de pares abaixo da média: ");
        if (contador != 0) {
            for (int i = 0; i < contador; i++) {

                System.out.print(pares[i] + " ");
            }
        } else {
            System.out.print("Não há elementos pares abaixo da média");
        }
        System.out.println();
    }

    // Método que identifica os números impares que estão acima da média calculada
    private static void identificarImparesAcimaMedia(int[] arrayPrimos, int media) {
        int contador = 0;
        int[] impares = new int[arrayPrimos.length];
        for (int i = 0; i < arrayPrimos.length; i++) {
            if (arrayPrimos[i] > media) {
                if (arrayPrimos[i] % 2 != 0) {
                    impares[contador] = arrayPrimos[i];
                    contador++;
                }
            }
        }
        System.out.print("Lista de impares acima da média: ");
        for (int i = 0; i < contador; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();
    }
}
