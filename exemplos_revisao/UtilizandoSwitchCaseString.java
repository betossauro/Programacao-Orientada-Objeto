package exemplos_revisao;

import java.util.Scanner;

public class UtilizandoSwitchCaseString {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número: ");
        String opcao = teclado.nextLine();
        switch (opcao) {
            case "1": {
                System.out.println("Número 1!");
                break;
            }
            case "2": {
                System.out.println("Número 2!");
                break;
            }
            default: {
                System.out.println("Opção inválida!");
            }
        }
        teclado.close();
    }
}
