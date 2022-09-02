package lista_strings;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um nome completo: ");
        String nomeCompleto = teclado.nextLine();
        String[] nomes = nomeCompleto.split(" ");
        String sobrenome = nomes[nomes.length-1].toUpperCase();
        String nome = "";
        for (int i = 0; i < (nomes.length - 1); i++) {
            nome += " " + nomes[i].substring(0, 1).toUpperCase() + nomes[i].substring(1).toLowerCase();;
        }
        System.out.println(sobrenome + "," + nome + ".");
        teclado.close();
    }
}
