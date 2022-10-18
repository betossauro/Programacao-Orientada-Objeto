package lista_datas;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Informe o horário de início da partida no formato -> (hora:minuto): ");
        LocalTime tempoInicio = LocalTime.parse(teclado.nextLine(), formatador);
        System.out.print("Informe o horário de fim da partida no formato -> (hora:minuto): ");
        LocalTime tempoFim = LocalTime.parse(teclado.nextLine(), formatador);

        Duration tempoTotal = Duration.between(tempoInicio, tempoFim);

        System.out.println(
                "A partida de tênis durou " + tempoTotal.toHoursPart() + " horas e " + tempoTotal.toMinutesPart() + " minutos.");
        teclado.close();
    }
}
