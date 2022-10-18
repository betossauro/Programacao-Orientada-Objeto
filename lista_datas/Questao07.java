package lista_datas;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Questao07 {

    public static void main(String[] args) {

        DateTimeFormatter formatador = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
                .withLocale(new Locale("pt", "BR"));
        DateTimeFormatter formatador1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
                .withZone(ZoneId.of("Europe/Paris"));

        ZonedDateTime dataHoraSaida = ZonedDateTime.parse("2022-10-18T19:00-03:00[America/Sao_Paulo]");
        ZonedDateTime dataHoraViagem = dataHoraSaida.plusHours(11).plusMinutes(20);
        System.out.println("Horário de saída de São Paulo: " + dataHoraSaida.format(formatador));
        System.out.println("Horário de saída de São Paulo: " + dataHoraSaida.format(formatador1));
        System.out.println("---------------------------------------------------------------");
        System.out.println("Horário de chegada em Paris: " + dataHoraViagem.format(formatador));
        System.out.println("Horário de chegada em Paris: " + dataHoraViagem.format(formatador1));
    }
}
