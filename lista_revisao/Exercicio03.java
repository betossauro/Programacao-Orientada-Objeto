package lista_revisao;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int[] num = new int[10];
        preencherArray(num);
        System.out.println();
        int menor = identificarMenor(num);
        System.out.println("O menor inteiro é o " + menor);
        int maior = identificarMaior(num);
        System.out.println("O maior inteiro é o " + maior);
        System.out.println();
        imprimirTabuada(menor);
        System.out.println();
        imprimirTabuada(maior);
    }

    // Preenchimento de array
    static int[] preencherArray(int[] num) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º número inteiro: ");
            num[i] = teclado.nextInt();
        }
        teclado.close();
        return num;
    }

    // Identificando o menor elemento do array
    static int identificarMenor(int[] num) {
        Arrays.sort(num);
        return num[0];
    }

    // Identificando o maior elemento do array
    static int identificarMaior(int[] num) {
        Arrays.sort(num);
        return num[num.length - 1];
    }

    // Impressão de tabuada do menor e do maior elemento
    static void imprimirTabuada(int num) {
        System.out.println("TABUADA DE " + num);
        System.out.println("-------------");
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
