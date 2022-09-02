package lista_strings;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um verbo terminado em 'AR': ");
        String verbo = teclado.nextLine();
        conjugarVerbo(verbo);
        teclado.close();
    }

    private static void conjugarVerbo(String verbo) {
        String verboSemAr = verbo.substring(0, verbo.length()-2);
        System.out.println("Eu " + verboSemAr + "o"
        + "\nTu " + verboSemAr + "as"
        + "\nEle " + verboSemAr + "a"
        + "\nNós " + verboSemAr + "amos"
        + "\nVós " + verboSemAr + "ais"
        + "\nEles " + verboSemAr + "am");
    }
}
