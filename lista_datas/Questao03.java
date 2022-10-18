package lista_datas;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o horário de início da partida no formato -> (hora:minuto): ");
        String inicio = teclado.nextLine();
        System.out.print("Informe o horário de fim da partida no formato -> (hora:minuto): ");
        String fim = teclado.nextLine();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime tempoInicio = LocalTime.parse(inicio, formatador);
        LocalTime tempoFim = LocalTime.parse(fim, formatador);

        Duration tempoTotal = Duration.between(tempoInicio, tempoFim);

        System.out.println(
                "A partida de tênis durou " + tempoTotal.toHoursPart() + ":" + tempoTotal.toMinutesPart() + ".");
        teclado.close();
    }
}
