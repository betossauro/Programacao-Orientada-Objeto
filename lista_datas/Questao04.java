package lista_datas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Informe a sua data de nascimento utilizando o formado -> (dia/mês/ano): ");
        LocalDate dataFormatada = LocalDate.parse(teclado.nextLine(), formatador);

        LocalDate data = LocalDate.now();
        Period tempoVida = Period.between(dataFormatada, data);

        System.out.println("Você possui " + tempoVida.getYears() + " anos, " + tempoVida.getMonths() + " meses e "
                + tempoVida.getDays() + " dias.");

        teclado.close();
    }
}
