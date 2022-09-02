package lista_strings;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = teclado.nextLine();
        System.out.print("Digite um termo: ");
        String termo = teclado.nextLine();
        System.out.println("A palavra tem: " + palavra.length() + " caracteres");
        System.out.println("A palavra em maiúsculo: " + palavra.toUpperCase());
        Comandos.contadorDeVogais(palavra);
        boolean inicia = palavra.startsWith(termo);
        boolean finaliza = palavra.endsWith(termo);
        System.out.println("A palavra começa com o termo informado? " + inicia);
        System.out.println("A palavra termina com o termo informado? " + finaliza);

        teclado.close();
    }
}
