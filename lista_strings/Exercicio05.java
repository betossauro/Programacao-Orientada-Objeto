package lista_strings;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe uma frase: ");
        String frase = teclado.nextLine().toLowerCase();
        System.out.println(frase);
        contadorDeVogaisIndividuais(frase);
        teclado.close();
    }

    static void contadorDeVogaisIndividuais(String frase) {
        char[] texto = new char [frase.length()];
        texto = frase.toCharArray();
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
        for (int i = 0; i < texto.length; i++) {
            if (texto[i] == 'a') {
                contadorA++;
            }
            if (texto[i] == 'e') {
                contadorE++;
            }
            if (texto[i] == 'i') {
                contadorI++;
            }
            if (texto[i] == 'o') {
                contadorO++;
            }
            if (texto[i] == 'u') {
                contadorU++;
            }
        }
        System.out.println("A vogal A aparece: " + contadorA + " vezes.");
        System.out.println("A vogal E aparece: " + contadorE + " vezes.");
        System.out.println("A vogal I aparece: " + contadorI + " vezes.");
        System.out.println("A vogal O aparece: " + contadorO + " vezes.");
        System.out.println("A vogal U aparece: " + contadorU + " vezes.");
    }
}
