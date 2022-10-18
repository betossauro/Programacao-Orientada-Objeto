package lista_datas;

import java.time.Duration;
import java.time.ZonedDateTime;

public class Questao08 {

    public static void main(String[] args) {

        ZonedDateTime dataHoraSaida = ZonedDateTime.parse("2022-10-18T19:00+02:00[Europe/Paris]");
        ZonedDateTime dataHoraChegada = ZonedDateTime.parse("2022-10-19T01:20-03:00[America/Sao_Paulo]");

        Duration duracaoVoo = Duration.between(dataHoraSaida, dataHoraChegada);
        System.out.println("A duração do voo foi de " + duracaoVoo.toHoursPart() + " horas e "
                + duracaoVoo.toMinutesPart() + " minutos.");
    }
}
