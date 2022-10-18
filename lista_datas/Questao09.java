package lista_datas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Questao09 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe uma data no formato -> (dia/mês/ano): ");
        String data = teclado.nextLine();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatada = LocalDate.parse(data, formatador);

        System.out.println("Data digitada: " + dataFormatada.format(formatador)
                + "\nTerça-Feira que antecede a data digitada: "
                + dataFormatada.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY)).format(formatador));
        teclado.close();
    }
}
