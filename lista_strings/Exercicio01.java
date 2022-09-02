package lista_strings;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Usuário digita palavra
        System.out.print("Escreva uma palavra: ");
        String palavra = teclado.nextLine();
        // Array de caracteres recebendo o tamanho da palavra
        char[] letras = new char [palavra.length()];
        // Utilizar toCharArray para colocar cada letra dentro do Array
        letras = palavra.toCharArray();
        // Percorrer for de trás pra frente para imprimir palavra invertida
        for (int i = (palavra.length()-1); i >= 0; i--) {
            System.out.print(letras[i] + "");
        }
        teclado.close();
    }
}
