package lista_datas;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        DateTimeFormatter formatador0 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatador1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
                .withLocale(new Locale("pt", "BR"));
        DateTimeFormatter formatador2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
                .withLocale(Locale.US).withZone(ZoneId.of("America/New_York"));
        DateTimeFormatter formatador3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
                .withLocale(Locale.FRANCE).withZone(ZoneId.of("Europe/Paris"));
        DateTimeFormatter formatador4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
                .withLocale(Locale.JAPANESE).withZone(ZoneId.of("Asia/Tokyo"));

        System.out.print("Informe a data e o horário no Brasil utilizando o formato -> (dia/mês/ano horas:minutos): ");
        LocalDateTime tempoBrasil = LocalDateTime.parse(teclado.nextLine(), formatador0);
        ZonedDateTime momentoBrasil = ZonedDateTime.of(tempoBrasil, ZoneId.of("America/Sao_Paulo"));
        System.out.println("Horário Brasil: " + momentoBrasil.format(formatador1)
                + "\nHorario Nova Iorque: " + momentoBrasil.format(formatador2)
                + "\nHorario Paris: " + momentoBrasil.format(formatador3)
                + "\nHorario Japão: " + momentoBrasil.format(formatador4));

        teclado.close();
    }
}
