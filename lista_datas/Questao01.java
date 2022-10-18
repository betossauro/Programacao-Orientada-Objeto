package lista_datas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma data no formato dia/mês/ano: ");
        String data = teclado.nextLine();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatada = LocalDate.parse(data, formatador);

        DayOfWeek diaDaSemana = dataFormatada.getDayOfWeek();

        System.out.println("O dia " + formatador.format(dataFormatada) + " cairá em um(a) "
                + diaDaSemana.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")).toLowerCase() + ".");

        teclado.close();
    }
}
