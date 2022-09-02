package lista_strings;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = teclado.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
                System.out.println(palavra.substring(0, i+1));
        }

        for (int i = palavra.length()-2; i >= 0; i--) {
                System.out.println(palavra.substring(0, i+1));
        }

        teclado.close();
    }
}
