package lista_strings;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = teclado.nextLine().toLowerCase();
        System.out.print("Que palavra deseja modificar? ");
        String palavraProcurar = teclado.nextLine().toLowerCase();
        System.out.print("Informe a nova palavra: ");
        String palavraAlterada = teclado.nextLine().toLowerCase();

        System.out.println(texto);

        System.out.println("----------------------------");
        texto = texto.replace(".","");
        texto = texto.replace(",","");
        texto = texto.replace("!","");
        texto = texto.replace("?","");
        
        String[] textoSplit = texto.split(" ");
        int contadorAntes = 0;
        for (int i = 0; i < textoSplit.length; i++) {
            if (palavraAlterada.equalsIgnoreCase(textoSplit[i])) {
                contadorAntes++;
            }
        }
        for (int i = 0; i < textoSplit.length; i++) {
            if (palavraProcurar.equals(textoSplit[i])) {
                textoSplit[i] = textoSplit[i].replace(palavraProcurar, palavraAlterada);
            }
        }
        int contadorDepois = 0;
        for (int i = 0; i < textoSplit.length; i++) {
            if (palavraAlterada.equalsIgnoreCase(textoSplit[i])) {
                contadorDepois++;
            }
        }
        for (int i = 0; i < textoSplit.length; i++) {
            System.out.print(textoSplit[i] + " "); 
        }
        if (contadorAntes > 0) {
            contadorDepois -= contadorAntes;
        }
        System.out.println("\n----------------------------");
        System.out.println("A palavra '" + palavraAlterada + "' teve " + contadorDepois + " ocorrências de troca.");
        
        teclado.close();
    }
}
