package lista_strings;

import java.util.Scanner;

public class Exercicio08alternativo {
    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o texto: ");
		String texto =  teclado.nextLine();
		System.out.print("Informe a palavra a ser buscada: ");
		String busca =  teclado.next();
		System.out.print("Informe a palavra a ser trocada: ");
		String troca =  teclado.next();
		
		String textoModificado = texto.replaceAll("\\b"+busca+"\\b", troca);
		System.out.println("Texto Original: " +  texto);
		System.out.println("Texto Modificado: " +  textoModificado);
		
		texto = texto.replace(".", " ");
		texto = texto.replace(",", " ");
		texto = texto.replace("!", " ");
		texto = texto.replace("?", " ");
		String[] palavras = texto.split(" ");
		
		int ocorrencias = 0;
		for(int i = 0; i < palavras.length; i++) {
			if(palavras[i].equals(busca)) {
				palavras[i] = troca;
				ocorrencias++;
			}
		}
		System.out.println("Ocorrências: " +  ocorrencias);
		
		teclado.close();
	}
}
