package lista_strings;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira um texto/frase: ");
        String texto = teclado.nextLine();
        System.out.println("Texto: " + texto);
        String[] palavras = texto.split(" ");
        System.out.println("O texto tem " + palavras.length + " palavras.");
        teclado.close();
    }
}
