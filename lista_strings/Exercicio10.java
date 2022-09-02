package lista_strings;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor numérico: ");
        String numeros = teclado.nextLine();

        String trocaNumeros = numeros.replaceAll("1", "um, ");
        trocaNumeros = trocaNumeros.replaceAll("2", "dois, ");
        trocaNumeros = trocaNumeros.replaceAll("3", "três, ");
        trocaNumeros = trocaNumeros.replaceAll("4", "quatro, ");
        trocaNumeros = trocaNumeros.replaceAll("5", "cinco, ");
        trocaNumeros = trocaNumeros.replaceAll("6", "seis, ");
        trocaNumeros = trocaNumeros.replaceAll("7", "sete, ");
        trocaNumeros = trocaNumeros.replaceAll("8", "oito, ");
        trocaNumeros = trocaNumeros.replaceAll("9", "nove, ");
        trocaNumeros = trocaNumeros.replaceAll("0", "zero, ");
        //Tirar virgula e colocar ponto
        trocaNumeros = trocaNumeros.substring(0, 1).toUpperCase() + trocaNumeros.substring(1, trocaNumeros.length()-2) + ".";
        //Colocar só primeira letra em maiúsculo

        System.out.print(trocaNumeros);
        teclado.close();
    }
}
