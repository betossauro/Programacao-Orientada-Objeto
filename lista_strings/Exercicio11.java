package lista_strings;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe sua data de nascimento no formato DD/MM/AAAA: ");
        String dtAniversario = teclado.nextLine();

        String trocaMes = dtAniversario.substring(3, 5).replace("01", "janeiro");
        trocaMes = trocaMes.replace("02", "fevereiro");
        trocaMes = trocaMes.replace("03", "março");
        trocaMes = trocaMes.replace("04", "abril");
        trocaMes = trocaMes.replace("05", "maio");
        trocaMes = trocaMes.replace("06", "junho");
        trocaMes = trocaMes.replace("07", "julho");
        trocaMes = trocaMes.replace("08", "agosto");
        trocaMes = trocaMes.replace("09", "setembro");
        trocaMes = trocaMes.replace("10", "outubro");
        trocaMes = trocaMes.replace("11", "novembro");
        trocaMes = trocaMes.replace("12", "dezembro");

        String mensagem = new String("Você nasceu em " + dtAniversario.substring(0, 2) + " de " + trocaMes + " de " + dtAniversario.substring(dtAniversario.length()-4, dtAniversario.length()) + ".");
        System.out.println(mensagem);
        teclado.close();
    }
}
