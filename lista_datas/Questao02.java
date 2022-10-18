package lista_datas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número de dias para calcular a data futura: ");
        int dias = Integer.parseInt(teclado.nextLine());

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.now();

        LocalDate dataFutura = data.plusDays(dias);
        DayOfWeek diaDaSemana = dataFutura.getDayOfWeek();

        System.out.println("Daqui a " + dias + " dias vai ser dia " + formatador.format(dataFutura) + " ("
                + diaDaSemana.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")).toLowerCase() + ").");

        teclado.close();
    }
}
