package lista_datas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print(
                "Informe a sua data e hora de nascimento utilizando o formado -> (dia/mês/ano horas:minutos): ");
        String dataHoraNascimento = teclado.nextLine();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataHora = LocalDateTime.parse(dataHoraNascimento, formatador);
        LocalDateTime dataHoraAtual = LocalDateTime.now();

        Duration tempo = Duration.between(dataHora, dataHoraAtual);
        System.out.println("Você possui " + tempo.toHours() + " horas, " + tempo.toMinutesPart() + " minutos e "
                + tempo.toSecondsPart() + " segundos.");

        teclado.close();
    }
}
