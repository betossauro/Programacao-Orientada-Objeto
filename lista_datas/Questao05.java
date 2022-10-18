package lista_datas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.print(
                "Informe a sua data e hora de nascimento utilizando o formado -> (dia/mês/ano horas:minutos): ");
        LocalDateTime dataHora = LocalDateTime.parse(teclado.nextLine(), formatador);
        LocalDateTime dataHoraAtual = LocalDateTime.now();

        Duration tempo = Duration.between(dataHora, dataHoraAtual);
        System.out.println("Você possui " + tempo.toHours() + " horas, " + tempo.toMinutesPart() + " minutos e "
                + tempo.toSecondsPart() + " segundos.");

        teclado.close();
    }
}
