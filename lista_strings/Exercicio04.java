package lista_strings;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine();
        System.out.print("Agora digite uma palavra: ");
        String palavra = teclado.nextLine();
        System.out.println("----------------------");
        // Imprimir frase e palavra
        System.out.println("Frase: " + frase);
        System.out.println("Palavra buscada: " + palavra);
        System.out.println();
        // Separar a frase em Array de palavras
        String[] pontuacao = {".", ",", "!", "?"};
        for (int i = 0; i < pontuacao.length; i++) {
            frase = frase.replace(pontuacao[i], "");
        }
        String[] verificador = frase.split(" ");
        // Percorrer o Array de palavras e verificar quantas vezes ela aparece
        int contador = 0;
        for (int i = 0; i < verificador.length; i++) {
            if (verificador[i].equalsIgnoreCase(palavra)) {
                contador++;
            }
        }
        // Imprimir resultado
        System.out.println("A palavra " + palavra + " aparece " + contador + " vezes.");
        teclado.close();
    }
}
