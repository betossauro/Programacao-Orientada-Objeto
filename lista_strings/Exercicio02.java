package lista_strings;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira um texto/frase: ");
        String texto = teclado.nextLine();
        texto = texto.replace(".", "");
        texto = texto.replace(",", "");
        texto = texto.replace("!", "");
        texto = texto.replace("?", "");
        String[] palavras = texto.split(" ");
        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i]);
        }
        teclado.close();
    }
}
